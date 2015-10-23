package me.Ijcerdas.RealRealms;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RealRealms extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable(){		
		saveDefaultConfig();
		getLogger().info("== Real Realms has been Enabled! ==");
		getServer().getPluginManager().registerEvents(this, this);
		getCommand("rr").setExecutor(new MainCmd());;
		getCommand("realreload").setExecutor((this));
		getCommand("rk").setExecutor(new Kits());
		getServer().getPluginManager().registerEvents(new AddArmor(), this);
		getServer().getPluginManager().registerEvents(new Shouts(), this);
		getCommand("rs").setExecutor(new ShoutsList());
	}

	@Override
	public void onDisable(){
		getLogger().info("== Real Realms has been Disabled! ==");
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
			Player p = (Player) event.getPlayer();
			event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("Player Join Message").replace("%player%", p.getName())));
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player p = (Player) event.getPlayer();
		event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("Player Quit Message").replace("%player%", p.getName())));
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("realreload")) {
			if(sender.hasPermission("rr.reload")){
			reloadConfig();
			sender.sendMessage(ChatColor.AQUA + "System" + ChatColor.DARK_GRAY + " -=-" + ChatColor.GREEN + " Real Realms Has Been Reloaded.");
		}else{
			sender.sendMessage(ChatColor.AQUA + "System" + ChatColor.DARK_GRAY + " -=-" + ChatColor.RED + " Permission Denied.");
		}
		}
		return true;
		}
}

