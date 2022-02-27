package com.example.examplemod.data;

import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.block.custom.TomatoPlantBlock;
import com.example.examplemod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {

        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TITANIUM_ORE.get());
        this.dropSelf(ModBlocks.TEST_BLOCK.get());
        this.dropSelf(ModBlocks.TOMATO_PLANT.get());



        this.add(ModBlocks.TITANIUM_ORE.get(), (block) -> {
            return createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.TITANIUM_RAW.get());
        });


        LootItemCondition.Builder tomatoLootConditionBuilder = LootItemBlockStatePropertyCondition.
                hasBlockStateProperties(ModBlocks.TOMATO_PLANT.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TomatoPlantBlock.AGE,
                        7));

        this.add(ModBlocks.TOMATO_PLANT.get(), createCropDrops(ModBlocks.TOMATO_PLANT.get(),
                ModItems.TOMATO_SEEDS.get(), ModItems.TOMATO_SEEDS.get(), tomatoLootConditionBuilder));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
