package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtConstants;

public class EndTag extends Tag<Object>{

    public static final long serialVersionUID = 7925783664695628339L;

    //这里采用一个空参构造器
    public EndTag() {
        super("", null);
    }

    @Override
    public NbtConstants.NbtType getType() {
        return NbtConstants.NbtType.END;
    }

    @Override
    public Tag<Object> getDeepCopy() {
        return new EndTag();
    }
}

