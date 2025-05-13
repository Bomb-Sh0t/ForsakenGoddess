package com.bombshot.forsakengoddess.block;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ForsakenGoddess.MODID);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
