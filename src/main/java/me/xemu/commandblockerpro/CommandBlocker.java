package me.xemu.commandblockerpro;

import org.bukkit.plugin.java.JavaPlugin;

public final class CommandBlocker extends JavaPlugin {

	private static CommandBlocker instance;

	@Override
	public void onEnable() {
		// Plugin startup logic
		instance = this;
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
