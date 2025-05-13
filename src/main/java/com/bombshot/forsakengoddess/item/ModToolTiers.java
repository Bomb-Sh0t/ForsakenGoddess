package com.bombshot.forsakengoddess.item;

import com.bombshot.forsakengoddess.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier FORSAKEN = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_FORSAKEN_TOOL,
            1950, 9f, 3f, 15, () -> Ingredient.of(ModItems.FORSAKEN_INGOT));

    public static final Tier Goddess = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_GODDESS_TOOL,
            2850, 12f, 4f, 25, () -> Ingredient.of(ModItems.EYE_OF_THE_GODDESS));

}
