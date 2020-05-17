package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

//NOTE: rewrite this so dirt extends a custom dirt armor class. Baked items will extend a bakedArmor class

public class baked_dirt_chestplate extends ArmorItem{
    public baked_dirt_chestplate() {
        super(CustomArmorMaterials.CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.CHEST, (new Properties()).group(BetterThanDirt.TAB));
    }

}