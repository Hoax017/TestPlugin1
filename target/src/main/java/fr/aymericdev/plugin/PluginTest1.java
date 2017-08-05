package fr.aymericdev.plugin;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import com.eu.habbo.plugin.EventListener;
import com.eu.habbo.plugin.HabboPlugin;

public class PluginTest1 extends HabboPlugin  implements EventListener {

    public void onEnable() {
        Emulator.getLogging().logStart("Loaded Test Plugin!");
        Emulator.getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {
        Emulator.getLogging().logShutdownLine("Disabled Test Plugin.");
    }

    public boolean hasPermission(Habbo habbo, String s) {
        return false;
    }

}
