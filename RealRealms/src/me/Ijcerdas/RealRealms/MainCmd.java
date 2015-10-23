package me.Ijcerdas.RealRealms;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class MainCmd implements org.bukkit.command.CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("rr")) {
		if (args.length == 0) {
		sender.sendMessage(ChatColor.RED + "Invalid Argument! Use /rr help");
		return false;
		
		} else {
		if (args[0].equalsIgnoreCase("help")) {
		sender.sendMessage(ChatColor.GRAY + "========" + ChatColor.DARK_AQUA + " Real Realms " + ChatColor.GRAY + "========");
		sender.sendMessage(ChatColor.GREEN + "All Commands Provided with Real Realms:");
		sender.sendMessage("");
		sender.sendMessage(ChatColor.AQUA + ChatColor.BOLD.toString() + "> " + ChatColor.YELLOW + "/rr refresh" + ChatColor.GRAY + "   (Refreshes the Plugin)");
		sender.sendMessage(ChatColor.AQUA + ChatColor.BOLD.toString() + "> " + ChatColor.YELLOW + "/rk help" + ChatColor.GRAY + "   (All Kit Commands)");
		sender.sendMessage(ChatColor.AQUA + ChatColor.BOLD.toString() + "> " + ChatColor.YELLOW + "/rs help" + ChatColor.GRAY + "   (Lists All Shouts)");
		sender.sendMessage(ChatColor.AQUA + ChatColor.BOLD.toString() + "> " + ChatColor.YELLOW + "/realreload" + ChatColor.GRAY + "   (Reloads RR and Config)");
		sender.sendMessage("");
		sender.sendMessage(ChatColor.GREEN + "More Commands Coming Soon!");
		return true;
				
			}else{
		//==================================REFRESH COMMAND=======================================//
				if (sender instanceof Player);
				if(args[0].equalsIgnoreCase("refresh")){
				Player p = (Player)sender;
				if(p.hasPermission("rr.refresh")){
				p.removePotionEffect(PotionEffectType.SLOW);
				p.sendMessage(ChatColor.AQUA + "System" + ChatColor.DARK_GRAY + " -=-" + ChatColor.GREEN + " Refreshed Real Realms.");
				
				}else{
					p.sendMessage(ChatColor.AQUA + "System" + ChatColor.DARK_GRAY + " -=-" + ChatColor.RED + " Permission Denied.");
				}
				
				}else{
					sender.sendMessage(ChatColor.RED + "Unknown Command! Please use /rr help");
				}
				}
		}
}
		return true;
	}
}


