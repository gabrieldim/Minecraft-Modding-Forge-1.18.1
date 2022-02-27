package com.example.examplemod.block.custom;

import com.example.examplemod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class TomatoPlantBlock extends CropBlock {


    public TomatoPlantBlock(Properties p_52247_) {
        super(p_52247_);
    }



    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.TOMATO_SEEDS.get();
    }
}
