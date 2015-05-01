
package com.jonathansteadman.griffithwhitehawkx.ffxivhunts;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.ListFragment;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HuntsListFragment extends ListFragment {

    ArrayList<Hunts> hunts = new ArrayList<Hunts>();

    Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        hunts = HuntsSet.getInstance().getHunts();

        ArrayAdapter<Hunts> adapter = new HuntsAdapter(hunts);

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Hunts hunts = (Hunts)(getListAdapter()).getItem(position);

        TextView respawnView = (TextView)v.findViewById(R.id.textview_hunt_respawn);
        //pass respawnView to the counter class, which sets the counter in the textview
        CounterClass counter = new CounterClass(getActivity(), (hunts.getRespawn() * 3600000), 1000, respawnView);
        counter.start();


    }

    private class HuntsAdapter extends ArrayAdapter<Hunts> {
        public HuntsAdapter(ArrayList<Hunts> hunts) {
            super(getActivity(), 0, hunts);
        }

        @SuppressLint("NewApi")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_hunts,
                        null);
            }

            Hunts hunts = getItem(position);

            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_hunt_img);
            imageView.setImageResource(hunts.getImage());

            TextView nameView = (TextView)convertView.findViewById(R.id.textview_hunt_name);
            nameView.setText(hunts.getName());

            TextView zoneView = (TextView)convertView.findViewById(R.id.textview_hunt_zone);
            zoneView.setText(hunts.getZone());

            TextView respawnView = (TextView)convertView.findViewById(R.id.textview_hunt_respawn);
            respawnView.setText("OPEN");
            respawnView.setTextColor(Color.GREEN);

            return convertView;
        }

    }

}
