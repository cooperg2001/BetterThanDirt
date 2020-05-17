package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class dirt_helmet extends ArmorItem {
    public dirt_helmet() {
        super(CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.HEAD, (new Item.Properties()).group(BetterThanDirt.TAB));
    }

}
