package com.obg.blockdata.nbt.tagdata;


import com.obg.blockdata.nbt.convert.NbtType;

public class ShortArrayTag extends Tag<Short[]> {

    private static final long serialVersionUID = 7925783664695648374L;

    public ShortArrayTag(String name, Short[] value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.SHORT_ARRAY;
    }

    @Override
    public Tag<Short[]> getDeepCopy() {
        return new ShortArrayTag(name, value);
    }
}
