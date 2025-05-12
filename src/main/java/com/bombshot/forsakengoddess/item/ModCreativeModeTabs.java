package com.bombshot.forsakengoddess.item;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForsakenGoddess.MODID);

    public static final Supplier<CreativeModeTab> FORSAKEN_GODDESS_TAB = CREATIVE_MODE_TAB.register("forsaken_goddess_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FATE_OF_THE_GODDESS.get()))
                    .title(Component.translatable("creativetab.forsaken_goddess.tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Insert items into the tab here in the order in which they should appear in game
                        output.accept(ModItems.FORSAKEN_INGOT);
                        output.accept(ModItems.LORE_TABLET);
                        output.accept(ModItems.FATE_OF_THE_GODDESS);
                        output.accept(ModItems.EYE_OF_THE_GODDESS);
                        output.accept(ModItems.GODDESS_SMITHING_TEMPLATE);
                        output.accept(ModItems.PADLOCK_KEY);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
