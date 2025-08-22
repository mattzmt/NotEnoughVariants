package github.mattzmt.not_enough_variants;

import github.mattzmt.not_enough_variants.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class NotEnoughVariantsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.NETHERRACK_DOOR,
                ModBlocks.STONE_DOOR,
                ModBlocks.COBBLESTONE_DOOR
        );
	}
}