package com.ridgecrest.mail;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	//C:\\Users\\Ninja\\Desktop\\MC\\MCServer\\
	//C:\\Users\\Guest1\\Desktop\\minecraft server\\
	public static String filePath = "C:\\Users\\Ninja\\Desktop\\MC\\MCServer\\";
	@Override
	public void onEnable() {
		//Register Listener and PlayerCommand class
		System.out.println("Your plugin is now enabled.");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		getCommand("mail").setExecutor(new MailCommands());
	}
	@Override
	public void onDisable() {
		System.out.println("Your plugin is now disabled.");
	}
}
