package com.bombshot.forsakengoddess.datagen;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import com.bombshot.forsakengoddess.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

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
        basicItem(ModItems.FORSAKEN_SMITHING_TEMPLATE.get());
        basicItem(ModItems.LORE_TABLET.get());
        basicItem(ModItems.FATE_OF_THE_GODDESS.get());
        basicItem(ModItems.PADLOCK_KEY.get());


        handheldItem(ModItems.FORSAKEN_SWORD);
        handheldItem(ModItems.FORSAKEN_PICKAXE);
        handheldItem(ModItems.FORSAKEN_SHOVEL);
        handheldItem(ModItems.FORSAKEN_AXE);
        handheldItem(ModItems.FORSAKEN_HOE);

        handheldItem(ModItems.GODDESS_SWORD);
        handheldItem(ModItems.GODDESS_PICKAXE);
        handheldItem(ModItems.GODDESS_SHOVEL);
        handheldItem(ModItems.GODDESS_AXE);
        handheldItem(ModItems.GODDESS_HOE);

    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ForsakenGoddess.MODID,"item/" + item.getId().getPath()));
    }
}
