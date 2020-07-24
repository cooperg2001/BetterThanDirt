package com.cooperg2001.betterthandirt.util;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.blocks.ArmorTable;
import com.cooperg2001.betterthandirt.blocks.BlockItemBase;
import com.cooperg2001.betterthandirt.blocks.DurataniumBlock;
import com.cooperg2001.betterthandirt.blocks.DurataniumOre;
import com.cooperg2001.betterthandirt.items.ItemBase;
import com.cooperg2001.betterthandirt.items.armor.*;
import com.cooperg2001.betterthandirt.items.armor.cobblestone_armor;
import com.cooperg2001.betterthandirt.items.tools.dirt_armor;
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
    //public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
   // public static final RegistryObject<Item>  DURATANIUM_INGOT = ITEMS.register("duratanium_ingot", ItemBase::new);


    //Blocks
   // public static final RegistryObject<Block> ARMOR_TABLE = BLOCKS.register("armor_table", ArmorTable::new);
   // public static final RegistryObject<Block> DURATANIUM_BLOCK = BLOCKS.register("duratanium_block", DurataniumBlock::new);
    //public static final RegistryObject<Block> DURATANIUM_ORE = BLOCKS.register("duratanium_ore", DurataniumOre::new);

    //Block Items
   // public static final RegistryObject<Item> ARMOR_TABLE_ITEM = ITEMS.register("armor_table", () -> new BlockItemBase(ARMOR_TABLE.get()));
   // public static final RegistryObject<Item> DURATANIUM_BLOCK_ITEM = ITEMS.register("duratanium_block", () -> new BlockItemBase(DURATANIUM_BLOCK.get()));

    //public static final RegistryObject<Item> TEST_CHEST = ITEMS.register("test_chest", () -> new ArmorBase(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));

    //NOTE: Clean these up to use a item type for DIRT and BAKED_DIRT instead of a seperate class for each armor

    //Armor
    public static final RegistryObject<Item> DIRT_CHESTPLATE = ITEMS.register("dirt_chestplate", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIRT_HELMET = ITEMS.register("dirt_helmet", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIRT_LEGGINGS = ITEMS.register("dirt_leggings", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIRT_BOOTS = ITEMS.register("dirt_boots", () -> new dirt_armor(CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> BAKED_DIRT_CHESTPLATE = ITEMS.register("baked_dirt_chestplate", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> BAKED_DIRT_HELMET = ITEMS.register("baked_dirt_helmet", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> BAKED_DIRT_LEGGINGS = ITEMS.register("baked_dirt_leggings", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> BAKED_DIRT_BOOTS = ITEMS.register("baked_dirt_boots", () -> new baked_dirt_armor(CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> COBBLESTONE_CHESTPLATE = ITEMS.register("cobblestone_chestplate", () -> new cobblestone_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> COBBLESTONE_HELMET = ITEMS.register("cobblestone_helmet", () -> new cobblestone_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> COBBLESTONE_LEGGINGS = ITEMS.register("cobblestone_leggings", () -> new cobblestone_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> COBBLESTONE_BOOTS = ITEMS.register("cobblestone_boots", () -> new cobblestone_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate", () -> new stone_armor(CustArmorMaterial.STONE_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> STONE_HELMET = ITEMS.register("stone_helmet", () -> new stone_armor(CustArmorMaterial.STONE_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings", () -> new stone_armor(CustArmorMaterial.STONE_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> STONE_BOOTS = ITEMS.register("stone_boots", () -> new stone_armor(CustArmorMaterial.STONE_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> ANDESITE_CHESTPLATE = ITEMS.register("andesite_chestplate", () -> new andesite_armor(CustArmorMaterial.ANDESITE_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> ANDESITE_HELMET = ITEMS.register("andesite_helmet", () -> new andesite_armor(CustArmorMaterial.ANDESITE_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> ANDESITE_LEGGINGS = ITEMS.register("andesite_leggings", () -> new andesite_armor(CustArmorMaterial.ANDESITE_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> ANDESITE_BOOTS = ITEMS.register("andesite_boots", () -> new andesite_armor(CustArmorMaterial.ANDESITE_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> DIORITE_CHESTPLATE = ITEMS.register("diorite_chestplate", () -> new diorite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIORITE_HELMET = ITEMS.register("diorite_helmet", () -> new diorite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIORITE_LEGGINGS = ITEMS.register("diorite_leggings", () -> new diorite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> DIORITE_BOOTS = ITEMS.register("diorite_boots", () -> new diorite_armor(CustArmorMaterial.COBBLESTONE_ARMOR  , EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> GRANITE_CHESTPLATE = ITEMS.register("granite_chestplate", () -> new granite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> GRANITE_HELMET = ITEMS.register("granite_helmet", () -> new granite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> GRANITE_LEGGINGS = ITEMS.register("granite_leggings", () -> new granite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> GRANITE_BOOTS = ITEMS.register("granite_boots", () -> new granite_armor(CustArmorMaterial.COBBLESTONE_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));

    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(CustArmorMaterial.EMERALD_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(CustArmorMaterial.EMERALD_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(CustArmorMaterial.EMERALD_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(CustArmorMaterial.EMERALD_ARMOR, EquipmentSlotType.FEET, (new Item.Properties()).group(BetterThanDirt.TAB)));



    //Swords
    //public static final RegistryObject<SwordItem> DURATANIUM_SWORD = ITEMS.register("duratanium_sword", () ->
    //        new SwordItem(CustToolTeir.DURATANIUM, 3, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<SwordItem> ANDESITE_SWORD = ITEMS.register("andesite_sword", () ->
            new SwordItem(CustToolTeir.ANDESITE, 1, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<SwordItem> DIORITE_SWORD = ITEMS.register("diorite_sword", () ->
            new SwordItem(CustToolTeir.DIORITE, 1, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<SwordItem> GRANITE_SWORD = ITEMS.register("granite_sword", () ->
            new SwordItem(CustToolTeir.GRANITE, 1, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

   // public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
      //      new SwordItem(CustToolTeir.EMERALD, 4, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    //Pickaxes
    public static final RegistryObject<PickaxeItem> ANDESITE_PICKAXE = ITEMS.register("andesite_pickaxe", () ->
            new PickaxeItem(CustToolTeir.ANDESITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<PickaxeItem> DIORITE_PICKAXE = ITEMS.register("diorite_pickaxe", () ->
            new PickaxeItem(CustToolTeir.DIORITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<PickaxeItem> GRANITE_PICKAXE = ITEMS.register("granite_pickaxe", () ->
            new PickaxeItem(CustToolTeir.GRANITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

   // public static final RegistryObject<PickaxeItem>EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
     //       new PickaxeItem(CustToolTeir.EMERALD, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));


    //Shovels
    public static final RegistryObject<ShovelItem> ANDESITE_SHOVEL = ITEMS.register("andesite_shovel", () ->
            new ShovelItem(CustToolTeir.ANDESITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<ShovelItem> DIORITE_SHOVEL = ITEMS.register("diorite_shovel", () ->
            new ShovelItem(CustToolTeir.DIORITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<ShovelItem> GRANITE_SHOVEL = ITEMS.register("granite_shovel", () ->
            new ShovelItem(CustToolTeir.GRANITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    //public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
     //       new ShovelItem(CustToolTeir.EMERALD, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    //Axes
    public static final RegistryObject<AxeItem> ANDESITE_AXE = ITEMS.register("andesite_axe", () ->
            new AxeItem(CustToolTeir.ANDESITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<AxeItem> DIORITE_AXE = ITEMS.register("diorite_axe", () ->
            new AxeItem(CustToolTeir.DIORITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<AxeItem> GRANITE_AXE = ITEMS.register("granite_axe", () ->
            new AxeItem(CustToolTeir.GRANITE, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

   // public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
    //        new AxeItem(CustToolTeir.EMERALD, 2, -2.4F, new Item.Properties().group(BetterThanDirt.TAB)));

    //Hoes
    public static final RegistryObject<HoeItem> ANDESITE_HOE = ITEMS.register("andesite_hoe", () ->
            new HoeItem(CustToolTeir.ANDESITE, 2,  new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<HoeItem> DIORITE_HOE = ITEMS.register("diorite_hoe", () ->
            new HoeItem(CustToolTeir.DIORITE, 2,  new Item.Properties().group(BetterThanDirt.TAB)));

    public static final RegistryObject<HoeItem> GRANITE_HOE = ITEMS.register("granite_hoe", () ->
            new HoeItem(CustToolTeir.GRANITE, 2,  new Item.Properties().group(BetterThanDirt.TAB)));

   // public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
     //       new HoeItem(CustToolTeir.EMERALD, 2,  new Item.Properties().group(BetterThanDirt.TAB)));

}
