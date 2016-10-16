package in.ac.iiitd.prankul.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
    }
}
