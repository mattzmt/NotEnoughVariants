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

public class ModLangLolUsProvider extends FabricLanguageProvider {
    public ModLangLolUsProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "lol_us", registryLookup);
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
        addText(translationBuilder, ModItemGroups.NEV_GROUP_TITLE, "No Enuf Vareejantz");

        //ITEMS
        translationBuilder.add(ModItems.BUSH_HAMMER, "Brakey Hammur Thing");
        translationBuilder.add(ModItems.NETHERRACK_SIGN, "Netherrack Syne");

        //BLOCKS
        translationBuilder.add(ModBlocks.NETHERRACK_DOOR, "Netherrack Dor");
        translationBuilder.add(ModBlocks.NETHERRACK_WALL, "Netherrack Wal");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE, "Netherrack Fens");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE_GATE, "Netherrack Gaet");
        translationBuilder.add(ModBlocks.NETHERRACK_STAIRS, "Netherrack Stairz");
        translationBuilder.add(ModBlocks.NETHERRACK_SLAB, "Netherrack Sleb");
        translationBuilder.add(ModBlocks.NETHERRACK_TRAPDOOR, "Netherrack Trepnoor");
        translationBuilder.add(ModBlocks.NETHERRACK_PRESSURE_PLATE, "Netherrack Prseure Pleitz");
        translationBuilder.add(ModBlocks.NETHERRACK_BUTTON, "Netherrack Pressablz");
    }
}
