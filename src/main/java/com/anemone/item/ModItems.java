package com.anemone.item;

import com.anemone.ZnicMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new Item.Settings()));

    private static Item registerItems(String id,Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(ZnicMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(ZnicMod.MOD_ID,id), item);
    }

    public static void registerModItems() {
        ZnicMod.LOGGER.info("Registering Mod Items");
    }
}
