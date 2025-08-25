package github.mattzmt.not_enough_variants.block;

import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //NETHERRACK VARIANTS
    public static final DoorBlock NETHERRACK_DOOR = registerWithItem(
            "netherrack_door",
            newModDoor(ModBlockSetType.NETHERRACK, Blocks.NETHERRACK, true, 1.4f, 0.4f, false));

    public static final WallBlock NETHERRACK_WALL = registerWithItem(
            "netherrack_wall",
            newModWall(Blocks.NETHERRACK));

    public static final FenceBlock NETHERRACK_FENCE = registerWithItem(
            "netherrack_fence",
            newModFence(Blocks.NETHERRACK, true, 0.4f, BlockSoundGroup.NETHERRACK, false));

    public static final FenceGateBlock NETHERRACK_FENCE_GATE = registerWithItem(
            "netherrack_fence_gate",
            newModFenceGate(ModWoodType.NETHERRACK, Blocks.NETHERRACK, true, 0.4f, false));

    public static final StairsBlock NETHERRACK_STAIRS = registerWithItem(
            "netherrack_stairs",
            newModStairs(Blocks.NETHERRACK));

    public static final SlabBlock NETHERRACK_SLAB = registerWithItem(
            "netherrack_slab",
            newModSlab(Blocks.NETHERRACK, true, 0.4f, BlockSoundGroup.NETHERRACK, false));

    public static final TrapdoorBlock NETHERRACK_TRAPDOOR = registerWithItem(
            "netherrack_trapdoor",
            newModTrapdoor(ModBlockSetType.NETHERRACK, Blocks.NETHERRACK, true, 1.4f, 0.4f));

    public static final PressurePlateBlock NETHERRACK_PRESSURE_PLATE = registerWithItem(
            "netherrack_pressure_plate",
            newModPressurePlate(ModBlockSetType.NETHERRACK, Blocks.NETHERRACK, 0.4f));

    public static final Block NETHERRACK_BUTTON = registerWithItem(
            "netherrack_button",
            newModButton(ModBlockSetType.NETHERRACK, 10, Blocks.NETHERRACK, 0.4f));

    private static final Identifier NETHERRACK_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/netherrack");

    public static final TerraformSignBlock NETHERRACK_SIGN = register(
            "netherrack_sign",
            newModSign(NETHERRACK_SIGN_TEXTURE, Blocks.NETHERRACK, 0.4f, false, BlockSoundGroup.NETHERRACK));

    public static final TerraformWallSignBlock NETHERRACK_WALL_SIGN = register(
            "netherrack_wall_sign",
            newModWallSign(NETHERRACK_SIGN_TEXTURE, ModBlocks.NETHERRACK_SIGN));

    //STONE VARIANTS
    public static final DoorBlock STONE_DOOR = registerWithItem(
            "stone_door",
            newModDoor(ModBlockSetType.STONE, Blocks.STONE, true, 2.5f, 6, false));

    public static final WallBlock STONE_WALL = registerWithItem(
            "stone_wall",
            newModWall(Blocks.STONE));

    public static final FenceBlock STONE_FENCE = registerWithItem(
            "stone_fence",
            newModFence(Blocks.STONE, true, 1.5f, 6, BlockSoundGroup.STONE, false));

    public static final FenceGateBlock STONE_FENCE_GATE = registerWithItem(
            "stone_fence_gate",
            newModFenceGate(ModWoodType.STONE, Blocks.STONE, true, 1.5f, 6, false));

    public static final TrapdoorBlock STONE_TRAPDOOR = registerWithItem(
            "stone_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.STONE, true, 2.5f, 6));

    private static final Identifier STONE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/stone");

    public static final TerraformSignBlock STONE_SIGN = register(
            "stone_sign",
            newModSign(STONE_SIGN_TEXTURE, Blocks.STONE, 1.5f, 2, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock STONE_WALL_SIGN = register(
            "stone_wall_sign",
            newModWallSign(STONE_SIGN_TEXTURE, ModBlocks.STONE_SIGN));

    //COBBLESTONE VARIANTS
    public static final DoorBlock COBBLESTONE_DOOR = registerWithItem(
            "cobblestone_door",
            newModDoor(ModBlockSetType.STONE, Blocks.COBBLESTONE, true, 3, 6, false));

    public static final FenceBlock COBBLESTONE_FENCE = registerWithItem(
            "cobblestone_fence",
            newModFence(Blocks.COBBLESTONE, true, 2, 6, BlockSoundGroup.STONE, false));

    public static final FenceGateBlock COBBLESTONE_FENCE_GATE = registerWithItem(
            "cobblestone_fence_gate",
            newModFenceGate(ModWoodType.STONE, Blocks.COBBLESTONE, true, 2, 6, false));

    public static final TrapdoorBlock COBBLESTONE_TRAPDOOR = registerWithItem(
            "cobblestone_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.COBBLESTONE, true, 3, 6));

    public static final PressurePlateBlock COBBLESTONE_PRESSURE_PLATE = registerWithItem(
            "cobblestone_pressure_plate",
            newModPressurePlate(ModBlockSetType.STONE, Blocks.COBBLESTONE));

    public static final ButtonBlock COBBLESTONE_BUTTON = registerWithItem(
            "cobblestone_button",
            newModButton(ModBlockSetType.STONE, 25, Blocks.COBBLESTONE));

    public static final Identifier COBBLESTONE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/cobblestone");

    public static final TerraformSignBlock COBBLESTONE_SIGN = register(
            "cobblestone_sign",
            newModSign(COBBLESTONE_SIGN_TEXTURE, Blocks.COBBLESTONE, 2, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock COBBLESTONE_WALL_SIGN = register(
            "cobblestone_wall_sign",
            newModWallSign(COBBLESTONE_SIGN_TEXTURE, ModBlocks.COBBLESTONE_SIGN));

    //GRANITE VARIANTS
    public static final DoorBlock GRANITE_DOOR = registerWithItem(
            "granite_door",
            newModDoor(ModBlockSetType.STONE, Blocks.GRANITE, false, 2.5f, 6, false));

    public static final FenceBlock GRANITE_FENCE = registerWithItem(
            "granite_fence",
            newModFence(Blocks.GRANITE, true, 1.5f, 6, BlockSoundGroup.STONE, false));
    
    public static final FenceGateBlock GRANITE_FENCE_GATE = registerWithItem(
            "granite_fence_gate",
            newModFenceGate(ModWoodType.STONE, Blocks.GRANITE, true, 1.5f, 6, false));

    public static final TrapdoorBlock GRANITE_TRAPDOOR = registerWithItem(
            "granite_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.GRANITE, true, 2.5f, 6));

    public static final PressurePlateBlock GRANITE_PRESSURE_PLATE = registerWithItem(
            "granite_pressure_plate",
            newModPressurePlate(ModBlockSetType.STONE, Blocks.GRANITE));

    public static final ButtonBlock GRANITE_BUTTON = registerWithItem(
            "granite_button",
            newModButton(ModBlockSetType.STONE, 20, Blocks.GRANITE));

    public static final Identifier GRANITE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/granite");

    public static final TerraformSignBlock GRANITE_SIGN = register(
            "granite_sign",
            newModSign(GRANITE_SIGN_TEXTURE, Blocks.GRANITE, 1.5f, 2, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock GRANITE_WALL_SIGN = register(
            "granite_wall_sign",
            newModWallSign(GRANITE_SIGN_TEXTURE, ModBlocks.GRANITE_SIGN));

    //PLANKS
    public static final WallBlock OAK_WALL = registerWithItem(
            "oak_wall",
            newModWall(Blocks.OAK_PLANKS));

    public static final WallBlock SPRUCE_WALL = registerWithItem(
            "spruce_wall",
            newModWall(Blocks.SPRUCE_PLANKS));

    public static final WallBlock BIRCH_WALL = registerWithItem(
            "birch_wall",
            newModWall(Blocks.BIRCH_PLANKS));

    public static final WallBlock JUNGLE_WALL = registerWithItem(
            "jungle_wall",
            newModWall(Blocks.JUNGLE_PLANKS));

    public static final WallBlock ACACIA_WALL = registerWithItem(
            "acacia_wall",
            newModWall(Blocks.ACACIA_PLANKS));

    public static final WallBlock DARK_OAK_WALL = registerWithItem(
            "dark_oak_wall",
            newModWall(Blocks.DARK_OAK_PLANKS));

    public static final WallBlock MANGROVE_WALL = registerWithItem(
            "mangrove_wall",
            newModWall(Blocks.MANGROVE_PLANKS));

    public static final WallBlock CHERRY_WALL = registerWithItem(
            "cherry_wall",
            newModWall(Blocks.CHERRY_PLANKS));

    public static final WallBlock BAMBOO_WALL = registerWithItem(
            "bamboo_wall",
            newModWall(Blocks.BAMBOO_PLANKS));

    public static final WallBlock CRIMSON_WALL = registerWithItem(
            "crimson_wall",
            newModWall(Blocks.CRIMSON_PLANKS));

    public static final WallBlock WARPED_WALL = registerWithItem(
            "warped_wall",
            newModWall(Blocks.WARPED_PLANKS));

    //MOSSY COBBLESTONE
    public static final DoorBlock MOSSY_COBBLESTONE_DOOR = registerWithItem(
            "mossy_cobblestone_door",
            newModDoor(ModBlockSetType.STONE, Blocks.MOSSY_COBBLESTONE, false, 3, 6, false));

    public static final FenceBlock MOSSY_COBBLESTONE_FENCE = registerWithItem(
            "mossy_cobblestone_fence",
            newModFence(Blocks.MOSSY_COBBLESTONE, true, 2, 6, BlockSoundGroup.STONE, false));

    public static final FenceGateBlock MOSSY_COBBLESTONE_FENCE_GATE = registerWithItem(
            "mossy_cobblestone_fence_gate",
            newModFenceGate(ModWoodType.STONE, Blocks.MOSSY_COBBLESTONE, true, 2, 6, false));

    public static final TrapdoorBlock MOSSY_COBBLESTONE_TRAPDOOR = registerWithItem(
            "mossy_cobblestone_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.MOSSY_COBBLESTONE, true, 3, 6));

    public static final PressurePlateBlock MOSSY_COBBLESTONE_PRESSURE_PLATE = registerWithItem(
            "mossy_cobblestone_pressure_plate",
            newModPressurePlate(ModBlockSetType.STONE,Blocks.MOSSY_COBBLESTONE));

    public static final ButtonBlock MOSSY_COBBLESTONE_BUTTON = registerWithItem(
            "mossy_cobblestone_button",
            newModButton(ModBlockSetType.STONE, 25, Blocks.MOSSY_COBBLESTONE));
    
    public static final Identifier MOSSY_COBBLESTONE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/mossy_cobblestone");
    
    public static final TerraformSignBlock MOSSY_COBBLESTONE_SIGN = register(
            "mossy_cobblestone_sign",
            newModSign(MOSSY_COBBLESTONE_SIGN_TEXTURE, Blocks.MOSSY_COBBLESTONE, 2, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock MOSSY_COBBLESTONE_WALL_SIGN = register(
            "mossy_cobblestone_wall_sign",
            newModWallSign(MOSSY_COBBLESTONE_SIGN_TEXTURE, ModBlocks.MOSSY_COBBLESTONE_SIGN));

    //SMOOTH STONE
    public static final DoorBlock SMOOTH_STONE_DOOR = registerWithItem(
            "smooth_stone_door",
            newModDoor(ModBlockSetType.STONE, Blocks.SMOOTH_STONE, false, 3, 6, false));

    public static final WallBlock SMOOTH_STONE_WALL = registerWithItem(
            "smooth_stone_wall",
            newModWall(Blocks.SMOOTH_STONE));

    public static final FenceBlock SMOOTH_STONE_FENCE = registerWithItem(
            "smooth_stone_fence",
            newModFence(Blocks.SMOOTH_STONE, true, 2, 6, BlockSoundGroup.STONE, false));

    public static final FenceGateBlock SMOOTH_STONE_FENCE_GATE = registerWithItem(
            "smooth_stone_fence_gate",
            newModFenceGate(ModWoodType.STONE, Blocks.SMOOTH_STONE, true, 2, 6, false));

    public static final StairsBlock SMOOTH_STONE_STAIRS = registerWithItem(
            "smooth_stone_stairs",
            newModStairs(Blocks.SMOOTH_STONE));

    public static final TrapdoorBlock SMOOTH_STONE_TRAPDOOR = registerWithItem(
            "smooth_stone_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.SMOOTH_STONE, true, 3, 6));

    public static final PressurePlateBlock SMOOTH_STONE_PRESSURE_PLATE = registerWithItem(
            "smooth_stone_pressure_plate",
            newModPressurePlate(ModBlockSetType.STONE, Blocks.SMOOTH_STONE));

    public static final ButtonBlock SMOOTH_STONE_BUTTON = registerWithItem(
            "smooth_stone_button",
            newModButton(ModBlockSetType.STONE, 25, Blocks.SMOOTH_STONE));

    public static final Identifier SMOOTH_STONE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/smooth_stone");

    public static final TerraformSignBlock SMOOTH_STONE_SIGN = register(
            "smooth_stone_sign",
            newModSign(SMOOTH_STONE_SIGN_TEXTURE, Blocks.SMOOTH_STONE, 2, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock SMOOTH_STONE_WALL_SIGN = register(
            "smooth_stone_wall_sign",
            newModWallSign(SMOOTH_STONE_SIGN_TEXTURE, ModBlocks.SMOOTH_STONE_SIGN));

    //STONE BRICK VARIANTS
    public static final DoorBlock STONE_BRICK_DOOR = registerWithItem(
            "stone_brick_door",
            newModDoor(ModBlockSetType.STONE, Blocks.STONE_BRICKS, false, 2.5f, 6, false));

    public static final FenceBlock STONE_BRICK_FENCE = registerWithItem(
            "stone_brick_fence",
            newModFence(Blocks.STONE_BRICKS, true, 1.5f, 6, BlockSoundGroup.STONE, false));

    public static final FenceGateBlock STONE_BRICK_FENCE_GATE = registerWithItem(
            "stone_brick_fence_gate",
            newModFenceGate(ModWoodType.STONE, Blocks.STONE_BRICKS, true, 1.5f, 6, false));

    public static final TrapdoorBlock STONE_BRICK_TRAPDOOR = registerWithItem(
            "stone_brick_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.STONE_BRICKS, true, 2.5f, 6));

    public static final PressurePlateBlock STONE_BRICK_PRESSURE_PLATE = registerWithItem(
            "stone_brick_pressure_plate",
            newModPressurePlate(ModBlockSetType.STONE, Blocks.STONE_BRICKS));
    
    public static final ButtonBlock STONE_BRICK_BUTTON = registerWithItem(
            "stone_brick_button",
            newModButton(ModBlockSetType.STONE, 20, Blocks.STONE_BRICKS));

    public static final Identifier STONE_BRICK_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/stone_bricks");

    public static final TerraformSignBlock STONE_BRICK_SIGN = register(
            "stone_brick_sign",
            newModSign(STONE_BRICK_SIGN_TEXTURE, Blocks.STONE_BRICKS, 1.5f, 2, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock STONE_BRICK_WALL_SIGN = register(
            "stone_brick_wall_sign",
            newModWallSign(STONE_BRICK_SIGN_TEXTURE, ModBlocks.STONE_BRICK_SIGN));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, NotEnoughVariants.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ModItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    private static DoorBlock newModDoor(BlockSetType blockSetType, Block base, boolean isTransparent, float hardness, float resistance, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(hardness, resistance)
                .pistonBehavior(PistonBehavior.DESTROY);

        if (isTransparent)
            settings.nonOpaque();

        if (isBurnable)
            settings.burnable();

        return new DoorBlock(blockSetType, settings);
    }

    private static DoorBlock newModDoor(BlockSetType blockSetType, Block base, boolean isTransparent, float strength, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(strength)
                .pistonBehavior(PistonBehavior.DESTROY);

        if (isTransparent)
            settings.nonOpaque();

        if (isBurnable)
            settings.burnable();

        return new DoorBlock(blockSetType, settings);
    }

    private static WallBlock newModWall(Block base) {
        return new WallBlock(AbstractBlock.Settings.copy(base).solid());
    }

    private static FenceBlock newModFence(Block base, boolean requiresTool, float hardness, float resistance, BlockSoundGroup blockSoundGroup, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(hardness, resistance)
                .sounds(blockSoundGroup);

        if (requiresTool)
            settings.requiresTool();

        if (isBurnable)
            settings.burnable();

        return new FenceBlock(settings);
    }

    private static FenceBlock newModFence(Block base, boolean requiresTool, float strength, BlockSoundGroup blockSoundGroup, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(strength)
                .sounds(blockSoundGroup);

        if (requiresTool)
            settings.requiresTool();

        if (isBurnable)
            settings.burnable();

        return new FenceBlock(settings);
    }

    private static FenceGateBlock newModFenceGate(WoodType woodType, Block base, boolean requiresTool, float hardness, float resistance, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .solid()
                .strength(hardness, resistance);

        if (requiresTool)
            settings.requiresTool();

        if (isBurnable)
            settings.burnable();

        return new FenceGateBlock(woodType, settings);
    }

    private static FenceGateBlock newModFenceGate(WoodType woodType, Block base, boolean requiresTool, float strength, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .solid()
                .strength(strength);

        if (requiresTool)
            settings.requiresTool();

        if (isBurnable)
            settings.burnable();

        return new FenceGateBlock(
                woodType, settings
        );
    }

    private static StairsBlock newModStairs(Block base) {
        return new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base));
    }

    private static SlabBlock newModSlab(Block base, boolean requiresTool, float hardness, float resistance, BlockSoundGroup blockSoundGroup, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(hardness, resistance)
                .sounds(blockSoundGroup);

        if (requiresTool)
            settings.requiresTool();

        if (isBurnable)
            settings.burnable();

        return new SlabBlock(settings);
    }

    private static SlabBlock newModSlab(Block base, boolean requiresTool, float strength, BlockSoundGroup blockSoundGroup, boolean isBurnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(strength)
                .sounds(blockSoundGroup);

        if (requiresTool)
            settings.requiresTool();

        if (isBurnable)
            settings.burnable();

        return new SlabBlock(settings);
    }

    private static TrapdoorBlock newModTrapdoor(BlockSetType blockSetType, Block base, boolean requiresTool, float hardness, float resistance) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(hardness, resistance)
                .allowsSpawning(Blocks::never);

        if (requiresTool)
            settings.requiresTool();

        return new TrapdoorBlock(blockSetType, settings);
    }

    private static TrapdoorBlock newModTrapdoor(BlockSetType blockSetType, Block base, boolean requiresTool, float strength) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .strength(strength)
                .allowsSpawning(Blocks::never);

        if (requiresTool)
            settings.requiresTool();

        return new TrapdoorBlock(blockSetType, settings);
    }

    private static PressurePlateBlock newModPressurePlate(BlockSetType blockSetType, Block base, float strength) {
        return new PressurePlateBlock(
                blockSetType,
                AbstractBlock.Settings.create()
                        .mapColor(base.getDefaultMapColor())
                        .instrument(base.getDefaultState().getInstrument())
                        .solid()
                        .noCollision()
                        .strength(strength)
                        .pistonBehavior(PistonBehavior.DESTROY));
    }

    private static PressurePlateBlock newModPressurePlate(BlockSetType blockSetType, Block base) {
        return new PressurePlateBlock(
                blockSetType,
                AbstractBlock.Settings.create()
                        .mapColor(base.getDefaultMapColor())
                        .instrument(base.getDefaultState().getInstrument())
                        .solid()
                        .noCollision()
                        .strength(0.5f)
                        .pistonBehavior(PistonBehavior.DESTROY));
    }

    private static ButtonBlock newModButton(BlockSetType blockSetType, int pressTicks, Block base, float strength) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .noCollision()
                .strength(strength)
                .pistonBehavior(PistonBehavior.DESTROY);

        return new ButtonBlock(blockSetType, pressTicks, settings);
    }

    private static ButtonBlock newModButton(BlockSetType blockSetType, int pressTicks, Block base) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .noCollision()
                .strength(0.5f)
                .pistonBehavior(PistonBehavior.DESTROY);

        return new ButtonBlock(blockSetType, pressTicks, settings);
    }

    private static TerraformSignBlock newModSign(Identifier texture, Block base, float hardness, float resistance, boolean isBurnable, BlockSoundGroup blockSoundGroup) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .solid()
                .noCollision()
                .strength(hardness, resistance)
                .sounds(blockSoundGroup);

        if (isBurnable)
            settings.burnable();

        return new TerraformSignBlock(texture, settings);
    }

    private static TerraformSignBlock newModSign(Identifier texture, Block base, float strength, boolean isBurnable, BlockSoundGroup blockSoundGroup) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .solid()
                .noCollision()
                .strength(strength)
                .sounds(blockSoundGroup);

        if (isBurnable)
            settings.burnable();

        return new TerraformSignBlock(texture, settings);
    }

    private static TerraformWallSignBlock newModWallSign(Identifier texture, Block base) {
        return new TerraformWallSignBlock(texture, AbstractBlock.Settings.copy(base));
    }

    public static void load() {}
}