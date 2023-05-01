package me.windmc.enchantre;

import me.windmc.enchantre.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class enchantre implements ModInitializer {

    public static final String Modid = "enchantre";

    public static final ItemGroup ENCHANT_REIMAGINED = FabricItemGroup.builder(new Identifier(Modid, "enchant_reimagined_group"))
        .icon(() -> new ItemStack(modBlocks.CRYSTAL_TABLE))
        .build();


    @Override
    public void onInitialize() {
        modBlocks.init();
        modTags.init();
        modBanner.init();
        modItems.init();
    }
}

