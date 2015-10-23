package me.Ijcerdas.RealRealms;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Kits implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("rk")){
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Invalid Argument! Use /rk help");
				return false;
			}else{
				if(args[0].equalsIgnoreCase("help")) {
					sender.sendMessage(ChatColor.GRAY + "========" + ChatColor.DARK_AQUA + " Real Kits " + ChatColor.GRAY + "========");
					sender.sendMessage(ChatColor.GREEN + "All Commands Provided with Real Kits:");
					sender.sendMessage("");
					sender.sendMessage(ChatColor.AQUA + ChatColor.BOLD.toString() + "> " + ChatColor.YELLOW + "/rk help" + ChatColor.GRAY + "   (Brings up this Page)");
					sender.sendMessage("");
					sender.sendMessage(ChatColor.GREEN + "More Commands Coming Soon!");
					return true;
					
				}else{
					
					sender.sendMessage(ChatColor.RED + "Unknown Command! Please use /rk help");
					
				}
			}
			
		}
		return true;
	}

}


