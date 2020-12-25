package com.obg.blockdata.nbt.tagdata;


import com.obg.blockdata.nbt.convert.NbtType;

import java.util.ArrayList;
import java.util.List;

/*此类主要用于处理混合型标签数据*/
public class CompoundTag extends Tag<ArrayList<Tag>>{

    public static final long serialVersionUID = 7925783664695648349L;

    public CompoundTag(String name, ArrayList<Tag> value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.COMPOUND;
    }

    @Override
    public CompoundTag getDeepCopy() {
        if(value != null){
            ArrayList<Tag> copy = new ArrayList<>();
            for(Tag tag : value){
                copy.add(tag.getDeepCopy());
            }
            return new CompoundTag(name, copy);
        }
        return new CompoundTag(name, null);
    }
    /*重写基类的toString方法*/
    public String toString(){
        String name = getName();
        String type = getType().name();
        ArrayList<Tag> value = getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(type == null ? "?" : ("TAG_" + type)).append(name == null ? "(?)" : ("(" + name + ")"));

        if(value != null) {
            sb.append(": ").append(value.size()).append(" entries\n{\n");
            for (Tag entry : value) {
                sb.append("   ").append(entry.toString().replaceAll("\n", "\n   ")).append("\n");
            }
            sb.append("}");
        } else sb.append(":?");
        return sb.toString();
    }

    /*此方法用于处理ListTag类返回的List列表*/
    public Tag getChildTagByKey(String key){
        List<Tag> list = getValue();
        if(list == null) return null;
        for(Tag tag : list){
            if(key.equals(tag.getName())) return tag;
        }
        return null;
    }
}
