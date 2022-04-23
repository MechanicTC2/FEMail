package com.ridgecrest.mail;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class MailCommands implements CommandExecutor {
	References references = new References();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (args[0].equals("openMailbox")) {
			Inventory mailGUI = Bukkit.getServer().createInventory(player, 9, player.getDisplayName() + "'s Mailbox");
			mailGUI.setItem(0, references.sendMail());
			mailGUI.setItem(8, references.deny());
			player.openInventory(mailGUI);
		}	
		return false;
	}
}
