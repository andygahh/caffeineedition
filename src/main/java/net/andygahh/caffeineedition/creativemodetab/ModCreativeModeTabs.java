package net.andygahh.caffeineedition.creativemodetab;

import net.andygahh.caffeineedition.CaffeineEdition;
import net.andygahh.caffeineedition.block.ModBlocks;
import net.andygahh.caffeineedition.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab COFFEE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CaffeineEdition.MOD_ID, "coffee_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FULL_COFFEE_MUG))
                    .title(Component.translatable("creativemodetab.caffeineedition.coffee_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_COFFEE_BEAN);
                        output.accept(ModItems.ROASTED_COFFEE_BEAN);
                        output.accept(ModItems.GROUND_COFFEE_BEAN);
                        output.accept(ModItems.EMPTY_COFFEE_MUG);
                        output.accept(ModItems.EMPTY_THERMOS);
                        output.accept(ModItems.FULL_COFFEE_MUG);
                        output.accept(ModItems.FULL_THERMOS);


                    }).build());

    public static final CreativeModeTab COFFEE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CaffeineEdition.MOD_ID, "coffee_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.COFFEE_BLOCK))
                    .title(Component.translatable("creativemodetab.caffeineedition.coffee_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.COFFEE_BLOCK);



                    }).build());




    public static void registerModCreativeModeTabs() {
        CaffeineEdition.LOGGER.info(String.format("Registering Creative Mode Tabs for %s", CaffeineEdition.MOD_ID));
    }

}
