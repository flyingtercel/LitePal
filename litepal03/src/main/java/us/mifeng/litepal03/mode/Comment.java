package us.mifeng.litepal03.mode;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by 黑夜之火 on 2018/3/29.
 */

public class Comment extends DataSupport{
    private News news;
    @Column(unique = true)
    private int id;
    @Column(defaultValue = "哈哈哈")
    private String content;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
