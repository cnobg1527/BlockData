package com.obg.blockdata.nbt.tagdata;


import com.obg.blockdata.nbt.convert.NbtType;

public class LongTag extends Tag<Long> {

    public static final long serialVersionUID = 7925783664695648375L;

    public LongTag(String name, Long value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.LONG;
    }

    @Override
    public Tag<Long> getDeepCopy() {
        return new LongTag(name, value);
    }
}
