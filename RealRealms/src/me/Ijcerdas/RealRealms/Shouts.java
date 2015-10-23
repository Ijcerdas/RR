package me.Ijcerdas.RealRealms;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Shouts implements Listener{
	
	@EventHandler
	public void onDragonShout(AsyncPlayerChatEvent e) {
		if(e.getMessage().toLowerCase().contentEquals("fus ro dah")){
			if(e.getPlayer().hasPermission("rs.unrelentingforce")){
			e.getPlayer().sendMessage(ChatColor.DARK_RED + "ROOOOOOOOOAAAAAAAARRRRRR!");
			e.setCancelled(true);
		}else{
			e.setCancelled(false);
		}
		}
			
	}

}

