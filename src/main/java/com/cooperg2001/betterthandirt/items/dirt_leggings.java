package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class dirt_leggings extends ArmorItem {
    public dirt_leggings() {
        super(CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.LEGS, (new Item.Properties()).group(BetterThanDirt.TAB));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "betterthandirt:textures/models/armor/dirt_layer_2.png";
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BipedModel getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel original) {

        return super.getArmorModel(entityLiving, itemStack, armorSlot, original);
    }

}
