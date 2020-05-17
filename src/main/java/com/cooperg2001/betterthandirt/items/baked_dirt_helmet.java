package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class baked_dirt_helmet extends ArmorItem {
    public baked_dirt_helmet() {
        super(CustomArmorMaterials.CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.HEAD, (new Properties()).group(BetterThanDirt.TAB));
    }

}
