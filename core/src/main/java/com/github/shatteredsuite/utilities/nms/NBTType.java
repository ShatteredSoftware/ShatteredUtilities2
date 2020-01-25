package com.github.shatteredsuite.utilities.nms;

/**
 * Represents Minecraft's magic numbers for NBT types.<br>
 * <br>
 * Based on <a href="https://wiki.vg/NBT">Wiki.vg's NBT page</a>.
 */
public enum NBTType {
    END(0),
    BYTE(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BYTE_ARRAY(7),
    STRING(8),
    LIST(9),
    COMPOUND(10),
    INT_ARRAY(11),
    LONG_ARRAY(12);

    public final int typeId;

    NBTType(int typeId) {
        this.typeId = typeId;
    }
}
