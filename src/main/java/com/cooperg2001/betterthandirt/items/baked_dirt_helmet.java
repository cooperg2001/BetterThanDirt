package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class baked_dirt_helmet extends ArmorItem {
    public baked_dirt_helmet() {
        super(CustomArmorMaterials.CustArmorMaterial.BAKED_DIRT_ARMOR, EquipmentSlotType.HEAD, (new Properties()).group(BetterThanDirt.TAB));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "betterthandirt:textures/models/armor/baked_dirt_layer_1.png";
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BipedModel getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel original) {

        return super.getArmorModel(entityLiving, itemStack, armorSlot, original);
    }

}
