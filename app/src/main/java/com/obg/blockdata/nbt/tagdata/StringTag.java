package com.obg.blockdata.nbt.tagdata;


import com.obg.blockdata.nbt.convert.NbtType;

public class StringTag extends Tag<String> {

    public static final Long serialVersionUID = 7925783664695648372L;

    public StringTag(String name, String value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.STRING;
    }

    @Override
    public Tag<String> getDeepCopy() {
        return new StringTag(name, value);
    }
}
