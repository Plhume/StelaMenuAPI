package fr.stelarys.stelamenuapi.managers;

import org.bukkit.entity.Player;

public class MenuManager {

    private final Player player;

    public MenuManager(Player player) {
        this.player = player;
    }

    public Player getMenuOwner() {
        return player;
    }
}
