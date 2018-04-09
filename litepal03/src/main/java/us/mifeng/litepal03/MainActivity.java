package us.mifeng.litepal03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.Date;
import java.util.List;

import us.mifeng.litepal03.mode.Introduction;
import us.mifeng.litepal03.mode.News;

;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Connector.getDatabase();
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.insert:
                News news = new News();

                news.setId(12);
                news.setCommentCount(12);
                news.setContent("哈哈哈");

                Introduction introduction = new Introduction();
                introduction.setId(11);
                introduction.setDigest("skdjf");
                introduction.setGuide("深刻搭街坊");
                introduction.save();
                news.setIntroduction(introduction);
                news.setPublisDate(new Date());
                news.setTitle("ss ");
                boolean save = news.save();
                if (save){
                    showToast("保存数据充公");
                }
                break;
            case R.id.update:

                /*News ns = DataSupport.find(News.class, 1);
                if (ns != null){
                    Log.i("tag", "click: ==="+ns.getContent()+ns.getId());
                }*/
                List<News> all = DataSupport.findAll(News.class);
                for(News nes : all){
                    Log.i("tag", "click: ==="+nes.getContent()+nes.getId());
                    Introduction introduction1 = nes.find(Introduction.class, 1);

                    Log.i("tag", "click: =getIntroduction()==="+introduction1.getId()+introduction1.getGuide());
                    /*List<Introduction> all1 = DataSupport.findAll(Introduction.class);
                    for (Introduction in :all1){
                    }*/
                }
                break;
        }
    }
    private void showToast(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
