package me.legadyn.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Keys {

    private String access_key;
    private String access_secret_key;
    private String consumer_key;
    private String consumer_secret;
    private String discord_token;
    private String prefix;
    private String channelID;
    
    public String getKey(AuthKeys selected) throws IOException {
        
         JSONParser parser = new JSONParser();
        
        try {
            //BufferedReader reader1 = new BufferedReader((new InputStreamReader(Keys.class.getResourceAsStream("/keys.json"))));
            BufferedReader reader1 = new BufferedReader(new FileReader(System.getProperty("user.home")+"\\keys.json"));
            JSONObject jsonObject = (JSONObject) parser.parse(reader1);
            System.out.println(jsonObject);

            access_key = (String) jsonObject.get("access_key");
            discord_token = (String) jsonObject.get("discordtoken");
            access_secret_key = (String) jsonObject.get("access_secret_key");
            consumer_key = (String) jsonObject.get("consumer_key");
            consumer_secret = (String) jsonObject.get("consumer_key_secret");
            discord_token = (String) jsonObject.get("discordtoken");
            prefix = (String) jsonObject.get("prefix");
            channelID = (String) jsonObject.get("channelID");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        switch(selected) {
            case ACCESS_KEY: return access_key;
            case CONSUMER_KEY: return consumer_key;
            case ACCESS_SECRET: return access_secret_key;
            case DISCORD_TOKEN: return discord_token;
            case SECRET_CONSUMER: return consumer_secret;
            case PREFIX: return prefix;
            case CHANNEL_ID: return channelID;
            default: break;

        }
        return null;
    }

}
