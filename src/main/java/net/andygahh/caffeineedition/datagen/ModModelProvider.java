package net.andygahh.caffeineedition.datagen;

import net.andygahh.caffeineedition.block.ModBlocks;
import net.andygahh.caffeineedition.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.COFFEE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RAW_COFFEE_BEAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ROASTED_COFFEE_BEAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GROUND_COFFEE_BEAN, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.EMPTY_COFFEE_MUG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FULL_COFFEE_MUG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMPTY_THERMOS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FULL_THERMOS, ModelTemplates.FLAT_ITEM);
    }
}
