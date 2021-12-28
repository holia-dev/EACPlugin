package fr.empireac.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/*
 *
 * EAC Plugin
 * By Holia
 *
 */

public class PlayersJoin implements Listener {
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		e.setJoinMessage(ChatColor.DARK_GRAY + "[" + ChatColor.WHITE + player.getName() + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " a rejoint le serveur ");
	}
}
