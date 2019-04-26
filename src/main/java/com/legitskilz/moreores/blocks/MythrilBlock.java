package com.legitskilz.moreores.blocks;

import com.legitskilz.moreores.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MythrilBlock extends BlockBase{


	public MythrilBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setCreativeTab(Main.moreores);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(5.0F);
	}
	
}
