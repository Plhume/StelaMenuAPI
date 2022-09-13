package fr.stelarys.stelamenuapi.gui;

import fr.stelarys.stelamenuapi.managers.MenuManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public abstract class MenuPaginated extends Menu {

    protected int page = 0;
    protected int maxItemsPerPage = 28;
    protected int index = 0;

    public MenuPaginated(MenuManager menuManager) {
        super(menuManager);
    }

    /**
     * Create the border of menu
     */
    public void addMenuBorder(){
        inventory.setItem(48, makeItem(Material.ARROW, ChatColor.GREEN + "Page précédente"));

        inventory.setItem(49, makeItem(Material.BARRIER, ChatColor.DARK_RED + "Fermer"));

        inventory.setItem(50, makeItem(Material.ARROW, ChatColor.GREEN + "Page suivante"));
    }

    /**
     * Set the maximum number of items in the menu
     * @return
     */
    public int getMaxItemsPerPage() {
        return maxItemsPerPage;
    }
}