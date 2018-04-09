package us.mifeng.litepal03.mode;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 黑夜之火 on 2018/3/29.
 */

public class News extends DataSupport{
    @Column(unique = true)
    private int id;
    @Column(nullable = true)
    private String title;
    @Column(defaultValue = "我是内容")
    private String content;
    @Column(ignore = true)
    private Date publisDate;
    private int commentCount;
    @Column(nullable = true)
    private Introduction introduction;
    private List<Comment>comments = new ArrayList<>();
    public Introduction getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Introduction introduction) {
        this.introduction = introduction;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getPublisDate() {
        return publisDate;
    }
    public void setPublisDate(Date publisDate) {
        this.publisDate = publisDate;
    }
    public int getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
