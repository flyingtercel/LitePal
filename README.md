# LitePal
添加依赖
compile 'org.litepal.android:core:1.3.2'
创建在main文件夹中创建asstes文件夹
在asste文件中创建litepal.xml文件
<?xml version="1.0" encoding="UTF-8" ?>
<litepal>
    <dbname value="book"></dbname>
    <version value="1"></version>
    <list>
        <mapping class="us.mifeng.litepal02.bean.Book"></mapping>
    </list>
</litepal>
在清单文件中注册LitePalApplication
android:name="org.litepal.LitePalApplication"

在Activity中
创建数据库，关联数据库对象，运行一下方法
        Connector.getDatabase();
