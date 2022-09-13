package fr.stelarys.stelamenuapi;

import fr.stelarys.stelamenuapi.managers.MenuManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class StelaMenuAPI extends JavaPlugin {

    private static final HashMap<Player, MenuManager> menuMap = new HashMap<>();

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }

    public static MenuManager getMenuManager(Player player) {
        MenuManager menuManager;

        if (!(menuMap.containsKey(player))) {
            menuManager = new MenuManager(player);
            menuMap.put(player, menuManager);

            return menuManager;
        } else {
            return menuMap.get(player);
        }
    }
}
