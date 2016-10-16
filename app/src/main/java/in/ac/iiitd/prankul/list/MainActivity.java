package in.ac.iiitd.prankul.list;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (RecyclerView) findViewById(R.id.listView);

        ArrayList<ItemDetails> list = new ArrayList<>();
        list.add(new ItemDetails("Title 1","Subtitle 1"));
        list.add(new ItemDetails("Title 2","Subtitle 2"));
        list.add(new ItemDetails("Title 3","Subtitle 3"));
        Adapter adapter = new Adapter(list);

        listView.setAdapter(adapter);
        listView.setLayoutManager(new LinearLayoutManager(this));

        /*
        //useful for slide out and other things

        listView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, listView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Toast.makeText(getApplication().getApplicationContext(),position+" pressed", Toast.LENGTH_SHORT).show();
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplication().getApplicationContext(),position+" long pressed", Toast.LENGTH_SHORT).show();
                    }
                })
        );*/
    }
}
