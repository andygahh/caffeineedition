package net.andygahh.caffeineedition;

import net.andygahh.caffeineedition.block.ModBlocks;
import net.andygahh.caffeineedition.creativemodetab.ModCreativeModeTabs;
import net.andygahh.caffeineedition.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaffeineEdition implements ModInitializer {
	public static final String MOD_ID = "caffeineedition";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
