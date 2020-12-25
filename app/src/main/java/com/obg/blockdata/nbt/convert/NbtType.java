package com.obg.blockdata.nbt.convert;

import com.obg.blockdata.nbt.tagdata.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public enum NbtType {
    END(0, EndTag.class, "EndTag"),
    BYTE(1, ByteTag.class, "ByteTag"),
    SHORT(2, ShortTag.class, "ShortTag"),
    INT(3, IntTag.class, "IntTag"),
    LONG(4, LongTag.class, "LongTag"),
    FLOAT(5, FloatTag.class, "FloatTag"),
    DOUBLE(6, DoubleTag.class, "DoubleTag"),
    BYTE_ARRAY(7, ByteArrayTag.class, "ByteArrayTag"),
    STRING(8, StringTag.class, "StringTag"),
    LIST(9, TagList.class, "TagList"),
    COMPOUND(10, CompoundTag.class, "CompoundTag"),
    INT_ARRAY(11, IntArrayTag.class, "IntArrayTag"),
    SHORT_ARRAY(100, ShortArrayTag.class, "ShortArrayTag");

    public final int id;
    public final Class<? extends Tag> tagClazz;
    public final String displayName;

    static public Map<Integer, NbtType> typesByID = new HashMap<>();
    static public Map<Class<? extends Tag>, NbtType> typesByClazz = new HashMap<>();

    NbtType(int id, Class<? extends Tag> Clazz, String displayName) {
        this.id = id;
        this.tagClazz = Clazz;
        this.displayName = displayName;
    }

    public static String[] editorOptions_asString;
    public static NbtType[] editorOptions_asType = new NbtType[]{BYTE, SHORT, INT, LONG, FLOAT, DOUBLE,
            BYTE_ARRAY, STRING, LIST, COMPOUND, INT_ARRAY, SHORT_ARRAY};

    static {
        int len = editorOptions_asType.length;
        editorOptions_asString = new String[len];
        for (int i = 0; i < len; i++) {
            editorOptions_asString[i] = editorOptions_asType[i].displayName;
        }
        //fill maps
        for (NbtType type : NbtType.values()) {
            typesByID.put(type.id, type);
            typesByClazz.put(type.tagClazz, type);
        }
    }

    public static Tag newInstance(String tagName, NbtType type) {
        switch (type) {
            case END:
                return new EndTag();
            case BYTE:
                return new ByteTag(tagName, (byte) 0);
            case SHORT:
                return new ShortTag(tagName, (short) 0);
            case INT:
                return new IntTag(tagName, 0);
            case LONG:
                return new LongTag(tagName, 0L);
            case FLOAT:
                return new FloatTag(tagName, 0f);
            case DOUBLE:
                return new DoubleTag(tagName, 0.0);
            case BYTE_ARRAY:
                return new ByteArrayTag(tagName, null);
            case STRING:
                return new StringTag(tagName, "");
            case LIST:
                return new TagList(tagName, new ArrayList<Tag>());
            case COMPOUND:
                return new CompoundTag(tagName, new ArrayList<Tag>());
            default:
                return null;
        }
    }

    public static final Charset CHARSET = Charset.forName("UTF-8");
}

