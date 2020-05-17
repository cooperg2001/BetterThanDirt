package com.cooperg2001.betterthandirt.util;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BetterThanDirt.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, BetterThanDirt.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items

    //NOTE: Clean these up to use a item type for DIRT and BAKED_DIRT instead of a seperate class for each armor
    public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", dirt_chestplate::new);
    public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", dirt_helmet::new);
    public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", dirt_leggings::new);
    public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", dirt_boots::new);

    public static final RegistryObject<Item> BAKED_DIRT_CHESTPLATE = ITEMS.register("baked_dirt_chestplate", baked_dirt_chestplate::new);
    public static final RegistryObject<Item> BAKED_DIRT_HELMET = ITEMS.register("baked_dirt_helmet", baked_dirt_helmet::new);
    public static final RegistryObject<Item> BAKED_DIRT_LEGGINGS = ITEMS.register("baked_dirt_leggings", baked_dirt_leggings::new);
    public static final RegistryObject<Item> BAKED_DIRT_BOOTS = ITEMS.register("baked_dirt_boots", baked_dirt_boots::new);


}
