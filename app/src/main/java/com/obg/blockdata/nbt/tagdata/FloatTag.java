package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class FloatTag extends Tag<Float> {

    public static final long serialVersionUID = 7925783664695648378L;

    public FloatTag(String name, Float value) {
        super(name, value);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.FLOAT;
    }

    @Override
    public Tag<Float> getDeepCopy() {
        return new FloatTag(name, value);
    }

}

