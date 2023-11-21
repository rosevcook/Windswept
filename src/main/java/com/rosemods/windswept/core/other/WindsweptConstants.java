package com.rosemods.windswept.core.other;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public final class WindsweptConstants {
    public static final String QUARK = "minecraft";
    public static final String BERRY_GOOD = "minecraft";
    public static final String WOODWORKS = "minecraft";
    public static final String BOATLOAD = "minecraft";
    public static final String NEAPOLITAN = "minecraft";
    public static final String FARMERSDELIGHT = "minecraft";
    public static final String AUTUMNITY = "minecraft";
    public static final String CAVERNS_AND_CHASMS = "minecraft";

    public static final Supplier<Item> FOUL_BERRIES = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("autumnity", "foul_berries"));
    public static final Supplier<Item> SILVER_SWORD = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_sword"));
    public static final Supplier<Item> SILVER_SHOVEL = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_shovel"));
    public static final Supplier<Item> SILVER_AXE = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_axe"));
    public static final Supplier<Item> SILVER_HELMET = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_helmet"));
    public static final Supplier<Item> SILVER_CHESTPLATE = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_chestplate"));
    public static final Supplier<Item> SILVER_LEGGINGS = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_leggings"));
    public static final Supplier<Item> SILVER_BOOTS = () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation("caverns_and_chasms", "silver_boots"));
}
