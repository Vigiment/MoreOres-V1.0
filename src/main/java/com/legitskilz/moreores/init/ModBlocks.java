package com.legitskilz.moreores.init;

import java.util.ArrayList;
import java.util.List;

import com.legitskilz.moreores.blocks.BlockBase;
import com.legitskilz.moreores.blocks.MythrilBlock;
import com.legitskilz.moreores.blocks.TitaniumBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();	
	public static final Block TITANIUM_BLOCK = new TitaniumBlock("titanium_block", Material.IRON);
	public static final Block MYTHRIL_BLOCK = new MythrilBlock("mythril_block", Material.IRON);
	
}