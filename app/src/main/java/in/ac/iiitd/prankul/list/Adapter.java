package in.ac.iiitd.prankul.list;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Prankul on 16-10-2016.
 */

public class Adapter extends RecyclerView.Adapter {

    private ArrayList<ItemDetails> list;

    public Adapter(ArrayList<ItemDetails> list)
    {
        this.list = list;
    }

    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView title,subtitle;
        private Button a,b;
        private ItemDetails item;

        private int KEY = 0;

        public ItemHolder(final View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle);
            a = (Button) itemView.findViewById(R.id.buttona);
            b = (Button) itemView.findViewById(R.id.buttonb);
            itemView.setOnClickListener(this);

            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(),getAdapterPosition()+"",Toast.LENGTH_SHORT).show();
                }
            });
        }

        public void bindItem(ItemDetails item) {
            this.item = item;
            title.setText(item.getTitle());
            subtitle.setText(item.getSubtitle());
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(itemView.getContext(),getAdapterPosition()+"",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ItemHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemDetails titem = list.get(position);
        ((ItemHolder)holder).bindItem(titem);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
