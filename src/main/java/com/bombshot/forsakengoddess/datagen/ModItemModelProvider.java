package com.bombshot.forsakengoddess.datagen;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import com.bombshot.forsakengoddess.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ForsakenGoddess.MODID, existingFileHelper);
    }

    @Override
    //Register items to generate the held variants of them.
    protected void registerModels() {
        basicItem(ModItems.FORSAKEN_INGOT.get());
        basicItem(ModItems.EYE_OF_THE_GODDESS.get());
        basicItem(ModItems.GODDESS_SMITHING_TEMPLATE.get());
        basicItem(ModItems.LORE_TABLET.get());
        basicItem(ModItems.FATE_OF_THE_GODDESS.get());
        basicItem(ModItems.PADLOCK_KEY.get());
    }
}
