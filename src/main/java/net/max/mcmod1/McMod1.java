package net.max.mcmod1;

import net.fabricmc.api.ModInitializer;

import net.max.mcmod1.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class McMod1 implements ModInitializer {
	public static final String MOD_ID = "mcmod1";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();    //calls for all Items when initializing (function in ModItems)
	}
    }