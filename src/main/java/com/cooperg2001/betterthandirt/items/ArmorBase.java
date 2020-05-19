package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

//NOTE: this function allows for condensing of code from earlier versions. Instead of having a class for each item, the item is of type ArmorBase and it's specific values
//are passed in at registration.

//NOTE: For armors that crumble a another class file with the crumble method should be extended instead of this one

public class ArmorBase extends ArmorItem {

    public final EquipmentSlotType type = null;

    public ArmorBase(CustomArmorMaterials.CustArmorMaterial mat, EquipmentSlotType type, Properties props) {
        super(mat, type, props);

    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            //Return path to generic layer two
            return null;

        } else {
            //return path to generic layer one
            return null;
        }


    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BipedModel getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel original) {

        return super.getArmorModel(entityLiving, itemStack, armorSlot, original);
    }



}
