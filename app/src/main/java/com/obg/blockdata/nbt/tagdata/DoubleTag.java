package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class DoubleTag extends Tag<Double> {

    public static final long serialVersionUID = 7925783664695648379L;

    public DoubleTag(String name, Double value) {
        super(name, value);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.DOUBLE;
    }

    @Override
    public Tag<Double> getDeepCopy() {
        return new DoubleTag(name, value);
    }
}
