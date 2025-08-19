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
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK).solid()));

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
            new PressurePlateBlock(
                    ModBlockSetType.NETHERRACK,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.NETHERRACK.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .noCollision()
                            .strength(0.4f)
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block NETHERRACK_BUTTON = registerWithItem(
            "netherrack_button",
            new ButtonBlock(
                    ModBlockSetType.NETHERRACK,
                    10,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.NETHERRACK.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .noCollision()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .strength(0.4f)
            ));

    private static final Identifier NETHERRACK_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/netherrack");

    public static final TerraformSignBlock NETHERRACK_SIGN = register(
            "netherrack_sign",
            new TerraformSignBlock(
                    NETHERRACK_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.NETHERRACK.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.4f)
                            .solid()
                            .noCollision()
                            .sounds(BlockSoundGroup.NETHERRACK)
            ));

    public static final TerraformWallSignBlock NETHERRACK_WALL_SIGN = register(
            "netherrack_wall_sign",
            new TerraformWallSignBlock(
                    NETHERRACK_SIGN_TEXTURE,
                    AbstractBlock.Settings.copy(ModBlocks.NETHERRACK_SIGN)
            ));
    //END OF NETHERRACK VARIANTS

    //STONE VARIANTS
    public static final DoorBlock STONE_DOOR = registerWithItem(
            "stone_door",
            new DoorBlock(
                    ModBlockSetType.STONE,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.STONE.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(2.5f,6)
                            .nonOpaque()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final WallBlock STONE_WALL = registerWithItem(
            "stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(Blocks.STONE.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5f,6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final FenceBlock STONE_FENCE = registerWithItem(
            "stone_fence",
            new FenceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.STONE.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5f,6)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final FenceGateBlock STONE_FENCE_GATE = registerWithItem(
            "stone_fence_gate",
            new FenceGateBlock(
                    ModWoodType.STONE,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.STONE.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5f,6)
                            .requiresTool()
            ));

    public static final TrapdoorBlock STONE_TRAPDOOR = registerWithItem(
            "stone_trapdoor",
            new TrapdoorBlock(
                    ModBlockSetType.STONE,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.STONE.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(2.5f,6)
                            .requiresTool()
                            .allowsSpawning(Blocks::never)
            ));

    private static final Identifier STONE_SIGN_TEXTURE = NotEnoughVariants.id("entity/signs/stone");

    public static final TerraformSignBlock STONE_SIGN = register(
            "stone_sign",
            new TerraformSignBlock(
                    STONE_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(Blocks.STONE.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1,4)
                            .solid()
                            .noCollision()
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final TerraformWallSignBlock STONE_WALL_SIGN = register(
            "stone_wall_sign",
            new TerraformWallSignBlock(
                    STONE_SIGN_TEXTURE,
                    AbstractBlock.Settings.copy(ModBlocks.STONE_SIGN)
            ));
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

    public static void load() {}
}