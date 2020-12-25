package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class IntArrayTag extends Tag<int[]> {

    public static final long serialVersionUID = 7925783664695648377L;

    public IntArrayTag(String name, int[] value) {
        super(name, value);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.INT_ARRAY;
    }

    @Override
    public Tag<int[]> getDeepCopy() {
        return new IntArrayTag(name,value );
    }
}
