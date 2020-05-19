package com.cooperg2001.betterthandirt.util;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nonnull;

import java.util.function.Supplier;

public class CustomArmorMaterials {
    public enum CustArmorMaterial implements IArmorMaterial {
        DIRT_ARMOR("dirt_armor", 2, new int[]{1, 1, 1, 1}, 2, () -> SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Items.DIRT, 0),
        BAKED_DIRT_ARMOR("baked_dirt_armor", 4, new int[]{1, 3, 5, 2}, 2, () -> SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Items.DIRT, 1),
        COBBLESTONE_ARMOR("cobblestone_armor", 4, new int[]{2, 2, 2, 2}, 2, () -> SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Items.COBBLESTONE, 1),
        STONE_ARMOR("stone_armor", 8, new int[]{2, 3, 5, 2}, 2, () -> SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Items.STONE, 2),
        ANDESITE_ARMOR("stone_armor", 8, new int[]{2, 3, 5, 2}, 2, () -> SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Items.STONE, 2);

        private final String name;
        private final int durabilityMultiplier;
        private final int[] damageReduction;
        private final int enchantability;
        private final Supplier<SoundEvent> equipSound;
        private final Supplier<Item> repairItem;
        private final float toughness;
        private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};

        CustArmorMaterial(String name, int durabilityMultiplier, int[] damageReduction, int enchantability, Supplier<SoundEvent> equipSound, Supplier<Item> repairItem, float toughness) {
            this.name = name;
            this.durabilityMultiplier = durabilityMultiplier;
            this.damageReduction = damageReduction;
            this.enchantability = enchantability;
            this.equipSound = equipSound;
            this.repairItem = repairItem;
            this.toughness = toughness;
        }

        @Override
        public int getDurability(EquipmentSlotType slot) {
            return durabilityMultiplier * MAX_DAMAGE_ARRAY[slot.getIndex()];
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slot) {
            return damageReduction[slot.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Nonnull
        @Override
        public SoundEvent getSoundEvent() {
            return equipSound.get();
        }

        @Nonnull
        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(repairItem.get());
        }

        @Nonnull
        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }
    }

}




