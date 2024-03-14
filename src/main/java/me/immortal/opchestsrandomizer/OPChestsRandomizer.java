package me.immortal.opchestsrandomizer;

import org.bukkit.plugin.java.JavaPlugin;

public final class OPChestsRandomizer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("activateOPChests").setExecutor(new OPChestRandomizer_Command());
        getServer().getPluginManager().registerEvents(new OPChestRandomizer_Listener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
