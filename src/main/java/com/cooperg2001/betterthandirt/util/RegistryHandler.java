package com.cooperg2001.betterthandirt.util;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.items.ArmorBase;
import com.cooperg2001.betterthandirt.items.bakeddirtarmor.*;
import com.cooperg2001.betterthandirt.items.dirtarmor.*;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials.CustArmorMaterial;

import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
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

    public static final RegistryObject<Item> TEST_CHEST = ITEMS.register("test_chest", () -> new ArmorBase(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));

    //NOTE: Clean these up to use a item type for DIRT and BAKED_DIRT instead of a seperate class for each armor
    public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> BAKED_DIRT_CHESTPLATE = ITEMS.register("baked_dirt_chestplate", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> BAKED_DIRT_HELMET = ITEMS.register("baked_dirt_helmet", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> BAKED_DIRT_LEGGINGS = ITEMS.register("baked_dirt_leggings", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> BAKED_DIRT_BOOTS = ITEMS.register("baked_dirt_boots", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));


}
