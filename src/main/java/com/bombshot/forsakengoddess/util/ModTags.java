package com.bombshot.forsakengoddess.util;

import com.bombshot.forsakengoddess.ForsakenGoddess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FORSAKEN_TOOL = createTag("needs_forsaken_tool");
        public static final TagKey<Block> INCORRECT_FOR_FORSAKEN_TOOL = createTag("incorrect_for_forsaken_tool");

        public static final TagKey<Block> NEEDS_GODDESS_TOOL = createTag("needs_goddess_tool");
        public static final TagKey<Block> INCORRECT_FOR_GODDESS_TOOL = createTag("incorrect_for_goddess_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ForsakenGoddess.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item>  createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ForsakenGoddess.MODID, name));
        }
    }
}
