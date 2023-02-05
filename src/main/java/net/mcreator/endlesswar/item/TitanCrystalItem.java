
package net.mcreator.endlesswar.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.endlesswar.init.EndlessWarModTabs;

public class TitanCrystalItem extends Item {
	public TitanCrystalItem() {
		super(new Item.Properties().tab(EndlessWarModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
