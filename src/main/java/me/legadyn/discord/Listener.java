package me.legadyn.discord;

import java.io.IOException;
import java.util.logging.Level;
import me.duncte123.botcommons.BotCommons;
import me.legadyn.config.AuthKeys;
import me.legadyn.config.Keys;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Listener extends ListenerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class); // para que loguee cuando la clase listener readyevent funque
    
    @Override
    public void onReady(ReadyEvent event) {

        LOGGER.info("El bot esta listo! User: " + event.getJDA().getSelfUser());

    }

}
