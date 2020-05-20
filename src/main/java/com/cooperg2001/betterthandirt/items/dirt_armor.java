package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class dirt_armor extends ArmorItem {
    private EquipmentSlotType SlotType;
    private int DegradeCount = 0;

    public dirt_armor(CustomArmorMaterials.CustArmorMaterial mat, EquipmentSlotType type, Properties props) {
        super(mat, type, props);
        SlotType = type;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            //Return path to generic layer two
            return "betterthandirt:textures/models/armor/dirt_layer_2.png";

        } else {
            //return path to generic layer one
            return "betterthandirt:textures/models/armor/dirt_layer_1.png";
        }


    }

    //This is the crumble effect
    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        DegradeCount++;
        boolean degrade = false;

        //decide if armor will degrade this tick
        if (DegradeCount == 100) {
            degrade = true;
        }

        if (degrade) {
            if (slot == EquipmentSlotType.HEAD) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.HEAD);});
                }

            } else if (slot == EquipmentSlotType.CHEST) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.CHEST);});
                }

            } else if (slot == EquipmentSlotType.LEGS) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.LEGS);});
                }

            } else if (slot == EquipmentSlotType.FEET) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.FEET);});
                }

            }
        }

    }
}

