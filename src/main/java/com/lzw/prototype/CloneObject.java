package com.lzw.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/10
 * Time: 20:39
 */
public class CloneObject implements Cloneable{

    private int id;
    private String name;
    private Date createDate;
    private CloneType cloneType;

    public CloneObject() {
    }

    public CloneObject(int id, String name, Date createDate, CloneType cloneType) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.cloneType = cloneType;
    }

    public CloneType getCloneType() {
        return cloneType;
    }

    public void setCloneType(CloneType cloneType) {
        this.cloneType = cloneType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public CloneObject clone() throws CloneNotSupportedException {
        //return (CloneObject) super.clone();
        CloneObject cloneObject = (CloneObject) super.clone();
        cloneObject.setCloneType((CloneType) cloneType.clone());
        return cloneObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CloneObject that = (CloneObject) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        return cloneType != null ? cloneType.equals(that.cloneType) : that.cloneType == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (cloneType != null ? cloneType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CloneObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(createDate) +
                ", cloneType=" + cloneType +
                '}';
    }
}
