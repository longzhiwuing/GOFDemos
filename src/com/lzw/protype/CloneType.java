package com.lzw.protype;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/10
 * Time: 21:04
 */
public class CloneType implements Cloneable{
    private String typename;

    public CloneType(String typename) {
        this.typename = typename;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CloneType cloneType = (CloneType) o;

        return typename != null ? typename.equals(cloneType.typename) : cloneType.typename == null;
    }

    @Override
    public int hashCode() {
        return typename != null ? typename.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CloneType{" +
                "hashCode='" + this.hashCode() + '\'' +
                "typename='" + typename + '\'' +
                '}';
    }
}
