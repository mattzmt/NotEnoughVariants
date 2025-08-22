package github.mattzmt.not_enough_variants.item.advanced;

import github.mattzmt.not_enough_variants.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class BushHammer extends Item {
    public static final Map<Block, Block> BUSH_HAMMER_MAP =
        Map.ofEntries(
                Map.entry(ModBlocks.STONE_DOOR, ModBlocks.COBBLESTONE_DOOR),
                Map.entry(Blocks.STONE, Blocks.COBBLESTONE),
                Map.entry(ModBlocks.STONE_WALL, Blocks.COBBLESTONE_WALL),
                Map.entry(ModBlocks.STONE_SIGN, ModBlocks.COBBLESTONE_SIGN),
                Map.entry(ModBlocks.STONE_WALL_SIGN, ModBlocks.COBBLESTONE_WALL_SIGN),
                Map.entry(ModBlocks.STONE_FENCE, ModBlocks.COBBLESTONE_FENCE),
                Map.entry(ModBlocks.STONE_FENCE_GATE, ModBlocks.COBBLESTONE_FENCE_GATE),
                Map.entry(Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS),
                Map.entry(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB),
                Map.entry(ModBlocks.STONE_TRAPDOOR, ModBlocks.COBBLESTONE_TRAPDOOR),
                Map.entry(Blocks.STONE_PRESSURE_PLATE, ModBlocks.COBBLESTONE_PRESSURE_PLATE),
                Map.entry(Blocks.STONE_BUTTON, ModBlocks.COBBLESTONE_BUTTON)
        );

    public BushHammer(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        var blockPos = context.getBlockPos();
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(blockPos).getBlock();

        if(BUSH_HAMMER_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                BlockState oldState = world.getBlockState(blockPos);
                Block newBlock = BUSH_HAMMER_MAP.get(oldState.getBlock());
                BlockState newState = newBlock.getDefaultState();

                for (Property<?> property : oldState.getProperties()) {
                    if (newState.contains(property)) {
                        newState = newState.with((Property) property, oldState.get(property));
                    }
                }

                world.setBlockState(blockPos, newState);

                ((ServerWorld) world).spawnParticles(
                            new BlockStateParticleEffect(ParticleTypes.BLOCK, newState),
                            blockPos.getX() + 0.5,
                            blockPos.getY() + 0.5,
                            blockPos.getZ() + 0.5,
                            50,
                            0.25, 0, 0.25,
                            0.5
                );

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, blockPos, SoundEvents.ITEM_MACE_SMASH_GROUND, SoundCategory.BLOCKS);

                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }
}
