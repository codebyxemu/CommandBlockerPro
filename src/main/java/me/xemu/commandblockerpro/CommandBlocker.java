package me.xemu.commandblockerpro;

import me.xemu.commandblockerpro.events.CommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class CommandBlocker extends JavaPlugin {

	private static CommandBlocker instance;

	private static List<String> blockedCommands;
	public static List<String> getBlockedCommands() {
		if (blockedCommands == null) {
			throw new NullPointerException("Blocked Commands is invalid.");
		}
		return blockedCommands;
	}

	@Override
	public void onEnable() {
		// Plugin startup logic
		instance = this;

		getConfig().options().copyDefaults(true);
		saveConfig();

		blockedCommands = getConfig().getStringList("blockedCommands");

		getServer().getPluginManager().registerEvents(new CommandEvent(), this);
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		instance = null;
	}

	public static CommandBlocker getInstance() {
		if (instance == null) {
			throw new NullPointerException("Instance is invalid.");
		}
		return instance;
	}

}
