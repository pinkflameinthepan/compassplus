package me.pinkflameinthepan.compassplus.compassplus;

import Commands.commandCompassLore;
import org.bukkit.plugin.java.JavaPlugin;

public final class CompassPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        String pluginName = "[Compass+]";
        System.out.println(pluginName + " Started up, smooth sailing!");

        //COMMANDS
        this.getCommand("cplore").setExecutor(new commandCompassLore());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
