package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

//NOTE: rewrite this so dirt extends a custom dirt armor class. Baked items will extend a bakedArmor class

public class dirt_chestplate extends ArmorItem{
    public dirt_chestplate() {
        super(CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB));
    }

}