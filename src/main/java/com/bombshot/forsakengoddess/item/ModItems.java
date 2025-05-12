package com.bombshot.forsakengoddess.item;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import net.minecraft.world.item.BookItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ForsakenGoddess.MODID);

    public static final DeferredItem<Item> FORSAKEN_INGOT = ITEMS.register("forsaken_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<BookItem> FATE_OF_THE_GODDESS = ITEMS.register("fate_of_the_goddess",
            () -> new BookItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> PADLOCK_KEY = ITEMS.register("padlock_key",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> EYE_OF_THE_GODDESS = ITEMS.register("eye_of_the_goddess",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final DeferredItem<Item> LORE_TABLET = ITEMS.register("lore_tablet",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final DeferredItem<Item> GODDESS_SMITHING_TEMPLATE = ITEMS.register("goddess_smithing_template",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
