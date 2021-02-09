package com.cjcj55.themeparksandmagic.core.init;

import com.cjcj55.themeparksandmagic.ThemeParksAndMagic;
import com.cjcj55.themeparksandmagic.common.blocks.DonaldDuckPlushBlock;
import com.cjcj55.themeparksandmagic.common.blocks.MickeyMousePlushBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ThemeParksAndMagic.MOD_ID);
	
	public static final RegistryObject<Block> CASTLE_LOGO_BLOCK = BLOCKS.register("castle_logo_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(5.0f, 6.0f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2).sound(SoundType.METAL).setLightLevel((state) -> { return 2; })));
	
	public static final RegistryObject<Block> CINDERELLA_CASTLE_BRICKS = BLOCKS.register("cinderella_castle_bricks", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(1).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> CINDERELLA_CASTLE_ROOF_TILES = BLOCKS.register("cinderella_castle_roof_tiles", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(2.0f, 6.0f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(1).sound(SoundType.STONE)));
	
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> CINDERELLA_CASTLE_ROOF_TILES_STAIRS = BLOCKS.register("cinderella_castle_roof_tiles_stairs", 
			() -> new StairsBlock(CINDERELLA_CASTLE_ROOF_TILES.get().getDefaultState(), AbstractBlock.Properties.from(CINDERELLA_CASTLE_ROOF_TILES.get())));
	
	public static final RegistryObject<Block> CINDERELLA_CASTLE_ROOF_TILES_SLAB = BLOCKS.register("cinderella_castle_roof_tiles_slab", 
			() -> new SlabBlock(AbstractBlock.Properties.from(CINDERELLA_CASTLE_ROOF_TILES.get())));
	
	public static final RegistryObject<Block> MICKEY_MOUSE_PLUSH_BLOCK = BLOCKS.register("mickey_mouse_plush_block", 
			() -> new MickeyMousePlushBlock(AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(2.0f, 4.0f).harvestLevel(0).sound(SoundType.CLOTH)));
	
	public static final RegistryObject<Block> DONALD_DUCK_PLUSH_BLOCK = BLOCKS.register("donald_duck_plush_block", 
			() -> new DonaldDuckPlushBlock(AbstractBlock.Properties.create(Material.WOOL).hardnessAndResistance(2.0f, 4.0f).harvestLevel(0).sound(SoundType.CLOTH)));
}
