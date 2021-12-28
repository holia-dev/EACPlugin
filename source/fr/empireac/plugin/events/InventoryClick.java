package fr.empireac.plugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/*
 *
 * EAC Plugin
 * By Holia
 *
 */

public class InventoryClick implements Listener{
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
        if(e.getCurrentItem() == null) return;
        if(e.getCurrentItem().getType() == Material.BEACON){
            e.setCancelled(true);
            p.closeInventory();
        }
        if(e.getCurrentItem().getType() == Material.GLASS){
            e.setCancelled(true);
            p.closeInventory();
        }
	}
	
}
