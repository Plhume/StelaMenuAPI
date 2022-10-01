package fr.stelarys.stelamenuapi.gui;

import fr.stelarys.stelamenuapi.managers.MenuManager;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public abstract class Menu {

    protected MenuManager menuManager;
    protected Inventory inventory;

    public Menu(MenuManager menuManager) {
        this.menuManager = menuManager;
    }

    /**
     * Set the title of the menu
     * @return
     */
    public abstract TextComponent getMenuTitle();

    /**
     * Set the number of slots
     * @return
     */
    public abstract int getSlots();

    /**
     * Set the actions of menu
     * @param e
     */
    public abstract void handleMenu(InventoryClickEvent e);

    /**
     * Add items in menu*
     */
    public abstract void setMenuItems();

    /**
     * Open the menu
     */
    public void open() {
        inventory = Bukkit.createInventory(null, getSlots(), getMenuTitle());

        this.setMenuItems();

        menuManager.getMenuOwner().openInventory(inventory);
    }

    /**
     * Get the inventory
     * @return
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Create items of menu
     * @param material
     * @param displayName
     * @param lore
     * @return
     */
    public ItemStack makeItem(Material material, String displayName, String... lore) {

        ItemStack item = new ItemStack(material);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(displayName);

        itemMeta.setLore(Arrays.asList(lore));
        item.setItemMeta(itemMeta);

        return item;
    }
}
