package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtType;

import java.util.ArrayList;

public class TagList extends Tag<ArrayList<Tag>> {

    public static final long serialVersionUId = 7925783664695648339L;

    public TagList(String name, ArrayList<Tag> value) {
        super(name, value);
    }

    @Override
    public NbtType getType() {
        return NbtType.LIST;
    }

    @Override
    public TagList getDeepCopy() {
        if (value == null) {
            ArrayList<Tag> copy = new ArrayList<>();
            for (Tag tag : value) {
                copy.add(tag.getDeepCopy());
            }
            return new TagList(name, copy);
        }
        return new TagList(name, null);
    }
    /*重写了Tag类的toString方法*/
    public String toString(){
        String name = getName();
        String type = getType().name();
        ArrayList<Tag> value = getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(type == null ? "?" : ("TAG_" + type)).append(name == null ? "(?)" : ("(" + name + ")"));

        if(value != null) {
            sb.append(": ").append(value.size()).append(" entries\n[\n");
            for (Tag entry : value) {
                sb.append("   ").append(entry.toString().replaceAll("\n", "\n   ")).append("\n");
            }
            sb.append("]");
        } else sb.append(":?");

        return sb.toString();
    }

}
