/*******************************************************************************
 * Copyright 2019 grondag
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package grondag.artbox;

import static grondag.xm2.api.texture.TextureRotation.ROTATE_180;
import static grondag.xm2.api.texture.TextureRotation.ROTATE_270;
import static grondag.xm2.api.texture.TextureRotation.ROTATE_90;
import static grondag.xm2.api.texture.TextureRotation.ROTATE_NONE;
import static grondag.xm2.api.texture.TextureRotation.ROTATE_RANDOM;
import static grondag.xm2.texture.TextureSetHelper.addBigTex;
import static grondag.xm2.texture.TextureSetHelper.addBorderRandom;
import static grondag.xm2.texture.TextureSetHelper.addBorderSingle;
import static grondag.xm2.texture.TextureSetHelper.addDecal;
import static grondag.xm2.texture.TextureSetHelper.addZoom;
import static grondag.xm2.texture.TextureSetHelper.addZoom2;

import static grondag.artbox.ArtBox.MODID;

import grondag.xm2.api.texture.TextureGroup;
import grondag.xm2.api.texture.TextureLayoutMap;
import grondag.xm2.api.texture.TextureRenderIntent;
import grondag.xm2.api.texture.TextureScale;
import grondag.xm2.api.texture.TextureSet;

public class ArtBoxTextures {
    
    public static void init() {
        ArtBox.LOG.info("Registering ArtBox texture sets.");
    }

    public static final TextureSet BIGTEX_MARBLE = addBigTex(MODID, "marble");
    public static final TextureSet BIGTEX_MARBLE_ZOOM = addZoom(BIGTEX_MARBLE);
    public static final TextureSet BIGTEX_MARBLE_ZOOM_X2 = addZoom2(BIGTEX_MARBLE);

    public static final TextureSet TILE_DOTS = TextureSet.builder().displayNameToken("dots").baseTextureName("artbox:blocks/dots").versionCount(4)
            .scale(TextureScale.SINGLE).layout(TextureLayoutMap.VERSION_X_8).rotation(ROTATE_RANDOM).renderIntent(TextureRenderIntent.BASE_OR_OVERLAY_NO_CUTOUT)
            .groups(TextureGroup.STATIC_TILES, TextureGroup.STATIC_DETAILS).build("artbox:dots");

//======================================================================
//  BORDERS
//======================================================================

    public static final TextureSet MASONRY_SIMPLE = TextureSet.builder().displayNameToken("masonry_simple").baseTextureName("artbox:blocks/masonry_simple")
            .versionCount(1).scale(TextureScale.SINGLE).layout(TextureLayoutMap.MASONRY_5).rotation(ROTATE_NONE).renderIntent(TextureRenderIntent.OVERLAY_ONLY)
            .groups(TextureGroup.STATIC_BORDERS).build("artbox:masonry_simple");

    public static final TextureSet BORDER_SINGLE_PINSTRIPE = addBorderSingle(MODID, "border_single_pinstripe");
    public static final TextureSet BORDER_INSET_PINSTRIPE = addBorderSingle(MODID, "border_inset_pinstripe");
    public static final TextureSet BORDER_GRITTY_INSET_PINSTRIPE = addBorderRandom(MODID, "border_gritty_inset_pinstripe", false, false);
    public static final TextureSet BORDER_SINGLE_LINE = addBorderSingle(MODID, "border_single_line");
    public static final TextureSet BORDER_SINGLE_BOLD_LINE = addBorderSingle(MODID, "border_single_bold_line");
    public static final TextureSet BORDER_SINGLE_FAT_LINE = addBorderSingle(MODID, "border_single_fat_line");
    public static final TextureSet BORDER_GRITTY_FAT_LINE = addBorderRandom(MODID, "border_gritty_fat_line", false, false);
    public static final TextureSet BORDER_DOUBLE_MIXED_LINES = addBorderSingle(MODID, "border_double_mixed_lines");
    public static final TextureSet BORDER_DOUBLE_PINSTRIPES = addBorderSingle(MODID, "border_double_pinstripes");
    public static final TextureSet BORDER_INSET_DOUBLE_PINSTRIPES = addBorderSingle(MODID, "border_inset_double_pinstripes");
    public static final TextureSet BORDER_TRIPLE_MIXED_LINES = addBorderSingle(MODID, "border_triple_mixed_lines");
    public static final TextureSet BORDER_DOUBLE_DOUBLE = addBorderSingle(MODID, "border_double_double");
    public static final TextureSet BORDER_WHITEWALL = addBorderSingle(MODID, "border_whitewall");
    public static final TextureSet BORDER_GRITTY_WHITEWALL = addBorderRandom(MODID, "border_gritty_whitewall", false, false);

    public static final TextureSet BORDER_PINSTRIPE_DASH = addBorderSingle(MODID, "border_pinstripe_dash");
    public static final TextureSet BORDER_INSET_DOTS_1 = addBorderSingle(MODID, "border_inset_dots_1");
    public static final TextureSet BORDER_INSET_DOTS_2 = addBorderSingle(MODID, "border_inset_dots_2");
    public static final TextureSet BORDER_INSET_PIN_DOTS = addBorderSingle(MODID, "border_inset_pin_dots");
    public static final TextureSet BORDER_CHANNEL_DOTS = addBorderSingle(MODID, "border_channel_dots");
    public static final TextureSet BORDER_CHANNEL_PIN_DOTS = addBorderSingle(MODID, "border_channel_pin_dots");

    public static final TextureSet BORDER_CHANNEL_CHECKERBOARD = addBorderSingle(MODID, "border_channel_checkerboard");
    public static final TextureSet BORDER_CHECKERBOARD = addBorderSingle(MODID, "border_checkerboard");
    public static final TextureSet BORDER_GRITTY_CHECKERBOARD = addBorderRandom(MODID, "border_gritty_checkerboard", false, false);

    public static final TextureSet BORDER_GROOVY_STRIPES = addBorderSingle(MODID, "border_groovy_stripes");
    public static final TextureSet BORDER_GRITTY_GROOVES = addBorderRandom(MODID, "border_gritty_grooves", false, false);
    public static final TextureSet BORDER_GROOVY_PINSTRIPES = addBorderSingle(MODID, "border_groovy_pinstripes");
    public static final TextureSet BORDER_GRITTY_PINSTRIPE_GROOVES = addBorderRandom(MODID, "border_gritty_pinstripe_grooves", false, false);

    public static final TextureSet BORDER_ZIGZAG = addBorderSingle(MODID, "border_zigzag");
    public static final TextureSet BORDER_INVERSE_ZIGZAG = addBorderSingle(MODID, "border_inverse_zigzag");
    public static final TextureSet BORDER_CAUTION = addBorderSingle(MODID, "border_caution");
    public static final TextureSet BORDER_FILMSTRIP = addBorderSingle(MODID, "border_filmstrip");
    public static final TextureSet BORDER_CHANNEL_LINES = addBorderSingle(MODID, "border_channel_lines");
    public static final TextureSet BORDER_SIGNAL = addBorderSingle(MODID, "border_signal");
    public static final TextureSet BORDER_GRITTY_SIGNAL = addBorderRandom(MODID, "border_gritty_signal", false, false);
    public static final TextureSet BORDER_LOGIC = addBorderRandom(MODID, "border_logic", true, false);
    public static final TextureSet BORDER_INVERSE_TILE_1 = addBorderRandom(MODID, "border_inverse_logic_1", true, true);
    public static final TextureSet BORDER_INVERSE_TILE_2 = addBorderRandom(MODID, "border_inverse_logic_2", true, true);

//======================================================================
//  BIGTEX
//======================================================================

    public static final TextureSet BIGTEX_WEATHERED_STONE = addBigTex(MODID, "weathered_smooth_stone");
    public static final TextureSet BIGTEX_WEATHERED_STONE_ZOOM = addZoom(BIGTEX_WEATHERED_STONE);
    public static final TextureSet BIGTEX_WEATHERED_STONE_ZOOM_X2 = addZoom2(BIGTEX_WEATHERED_STONE);

    public static final TextureSet BIGTEX_SANDSTONE = addBigTex(MODID, "sandstone");
    public static final TextureSet BIGTEX_SANDSTONE_ZOOM = addZoom(BIGTEX_SANDSTONE);
    public static final TextureSet BIGTEX_SANDSTONE_ZOOM_X2 = addZoom2(BIGTEX_SANDSTONE);

    public static final TextureSet BIGTEX_ASPHALT = addBigTex(MODID, "asphalt");
    public static final TextureSet BIGTEX_ASPHALT_ZOOM = addZoom(BIGTEX_ASPHALT);
    public static final TextureSet BIGTEX_ASPHALT_ZOOM_X2 = addZoom2(BIGTEX_ASPHALT);

    public static final TextureSet BIGTEX_WORN_ASPHALT = addBigTex(MODID, "worn_asphalt");
    public static final TextureSet BIGTEX_WORN_ASPHALT_ZOOM = addZoom(BIGTEX_WORN_ASPHALT);
    public static final TextureSet BIGTEX_WORN_ASPHALT_ZOOM_X2 = addZoom2(BIGTEX_WORN_ASPHALT);

    public static final TextureSet BIGTEX_WOOD = TextureSet.builder().displayNameToken("wood").baseTextureName("artbox:blocks/wood").versionCount(1)
            .scale(TextureScale.MEDIUM).layout(TextureLayoutMap.SINGLE).rotation(ROTATE_NONE).renderIntent(TextureRenderIntent.BASE_ONLY)
            .groups(TextureGroup.STATIC_TILES).build("artbox:wood");
    public static final TextureSet BIGTEX_WOOD_ZOOM = addZoom(BIGTEX_WOOD);
    public static final TextureSet BIGTEX_WOOD_ZOOM_X2 = addZoom2(BIGTEX_WOOD_ZOOM);

    public static final TextureSet BIGTEX_WOOD_FLIP = TextureSet.builder(BIGTEX_WOOD).displayNameToken("wood_flip").rotation(ROTATE_90)
            .build("artbox:wood_flip");

    public static final TextureSet BIGTEX_WOOD_ZOOM_FLIP = addZoom(BIGTEX_WOOD_FLIP);
    public static final TextureSet BIGTEX_WOOD_ZOOM_X2_FLIP = addZoom2(BIGTEX_WOOD_ZOOM_FLIP);

    public static final TextureSet BIGTEX_GRANITE = addBigTex(MODID, "granite");
    public static final TextureSet BIGTEX_GRANITE_ZOOM = addZoom(BIGTEX_GRANITE);
    public static final TextureSet BIGTEX_GRANITE_ZOOM_X2 = addZoom2(BIGTEX_GRANITE);

    public static final TextureSet BIGTEX_SLATE = addBigTex(MODID, "slate");
    public static final TextureSet BIGTEX_SLATE_ZOOM = addZoom(BIGTEX_SLATE);
    public static final TextureSet BIGTEX_SLATE_ZOOM_X2 = addZoom2(BIGTEX_SLATE);

    public static final TextureSet BIGTEX_ROUGH_ROCK = addBigTex(MODID, "rough_rock");
    public static final TextureSet BIGTEX_ROUGH_ROCK_ZOOM = addZoom(BIGTEX_ROUGH_ROCK);
    public static final TextureSet BIGTEX_ROUGH_ROCK_ZOOM_X2 = addZoom2(BIGTEX_ROUGH_ROCK);

    public static final TextureSet BIGTEX_CRACKED_EARTH = addBigTex(MODID, "cracked_earth");
    public static final TextureSet BIGTEX_CRACKED_EARTH_ZOOM = addZoom(BIGTEX_CRACKED_EARTH);
    public static final TextureSet BIGTEX_CRACKED_EARTH_ZOOM_X2 = addZoom2(BIGTEX_CRACKED_EARTH);

//======================================================================
//  BIGTEX - ANIMATED
//======================================================================

//    public static final TextureSet BIGTEX_FLUID_GLOW = TextureSetRegistry.addTexturePallette("fluid_glow", "fluid_glow",
//            new TexturePaletteSpec(ExoticMatter.INSTANCE).versionCount(1).scale(TextureScale.MEDIUM).layout(TextureLayoutMap.BIGTEX_ANIMATED)
//                    .rotation(CONSISTENT.with(ROTATE_NONE)).renderIntent(TextureRenderIntent.OVERLAY_ONLY).groups(TextureGroup.DYNAMIC_DETAILS));
//    public static final TextureSet BIGTEX_FLUID_GLOW_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_FLUID_GLOW);
//    public static final TextureSet BIGTEX_FLUID_GLOW_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_FLUID_GLOW_ZOOM);
//
//    public static final TextureSet BIGTEX_FLUID_VORTEX = TextureSetRegistry.addTexturePallette("fluid_vortex", "fluid_vortex",
//            new TexturePaletteSpec(ExoticMatter.INSTANCE).versionCount(1).scale(TextureScale.MEDIUM).layout(TextureLayoutMap.BIGTEX_ANIMATED)
//                    .rotation(CONSISTENT.with(ROTATE_NONE)).renderIntent(TextureRenderIntent.BASE_OR_OVERLAY_NO_CUTOUT)
//                    .groups(TextureGroup.DYNAMIC_DETAILS, TextureGroup.DYNAMIC_TILES).withTicksPerFrame(2));
//    public static final TextureSet BIGTEX_FLUID_VORTEX_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_FLUID_VORTEX);
//    public static final TextureSet BIGTEX_FLUID_VORTEX_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_FLUID_VORTEX_ZOOM);
//
//    public static final TextureSet BIGTEX_CLOUDS = TextureSetRegistry.addTexturePallette("clouds", "clouds",
//            new TexturePaletteSpec(ExoticMatter.INSTANCE).versionCount(1).scale(TextureScale.MEDIUM).layout(TextureLayoutMap.BIGTEX_ANIMATED)
//                    .rotation(CONSISTENT.with(ROTATE_NONE)).renderIntent(TextureRenderIntent.BASE_OR_OVERLAY_NO_CUTOUT)
//                    .groups(TextureGroup.DYNAMIC_DETAILS, TextureGroup.DYNAMIC_TILES));
//    public static final TextureSet BIGTEX_CLOUDS_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_CLOUDS);
//    public static final TextureSet BIGTEX_CLOUDS_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_CLOUDS_ZOOM);
//
//    public static final TextureSet BIGTEX_STARFIELD = TextureSetRegistry.addTexturePallette("starfield", "starfield",
//            new TexturePaletteSpec(ExoticMatter.INSTANCE).versionCount(1).scale(TextureScale.SMALL).layout(TextureLayoutMap.BIGTEX_ANIMATED)
//                    .rotation(FIXED.with(ROTATE_NONE)).renderIntent(TextureRenderIntent.BASE_OR_OVERLAY_NO_CUTOUT)
//                    .groups(TextureGroup.DYNAMIC_DETAILS, TextureGroup.DYNAMIC_TILES));
//    public static final TextureSet BIGTEX_STARFIELD_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD);
//    public static final TextureSet BIGTEX_STARFIELD_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_ZOOM);
//
//    public static final TextureSet BIGTEX_STARFIELD_90 = TextureSetRegistry.addTexturePallette("starfield_90", "starfield",
//            new TexturePaletteSpec(BIGTEX_STARFIELD).rotation(FIXED.with(ROTATE_90)));
//    public static final TextureSet BIGTEX_STARFIELD_90_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_90);
//    public static final TextureSet BIGTEX_STARFIELD_90_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_90_ZOOM);
//
//    public static final TextureSet BIGTEX_STARFIELD_180 = TextureSetRegistry.addTexturePallette("starfield_180", "starfield",
//            new TexturePaletteSpec(BIGTEX_STARFIELD).rotation(FIXED.with(ROTATE_180)));
//    public static final TextureSet BIGTEX_STARFIELD_180_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_180);
//    public static final TextureSet BIGTEX_STARFIELD_180_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_180_ZOOM);
//
//    public static final TextureSet BIGTEX_STARFIELD_270 = TextureSetRegistry.addTexturePallette("starfield_270", "starfield",
//            new TexturePaletteSpec(BIGTEX_STARFIELD).rotation(FIXED.with(ROTATE_270)));
//    public static final TextureSet BIGTEX_STARFIELD_270_ZOOM = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_270);
//    public static final TextureSet BIGTEX_STARFIELD_270_ZOOM_X2 = TextureSetRegistry.addZoomedPallete(BIGTEX_STARFIELD_270_ZOOM);

//======================================================================
//  DECALS
//======================================================================
    public static final TextureSet DECAL_SMALL_DOT = addDecal(MODID, "small_dot", "small_dot", ROTATE_NONE);
    public static final TextureSet DECAL_MEDIUM_DOT = addDecal(MODID, "medium_dot", "medium_dot", ROTATE_NONE);
    public static final TextureSet DECAL_LARGE_DOT = addDecal(MODID, "big_dot", "big_dot", ROTATE_NONE);
    public static final TextureSet DECAL_SMALL_SQUARE = addDecal(MODID, "small_square", "small_square", ROTATE_NONE);
    public static final TextureSet DECAL_MEDIUM_SQUARE = addDecal(MODID, "medium_square", "medium_square", ROTATE_NONE);
    public static final TextureSet DECAL_LARGE_SQUARE = addDecal(MODID, "big_square", "big_square", ROTATE_NONE);
    public static final TextureSet DECAL_SKINNY_DIAGONAL_RIDGES = addDecal(MODID, "skinny_diagonal_ridges", "skinny_diagonal_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_THICK_DIAGONAL_CROSS_RIDGES = addDecal(MODID, "thick_diagonal_cross_ridges", "thick_diagonal_cross_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_THICK_DIAGONAL_RIDGES = addDecal(MODID, "thick_diagonal_ridges", "thick_diagonal_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_THIN_DIAGONAL_CROSS_RIDGES = addDecal(MODID, "thin_diagonal_cross_ridges", "thin_diagonal_cross_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_THIN_DIAGONAL_RIDGES = addDecal(MODID, "thin_diagonal_ridges", "thin_diagonal_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_THIN_DIAGONAL_CROSS_BARS = addDecal(MODID, "thin_diagonal_cross_bars", "thin_diagonal_cross_bars", ROTATE_NONE);
    public static final TextureSet DECAL_THIN_DIAGONAL_BARS = addDecal(MODID, "thin_diagonal_bars", "thin_diagonal_bars", ROTATE_NONE);
    public static final TextureSet DECAL_SKINNY_DIAGNAL_CROSS_BARS = addDecal(MODID, "skinny_diagonal_cross_bars", "skinny_diagonal_cross_bars", ROTATE_NONE);
    public static final TextureSet DECAL_SKINNY_DIAGONAL_BARS = addDecal(MODID, "skinny_diagonal_bars", "skinny_diagonal_bars", ROTATE_NONE);
    public static final TextureSet DECAL_DIAGONAL_CROSS_BARS = addDecal(MODID, "diagonal_cross_bars", "diagonal_cross_bars", ROTATE_NONE);
    public static final TextureSet DECAL_DIAGONAL_BARS = addDecal(MODID, "diagonal_bars", "diagonal_bars", ROTATE_NONE);
    public static final TextureSet DECAL_FAT_DIAGONAL_CROSS_BARS = addDecal(MODID, "fat_diagonal_cross_bars", "fat_diagonal_cross_bars", ROTATE_NONE);
    public static final TextureSet DECAL_FAT_DIAGONAL_BARS = addDecal(MODID, "fat_diagonal_bars", "fat_diagonal_bars", ROTATE_NONE);
    public static final TextureSet DECAL_DIAGONAL_CROSS_RIDGES = addDecal(MODID, "diagonal_cross_ridges", "diagonal_cross_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_DIAGONAL_RIDGES = addDecal(MODID, "diagonal_ridges", "diagonal_ridges", ROTATE_NONE);
    public static final TextureSet DECAL_SKINNY_BARS = addDecal(MODID, "skinny_bars", "skinny_bars", ROTATE_NONE);
    public static final TextureSet DECAL_FAT_BARS = addDecal(MODID, "fat_bars", "fat_bars", ROTATE_NONE);
    public static final TextureSet DECAL_THICK_BARS = addDecal(MODID, "thick_bars", "thick_bars", ROTATE_NONE);
    public static final TextureSet DECAL_THIN_BARS = addDecal(MODID, "thin_bars", "thin_bars", ROTATE_NONE);
    public static final TextureSet DECAL_SKINNY_DIAGONAL_RIDGES_90 = addDecal(MODID, "skinny_diagonal_ridges_90", "skinny_diagonal_ridges", ROTATE_90);
    public static final TextureSet DECAL_THICK_DIAGONAL_RIDGES_90 = addDecal(MODID, "thick_diagonal_ridges_90", "thick_diagonal_ridges", ROTATE_90);
    public static final TextureSet DECAL_THIN_DIAGONAL_RIDGES_90 = addDecal(MODID, "thin_diagonal_ridges_90", "thin_diagonal_ridges", ROTATE_90);
    public static final TextureSet DECAL_THIN_DIAGONAL_BARS_90 = addDecal(MODID, "thin_diagonal_bars_90", "thin_diagonal_bars", ROTATE_90);
    public static final TextureSet DECAL_SKINNY_DIAGONAL_BARS_90 = addDecal(MODID, "skinny_diagonal_bars_90", "skinny_diagonal_bars", ROTATE_90);
    public static final TextureSet DECAL_DIAGONAL_BARS_90 = addDecal(MODID, "diagonal_bars_90", "diagonal_bars", ROTATE_90);
    public static final TextureSet DECAL_FAT_DIAGONAL_BARS_90 = addDecal(MODID, "fat_diagonal_bars_90", "fat_diagonal_bars", ROTATE_90);
    public static final TextureSet DECAL_DIAGONAL_RIDGES_90 = addDecal(MODID, "diagonal_ridges_90", "diagonal_ridges", ROTATE_90);
    public static final TextureSet DECAL_SKINNY_BARS_90 = addDecal(MODID, "skinny_bars_90", "skinny_bars", ROTATE_90);
    public static final TextureSet DECAL_FAT_BARS_90 = addDecal(MODID, "fat_bars_90", "fat_bars", ROTATE_90);
    public static final TextureSet DECAL_THICK_BARS_90 = addDecal(MODID, "thick_bars_90", "thick_bars", ROTATE_90);
    public static final TextureSet DECAL_THIN_BARS_90 = addDecal(MODID, "thin_bars_90", "thin_bars", ROTATE_90);
    public static final TextureSet DECAL_SKINNY_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "skinny_diagonal_ridges_random", "skinny_diagonal_ridges", ROTATE_RANDOM);
    public static final TextureSet DECAL_THICK_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "thick_diagonal_ridges_random", "thick_diagonal_ridges", ROTATE_RANDOM);
    public static final TextureSet DECAL_THIN_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "thin_diagonal_ridges_random", "thin_diagonal_ridges", ROTATE_RANDOM);
    public static final TextureSet DECAL_THIN_DIAGONAL_BARS_RANDOM = addDecal(MODID, "thin_diagonal_bars_random", "thin_diagonal_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_SKINNY_DIAGONAL_BARS_RANDOM = addDecal(MODID, "skinny_diagonal_bars_random", "skinny_diagonal_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_DIAGONAL_BARS_RANDOM = addDecal(MODID, "diagonal_bars_random", "diagonal_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_FAT_DIAGONAL_BARS_RANDOM = addDecal(MODID, "fat_diagonal_bars_random", "fat_diagonal_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "diagonal_ridges_random", "diagonal_ridges", ROTATE_RANDOM);
    public static final TextureSet DECAL_SKINNY_BARS_RANDOM = addDecal(MODID, "skinny_bars_random", "skinny_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_FAT_BARS_RANDOM = addDecal(MODID, "fat_bars_random", "fat_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_THICK_BARS_RANDOM = addDecal(MODID, "thick_bars_random", "thick_bars", ROTATE_RANDOM);
    public static final TextureSet DECAL_THIN_BARS_RANDOM = addDecal(MODID, "thin_bars_random", "thin_bars", ROTATE_RANDOM);

    public static final TextureSet DECAL_SOFT_SKINNY_DIAGONAL_RIDGES = addDecal(MODID, "skinny_diagonal_ridges_seamless", "skinny_diagonal_ridges_seamless",
            ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_THICK_DIAGONAL_CROSS_RIDGES = addDecal(MODID, "thick_diagonal_cross_ridges_seamless",
            "thick_diagonal_cross_ridges_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_THICK_DIAGONAL_RIDGES = addDecal(MODID, "thick_diagonal_ridges_seamless", "thick_diagonal_ridges_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_CROSS_RIDGES = addDecal(MODID, "thin_diagonal_cross_ridges_seamless",
            "thin_diagonal_cross_ridges_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_RIDGES = addDecal(MODID, "thin_diagonal_ridges_seamless", "thin_diagonal_ridges_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_CROSS_BARS = addDecal(MODID, "thin_diagonal_cross_bars_seamless", "thin_diagonal_cross_bars_seamless",
            ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_BARS = addDecal(MODID, "thin_diagonal_bars_seamless", "thin_diagonal_bars_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_SKINNY_DIAGNAL_CROSS_BARS = addDecal(MODID, "skinny_diagonal_cross_bars_seamless", "skinny_diagonal_cross_bars_seamless",
            ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_SKINNY_DIAGONAL_BARS = addDecal(MODID, "skinny_diagonal_bars_seamless", "skinny_diagonal_bars_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_DIAGONAL_CROSS_BARS = addDecal(MODID, "diagonal_cross_bars_seamless", "diagonal_cross_bars_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_DIAGONAL_BARS = addDecal(MODID, "diagonal_bars_seamless", "diagonal_bars_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_FAT_DIAGONAL_CROSS_BARS = addDecal(MODID, "fat_diagonal_cross_bars_seamless", "fat_diagonal_cross_bars_seamless",
            ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_FAT_DIAGONAL_BARS = addDecal(MODID, "fat_diagonal_bars_seamless", "fat_diagonal_bars_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_DIAGONAL_CROSS_RIDGES = addDecal(MODID, "diagonal_cross_ridges_seamless", "diagonal_cross_ridges_seamless", ROTATE_NONE);
    public static final TextureSet DECAL_SOFT_DIAGONAL_RIDGES = addDecal(MODID, "diagonal_ridges_seamless", "diagonal_ridges_seamless", ROTATE_NONE);

    public static final TextureSet DECAL_SOFT_SKINNY_DIAGONAL_RIDGES_90 = addDecal(MODID, "skinny_diagonal_ridges_90", "skinny_diagonal_ridges", ROTATE_90);
    public static final TextureSet DECAL_SOFT_THICK_DIAGONAL_RIDGES_90 = addDecal(MODID, "thick_diagonal_ridges_seamless_90", "thick_diagonal_ridges_seamless",
            ROTATE_90);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_RIDGES_90 = addDecal(MODID, "thin_diagonal_ridges_seamless_90", "thin_diagonal_ridges_seamless",
            ROTATE_90);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_BARS_90 = addDecal(MODID, "thin_diagonal_bars_seamless_90", "thin_diagonal_bars_seamless", ROTATE_90);
    public static final TextureSet DECAL_SOFT_SKINNY_DIAGONAL_BARS_90 = addDecal(MODID, "skinny_diagonal_bars_seamless_90", "skinny_diagonal_bars_seamless",
            ROTATE_90);
    public static final TextureSet DECAL_SOFT_DIAGONAL_BARS_90 = addDecal(MODID, "diagonal_bars_seamless_90", "diagonal_bars_seamless", ROTATE_90);
    public static final TextureSet DECAL_SOFT_FAT_DIAGONAL_BARS_90 = addDecal(MODID, "fat_diagonal_bars_seamless_90", "fat_diagonal_bars_seamless", ROTATE_90);
    public static final TextureSet DECAL_SOFT_DIAGONAL_RIDGES_90 = addDecal(MODID, "diagonal_ridges_seamless_90", "diagonal_ridges_seamless", ROTATE_90);

    public static final TextureSet DECAL_SOFT_SKINNY_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "skinny_diagonal_ridges_random", "skinny_diagonal_ridges",
            ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_THICK_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "thick_diagonal_ridges_seamless_random", "thick_diagonal_ridges_seamless",
            ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "thin_diagonal_ridges_seamless_random", "thin_diagonal_ridges_seamless",
            ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_THIN_DIAGONAL_BARS_RANDOM = addDecal(MODID, "thin_diagonal_bars_seamless_random", "thin_diagonal_bars_seamless",
            ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_SKINNY_DIAGONAL_BARS_RANDOM = addDecal(MODID, "skinny_diagonal_bars_seamless_random", "skinny_diagonal_bars_seamless",
            ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_DIAGONAL_BARS_RANDOM = addDecal(MODID, "diagonal_bars_seamless_random", "diagonal_bars_seamless", ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_FAT_DIAGONAL_BARS_RANDOM = addDecal(MODID, "fat_diagonal_bars_seamless_random", "fat_diagonal_bars_seamless",
            ROTATE_RANDOM);
    public static final TextureSet DECAL_SOFT_DIAGONAL_RIDGES_RANDOM = addDecal(MODID, "diagonal_ridges_seamless_random", "diagonal_ridges_seamless", ROTATE_RANDOM);

    public static final TextureSet DECAL_BIG_TRIANGLE = addDecal(MODID, "big_triangle", "big_triangle", ROTATE_NONE);
    public static final TextureSet DECAL_BIG_DIAMOND = addDecal(MODID, "big_diamond", "big_diamond", ROTATE_NONE);
    public static final TextureSet DECAL_BIG_PENTAGON = addDecal(MODID, "big_pentagon", "big_pentagon", ROTATE_NONE);
    public static final TextureSet DECAL_BIG_HEXAGON = addDecal(MODID, "big_hexagon", "big_hexagon", ROTATE_NONE);
    public static final TextureSet DECAL_STAR_16 = addDecal(MODID, "star_16", "star_16", ROTATE_NONE);
    public static final TextureSet DECAL_STAR_12 = addDecal(MODID, "star_12", "star_12", ROTATE_NONE);
    public static final TextureSet DECAL_STAR_8 = addDecal(MODID, "star_8", "star_8", ROTATE_NONE);
    public static final TextureSet DECAL_STAR_5 = addDecal(MODID, "star_5", "star_5", ROTATE_NONE);
    public static final TextureSet DECAL_STAR_4 = addDecal(MODID, "star_4", "star_4", ROTATE_NONE);
    public static final TextureSet DECAL_TWO_DOTS = addDecal(MODID, "two_dots", "two_dots", ROTATE_NONE);
    public static final TextureSet DECAL_TWO_DOTS_RANDOM = addDecal(MODID, "two_dots", "two_dots", ROTATE_RANDOM);
    public static final TextureSet DECAL_DUST = addDecal(MODID, "dust", "dust", ROTATE_NONE);
    public static final TextureSet DECAL_MIX = addDecal(MODID, "mix", "mix", ROTATE_NONE);
    public static final TextureSet DECAL_MIX_90 = addDecal(MODID, "mix_90", "mix", ROTATE_90);
    public static final TextureSet DECAL_MIX_180 = addDecal(MODID, "mix_180", "mix", ROTATE_180);
    public static final TextureSet DECAL_MIX_270 = addDecal(MODID, "mix_270", "mix", ROTATE_270);
    public static final TextureSet DECAL_DRIP = addDecal(MODID, "drip", "drip", ROTATE_NONE);
    public static final TextureSet DECAL_FUNNEL = addDecal(MODID, "funnel", "funnel", ROTATE_NONE);
    public static final TextureSet DECAL_ARROW = addDecal(MODID, "arrow", "arrow", ROTATE_NONE);
    public static final TextureSet DECAL_ARROW_90 = addDecal(MODID, "arrow_90", "arrow", ROTATE_90);
    public static final TextureSet DECAL_ARROW_180 = addDecal(MODID, "arrow_180", "arrow", ROTATE_180);
    public static final TextureSet DECAL_ARROW_270 = addDecal(MODID, "arrow_270", "arrow", ROTATE_270);

    public static final TextureSet MATERIAL_GRADIENT = addDecal(MODID, "material_gradient", "material_gradient", ROTATE_NONE);

    public static final TextureSet DECAL_BUILDER = addDecal(MODID, "symbol_builder", "symbol_builder", ROTATE_NONE);
    public static final TextureSet DECAL_CHEST = addDecal(MODID, "symbol_chest", "symbol_chest", ROTATE_NONE);

    public static final TextureSet MACHINE_POWER_ON = addDecal(MODID, "on", "on", ROTATE_NONE);
    public static final TextureSet MACHINE_POWER_OFF = addDecal(MODID, "off", "off", ROTATE_NONE);

    public static final TextureSet MACHINE_GAUGE_INNER = addDecal(MODID, "gauge_inner", "gauge_inner_256", ROTATE_NONE);
    public static final TextureSet MACHINE_GAUGE_MAIN = addDecal(MODID, "gauge_main", "gauge_main_256", ROTATE_NONE);
    public static final TextureSet MACHINE_GAGUE_MARKS = addDecal(MODID, "gauge_background", "gauge_background_256", ROTATE_NONE);
    public static final TextureSet MACHINE_GAUGE_FULL_MARKS = addDecal(MODID, "gauge_marks", "gauge_marks_256", ROTATE_NONE);

    public static final TextureSet MACHINE_POWER_BACKGROUND = addDecal(MODID, "power_background", "power_background_128", ROTATE_NONE);
    public static final TextureSet MACHINE_POWER_FOREGROUND = addDecal(MODID, "power_foreground", "power_foreground_128", ROTATE_NONE);
    public static final TextureSet DECAL_NO = addDecal(MODID, "no", "no_128", ROTATE_NONE);
    public static final TextureSet DECAL_MATERIAL_SHORTAGE = addDecal(MODID, "material_shortage", "material_shortage", ROTATE_NONE);
    public static final TextureSet DECAL_ELECTRICITY = addDecal(MODID, "electricity", "electricity_64", ROTATE_NONE);
    public static final TextureSet DECAL_CMY = addDecal(MODID, "cmy", "cmy", ROTATE_NONE);
    public static final TextureSet DECAL_FLAME = addDecal(MODID, "flame", "flame_64", ROTATE_NONE);

    public static final TextureSet TILE_DOTS_SUBTLE = TextureSet.builder().displayNameToken("dots_subtle").versionCount(4).scale(TextureScale.SINGLE)
            .layout(TextureLayoutMap.VERSION_X_8).baseTextureName("artbox:blocks/dots_subtle").rotation(ROTATE_RANDOM)
            .renderIntent(TextureRenderIntent.BASE_OR_OVERLAY_NO_CUTOUT).groups(TextureGroup.STATIC_TILES, TextureGroup.STATIC_DETAILS)
            .build("artbox:dots_subtle");

    public static final TextureSet TILE_DOTS_INVERSE = TextureSet.builder(TILE_DOTS_SUBTLE).displayNameToken("dots_inverse")
            .baseTextureName("artbox:blocks/dots_inverse").build("artbox:dots_inverse");

    public static final TextureSet TILE_DOTS_INVERSE_SUBTLE = TextureSet.builder(TILE_DOTS_SUBTLE).displayNameToken("dots_inverse_subtle")
            .baseTextureName("artbox:blocks/dots_inverse_subtle").build("artbox:dots_inverse_subtle");

}
