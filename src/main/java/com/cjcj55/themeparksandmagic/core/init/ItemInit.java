package com.cjcj55.themeparksandmagic.core.init;

import com.cjcj55.themeparksandmagic.ThemeParksAndMagic;
import com.cjcj55.themeparksandmagic.common.items.CoinItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThemeParksAndMagic.MOD_ID);
	
	public static final RegistryObject<Item> COIN = ITEMS.register("coin", () -> new CoinItem());
}
