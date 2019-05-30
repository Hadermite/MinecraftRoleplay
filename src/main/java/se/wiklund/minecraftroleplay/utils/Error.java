package se.wiklund.minecraftroleplay.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Error {

	public static final Error NO_PERMISSION = new Error("You don't have permission to enter that command.");
	public static final Error NOT_PLAYER = new Error("You have to be a player in order to execute this command.");
	public static final Error PLAYER_NOT_EXIST = new Error("That player does not exist, or is not online.");
	public static final Error NUMBER_PARSE_ERROR = new Error("You have to enter a number.");

	private String message;

	private Error(String message) {
		this.message = message;
	}

	public static void send(CommandSender sender, Error error) {
		sender.sendMessage(ChatColor.RED + error.message);
	}

	public static void send(CommandSender sender, String message) {
		sender.sendMessage(ChatColor.RED + message);
	}
}
