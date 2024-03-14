package me.immortal.opchestsrandomizer;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.loot.LootTables;

import java.util.ArrayList;
import java.util.Random;


public class OPChestRandomizer_Listener implements Listener {
    OPChestRandomizer_Command opChestRandomizerCommand = new OPChestRandomizer_Command();
    Random random = new Random();
    @EventHandler
    public void placeBlock(BlockPlaceEvent e){


        if (opChestRandomizerCommand.getActivationStatus()){
            if (e.getBlockPlaced().getType().equals(Material.CHEST)){

                Chest chest = (Chest) e.getBlockPlaced().getState();
                chest.setLootTable(Bukkit.getLootTable(opChestRandomizerCommand.getLoot()[random.nextInt(opChestRandomizerCommand.getLoot().length)].getKey()));
                chest.update();
            }

        }
    }

}
