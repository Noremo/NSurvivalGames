package com.norelia.survivalgames

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onLoad() {
		saveDefaultConfig();
	}

	public void onEnable() {
		System.out.println("sg @ sonicjoshua - dummy 11.38.15.02.2014 [Enabled]");
	}

	public void onDisable() {
		System.out.println("sg @ sonicjoshua - dummy 11.38.15.02.2014 [Disabled]");
	}
   /*
    * Dummy plugin! Main includes:
    * help
    * sg
    * signs
   */
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		Player player = e.getPlayer();
		String message = e.getMessage();
		if (message.equalsIgnoreCase("/sg")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "sg @ sonicjoshua - dummy 11.38.15.02.2014");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "norelia version = true includes signs & output.");
		}
		if (message.equalsIgnoreCase("/sg arena new")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "sg @ sonicjoshua - dummy 11.38.15.02.2014");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "norelia version = true includes signs & output.");
		}
		if (message.equalsIgnoreCase("/sg arena setup")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "sg @ sonicjoshua - dummy 11.38.15.02.2014");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "norelia version = true includes signs & output.");
		}
		if (message.equalsIgnoreCase("/sg arena disable")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "sg @ sonicjoshua - dummy 11.38.15.02.2014");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "norelia version = true includes signs & output.");
		}
		if (message.equalsIgnoreCase("/sg arena enable")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "sg @ sonicjoshua - dummy 11.38.15.02.2014");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "norelia version = true includes signs & output.");
		}
		if (message.equalsIgnoreCase("/norelia sign add sg")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "sg @ sonicjoshua - dummy 11.38.15.02.2014");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "norelia version = true includes signs & output.");
		}	
		if (message.equalsIgnoreCase("/sg help")) {
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "SurvivalGames help [Admin Use]:");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "/sg output - [console use] - Outputs current stats to the console");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "/norelia sign add sg <arena> - Adds a sign");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "/sg arena new - Adds new arena");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "/sg arena setup <arena> - Enters setup mode");
			player.sendMessage(ChatColor.BLUE + "[SurvivalGames] " + ChatColor.GOLD + "/sg arena <disable/enable> <arena> - Enables/Disables an arena");
		}
	}
}
