package me.legadyn.discord;

import java.io.IOException;
import me.legadyn.config.AuthKeys;
import me.legadyn.config.Keys;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class DiscordBot {
    public static JDA jda;

    public DiscordBot() throws LoginException, IOException {
        Keys keys = new Keys();
        jda = JDABuilder.createDefault(keys.getKey(AuthKeys.DISCORD_TOKEN), GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_VOICE_STATES)
                .disableCache(EnumSet.of(CacheFlag.CLIENT_STATUS, CacheFlag.ACTIVITY, CacheFlag.EMOTE)).enableCache(CacheFlag.VOICE_STATE)
                .addEventListeners(new Listener()).setActivity(Activity.listening("Musique")).build();


    }
}
