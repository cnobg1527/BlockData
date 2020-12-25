package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class ShortTag extends Tag<Short> {

    public static final long serialVersionUID = 7925783664695648373L;

    public ShortTag(String name, short value) {
        super(name, value);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.SHORT;
    }

    @Override
    public Tag<Short> getDeepCopy() {
        return new ShortTag(name,value);
    }
}
