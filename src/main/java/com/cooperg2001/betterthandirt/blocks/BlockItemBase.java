package com.cooperg2001.betterthandirt.blocks;

import com.cooperg2001.betterthandirt.BetterThanDirt;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(BetterThanDirt.TAB));
    }

}
