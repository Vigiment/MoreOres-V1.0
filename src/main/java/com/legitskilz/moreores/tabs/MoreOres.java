package com.legitskilz.moreores.tabs;

import com.legitskilz.moreores.init.ModItems;
import com.legitskilz.moreores.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreOres extends CreativeTabs{

	public MoreOres(String label) {
		super("moreores");
	this.setBackgroundImageName("");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.TITANIUM_INGOT);
	}
}
