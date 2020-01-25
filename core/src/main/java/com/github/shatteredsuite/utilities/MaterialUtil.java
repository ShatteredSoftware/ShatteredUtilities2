package com.github.shatteredsuite.utilities;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * An interface for implementations of material matching and other functions
 * for varying Minecraft versions.
 */
public interface MaterialUtil {

    /**
     * Find a material in this version's Material enum.
     *
     * @param name The name of the material to look up.
     * @return The material, if found.
     */
    Material matchMaterial(String name);

    /**
     * Sets custom model data on an item, if the server version supports it.
     * Otherwise, does nothing.
     *
     * @param stack The stack to have data set on.
     * @param data The data value to set on the stack.
     * @return The stack with the data set on it.
     */
    ItemStack setCustomModelData(ItemStack stack, int data);
}
