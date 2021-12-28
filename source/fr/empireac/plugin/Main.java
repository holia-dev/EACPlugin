package fr.empireac.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import fr.empireac.plugin.events.InventoryClick;
import fr.empireac.plugin.events.PlayersJoin;

/*
 *
 * EAC Plugin
 * By Holia
 *
 */

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new PlayersJoin(), this);
		Bukkit.getPluginManager().registerEvents(new InventoryClick(), this);
		
		getConfig().options().copyDefaults(true);
		
		getConfig().addDefault("report", 0);
		
		saveConfig();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if (label.equalsIgnoreCase("report")) {
			
			int reports = getConfig().getInt("report");
			String raison = "";
			
			for (int i = 1; i < args.length; i++) {
				raison += args[i] + " ";
			}
			
			getConfig().set("report", reports + 1);
			saveConfig();
			
			for (Player all : Bukkit.getOnlinePlayers()) {
				if (args.length == 0) {
					sender.sendMessage(ChatColor.RED + "Utilisation: /report <Joueur> <Raison>");
				} else if (args.length == 1) {
					sender.sendMessage(ChatColor.RED + "Utilisation: /report <Joueur> <Raison>");
				} else {
					if (all.isOp()) {
						all.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "REPORT" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + sender.getName() + ChatColor.AQUA + " a report " + ChatColor.YELLOW + args[0] + ChatColor.AQUA + " avec la raison suivante : " + ChatColor.YELLOW + raison);
					}
					sender.sendMessage(ChatColor.GREEN + "Votre report a été envoyé au membres du staff. Merci de faire EmpireAC un serveur meilleur.");
				}
			}
			
		}
		else if (label.equalsIgnoreCase("discord")) {
			sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "DISCORD" + ChatColor.DARK_GRAY + "]" + ChatColor.AQUA + " Lien du serveur discord de L'Empire AC : " + ChatColor.YELLOW + "https://discord.gg/TsrUWZbgsx");
		}
		
		else if (label.equalsIgnoreCase("help")) {
			sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "HELP" + ChatColor.DARK_GRAY + "]" + ChatColor.AQUA + " Page d'aide :");
			sender.sendMessage(ChatColor.YELLOW + "-" + ChatColor.LIGHT_PURPLE + " help" + ChatColor.AQUA + " : Page d'aide");
			sender.sendMessage(ChatColor.YELLOW + "-" + ChatColor.LIGHT_PURPLE + " report" + ChatColor.AQUA + " : Report un Joueur");
			sender.sendMessage(ChatColor.YELLOW + "-" + ChatColor.LIGHT_PURPLE + " discord" + ChatColor.AQUA + " : Lien discord");
			sender.sendMessage(ChatColor.YELLOW + "-" + ChatColor.LIGHT_PURPLE + " menu" + ChatColor.AQUA + " : Ouvrir le menu.");
			sender.sendMessage(ChatColor.YELLOW + "-" + ChatColor.LIGHT_PURPLE + " myuuid" + ChatColor.AQUA + " : Affiche votre uuid.");
		}
		
		else if (label.equalsIgnoreCase("menu")) {
			
			if (args.length == 0) {
				Inventory inventaire = Bukkit.createInventory(null, InventoryType.CHEST, ChatColor.BLUE + "Menu (GUI)");
                
                ItemStack item = new ItemStack(Material.BEACON);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName("Menu Empire AC");
                item.setItemMeta(meta);
                inventaire.setItem(4, item);
                
                ItemStack glass_two = new ItemStack(Material.GLASS);
                ItemMeta glass_two_meta = glass_two.getItemMeta();
                glass_two_meta.setDisplayName("");
                glass_two.setItemMeta(glass_two_meta);
                inventaire.setItem(9, glass_two);
                
                ItemStack glass_three = new ItemStack(Material.GLASS);
                ItemMeta glass_three_meta = glass_three.getItemMeta();
                glass_three_meta.setDisplayName("");
                glass_three.setItemMeta(glass_three_meta);
                inventaire.setItem(10, glass_three);
                
                ItemStack glass_four = new ItemStack(Material.GLASS);
                ItemMeta glass_four_meta = glass_four.getItemMeta();
                glass_four_meta.setDisplayName("");
                glass_four.setItemMeta(glass_four_meta);
                inventaire.setItem(11, glass_four);
                
                ItemStack glass_five = new ItemStack(Material.GLASS);
                ItemMeta glass_five_meta = glass_five.getItemMeta();
                glass_five_meta.setDisplayName("");
                glass_five.setItemMeta(glass_five_meta);
                inventaire.setItem(15, glass_five);
                
                ItemStack glass_six = new ItemStack(Material.GLASS);
                ItemMeta glass_six_meta = glass_six.getItemMeta();
                glass_six_meta.setDisplayName("");
                glass_six.setItemMeta(glass_six_meta);
                inventaire.setItem(16, glass_six);
                
                ItemStack glass_seven = new ItemStack(Material.GLASS);
                ItemMeta glass_seven_meta = glass_seven.getItemMeta();
                glass_seven_meta.setDisplayName("");
                glass_seven.setItemMeta(glass_seven_meta);
                inventaire.setItem(17, glass_seven);
                
                p.openInventory(inventaire);
			}
		
		}
		
		else if (label.equalsIgnoreCase("myuuid")) {
			sender.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "MY-UUID" + ChatColor.DARK_GRAY + "]" + ChatColor.AQUA + " Votre UUID est : ");
			sender.sendMessage(p.getUniqueId() + "");
		}
		
		else if (label.equalsIgnoreCase("fakechat")) {
			if (sender.isOp()) {
				if (args.length == 0) {
					sender.sendMessage(ChatColor.RED + "Utilisation: /fakechat <Joueur> <Chat>");
				}
				else if (args.length == 1) {
					sender.sendMessage(ChatColor.RED + "Utilisation: /fakechat <Joueur> <Chat>");
				}
				else if (args.length == 2) {
					String chatJoueur = "";
					
					for (int i = 1; i < args.length; i++) {
						chatJoueur += args[i] + " ";
					}
					
					Bukkit.broadcastMessage(ChatColor.WHITE + "<" + args[0] + ">" + " " + chatJoueur);
				}
			} else {
				sender.sendMessage(ChatColor.RED + "Vous n'avez pas accès a cette commande.");
			}
		}
		
		return false;
	}
}
 
