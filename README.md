# LitePal
添加依赖
```
compile 'org.litepal.android:core:1.3.2'
```
创建在main文件夹中创建asstes文件夹
在asste文件中创建litepal.xml文件
```
<?xml version="1.0" encoding="UTF-8" ?>
<litepal>
    <dbname value="book"></dbname>
    <version value="1"></version>
    <list>
        <mapping class="us.mifeng.litepal02.bean.Book"></mapping>
    </list>
</litepal>
```
在清单文件中注册LitePalApplication
```
android:name="org.litepal.LitePalApplication"
```
在Activity中
创建数据库，关联数据库对象，运行一下方法
```
        Connector.getDatabase();
```
向数据库中插入数据
```
     boolean save = book.save() 等
```
查询数据
```
List<Book> all = DataSupport.findAll(Book.class);等
```
修改数据
```
DataSupport.updateAll(Book.class,value,"author = ?","李四");等
```
删除数据
```
DataSupport.deleteAll(Book.class,  "author = ?","李四");等
```
