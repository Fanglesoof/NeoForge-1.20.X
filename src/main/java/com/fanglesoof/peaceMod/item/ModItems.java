package com.fanglesoof.peaceMod.item;

import com.fanglesoof.peaceMod.PeaceMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PeaceMod.MOD_ID);

    // Neues Item (hier: "bismuth") registrieren.
    public static final DeferredItem<Item> BISMUTH = ITEMS.register(
            "bismuth",
            () -> new Item(new Item.Properties())
    );
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register(
            "raw_bismuth",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
