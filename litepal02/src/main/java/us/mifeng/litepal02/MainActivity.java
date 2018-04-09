package us.mifeng.litepal02;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

import us.mifeng.litepal02.bean.Book;


public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.create:
                //创建数据库，关联数据库对象
                Connector.getDatabase();
                 db = Connector.getDatabase();
                break;
            case R.id.insert:
                Book book = new Book();
                book.setName("语文");
                book.setAuthor("张三");
                book.setId(23);
                //向数据库中插入数据
                boolean save = book.save();
                if (save){
                    showToast("数据插入成功");
                }
                break;
            case R.id.query:
                List<Book> all = DataSupport.findAll(Book.class);
                for(int i=0;i<all.size();i++){
                    Log.i("tag", "click: ====="+all.get(i).getName()+all.get(i).getAuthor());
                }
                break;
            case R.id.update:
                Book bok = new Book();
                bok.setAuthor("李四");
                bok.updateAll("name=?","语文");
                ContentValues value = new ContentValues();
                value.put("name","音乐");
                DataSupport.updateAll(Book.class,value,"author = ?","李四");
                break;
            case R.id.delete:
                Book bok1 = new Book();
                bok1.setAuthor("李四");
                //bok1.delete();
                DataSupport.deleteAll(Book.class,  "author = ?","李四");
                break;
        }
    }
    //吐司的方法
    private void showToast(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
