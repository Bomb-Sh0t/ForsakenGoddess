package com.bombshot.forsakengoddess.datagen;

import com.bombshot.forsakengoddess.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FATE_OF_THE_GODDESS.get())
                .pattern("TTT")
                .pattern("TBT")
                .pattern("TTT")
                .define('T', ModItems.LORE_TABLET.get())
                .define('B', Items.BOOK)
                .unlockedBy("has_lore_tablet", has(ModItems.LORE_TABLET)).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EYE_OF_THE_GODDESS.get())
                .pattern("SQS")
                .pattern("QEQ")
                .pattern("SQS")
                .define('S', Items.NETHERITE_SCRAP)
                .define('Q', Items.QUARTZ_BLOCK)
                .define('E', Items.ENDER_EYE)
                .unlockedBy("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GODDESS_SMITHING_TEMPLATE.get(),2)
                .pattern("DTD")
                .pattern("DQD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('T', ModItems.GODDESS_SMITHING_TEMPLATE.get())
                .define('Q', Items.QUARTZ_BLOCK)
                .unlockedBy("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FORSAKEN_SMITHING_TEMPLATE.get(),4)
                .pattern("OFO")
                .pattern("OIO")
                .pattern("OOO")
                .define('O', Items.OBSIDIAN)
                .define('F', ModItems.FORSAKEN_INGOT.get())
                .define('I', Items.IRON_BLOCK)
                .unlockedBy("has_forsaken_ingot",has(ModItems.FORSAKEN_INGOT))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FORSAKEN_INGOT.get())
                .requires(Items.GOLD_INGOT, 4)
                .requires(Items.OBSIDIAN, 2)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(recipeOutput);


        //Smithing Upgrades for Forsaken Gear
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.FORSAKEN_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.DIAMOND_SWORD),
                Ingredient.of(ModItems.FORSAKEN_INGOT.get()),
                RecipeCategory.COMBAT, ModItems.FORSAKEN_SWORD.get())
                .unlocks("has_forsaken_ingot", has(ModItems.FORSAKEN_INGOT))
                .save(recipeOutput, "forsaken_sword");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.FORSAKEN_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_PICKAXE),
                        Ingredient.of(ModItems.FORSAKEN_INGOT.get()),
                        RecipeCategory.TOOLS, ModItems.FORSAKEN_PICKAXE.get())
                .unlocks("has_forsaken_ingot", has(ModItems.FORSAKEN_INGOT))
                .save(recipeOutput, "forsaken_pickaxe");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.FORSAKEN_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_AXE),
                        Ingredient.of(ModItems.FORSAKEN_INGOT.get()),
                        RecipeCategory.TOOLS, ModItems.FORSAKEN_AXE.get())
                .unlocks("has_forsaken_ingot", has(ModItems.FORSAKEN_INGOT))
                .save(recipeOutput, "forsaken_axe");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.FORSAKEN_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_SHOVEL),
                        Ingredient.of(ModItems.FORSAKEN_INGOT.get()),
                        RecipeCategory.TOOLS, ModItems.FORSAKEN_SHOVEL.get())
                .unlocks("has_forsaken_ingot", has(ModItems.FORSAKEN_INGOT))
                .save(recipeOutput, "forsaken_shovel");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.FORSAKEN_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.DIAMOND_HOE),
                        Ingredient.of(ModItems.FORSAKEN_INGOT.get()),
                        RecipeCategory.TOOLS, ModItems.FORSAKEN_HOE.get())
                .unlocks("has_forsaken_ingot", has(ModItems.FORSAKEN_INGOT))
                .save(recipeOutput, "forsaken_hoe");


        //Smithing upgrades for Goddess Gear
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.GODDESS_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModItems.FORSAKEN_SWORD.get()),
                        Ingredient.of(ModItems.EYE_OF_THE_GODDESS.get()),
                        RecipeCategory.COMBAT, ModItems.GODDESS_SWORD.get())
                .unlocks("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput, "goddess_sword");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.GODDESS_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModItems.FORSAKEN_PICKAXE.get()),
                        Ingredient.of(ModItems.EYE_OF_THE_GODDESS.get()),
                        RecipeCategory.TOOLS, ModItems.GODDESS_PICKAXE.get())
                .unlocks("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput, "goddess_pickaxe");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.GODDESS_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModItems.FORSAKEN_AXE.get()),
                        Ingredient.of(ModItems.EYE_OF_THE_GODDESS.get()),
                        RecipeCategory.TOOLS, ModItems.GODDESS_AXE.get())
                .unlocks("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput, "goddess_axe");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.GODDESS_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModItems.FORSAKEN_SHOVEL.get()),
                        Ingredient.of(ModItems.EYE_OF_THE_GODDESS.get()),
                        RecipeCategory.TOOLS, ModItems.GODDESS_SHOVEL.get())
                .unlocks("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput, "goddess_shovel");

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.GODDESS_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ModItems.FORSAKEN_HOE.get()),
                        Ingredient.of(ModItems.EYE_OF_THE_GODDESS.get()),
                        RecipeCategory.TOOLS, ModItems.GODDESS_HOE.get())
                .unlocks("has_goddess_smithing_template",has(ModItems.GODDESS_SMITHING_TEMPLATE))
                .save(recipeOutput, "goddess_hoe");
    }
}
