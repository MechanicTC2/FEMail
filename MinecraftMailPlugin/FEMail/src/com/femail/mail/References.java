package com.femail.mail;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class References {
	public ItemStack sendMail() {
		ItemStack sendMail = new ItemStack(Material.GREEN_CONCRETE);
		ItemMeta meta = sendMail.getItemMeta();
		meta.setDisplayName("Send Message");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Compose and send an email.");
		meta.setLore(lore);
		sendMail.setItemMeta(meta);
		return sendMail;
	}
	public ItemStack checkMail() {
		ItemStack checkMail = new ItemStack(Material.KNOWLEDGE_BOOK);
		ItemMeta meta = checkMail.getItemMeta();
		meta.setDisplayName("Check Mail");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Check mail.");
		meta.setLore(lore);
		checkMail.setItemMeta(meta);
		return checkMail;
	}
	public ItemStack confirmMessage() {
		ItemStack confirmMessage = new ItemStack(Material.GREEN_CONCRETE);
		ItemMeta meta = confirmMessage.getItemMeta();
		meta.setDisplayName("Confirm message:");
		ArrayList<String> lore = new ArrayList<>();
		lore.add(Listeners.message);
		meta.setLore(lore);
		confirmMessage.setItemMeta(meta);
		return confirmMessage;
	}
	public ItemStack confirmSubject() {
		ItemStack confirmSubject = new ItemStack(Material.GREEN_CONCRETE);
		ItemMeta meta = confirmSubject.getItemMeta();
		meta.setDisplayName(Listeners.recipient);
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Confirm subject and compose email.");
		meta.setLore(lore);
		confirmSubject.setItemMeta(meta);
		return confirmSubject;
	}
	public ItemStack deny() {
		ItemStack deny = new ItemStack(Material.BARRIER);
		ItemMeta meta = deny.getItemMeta();
		meta.setDisplayName("Stop");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Exit FEMail.");
		meta.setLore(lore);
		deny.setItemMeta(meta);
		return deny;
	}
	public ItemStack mail() {
		ItemStack mail = new ItemStack(Material.WRITABLE_BOOK);
		ItemMeta meta = mail.getItemMeta();
		meta.setDisplayName("Message Book");
		ArrayList<String> lore = new ArrayList<>();
		lore.add("FEMail!");
		meta.setLore(lore);
		mail.setItemMeta(meta);
		return mail;
	}
}
