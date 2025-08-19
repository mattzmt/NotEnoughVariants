package github.mattzmt.not_enough_variants;

import github.mattzmt.not_enough_variants.data.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NotEnoughVariantsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModLangEnGbProvider::new);
        pack.addProvider(ModLangEnpProvider::new);
        pack.addProvider(ModLangEnPtProvider::new);
        pack.addProvider(ModLangEnUsProvider::new);
        pack.addProvider(ModLangEnwsProvider::new);
        pack.addProvider(ModLangLolUsProvider::new);
        pack.addProvider(ModLangMtMtProvider::new);
	}
}