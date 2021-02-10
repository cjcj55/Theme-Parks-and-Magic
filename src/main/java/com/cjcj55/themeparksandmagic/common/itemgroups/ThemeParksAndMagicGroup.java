package com.cjcj55.themeparksandmagic.common.itemgroups;

import com.cjcj55.themeparksandmagic.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ThemeParksAndMagicGroup extends ItemGroup {

	public static final ItemGroup THEME_PARKS_AND_MAGIC_GROUP = new ThemeParksAndMagicGroup("themeparksandmagictab");
	
	public ThemeParksAndMagicGroup(String label) {
		super(label);
	}

	@Override
	public ItemStack createIcon() {
		return ItemInit.COIN.get().getDefaultInstance();
	}
	
	@Override
	public void fill(NonNullList<ItemStack> items) {
		// items.add(ItemInit.COIN);
		super.fill(items);
	}

}
