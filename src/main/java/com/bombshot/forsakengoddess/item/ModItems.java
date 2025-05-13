package com.bombshot.forsakengoddess.item;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    //Adding key items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ForsakenGoddess.MODID);

    public static final DeferredItem<Item> FORSAKEN_INGOT = ITEMS.register("forsaken_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FATE_OF_THE_GODDESS = ITEMS.register("fate_of_the_goddess",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> PADLOCK_KEY = ITEMS.register("padlock_key",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> EYE_OF_THE_GODDESS = ITEMS.register("eye_of_the_goddess",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final DeferredItem<Item> LORE_TABLET = ITEMS.register("lore_tablet",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final DeferredItem<Item> GODDESS_SMITHING_TEMPLATE = ITEMS.register("goddess_smithing_template",
            () -> new Item(new Item.Properties()));



    //Adding tools and weapons

    //Forsaken Sword and Tools
    public static final DeferredItem<SwordItem> FORSAKEN_SWORD = ITEMS.register("forsaken_sword",
            () -> new SwordItem(ModToolTiers.FORSAKEN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.FORSAKEN, 8, -2.2f))));

    public static final DeferredItem<PickaxeItem> FORSAKEN_PICKAXE = ITEMS.register("forsaken_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FORSAKEN, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.FORSAKEN, 2, -2.8f))));

    public static final DeferredItem<ShovelItem> FORSAKEN_SHOVEL = ITEMS.register("forsaken_shovel",
            () -> new ShovelItem(ModToolTiers.FORSAKEN, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.FORSAKEN, 2, -3.0f))));

    public static final DeferredItem<AxeItem> FORSAKEN_AXE = ITEMS.register("forsaken_axe",
            () -> new AxeItem(ModToolTiers.FORSAKEN, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.FORSAKEN, 9, -3.2f))));

    public static final DeferredItem<HoeItem> FORSAKEN_HOE = ITEMS.register("forsaken_hoe",
            () -> new HoeItem(ModToolTiers.FORSAKEN, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.FORSAKEN, 2, -3.0f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
