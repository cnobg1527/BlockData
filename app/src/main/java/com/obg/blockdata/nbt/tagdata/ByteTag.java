package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class ByteTag extends Tag<Byte> {

    public static final long serialVersionUID = 7925783664695648319L;

    public ByteTag(String name, Byte value) {
        super(name, value);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.BYTE;
    }

    @Override
    public Tag<Byte> getDeepCopy() {
        return new ByteTag(name, value);
    }
}
