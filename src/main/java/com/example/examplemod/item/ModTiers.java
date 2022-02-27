package com.example.examplemod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {

    public static final ForgeTier TITANIUM = new ForgeTier(1,1500,1f,
            4f, 10, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.TITANIUM_INGOT.get()));

}
