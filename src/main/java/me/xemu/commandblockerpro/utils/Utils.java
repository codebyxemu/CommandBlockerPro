package me.xemu.commandblockerpro.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Utils {

	public static String translate(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}

	public static boolean isPlayer(CommandSender sender) {
		return sender instanceof Player;
	}

	public static Player getPlayer(CommandSender sender) {
		return (Player) sender;
	}

}
