package com.cooperg2001.betterthandirt.items;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import com.cooperg2001.betterthandirt.util.CustomArmorMaterials;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//NOTE: rewrite this so dirt extends a custom dirt armor class. Baked items will extend a bakedArmor class

public class dirt_chestplate extends ArmorItem{
    public dirt_chestplate() {
        super(CustomArmorMaterials.CustArmorMaterial.DIRT_ARMOR, EquipmentSlotType.CHEST, (new Item.Properties()).group(BetterThanDirt.TAB));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "betterthandirt:textures/models/armor/dirt_layer_1.png";
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BipedModel getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel original) {

        return super.getArmorModel(entityLiving, itemStack, armorSlot, original);
    }
}