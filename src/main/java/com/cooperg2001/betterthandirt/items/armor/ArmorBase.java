package com.cooperg2001.betterthandirt.items.armor;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

//NOTE: this function allows for condensing of code from earlier versions. Instead of having a class for each item, the item is of type ArmorBase and it's specific values
//are passed in at registration.

//NOTE: For armors that crumble a another class file with the crumble method should be extended instead of this one

//Note: to create armors that are crafted with low durability do MAX_HEALTH - (MAX_HEALTH-DESIRED_REDUCTION)

public class ArmorBase extends ArmorItem {

    private EquipmentSlotType SlotType;
    private int DegradeCount = 0;

    public ArmorBase(CustomArmorMaterials.CustArmorMaterial mat, EquipmentSlotType type, Properties props) {
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
            DegradeCount = 0;
        }

        if (degrade) {
            if (SlotType == EquipmentSlotType.HEAD) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.HEAD);});
                }

            } else if (SlotType == EquipmentSlotType.CHEST) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.CHEST);});
                }

            } else if (SlotType == EquipmentSlotType.LEGS) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.LEGS);});
                }

            } else if (SlotType == EquipmentSlotType.FEET) {
                if (!world.isRemote && stack.getDamage() <= CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR.getDurability(SlotType)) {
                    stack.damageItem(1, player, (p_220038_0_) -> {p_220038_0_.sendBreakAnimation(EquipmentSlotType.FEET);});
                }

            }
        }

    }
}
