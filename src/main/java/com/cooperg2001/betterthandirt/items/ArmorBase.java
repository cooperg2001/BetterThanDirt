package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ArmorItem {

    public final EquipmentSlotType type = null;

    public ArmorBase(ArmorMaterial mat, EquipmentSlotType type, Properties props) {
        super(mat, type, props);

    }



}
