package com.cooperg2001.betterthandirt.util;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum CustToolTeir implements IItemTier {
    //DURATANIUM(3, 800, 7.0F, 3.0F, 12, () -> {
      //  return Ingredient.fromItems(RegistryHandler.DURATANIUM_INGOT.get());
    //}),
    ANDESITE(2, 131, 4.0F, 1.0F, 5, () -> Ingredient.fromItems(Items.ANDESITE)),
    DIRT(1, 12, 1.0F, 1.0F, 0, () -> Ingredient.fromItems(Items.ANDESITE)),
    BAKED_DIRT(1, 24, 2.0F, 1.0F, 0, () -> Ingredient.fromItems(Items.ANDESITE)),
    DIORITE(2, 131, 4.0F, 1.0F, 5, () -> Ingredient.fromItems(Items.ANDESITE)),
    GRANITE(2, 131, 4.0F, 1.0F, 5, () -> Ingredient.fromItems(Items.ANDESITE)),
    REDSTONE(2, 32, 10.0F, 4.0F, 5, () -> Ingredient.fromItems(Items.ANDESITE)),
    LAPIS(2, 32, 4.0F, 3.0F, 22, () -> Ingredient.fromItems(Items.ANDESITE)),
    EMERALD(3, 1561, 10.0F, 7.0F, 11, () -> Ingredient.fromItems(Items.EMERALD));


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    //Constructor
    CustToolTeir(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
