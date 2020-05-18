package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class stone_armor extends ArmorBase{
    public stone_armor(CustomArmorMaterials.CustArmorMaterial mat, EquipmentSlotType type, Item.Properties props) {
        super(mat, type, props);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            //Return path to generic layer two
            return "betterthandirt:textures/models/armor/stone_layer_2.png";

        } else {
            //return path to generic layer one
            return "betterthandirt:textures/models/armor/stone_layer_1.png";
        }


    }

}
