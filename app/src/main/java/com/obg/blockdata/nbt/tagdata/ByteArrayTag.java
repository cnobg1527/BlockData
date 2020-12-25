package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class ByteArrayTag extends Tag<Byte[]> {

    public  static  final long serialVersionUID = 7925783664695648329L;

    public ByteArrayTag(String name, Byte[] value) {
        super(name, value);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.BYTE_ARRAY;
    }

    @Override
    public Tag<Byte[]> getDeepCopy() {
        return new ByteArrayTag(name, value);
    }
}
