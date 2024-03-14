package me.immortal.opchestsrandomizer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.loot.LootTables;


public class OPChestRandomizer_Command implements CommandExecutor {
    public LootTables[] loot = {LootTables.BASTION_BRIDGE,
            LootTables.BASTION_TREASURE,
            LootTables.BURIED_TREASURE,
            LootTables.VILLAGE_TOOLSMITH,
            LootTables.VILLAGE_WEAPONSMITH,
            LootTables.WOODLAND_MANSION,
            LootTables.STRONGHOLD_LIBRARY,
            LootTables.STRONGHOLD_CROSSING,
            LootTables.STRONGHOLD_CORRIDOR,
            LootTables.RUINED_PORTAL,
            LootTables.PILLAGER_OUTPOST,
            LootTables.NETHER_BRIDGE,
            LootTables.SHIPWRECK_TREASURE,
            LootTables.JUNGLE_TEMPLE,
            LootTables.BASTION_HOGLIN_STABLE,
            LootTables.END_CITY_TREASURE,
            LootTables.ABANDONED_MINESHAFT,
            LootTables.ANCIENT_CITY,
            LootTables.ANCIENT_CITY_ICE_BOX,
            LootTables.DESERT_PYRAMID,
            LootTables.SHIPWRECK_SUPPLY

    };
    public static boolean activateChests;

    public boolean getActivationStatus(){
        return activateChests;
    }

    public LootTables[] getLoot(){
        return loot;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            if(activateChests){
                activateChests = false;
                commandSender.sendMessage(ChatColor.RED + " " + ChatColor.BOLD + "OPChests plugin deactivated");
            }
            else{
                activateChests = true;
                commandSender.sendMessage(ChatColor.GREEN + " " + ChatColor.BOLD + "OPChests plugin activated");


            }
        }


        return false;
    }
}
