package net.andygahh.caffeineedition.item;

import net.andygahh.caffeineedition.CaffeineEdition;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static final Item RAW_COFFEE_BEAN = registerItem("raw_coffee_bean", Item::new);
    public static final Item ROASTED_COFFEE_BEAN = registerItem("roasted_coffee_bean", Item::new);
    public static final Item GROUND_COFFEE_BEAN = registerItem("ground_coffee_bean", Item::new);

    public static final Item EMPTY_COFFEE_MUG = registerItem("empty_coffee_mug", Item::new);
    public static final Item FULL_COFFEE_MUG = registerItem("full_coffee_mug", Item::new);
    public static final Item EMPTY_THERMOS = registerItem("empty_thermos", Item::new);
    public static final Item FULL_THERMOS = registerItem("full_thermos", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CaffeineEdition.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CaffeineEdition.MOD_ID, name)))));
    }

    public static void registerModItems() {
        CaffeineEdition.LOGGER.info(String.format("Registering Mod Items for %s", CaffeineEdition.MOD_ID));

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(RAW_COFFEE_BEAN);
            output.accept(ROASTED_COFFEE_BEAN);
            output.accept(GROUND_COFFEE_BEAN);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            output.accept(EMPTY_COFFEE_MUG);
            output.accept(EMPTY_THERMOS);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(FULL_COFFEE_MUG);
            output.accept(FULL_THERMOS);
        });
    }

}
