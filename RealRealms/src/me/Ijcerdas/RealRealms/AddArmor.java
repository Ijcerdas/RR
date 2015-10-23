package me.Ijcerdas.RealRealms;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AddArmor implements Listener{
	
	@EventHandler
	public void onArmorUsage(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		ItemStack air = new ItemStack(Material.AIR);
		if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
			if(p.getItemInHand().getType() == Material.LEATHER_HELMET) {
				p.sendMessage(ChatColor.GREEN + "Leather Helmet Equipped!");
				p.getInventory().setItem(26, air);
				p.getInventory().setItem(25, air);
				p.getInventory().setItem(24, air);
				p.getInventory().setItem(23, air);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000, 1));
				p.updateInventory();
			}else{
				
				if(p.getItemInHand().getType() == Material.LEATHER_CHESTPLATE) {
					p.sendMessage(ChatColor.GREEN + "Leather ChestPlate Equipped!");
					p.getInventory().setItem(22, air);
					p.getInventory().setItem(21, air);
					p.getInventory().setItem(20, air);
					p.getInventory().setItem(19, air);
					p.getInventory().setItem(18, air);
					p.getInventory().setItem(17, air);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000, 2));
					p.updateInventory();
			}else{
				
				if(p.getItemInHand().getType() == Material.LEATHER_LEGGINGS) {
					p.sendMessage(ChatColor.GREEN + "Leather Pants Equipped!");
					p.getInventory().setItem(16, air);
					p.getInventory().setItem(15, air);
					p.getInventory().setItem(14, air);
					p.getInventory().setItem(13, air);
					p.getInventory().setItem(12, air);
					p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000, 3));
					p.updateInventory();
				
				}else{
					
					if(p.getItemInHand().getType() == Material.LEATHER_BOOTS) {
						p.sendMessage(ChatColor.GREEN + "Leather Boots Equipped!");
						p.getInventory().setItem(11, air);
						p.getInventory().setItem(10, air);
						p.getInventory().setItem(9, air);
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000, 4));
						p.updateInventory();
					
				}
				}
			}
			
		}
		
		}
		
	}

}

