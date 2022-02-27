package com.example.examplemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorial_mod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };

    public static final CreativeModeTab TUTORIAL_TAB2 = new CreativeModeTab("tutorialModTab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_NUGGET.get());
        }
    };
}
