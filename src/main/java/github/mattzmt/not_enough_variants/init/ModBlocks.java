package github.mattzmt.not_enough_variants.init;

import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.list.ModBlockSetType;
import github.mattzmt.not_enough_variants.list.ModWoodType;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
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
            newModGate(ModWoodType.NETHERRACK, Blocks.NETHERRACK, true, 0.4f, false));

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
            newModPressurePlate(ModBlockSetType.NETHERRACK, Blocks.NETHERRACK, true, 0.4f));

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
    //END OF NETHERRACK VARIANTS

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
            newModGate(ModWoodType.STONE, Blocks.STONE, true, 1.5f, 6, false));

    public static final TrapdoorBlock STONE_TRAPDOOR = registerWithItem(
            "stone_trapdoor",
            newModTrapdoor(ModBlockSetType.STONE, Blocks.STONE, true, 2.5f, 6));

    private static final Identifier STONE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/stone");

    public static final TerraformSignBlock STONE_SIGN = register(
            "stone_sign",
            newModSign(STONE_SIGN_TEXTURE, Blocks.STONE, 1, 4, false, BlockSoundGroup.STONE));

    public static final TerraformWallSignBlock STONE_WALL_SIGN = register(
            "stone_wall_sign",
            newModWallSign(STONE_SIGN_TEXTURE, ModBlocks.STONE_SIGN));
    //END OF STONE VARIANTS

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

    private static FenceGateBlock newModGate(WoodType woodType, Block base, boolean requiresTool, float hardness, float resistance, boolean isBurnable) {
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

    private static FenceGateBlock newModGate(WoodType woodType, Block base, boolean requiresTool, float strength, boolean isBurnable) {
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

    private static PressurePlateBlock newModPressurePlate(BlockSetType blockSetType, Block base, boolean requiresTool, float hardness, float resistance) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .solid()
                .noCollision()
                .strength(hardness, resistance)
                .pistonBehavior(PistonBehavior.DESTROY);

        if (requiresTool)
            settings.requiresTool();

        return new PressurePlateBlock(blockSetType, settings);
    }

    private static PressurePlateBlock newModPressurePlate(BlockSetType blockSetType, Block base, boolean requiresTool, float strength) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .solid()
                .noCollision()
                .strength(strength)
                .pistonBehavior(PistonBehavior.DESTROY);

        if (requiresTool)
            settings.requiresTool();

        return new PressurePlateBlock(blockSetType, settings);
    }

    private static ButtonBlock newModButton(BlockSetType blockSetType, int pressTicks, Block base, float hardness, float resistance) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .mapColor(base.getDefaultMapColor())
                .instrument(base.getDefaultState().getInstrument())
                .noCollision()
                .strength(hardness, resistance)
                .pistonBehavior(PistonBehavior.DESTROY);

        return new ButtonBlock(blockSetType, pressTicks, settings);
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