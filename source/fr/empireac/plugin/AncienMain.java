package fr.empireac.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class AncienMain extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(this, this);
		
		int versionMajor = 0;
		int versionMinor = 1;
		String versionType = "beta";
		String versionPoint = ".";
		String version = versionType + versionMajor + versionPoint + versionMinor;		
		System.out.print("EmpireAC plugin loaded ! (version " + version + ")");
	}
	
	@Override
	public void onDisable() {
		System.out.print("EmpireAC plugin is now offline.");
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		
		event.setJoinMessage(ChatColor.DARK_GRAY + "[" + ChatColor.WHITE + player.getName() + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " a rejoint le serveur ");
		
		ItemStack item = new ItemStack(Material.GRASS);
		
		item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW + "Terre de " + ChatColor.BLUE + player.getName());
		
		item.setItemMeta(meta);
		
		player.getInventory().setItem(0, item);
		
		
		
	}
	
}