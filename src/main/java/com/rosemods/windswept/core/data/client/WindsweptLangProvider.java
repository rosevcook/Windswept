package com.rosemods.windswept.core.data.client;

import com.mojang.datafixers.util.Pair;
import com.rosemods.windswept.core.Windswept;
import com.rosemods.windswept.core.other.WindsweptDamageSources;
import com.rosemods.windswept.core.registry.*;
import com.rosemods.windswept.integration.jei.WindsweptPlugin;
import com.teamabnormals.blueprint.common.block.sign.BlueprintStandingSignBlock;
import com.teamabnormals.blueprint.common.block.sign.BlueprintWallSignBlock;
import com.teamabnormals.blueprint.core.util.registry.BiomeSubRegistryHelper;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import org.codehaus.plexus.util.StringUtils;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.rosemods.windswept.core.registry.WindsweptBlocks.*;
import static com.rosemods.windswept.core.registry.WindsweptItems.*;

public class WindsweptLangProvider extends LanguageProvider {
    public WindsweptLangProvider(GatherDataEvent event) {
        super(event.getGenerator(), Windswept.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items //
        this.translateItem(HOLLY_BERRIES);
        this.translateItem(HOLLY_BOATS.getFirst());
        this.add(HOLLY_BOATS.getSecond().get(), "Holly Boat with Chest");
        this.translateItem(CHESTNUT_BOATS.getFirst());
        this.add(CHESTNUT_BOATS.getSecond().get(), "Chestnut Boat with Chest");
        this.translateItem(PINE_BOATS.getFirst());
        this.add(PINE_BOATS.getSecond().get(), "Pine Boat with Chest");
        this.translateItem(CHESTNUTS);
        this.translateItem(ROASTED_CHESTNUTS);
        this.translateItem(CHESTNUT_SOUP);
        this.translateItem(CHESTNUT_RISOTTO);
        this.translateItem(CHESTNUT_CHICKEN_PLATTER);
        this.translateItem(WOODEN_BUCKET);
        this.translateItem(WOODEN_WATER_BUCKET);
        this.translateItem(WOODEN_MILK_BUCKET);
        this.translateItem(WOODEN_POWDER_SNOW_BUCKET);
        this.translateItem(WILD_BERRIES);
        this.translateItem(WILD_BERRY_POPSICLE);
        this.translateItem(WILD_BERRY_COOKIE);
        this.translateItem(WILD_BERRY_JUICE);
        this.translateItem(WILD_BERRY_PIPS);
        this.translateItem(CHRISTMAS_PUDDING_SLICE);
        this.add(SWEET_BERRY_BOWL.get(), "Bowl of Sweet Berries");
        this.add(WILD_BERRY_BOWL.get(), "Bowl of Wild Berries");
        this.translateItem(MUTTON_PIE);
        this.add(GOAT.get(), "Raw Chevon");
        this.add(COOKED_GOAT.get(), "Cooked Chevon");
        this.translateItem(GOAT_STEW);
        this.add(GOAT_SHANKS.get(), "Raw Chevon Shanks");
        this.add(COOKED_GOAT_SHANKS.get(), "Cooked Chevon Shanks");
        this.add(FOUL_BERRY_BOWL.get(), "Bowl of Foul Berries");
        this.translateItem(FROZEN_FLESH);
        this.translateItem(FROZEN_BRANCH);
        this.translateItem(LAVENDER_CROWN);
        this.translateItem(SNOW_BOOTS);
        this.translateItem(FROST_ARROW);
        this.add(CUPIDS_ARROW.get(), "Cupid's Arrow");
        this.add(HOLLY_BERRIES_ON_A_STICK.get(), "Holly Berries on a Stick");
        this.translateBannerPattern(SNOW_CHARGE_BANNER_PATTERN, "snow_charge");
        this.translateBannerPattern(SNOW_GOLEM_BANNER_PATTERN, "snow_golem");
        this.translateBannerPattern(ROSE_FLOWER_BANNER_PATTERN, "rose_flower");
        this.translateMusicDisc(MUSIC_DISC_RAIN, "rose - rain");
        this.translateMusicDisc(MUSIC_DISC_SNOW, "rose - snow");
        this.translateMusicDisc(MUSIC_DISC_BUMBLEBEE, "rose - bumblebee");
        this.translateItem(CHILLED_SPAWN_EGG);
        this.translateItem(FROSTBITER_SPAWN_EGG);
        this.translateItem(GINGER_ROOT);
        this.translateItem(GINGERBREAD_COOKIE);
        this.translateItem(GINGER_SORBET);
        this.translateItem(GINGER_TEA);
        this.translateItem(CANDY_CANE);
        this.translateItem(OWL_FEATHER);
        this.translateItem(LAVENDER_SCONES);
        this.translateItem(LAVENDER_TEA);

        this.add(HOLLY_FURNACE_BOAT.get(), "Holly Boat with Furnace");
        this.translateItem(LARGE_HOLLY_BOAT);
        this.add(CHESTNUT_FURNACE_BOAT.get(), "Chestnut Boat with Furnace");
        this.translateItem(LARGE_CHESTNUT_BOAT);
        this.add(PINE_FURNACE_BOAT.get(), "Pine Boat with Furnace");
        this.translateItem(LARGE_PINE_BOAT);

        // Blocks //
        this.translateBlock(STRIPPED_HOLLY_LOG);
        this.translateBlock(STRIPPED_HOLLY_WOOD);
        this.translateBlock(WEATHERED_PINE_LOG);
        this.translateBlock(WEATHERED_PINE_WOOD);
        this.translateBlock(HOLLY_LOG);
        this.translateBlock(HOLLY_WOOD);
        this.translateBlock(HOLLY_PLANKS);
        this.translateBlock(VERTICAL_HOLLY_PLANKS);
        this.translateBlock(HOLLY_SLAB);
        this.translateBlock(HOLLY_STAIRS);
        this.translateBlock(HOLLY_FENCE);
        this.translateBlock(HOLLY_FENCE_GATE);
        this.translateBlock(HOLLY_PRESSURE_PLATE);
        this.translateBlock(HOLLY_DOOR);
        this.translateBlock(HOLLY_TRAPDOOR);
        this.translateBlock(HOLLY_BUTTON);
        this.translateSign(HOLLY_SIGNS, "holly");
        this.translateBlock(HOLLY_LEAVES);
        this.translateBlock(HOLLY_SAPLING);
        this.translateBlock(POTTED_HOLLY_SAPLING);
        this.translateBlock(HOLLY_BEEHIVE);
        this.add(HOLLY_HEDGE.get(), "Holly Leaf Hedge");
        this.translateBlock(HOLLY_LEAF_CARPET);
        this.add(HOLLY_LEAF_PILE.get(), "Pile of Holly Leaves");
        this.translateBlock(HOLLY_LADDER);
        this.translateBlock(HOLLY_BOOKSHELF);
        this.translateBlock(HOLLY_BOARDS);
        this.translateBlock(HOLLY_CABINET);
        this.translateBlock(HOLLY_VERTICAL_SLAB);
        this.translateBlock(HOLLY_POST);
        this.translateBlock(WEATHERED_PINE_POST);
        this.translateBlock(STRIPPED_HOLLY_POST);
        this.translateBlock(HOLLY_CHEST);
        this.translateBlock(HOLLY_TRAPPED_CHEST);
        this.add(HOLLY_BERRY_BASKET.get(), "Basket of Holly Berries");

        this.translateBlock(STRIPPED_CHESTNUT_LOG);
        this.translateBlock(STRIPPED_CHESTNUT_WOOD);
        this.translateBlock(CHESTNUT_LOG);
        this.translateBlock(CHESTNUT_WOOD);
        this.translateBlock(CHESTNUT_PLANKS);
        this.translateBlock(VERTICAL_CHESTNUT_PLANKS);
        this.translateBlock(CHESTNUT_SLAB);
        this.translateBlock(CHESTNUT_STAIRS);
        this.translateBlock(CHESTNUT_FENCE);
        this.translateBlock(CHESTNUT_FENCE_GATE);
        this.translateBlock(CHESTNUT_PRESSURE_PLATE);
        this.translateBlock(CHESTNUT_DOOR);
        this.translateBlock(CHESTNUT_TRAPDOOR);
        this.translateBlock(CHESTNUT_BUTTON);
        this.translateSign(CHESTNUT_SIGNS, "chestnut");
        this.translateBlock(CHESTNUT_LEAVES);
        this.translateBlock(CHESTNUT_SAPLING);
        this.translateBlock(POTTED_CHESTNUT_SAPLING);
        this.translateBlock(CHESTNUT_BEEHIVE);
        this.add(CHESTNUT_HEDGE.get(), "Chestnut Leaf Hedge");
        this.translateBlock(CHESTNUT_LEAF_CARPET);
        this.add(CHESTNUT_LEAF_PILE.get(), "Pile of Chestnut Leaves");
        this.translateBlock(CHESTNUT_LADDER);
        this.translateBlock(CHESTNUT_BOOKSHELF);
        this.translateBlock(CHESTNUT_BOARDS);
        this.translateBlock(CHESTNUT_CABINET);
        this.translateBlock(CHESTNUT_VERTICAL_SLAB);
        this.translateBlock(CHESTNUT_POST);
        this.translateBlock(STRIPPED_CHESTNUT_POST);
        this.translateBlock(CHESTNUT_CHEST);
        this.translateBlock(CHESTNUT_TRAPPED_CHEST);
        this.add(CHESTNUT_CRATE.get(), "Crate of Chestnuts");
        this.add(ROASTED_CHESTNUT_CRATE.get(), "Crate of Roasted Chestnuts");

        this.translateBlock(STRIPPED_PINE_LOG);
        this.translateBlock(STRIPPED_PINE_WOOD);
        this.translateBlock(PINE_LOG);
        this.translateBlock(PINE_WOOD);
        this.translateBlock(PINE_PLANKS);
        this.translateBlock(VERTICAL_PINE_PLANKS);
        this.translateBlock(PINE_SLAB);
        this.translateBlock(PINE_STAIRS);
        this.translateBlock(PINE_FENCE);
        this.translateBlock(PINE_FENCE_GATE);
        this.translateBlock(PINE_PRESSURE_PLATE);
        this.translateBlock(PINE_DOOR);
        this.translateBlock(PINE_TRAPDOOR);
        this.translateBlock(PINE_BUTTON);
        this.translateSign(PINE_SIGNS, "pine");
        this.translateBlock(PINE_LEAVES);
        this.translateBlock(PINE_SAPLING);
        this.translateBlock(POTTED_PINE_SAPLING);
        this.translateBlock(PINE_BEEHIVE);
        this.add(PINE_HEDGE.get(), "Pine Leaf Hedge");
        this.translateBlock(PINE_LEAF_CARPET);
        this.add(PINE_LEAF_PILE.get(), "Pile of Pine Leaves");
        this.translateBlock(PINE_LADDER);
        this.translateBlock(PINE_BOOKSHELF);
        this.translateBlock(PINE_BOARDS);
        this.translateBlock(PINE_CABINET);
        this.translateBlock(PINE_VERTICAL_SLAB);
        this.translateBlock(PINE_POST);
        this.translateBlock(STRIPPED_PINE_POST);
        this.translateBlock(PINE_CHEST);
        this.translateBlock(PINE_TRAPPED_CHEST);

        this.translateBlock(PINECONE);
        this.translateBlock(FAIRY_LIGHT);
        this.translateBlock(SOUL_FAIRY_LIGHT);
        this.translateBlock(CUPRIC_FAIRY_LIGHT);
        this.translateBlock(ENDER_FAIRY_LIGHT);

        this.translateBlock(PINECONE_BLOCK);
        this.translateBlock(CARVED_PINECONE_BLOCK);
        this.add(WILL_O_THE_WISP.get(), "Will o' the Wisp");

        this.translateBlock(FEATHER_WING);
        this.translateBlock(FEATHER_ORNAMENT);
        this.translateBlock(DREAM_CATCHER);

        this.translateBlock(PINECONE_SHINGLES);
        this.translateBlock(PINECONE_SHINGLE_SLAB);
        this.translateBlock(PINECONE_SHINGLE_STAIRS);
        this.translateBlock(PINECONE_SHINGLE_WALL);
        this.translateBlock(PINECONE_SHINGLE_VERTICAL_SLAB);

        this.translateBlock(SNOWY_SPROUTS);
        this.translateBlock(GELISOL_SPROUTS);
        this.translateBlock(DRY_MOSSY_SPROUTS);
        this.translateBlock(MOSSY_SPROUTS);

        this.add("block.windswept.snow_carpet", "Snow Carpet");
        this.translateBlock(SNOW_STAIRS);
        this.translateBlock(SNOW_SLAB);
        this.translateBlock(SNOW_VERTICAL_SLAB);
        this.translateBlock(SNOW_BRICKS);
        this.translateBlock(SNOW_BRICK_STAIRS);
        this.translateBlock(SNOW_BRICK_SLAB);
        this.translateBlock(SNOW_BRICK_WALL);
        this.translateBlock(SNOW_BRICK_VERTICAL_SLAB);

        this.translateBlock(PACKED_ICE_STAIRS);
        this.translateBlock(PACKED_ICE_SLAB);
        this.translateBlock(PACKED_ICE_VERTICAL_SLAB);
        this.translateBlock(PACKED_ICE_BRICKS);
        this.translateBlock(CHISELED_PACKED_ICE_BRICKS);
        this.translateBlock(PACKED_ICE_BRICK_STAIRS);
        this.translateBlock(PACKED_ICE_BRICK_SLAB);
        this.translateBlock(PACKED_ICE_BRICK_WALL);
        this.translateBlock(PACKED_ICE_BRICK_VERTICAL_SLAB);

        this.translateBlock(BLUE_ICE_STAIRS);
        this.translateBlock(BLUE_ICE_SLAB);
        this.translateBlock(BLUE_ICE_VERTICAL_SLAB);
        this.translateBlock(BLUE_ICE_BRICKS);
        this.translateBlock(CHISELED_BLUE_ICE_BRICKS);
        this.translateBlock(BLUE_ICE_BRICK_STAIRS);
        this.translateBlock(BLUE_ICE_BRICK_SLAB);
        this.translateBlock(BLUE_ICE_BRICK_WALL);
        this.translateBlock(BLUE_ICE_BRICK_VERTICAL_SLAB);

        this.translateBlock(SHALE);
        this.translateBlock(SHALE_STAIRS);
        this.translateBlock(SHALE_SLAB);
        this.translateBlock(SHALE_WALL);
        this.translateBlock(SHALE_VERTICAL_SLAB);
        this.translateBlock(POLISHED_SHALE);
        this.translateBlock(POLISHED_SHALE_STAIRS);
        this.translateBlock(POLISHED_SHALE_SLAB);
        this.translateBlock(POLISHED_SHALE_WALL);
        this.translateBlock(POLISHED_SHALE_VERTICAL_SLAB);
        this.translateBlock(POLISHED_SHALE_BRICKS);
        this.translateBlock(CHISELED_POLISHED_SHALE_BRICKS);
        this.translateBlock(POLISHED_SHALE_BRICK_STAIRS);
        this.translateBlock(POLISHED_SHALE_BRICK_SLAB);
        this.translateBlock(POLISHED_SHALE_BRICK_WALL);
        this.translateBlock(POLISHED_SHALE_BRICK_VERTICAL_SLAB);
        this.translateBlock(ICY_POLISHED_SHALE_BRICKS);
        this.translateBlock(POLISHED_SHALE_PRESSURE_PLATE);
        this.translateBlock(POLISHED_SHALE_BUTTON);

        this.translateBlock(POLISHED_DEEPSLATE_PRESSURE_PLATE);
        this.translateBlock(POLISHED_DEEPSLATE_BUTTON);

        this.translateBlock(CANDY_CANE_BLOCK);

        this.translateBlock(GINGER_SOIL);
        this.translateBlock(GINGERBREAD_BLOCK);
        this.translateBlock(GLAZED_GINGERBREAD_BLOCK);
        this.translateBlock(GINGERBREAD_BRICKS);
        this.translateBlock(GINGERBREAD_BRICK_STAIRS);
        this.translateBlock(GINGERBREAD_BRICK_SLAB);
        this.translateBlock(GINGERBREAD_BRICK_WALL);
        this.translateBlock(GINGERBREAD_BRICK_VERTICAL_SLAB);
        this.translateBlock(GLAZED_GINGERBREAD_BRICKS);
        this.translateBlock(GINGERBREAD_COOKIE_BLOCK);
        this.translateBlock(GLAZED_GINGERBREAD_BRICK_STAIRS);
        this.translateBlock(GLAZED_GINGERBREAD_BRICK_SLAB);
        this.translateBlock(GLAZED_GINGERBREAD_BRICK_WALL);
        this.translateBlock(GLAZED_GINGERBREAD_BRICK_VERTICAL_SLAB);
        this.add(GINGER_ROOT_CRATE.get(), "Crate of Ginger Roots");

        this.translateBlock(HOLLY_WREATH);
        this.translateBlock(PINECONE_WREATH);
        this.translateBlock(VINE_WREATH);
        this.translateBlock(CHRISTMAS_PUDDING);
        this.translateBlock(FROSTBITER_TROPHY);
        this.translateBlock(ICE_SHEET);

        this.translateBlock(LUPINE);
        this.translateBlock(RED_ROSE_BUSH);
        this.translateBlock(BLUE_ROSE_BUSH);
        this.translateBlock(WHITE_ROSE_BUSH);
        this.translateBlock(YELLOW_ROSE_BUSH);

        this.translateBlock(RED_ROSE);
        this.translateBlock(BLUE_ROSE);
        this.translateBlock(WHITE_ROSE);
        this.translateBlock(YELLOW_ROSE);
        this.translateBlock(FOXGLOVE);
        this.translateBlock(BLUEBELLS);
        this.translateBlock(SNOWDROP);
        this.translateBlock(MOSS_CAMPION);
        this.translateBlock(GINGER_FLOWER);
        this.translateBlock(NIGHTSHADE);
        this.translateBlock(LAVENDER);

        this.translateBlock(POTTED_RED_ROSE);
        this.translateBlock(POTTED_BLUE_ROSE);
        this.translateBlock(POTTED_WHITE_ROSE);
        this.translateBlock(POTTED_YELLOW_ROSE);
        this.translateBlock(POTTED_FOXGLOVE);
        this.translateBlock(POTTED_BLUEBELLS);
        this.translateBlock(POTTED_NIGHTSHADE);
        this.translateBlock(POTTED_SNOWDROP);
        this.translateBlock(POTTED_MOSS_CAMPION);
        this.translateBlock(POTTED_GINGER_FLOWER);
        this.translateBlock(POTTED_SNOWY_SPROUTS);
        this.translateBlock(POTTED_GELISOL_SPROUTS);
        this.translateBlock(POTTED_DRY_MOSSY_SPROUTS);
        this.translateBlock(POTTED_MOSSY_SPROUTS);
        this.translateBlock(POTTED_LAVENDER);

        this.translateBlock(LAVENDER_THATCH);
        this.translateBlock(LAVENDER_THATCH_STAIRS);
        this.translateBlock(LAVENDER_THATCH_SLAB);
        this.translateBlock(LAVENDER_THATCH_VERTICAL_SLAB);

        this.translateBlock(WILD_BERRY_BUSH);
        this.add(WILD_BERRY_BASKET.get(), "Basket of Wild Berries");

        this.translateBlock(ICICLES);
        this.translateBlock(ICICLE_BLOCK);
        this.translateBlock(CHISELED_ICICLE_BLOCK);
        this.translateBlock(ICICLE_DOOR);
        this.translateBlock(ICICLE_TRAPDOOR);
        this.translateBlock(ICICLE_BARS);
        this.translateBlock(ICE_LANTERN);

        this.translateBlock(LUNAROCK);
        this.translateBlock(LUNAROCK_STAIRS);
        this.translateBlock(LUNAROCK_SLAB);
        this.translateBlock(LUNAROCK_WALL);
        this.translateBlock(LUNAROCK_VERTICAL_SLAB);
        this.translateBlock(CUT_LUNAROCK);
        this.translateBlock(CUT_LUNAROCK_STAIRS);
        this.translateBlock(CUT_LUNAROCK_SLAB);
        this.translateBlock(CUT_LUNAROCK_WALL);
        this.translateBlock(CUT_LUNAROCK_VERTICAL_SLAB);
        this.translateBlock(CUT_LUNAROCK_BRICKS);
        this.translateBlock(CHISELED_CUT_LUNAROCK_BRICKS);
        this.translateBlock(CUT_LUNAROCK_BRICK_STAIRS);
        this.translateBlock(CUT_LUNAROCK_BRICK_SLAB);
        this.translateBlock(CUT_LUNAROCK_BRICK_WALL);
        this.translateBlock(CUT_LUNAROCK_BRICK_VERTICAL_SLAB);
        this.translateBlock(SMOOTH_LUNAROCK);
        this.translateBlock(SMOOTH_LUNAROCK_SLAB);
        this.translateBlock(SMOOTH_LUNAROCK_STAIRS);
        this.translateBlock(SMOOTH_LUNAROCK_VERTICAL_SLAB);

        this.translateBlock(DRY_MOSS_CARPET);
        this.translateBlock(DRY_MOSS_BLOCK);
        this.translateBlock(DRY_MOSSY_COBBLESTONE);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_SLAB);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_STAIRS);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_WALL);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_VERTICAL_SLAB);
        this.translateBlock(DRY_MOSSY_STONE_BRICKS);
        this.translateBlock(DRY_MOSSY_STONE_BRICK_SLAB);
        this.translateBlock(DRY_MOSSY_STONE_BRICK_STAIRS);
        this.translateBlock(DRY_MOSSY_STONE_BRICK_WALL);
        this.translateBlock(DRY_MOSSY_STONE_BRICK_VERTICAL_SLAB);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_BRICKS);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_BRICK_SLAB);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_BRICK_STAIRS);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_BRICK_WALL);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_BRICK_VERTICAL_SLAB);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_TILES);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_TILE_SLAB);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_TILE_STAIRS);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_TILE_WALL);
        this.translateBlock(DRY_MOSSY_COBBLESTONE_TILE_VERTICAL_SLAB);

        this.add(RED_MUSHROOM_BASKET.get(), "Basket of Red Mushrooms");
        this.add(BROWN_MUSHROOM_BASKET.get(), "Basket of Brown Mushrooms");
        this.add(GLOW_SHROOM_BASKET.get(), "Basket of Glow Shrooms");

        this.translateBlock(GELISOL);
        this.translateBlock(GELISOL_PATH);
        this.translateBlock(FROZEN_FLESH_BLOCK);

        // Entities //
        this.translateEntity(WindsweptEntityTypes.CHILLED);
        this.translateEntity(WindsweptEntityTypes.FROSTBITER);
        this.translateEntity(WindsweptEntityTypes.FROST_ARROW);
        this.add(WindsweptEntityTypes.CUPIDS_ARROW.get(), "Cupid's Arrow");

        // Effects //
        this.translateEffect(WindsweptEffects.THORNS, "Causes damage to enemies when they attack you.");
        this.translateEffect(WindsweptEffects.FROST_RESISTANCE, "Grants immunity to frost. Allows for walking on Powder Snow. Stops Entity Conversion in Powder Snow.");
        this.translateEffect(WindsweptEffects.PLENTY, "idk yet.");

        this.translatePotion(WindsweptEffects.THORNS_POTION, "Prickling");
        this.translatePotion(WindsweptEffects.LONG_THORNS_POTION, "Prickling");
        this.translatePotion(WindsweptEffects.STRONG_THORNS_POTION, "Prickling");

        this.translatePotion(WindsweptEffects.FROST_RESISTANCE_POTION, "Frost Resistance");
        this.translatePotion(WindsweptEffects.LONG_FROST_RESISTANCE_POTION, "Frost Resistance");

        // Attributes
        this.translateAttribute(WindsweptAttributes.SNOW_SPEED);
        this.translateAttribute(WindsweptAttributes.FRAGRANCE);
        this.add(WindsweptAttributes.SPRINT_DAMAGE.get().getDescriptionId(), "Attack Damage While Sprinting");

        // Biomes //
        this.translateBiome(WindsweptBiomes.CHESTNUT_FOREST);
        this.translateBiome(WindsweptBiomes.SNOWY_CHESTNUT_FOREST);
        this.translateBiome(WindsweptBiomes.PINE_BARRENS);
        this.translateBiome(WindsweptBiomes.SNOWY_PINE_BARRENS);
        this.translateBiome(WindsweptBiomes.TUNDRA);

        // Enchantments //
        this.translateEnchantment(WindsweptEnchantments.SLIPPING_CURSE, "Curse of Slipping", "Causes the wearer to slip on any block as if it was ice whilst damaging the boots.");

        // Damage Sources //
        this.translateDamageSource(WindsweptDamageSources.HOLLY_LEAVES,
                player -> player + " was ripped to death by holly leaves",
                (player, entity) -> player + " was ripped to death by holly leaves whilst trying to escape " + entity);

        this.translateDamageSource(WindsweptDamageSources.ICICLE,
                player -> player + " was impaled on an icicle",
                (player, entity) -> player + " was impaled on an icicle whilst trying to escape " + entity);

        // Slabfish //
        this.translateSlabfish("chestnut");
        this.translateSlabfish("grove");
        this.translateSlabfish("pine");

        // JEI Info //
        this.jeiInfo(MUSIC_DISC_RAIN, "Dropped by a Drowned if killed by a Skeleton.");
        this.jeiInfo(MUSIC_DISC_SNOW, "Dropped by a Chilled if killed by a Skeleton.");
        this.jeiInfo(MUSIC_DISC_BUMBLEBEE, "Sometimes dropped when shearing a Beehive for Honeycombs.");

        this.jeiInfo(WILD_BERRIES, "Wild berries are the fruit of the wild berry bush. The plant is made unique by their ability to grow in snowy conditions. The berry can be cultivated for a juice that can regenerate health, and can be frozen to a popsicle that grants resistance to frost.");
        this.jeiInfo(NIGHTSHADE, "Nightshades are mystical flowers found rarely growing in patches from the roots of trees. The flower emits a subtle white light; similar to the light of the moon.");

        this.jeiInfo(CARVED_PINECONE_BLOCK, "The face of the Carved Pinecone creates a single note randomly as wind passes through them, the note produced is deeper depending on how high they are stacked.");
        //this.jeiInfo(WILL_O_THE_WISP, "The face of the Carved Pinecone ");

        this.jeiInfo(ICE_LANTERN, "The Ice Lantern emits a light incapable of melting Ice and Snow.");
        this.jeiInfo(WOODEN_BUCKET, "Wooden buckets are easily craft-able; but it comes at a cost to their strength. Durability is taken when fluids exit the bucket.");
        this.jeiInfo(SNOW_BOOTS, "Snow boots allow for faster traversal through snow, and grants the wearer the ability to walk on Powder Snow. The leather can be dyed.");
    }

    private void translateItem(RegistryObject<? extends Item> item) {
        this.add(item.get(), toUpper(ForgeRegistries.ITEMS, item));
    }

    private void translateBlock(RegistryObject<? extends Block> block) {
        this.add(block.get(), toUpper(ForgeRegistries.BLOCKS, block));
    }

    private void translateEntity(RegistryObject<? extends EntityType<?>> entity) {
        this.add(entity.get(), toUpper(ForgeRegistries.ENTITY_TYPES, entity));
    }

    private void translateBiome(BiomeSubRegistryHelper.KeyedBiome biome) {
        this.add("biome." + Windswept.MOD_ID + "." + ForgeRegistries.BIOMES.getKey(biome.get()).getPath(), toUpper(ForgeRegistries.BIOMES, biome.getObject()));
    }

    private void translateEnchantment(RegistryObject<? extends Enchantment> enchantment, String name, String desc) {
        String descId = enchantment.get().getDescriptionId();
        this.add(descId, name);
        this.add(descId + ".desc", desc);
    }

    private void translateMusicDisc(RegistryObject<? extends Item> item, String desc) {
        this.add(item.get(), "Music Disc");
        this.addDescription(item, desc);
    }

    private void translateSign(Pair<RegistryObject<BlueprintStandingSignBlock>, RegistryObject<BlueprintWallSignBlock>> sign, String name) {
        this.translateBlock(sign.getFirst());
        this.add(sign.getFirst().get().getDescriptionId().replace(name, name + "_wall"), toUpper(ForgeRegistries.BLOCKS, sign.getSecond()));
    }

    private void translateAttribute(RegistryObject<? extends Attribute> attribute) {
        this.add(attribute.get().getDescriptionId(), toUpper(ForgeRegistries.ATTRIBUTES, attribute));
    }

    private void translateEffect(RegistryObject<? extends MobEffect> effect, String desc) {
        this.add(effect.get(), toUpper(ForgeRegistries.MOB_EFFECTS, effect));
        this.add(effect.get().getDescriptionId() + ".description", desc);
    }

    private void translateSlabfish(String type) {
        this.add("entity.environmental.slabfish.type." + type, toUpper(type));
    }

    private void translateBannerPattern(RegistryObject<? extends Item> item, String name) {
        String desc = toUpper(name);
        this.add(item.get(), "Banner Pattern");
        this.addDescription(item, desc);

        for (DyeColor dye : DyeColor.values())
            this.add("block.minecraft.banner." + Windswept.MOD_ID + "." + name + "." + dye.getName(), toUpper(dye.getName()) + " " + desc);
    }

    private void jeiInfo(Supplier<? extends ItemLike> item, String desc) {
        this.add(WindsweptPlugin.getDesc(item), desc);
    }

    private void translateDamageSource(DamageSource source, Function<String, String> death, BiFunction<String, String, String> killed) {
        this.add("death.attack." + source.getMsgId(), death.apply("%1$s"));
        this.add("death.attack." + source.getMsgId() + ".player", killed.apply("%1$s", "%2$s"));
    }

    private void translatePotion(RegistryObject<? extends Potion> potion, String effect) {
        String name = ForgeRegistries.POTIONS.getKey(potion.get()).getPath();

        this.add("item.minecraft.potion.effect." + name, "Potion of " + effect);
        this.add("item.minecraft.splash_potion.effect." + name, "Splash Potion of " + effect);
        this.add("item.minecraft.tipped_arrow.effect." + name, "Arrow of " + effect);
        this.add("item.minecraft.lingering_potion.effect." + name, "Lingering Potion of " + effect);
        this.add("item.caverns_and_chasms.tether_potion.effect." + name, "Tether Potion of " + effect);
    }

    private void addDescription(RegistryObject<? extends Item> item, String desc) {
        this.add(item.get().getDescriptionId() + ".desc", desc);
    }

    private static <T> String toUpper(IForgeRegistry<T> entry, RegistryObject<? extends T> object) {
        return toUpper(entry.getKey(object.get()).getPath());
    }

    private static String toUpper(String string) {
        return StringUtils.capitaliseAllWords(string.replace('_', ' '));
    }

}
