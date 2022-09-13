package fr.stelarys.stelamenuapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class StelaMenuAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}
