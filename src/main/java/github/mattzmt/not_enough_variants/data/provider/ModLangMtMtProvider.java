package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.init.ModBlocks;
import github.mattzmt.not_enough_variants.init.ModItemGroups;
import github.mattzmt.not_enough_variants.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModLangMtMtProvider extends FabricLanguageProvider {
    public ModLangMtMtProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "mt_mt", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if(text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        }else{
            NotEnoughVariants.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        //ITEM GROUPS
        addText(translationBuilder, ModItemGroups.NEV_GROUP_TITLE, "Mhux Biżżejjed Varjanti");

        //ITEMS
        translationBuilder.add(ModItems.BUSH_HAMMER, "Martell tat-Tifrik");
        translationBuilder.add(ModItems.NETHERRACK_SIGN, "Tabella tal-Ġebel tan-Nether");
        translationBuilder.add(ModItems.STONE_SIGN, "Tabella tal-Ġebel");

        //BLOCKS
        translationBuilder.add(ModBlocks.NETHERRACK_DOOR, "Bieb tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_WALL, "Ħajt tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE, "Ċint tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE_GATE, "Grada tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_STAIRS, "Taraġ tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_SLAB, "Ċangatura tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_TRAPDOOR, "Bokkaport tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_PRESSURE_PLATE, "Pjanċa tal-Pressjoni tal-Ġebel tan-Nether");
        translationBuilder.add(ModBlocks.NETHERRACK_BUTTON, "Buttuna tal-Ġebel tan-Nether");

        translationBuilder.add(ModBlocks.STONE_DOOR, "Bieb tal-Ġebel");
        translationBuilder.add(ModBlocks.STONE_WALL, "Ħajt tal-Ġebel");
        translationBuilder.add(ModBlocks.STONE_FENCE, "Ċint tal-Ġebel");
        translationBuilder.add(ModBlocks.STONE_FENCE_GATE, "Grada tal-Ġebel");
        translationBuilder.add(ModBlocks.STONE_TRAPDOOR, "Bokkaport tal-Ġebel");
    }
}
