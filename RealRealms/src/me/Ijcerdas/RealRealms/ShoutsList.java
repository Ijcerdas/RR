package me.Ijcerdas.RealRealms;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ShoutsList implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("rs")){
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Invalid Argument! Use /rs help");
				return false;
				
			}else{
				if(args[0].equalsIgnoreCase("help")){
			sender.sendMessage(ChatColor.GRAY + "===============" + ChatColor.GOLD + " Real Shouts " + ChatColor.GRAY + "===============");
			sender.sendMessage(ChatColor.GREEN + "All Shouts Included in Real Realms:");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Whirlwind Sprint");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Wuld");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Nah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Kest");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Unrelenting Force");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Fus");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Ro");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Dah");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Throw Voice");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Zul");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Mey");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Gut");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Summon Durnehviir");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Dur");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Neh");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Viir");
			sender.sendMessage(ChatColor.AQUA + "Go on to " + ChatColor.YELLOW + "Page 2" + ChatColor.AQUA + " with " + ChatColor.YELLOW + "/realshouts 2");
			
		}else{
			if(args[0].equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Storm Call");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Strun");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Bah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Qo");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Slow Time");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Tiid");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Klo");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Ul");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Soul Tear");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Rii");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Vaaz");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Zol");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Marked For Death");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Krii");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Lun");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Aus");
			sender.sendMessage(ChatColor.AQUA + "Go on to " + ChatColor.YELLOW + "Page 3" + ChatColor.AQUA + " with " + ChatColor.YELLOW + "/realshouts 3");
			
			}else{
				if(args[0].equalsIgnoreCase("3")){
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Kyne's Peace");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Kaan");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Drem");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Ov");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Ice Form");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Liz");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Slen");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Nus");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Frost Breath");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Fo");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Krah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Diin");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Fire Breath");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Yol");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Toor");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Shul");
			sender.sendMessage(ChatColor.AQUA + "Go on to " + ChatColor.YELLOW + "Page 4" + ChatColor.AQUA + " with " + ChatColor.YELLOW + "/realshouts 4");
			
				}else{
					if(args[0].equalsIgnoreCase("4")){
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Elemental Fury");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Su");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Grah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Dun");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Drain Vitality");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Gaan");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Lah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Haas");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Dragonrend");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Joor");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Zah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Frul");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Dragon Aspect");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Mul");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Qah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Diiv");
			sender.sendMessage(ChatColor.AQUA + "Go on to " + ChatColor.YELLOW + "Page 5" + ChatColor.AQUA + " with " + ChatColor.YELLOW + "/realshouts 5");
			
					}else{
						if(args[0].equalsIgnoreCase("5")){
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Dismay");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Faas");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Ru");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Maar");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Disarm");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Zun");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Haal");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Viik");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Cyclone");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Ven");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Gar");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Nos");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Clear Skies");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Lok");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Vah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Koor");
			sender.sendMessage(ChatColor.AQUA + "Go on to " + ChatColor.YELLOW + "Page 6" + ChatColor.AQUA + " with " + ChatColor.YELLOW + "/realshouts 6");
			
						}else{
							if(args[0].equalsIgnoreCase("6")){
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Call of Valor");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Hun");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Kaal");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Zoor");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Call Dragon");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Od");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Ah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Viing");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Bend Will");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Gol");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Hah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Dov");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Become Ethereal");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Feim");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Zii");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Gron");
			sender.sendMessage(ChatColor.AQUA + "Go on to " + ChatColor.YELLOW + "Page 7" + ChatColor.AQUA + " with " + ChatColor.YELLOW + "/realshouts 7");
			
							}else{
								if(args[0].equalsIgnoreCase("7")){
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Battle Fury");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Mid");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Vur");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Shaan");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Aura Whisper");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Laas");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Yah");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Nir");
			sender.sendMessage(ChatColor.GOLD + "-----------------------------------------------------");
			sender.sendMessage(ChatColor.GRAY + "Animal Allegiance");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Raan");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Mir");
			sender.sendMessage(ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Tah");
									
								}else{
									sender.sendMessage(ChatColor.RED + "Unknown Command! Please use /rs help");
									
								}
							}
						}
					}
				}
			}
		}
	}

		}
		return true;
	}
	}


