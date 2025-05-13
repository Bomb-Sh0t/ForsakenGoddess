package com.bombshot.forsakengoddess.datagen;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import com.bombshot.forsakengoddess.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ForsakenGoddess.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ItemTags.BOOKSHELF_BOOKS)
                .add(ModItems.FATE_OF_THE_GODDESS.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.FORSAKEN_SWORD.get())
                .add(ModItems.GODDESS_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.FORSAKEN_PICKAXE.get())
                .add(ModItems.GODDESS_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.FORSAKEN_SHOVEL.get())
                .add(ModItems.GODDESS_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.FORSAKEN_AXE.get())
                .add(ModItems.GODDESS_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.FORSAKEN_HOE.get())
                .add(ModItems.GODDESS_HOE.get());

    }
}
