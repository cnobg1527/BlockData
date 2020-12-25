package com.obg.blockdata.nbt.tagdata;

import com.obg.blockdata.nbt.convert.NbtType;

import java.io.Serializable;

/*这是一个通用抽象基类，*/
public abstract class Tag<T> implements Serializable {
    /*该类实现了Serializable接口，其所有的子类默认都实现了此接口，但需要每个子类提供自己的UID*/
    private static final long serialVersionUID = 7925783664695648371L;

    protected String name;
    protected T value;

    public Tag(String name) {
        this.name = name;
    }

    public Tag(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    /*返回一个type的常量，该常量定义在NbtConstants类中的内部枚举类NbtType中*/
    public abstract NbtType getType();

    /*拷贝对应类的对象*/
    public abstract Tag<T> getDeepCopy();

    /*返回类型+名称+值的字符串形式*/
    public String toString(){
        String name = getName();
        String type = getType().name();
        T value = getValue();
        return (type == null ? "?" : ("TAG_"+type)) + (name == null ? "(?)" : ("("+name+")"))
                + (value == null ? ":?" : (": "+value.toString()));
    }


}
