package com.github.shatteredsuite.utilities.nms;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import com.github.shatteredsuite.utilities.MaterialUtil;

public class MaterialUtil13 implements MaterialUtil {

    @Override
    public ItemStack setCustomModelData(ItemStack stack, int data) {
        return stack;
    }

    @Override
    public Material matchMaterial(String name) {
        return Material.matchMaterial(name, false);
    }
}
