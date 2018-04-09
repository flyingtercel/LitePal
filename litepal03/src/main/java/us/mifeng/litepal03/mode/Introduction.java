package us.mifeng.litepal03.mode;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by 黑夜之火 on 2018/3/29.
 */

public class Introduction extends DataSupport{
    @Column(unique = true)
    private int id;
    @Column(nullable = true)
    private String guide;
    private String digest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
