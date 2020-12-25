package com.obg.blockdata.nbt.tagdata;


import com.obg.blockdata.nbt.convert.NbtType;

public class IntTag extends Tag<Integer> {

    public static final long serialVersionUID = 7925783664695648376L;

    public IntTag(String name, Integer value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.INT;
    }

    @Override
    public Tag<Integer> getDeepCopy() {
        return new IntTag(name, value);
    }
}
