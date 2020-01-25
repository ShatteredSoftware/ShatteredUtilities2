package com.github.shatteredsuite.utilities.nms;

import com.github.shatteredsuite.utilities.MaterialUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MaterialUtil12 implements MaterialUtil {

    @Override
    public ItemStack setCustomModelData(ItemStack stack, int data) {
        return stack;
    }

    @Override
    public Material matchMaterial(String name) {
        return Material.matchMaterial(name);
    }
}
