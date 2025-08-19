package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.init.ModBlocks;
import github.mattzmt.not_enough_variants.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        //VANILLA ONLY STONECUTTING RECIPES
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_FENCE, 2)
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(Blocks.NETHER_BRICK_FENCE)+"_via_stonecutting"));

        //MOD CRAFTING RECIPES
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NETHERRACK_DOOR, 3)
                .input('N', Blocks.NETHERRACK)
                .input('G', Items.GOLD_NUGGET)
                .pattern("NN")
                .pattern("NG")
                .pattern("NN")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_DOOR)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.NETHERRACK_WALL, 6)
                .input('N', Blocks.NETHERRACK)
                .pattern("NNN")
                .pattern("NNN")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_WALL)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.NETHERRACK_FENCE, 4)
                .input('N', Blocks.NETHERRACK)
                .input('S', ModBlocks.NETHERRACK_SLAB)
                .pattern("NSN")
                .pattern("NSN")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_FENCE)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NETHERRACK_FENCE_GATE, 2)
                .input('N', Blocks.NETHERRACK)
                .input('S', ModBlocks.NETHERRACK_SLAB)
                .pattern("SNS")
                .pattern("SNS")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_FENCE_GATE)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, 4)
                .input('N', Blocks.NETHERRACK)
                .pattern("N  ")
                .pattern("NN ")
                .pattern("NNN")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_STAIRS)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, 4)
                .input('N', Blocks.NETHERRACK)
                .pattern("NNN")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_SLAB)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NETHERRACK_PRESSURE_PLATE, 1)
                .input('N', Blocks.NETHERRACK)
                .pattern("NN ")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_PRESSURE_PLATE)+"_via_crafting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NETHERRACK_BUTTON, 1)
                .input(Blocks.NETHERRACK)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_BUTTON)+"_via_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERRACK_SIGN, 3)
                .input('N', Blocks.NETHERRACK)
                .input('Q', Items.QUARTZ)
                .pattern("NNN")
                .pattern("NNN")
                .pattern(" Q ")
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModItems.NETHERRACK_SIGN)+"_via_crafting"));

        //MOD STONECUTTING RECIPES
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_WALL, 1)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_WALL)+"_via_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_FENCE, 2)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_FENCE)+"_via_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_FENCE_GATE, 2)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_FENCE_GATE)+"_via_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_STAIRS, 1)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_STAIRS)+"_via_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_SLAB, 2)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_SLAB)+"_via_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_PRESSURE_PLATE, 2)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_PRESSURE_PLATE)+"_via_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.NETHERRACK_BUTTON, 3)
                .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(recipeExporter, NotEnoughVariants.id(getItemPath(ModBlocks.NETHERRACK_BUTTON)+"_via_stonecutting"));
    }
}