package net.max.mcmod1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.max.mcmod1.McMod1;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //calls all Items at Mod start
    public static void registerModItems(){
        McMod1.LOGGER.info("Registering Mod Items for " + McMod1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

    //standard function to integrate Item from above into Mod.
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(McMod1.MOD_ID,name),item);
    }


    //create new Item. Automatically calls registerItem
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));


    //adds Item to creative Inventory
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
    }








}
