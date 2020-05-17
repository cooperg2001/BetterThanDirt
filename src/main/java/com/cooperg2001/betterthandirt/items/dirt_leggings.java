package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;

public class dirt_leggings extends ArmorItem {
    public dirt_leggings() {
        super(CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB));
    }

}
