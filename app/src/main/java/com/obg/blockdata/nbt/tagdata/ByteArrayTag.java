package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtType;

public class ByteArrayTag extends Tag<Byte[]> {

    public  static  final long serialVersionUID = 7925783664695648329L;

    public ByteArrayTag(String name, Byte[] value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.BYTE_ARRAY;
    }

    @Override
    public Tag<Byte[]> getDeepCopy() {
        return new ByteArrayTag(name, value);
    }
}
