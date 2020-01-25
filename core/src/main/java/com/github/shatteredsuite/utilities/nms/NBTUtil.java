package com.github.shatteredsuite.utilities.nms;

import org.bukkit.inventory.ItemStack;

/**
 * An interface to represent interaction with the NBT data on an {@link
 * org.bukkit.inventory.ItemStack ItemStack}.
 *
 * @author UberPilot
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public abstract class NBTUtil {

    protected void checkArgs(ItemStack item, String key) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
    }

    protected void checkArgs(ItemStack item, String key, Object value) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null.");
        }
    }

    /**
     * Uses NMS to get NBT data from an {@link org.bukkit.inventory.ItemStack ItemStack}, then
     * checks if it has the provided key.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and the given key,
     * <code>false</code>
     * otherwise.
     */
    public abstract boolean hasKey(ItemStack item, String key);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Bytes.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Byte with the given key,
     * <code>
     * false</code> if otherwise.
     */
    public abstract boolean hasByte(ItemStack item, String key);

    /**
     * Gets the Byte with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Byte with the given key if the item has an NBT Compound with that
     * key,
     * <code>null</code> if otherwise.
     */
    public abstract Byte getByteNullable(ItemStack item, String key);

    /**
     * Gets the Byte with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Byte with the given key if the item has an NBT Compound with that
     * key,
     * <code>0x0</code> if otherwise.
     */
    public abstract byte getByte(ItemStack item, String key);

    /**
     * Sets the byte on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the byte to.
     * @return The item with the new data.
     */
    public abstract ItemStack setByte(ItemStack item, String key, byte value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Shorts.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Short with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasShort(ItemStack item, String key);

    /**
     * Gets the Short with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Short with the given key if the item has an NBT Compound with that
     * key, <code>null</code> if otherwise.
     */
    public abstract Short getShortNullable(ItemStack item, String key);

    /**
     * Gets the Short with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Short with the given key if the item has an NBT Compound with that
     * key, <code>0</code> if otherwise.
     */
    public abstract short getShort(ItemStack item, String key);

    /**
     * Sets the short on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the short to.
     * @return The item with the new data.
     */
    public abstract ItemStack setShort(ItemStack item, String key, short value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Integers.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Integer with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasInt(ItemStack item, String key);

    /**
     * Gets the Integer with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Integer with the given key if the item has an NBT Compound with that
     * key, <code>null</code> if otherwise.
     */
    public abstract Integer getIntNullable(ItemStack item, String key);

    /**
     * Gets the Integer with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Integer with the given key if the item has an NBT Compound with that
     * key, <code>0</code> if otherwise.
     */
    public abstract int getInt(ItemStack item, String key);

    /**
     * Sets the integer on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the integer to.
     * @return The item with the new data.
     */
    public abstract ItemStack setInt(ItemStack item, String key, int value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Longs.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Long with the given key,
     * <code>
     * false</code> if otherwise.
     */
    public abstract boolean hasLong(ItemStack item, String key);

    /**
     * Gets the Long with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Long with the given key if the item has an NBT Compound with that
     * key,
     * <code>null</code> if otherwise.
     */
    public abstract Long getLongNullable(ItemStack item, String key);

    /**
     * Gets the Long with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Long with the given key if the item has an NBT Compound with that
     * key,
     * <code>0L</code> if otherwise.
     */
    public abstract long getLong(ItemStack item, String key);

    /**
     * Sets the long on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the long to.
     * @return The item with the new data.
     */
    public abstract ItemStack setLong(ItemStack item, String key, long value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Floats.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Float with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasFloat(ItemStack item, String key);

    /**
     * Gets the Float with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Float with the given key if the item has an NBT Compound with that
     * key, <code>null</code> if otherwise.
     */
    public abstract Float getFloatNullable(ItemStack item, String key);

    /**
     * Gets the Float with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Float with the given key if the item has an NBT Compound with that
     * key, <code>0F</code> if otherwise.
     */
    public abstract float getFloat(ItemStack item, String key);

    /**
     * Sets the float on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the float to.
     * @return The item with the new data.
     */
    public abstract ItemStack setFloat(ItemStack item, String key, float value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Doubles.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Double with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasDouble(ItemStack item, String key);

    /**
     * Gets the Double with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Double with the given key if the item has an NBT Compound with that
     * key, <code>null</code> if otherwise.
     */
    public abstract Double getDoubleNullable(ItemStack item, String key);

    /**
     * Gets the double with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the double with the given key if the item has an NBT Compound with that
     * key, <code>0D</code> if otherwise.
     */
    public abstract double getDouble(ItemStack item, String key);

    /**
     * Sets the double on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the double to.
     * @return The item with the new data.
     */
    public abstract ItemStack setDouble(ItemStack item, String key, double value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for Byte
     * Array.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a Byte[] with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasByteArray(ItemStack item, String key);

    /**
     * Gets the Byte Array with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Byte[] with the given key if the item has an NBT Compound with that
     * key, <code>null</code> if otherwise.
     */
    public abstract byte[] getByteArrayNullable(ItemStack item, String key);

    /**
     * Gets the Byte Array with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the byte[] with the given key if the item has an NBT Compound with that
     * key, <code>0D</code> if otherwise.
     */
    public abstract byte[] getByteArray(ItemStack item, String key);

    /**
     * Sets the Byte Array on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the byte[] to.
     * @return The item with the new data.
     */
    public abstract ItemStack setByteArray(ItemStack item, String key, byte[] value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * Strings.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a String with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasString(ItemStack item, String key);

    /**
     * Gets the String with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the String with the given key if the item has an NBT Compound with that
     * key, <code>""</code> if otherwise.
     */
    public abstract String getString(ItemStack item, String key);

    /**
     * Gets the String with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the String with the given key if the item has an NBT Compound with that
     * key, <code>null</code> if otherwise.
     */
    public abstract String getStringNullable(ItemStack item, String key);

    /**
     * Sets the String on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the String to.
     * @return The item with the new data.
     */
    public abstract ItemStack setString(ItemStack item, String key, String value);

    /**
     * A more specific version of {@link #hasKey(ItemStack, String) hasKey} that only tests for
     * IntArrays.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return <code>true</code> if the item has an NBT Compound and a IntArray with the given key,
     * <code>false</code> if otherwise.
     */
    public abstract boolean hasIntArray(ItemStack item, String key);

    /**
     * Gets the Integer Array with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Integer Array with the given key if the item has an NBT Compound
     * with that key, <code>null</code> if otherwise.
     */
    public abstract int[] getIntArrayNullable(ItemStack item, String key);

    /**
     * Gets the Integer Array with a given key from an item's NBT data.
     *
     * @param item The item to check.
     * @param key  The key to check for.
     * @return The value of the Integer Array with the given key if the item has an NBT Compound
     * with that key, an empty Integer Array if otherwise.
     */
    public abstract int[] getIntArray(ItemStack item, String key);

    /**
     * Sets the Integer Array on an item's NBT data with the given key.
     *
     * @param item  The item to adjust.
     * @param key   The key to set the value on.
     * @param value The value to set the Integer Array to.
     * @return The item with the new data.
     */
    public abstract ItemStack setIntArray(ItemStack item, String key, int[] value);
}
