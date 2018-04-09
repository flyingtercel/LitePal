package us.mifeng.litepal02.bean;

import org.litepal.crud.DataSupport;

/**
 * Created by 黑夜之火 on 2018/3/29.
 */

public class Book extends DataSupport{
    private String name;
    private String author;
    private int id;
    private String ss;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
