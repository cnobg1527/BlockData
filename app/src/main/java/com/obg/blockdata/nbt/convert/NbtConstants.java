package com.obg.blockdata.nbt.convert;

import com.obg.blockdata.nbt.tagdata.*;


public class NbtConstants {
    public enum NbtType {
        END(0, EndTag.class, "EndTag"),
        BYTE(1, ByteTag.class, "ByteTag"),
        SHORT(2, ShortTag.class, "ShortTag"),
        INT(3, IntTag.class, "IntTag"),
        LONG(4, LongTag.class, "LongTag"),
        FLOAT(5, FloatTag.class, "FloatTag"),
        DOUBLE(6, DoubleTag.class, "DoubleTag"),
        BYTE_ARRAY(7, ByteArrayTag.class, "ByteArrayTag"),
        STRING(8, StringTag.class, "StringTag"),
        LIST(9, ListTag.class, "ListTag"),
        COMPOUND(10, CompoundTag.class, "CompoundTag"),
        INT_ARRAY(11, IntArrayTag.class, "IntArrayTag"),
        SHORT_ARRAY(100, ShortArrayTag.class, "ShortArrayTag");

    }
}
