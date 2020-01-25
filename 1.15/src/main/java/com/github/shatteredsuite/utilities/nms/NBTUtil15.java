package com.github.shatteredsuite.utilities.nms;

import net.minecraft.server.v1_15_R1.NBTTagCompound;
import org.bukkit.craftbukkit.v1_15_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("unused")
public class NBTUtil15 extends NBTUtil {

    private NBTTagCompound checkOrMakeCompound(net.minecraft.server.v1_15_R1.ItemStack stack) {
        NBTTagCompound compound = stack.getTag();
        return compound != null ? compound : new NBTTagCompound();
    }

    private boolean hasCompoundAndKey(ItemStack stack, String key, NBTType type) {
        net.minecraft.server.v1_15_R1.ItemStack item = CraftItemStack.asNMSCopy(stack);
        NBTTagCompound compound = item.getTag();
        if (compound == null) {
            return false;
        }
        return type != null ? compound.hasKeyOfType(key, type.typeId) : compound.hasKey(key);
    }

    private boolean hasCompoundAndKey(NBTTagCompound compound, String key, NBTType type) {
        if (compound == null) {
            return false;
        }
        return type != null ? compound.hasKeyOfType(key, type.typeId) : compound.hasKey(key);
    }

    @Override
    public boolean hasKey(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, null);
    }

    @Override
    public boolean hasByte(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.BYTE);
    }

    @Override
    public Byte getByteNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.BYTE) ? compound.getByte(key) : null;
    }

    @Override
    public byte getByte(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.BYTE) ? compound.getByte(key) : 0x0;
    }

    @Override
    public ItemStack setByte(ItemStack item, String key, byte value) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setByte(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasShort(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.SHORT);
    }

    @Override
    public Short getShortNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.SHORT) ? compound.getShort(key) : null;
    }

    @Override
    public short getShort(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.SHORT) ? compound.getShort(key) : 0;
    }

    @Override
    public ItemStack setShort(ItemStack item, String key, short value) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setShort(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasInt(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.INT);
    }

    @Override
    public Integer getIntNullable(org.bukkit.inventory.ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.INT) ? compound.getInt(key) : null;
    }

    @Override
    public int getInt(org.bukkit.inventory.ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.INT) ? compound.getInt(key) : 0;
    }

    @Override
    public ItemStack setInt(ItemStack item, String key, int value) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setInt(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasLong(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.LONG);
    }

    @Override
    public Long getLongNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.LONG) ? compound.getLong(key) : null;
    }

    @Override
    public long getLong(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.LONG) ? compound.getLong(key) : 0L;
    }

    @Override
    public ItemStack setLong(ItemStack item, String key, long value) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setLong(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasFloat(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.FLOAT);
    }

    @Override
    public Float getFloatNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.FLOAT) ? compound.getFloat(key) : null;
    }

    @Override
    public float getFloat(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.FLOAT) ? compound.getFloat(key) : 0F;
    }

    @Override
    public ItemStack setFloat(ItemStack item, String key, float value) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setFloat(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasDouble(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.DOUBLE);
    }

    @Override
    public Double getDoubleNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.DOUBLE) ? compound.getDouble(key) : null;
    }

    @Override
    public double getDouble(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.DOUBLE) ? compound.getDouble(key) : 0D;
    }

    @Override
    public ItemStack setDouble(ItemStack item, String key, double value) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setDouble(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasByteArray(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.BYTE_ARRAY);
    }

    @Override
    public byte[] getByteArrayNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.BYTE_ARRAY) ? compound.getByteArray(key)
            : null;
    }

    @Override
    public byte[] getByteArray(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.BYTE_ARRAY)
            ? compound.getByteArray(key)
            : new byte[0];
    }

    @Override
    public ItemStack setByteArray(ItemStack item, String key, byte[] value) {
        checkArgs(item, key, value);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setByteArray(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasString(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.STRING);
    }

    @Override
    public String getStringNullable(org.bukkit.inventory.ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.STRING) ? compound.getString(key) : null;
    }

    @Override
    public String getString(org.bukkit.inventory.ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.STRING) ? compound.getString(key) : "";
    }

    @Override
    public ItemStack setString(org.bukkit.inventory.ItemStack item, String key, String value) {
        checkArgs(item, key, value);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setString(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }

    @Override
    public boolean hasIntArray(ItemStack item, String key) {
        checkArgs(item, key);
        return hasCompoundAndKey(item, key, NBTType.INT_ARRAY);
    }

    @Override
    public int[] getIntArrayNullable(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.INT_ARRAY) ? compound.getIntArray(key)
            : null;
    }

    @Override
    public int[] getIntArray(ItemStack item, String key) {
        checkArgs(item, key);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = stack.getTag();
        return hasCompoundAndKey(compound, key, NBTType.INT_ARRAY)
            ? compound.getIntArray(key)
            : new int[0];
    }

    @Override
    public ItemStack setIntArray(ItemStack item, String key, int[] value) {
        checkArgs(item, key, value);
        net.minecraft.server.v1_15_R1.ItemStack stack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound compound = checkOrMakeCompound(stack);
        compound.setIntArray(key, value);
        stack.setTag(compound);
        return CraftItemStack.asBukkitCopy(stack);
    }
}
