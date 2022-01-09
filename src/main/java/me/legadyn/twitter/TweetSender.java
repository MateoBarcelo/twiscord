package me.legadyn.twitter;

import java.io.File;
import java.io.IOException;
import me.legadyn.config.AuthKeys;
import me.legadyn.config.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UploadedMedia;
import twitter4j.auth.AccessToken;
public class TweetSender {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TweetSender.class);
    Keys keys = new Keys();
    
    public TweetSender(String message, File img) throws TwitterException, IOException {
        TwitterFactory factory = new TwitterFactory();
        AccessToken accessToken = loadAccessToken();
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.setOAuthConsumer(keys.getKey(AuthKeys.CONSUMER_KEY), keys.getKey(AuthKeys.SECRET_CONSUMER));
        twitter.setOAuthAccessToken(accessToken);
        if(img == null) {
            //only post tweet
            StatusUpdate update = new StatusUpdate(message);
            Status status = twitter.updateStatus(update);
            System.out.println(message);
        } else {
            
            StatusUpdate update = new StatusUpdate(message);
            update.setMedia(new File(img.getAbsolutePath()));
            twitter.updateStatus(update.media(img));
            System.out.println(img.getAbsolutePath());
            return;
        }
        
    }

    private AccessToken loadAccessToken() throws IOException{
        String token = keys.getKey(AuthKeys.ACCESS_KEY); // load from a persistent store
        String tokenSecret = keys.getKey(AuthKeys.ACCESS_SECRET); // load from a persistent store
        return new AccessToken(token, tokenSecret);
    }

}
