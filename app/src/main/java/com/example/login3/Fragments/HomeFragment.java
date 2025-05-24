package com.example.login3.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.login3.Adapters.SightAdapter;
import com.example.login3.Helpers.SightItem;
import com.example.login3.R;

public class HomeFragment extends Fragment {

    private ArrayList<SightItem> sightItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new SightAdapter(sightItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sightItems.add(new SightItem(R.drawable.bucharest, "Latte","0","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Kapucino","1","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Raf","2","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Milk Shake","3","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Magic Coffee","4","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Swedish Coffee","5","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Mint Coffee","6","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Espresso","7","0"));
        sightItems.add(new SightItem(R.drawable.bucharest, "Americano","8","0"));

        return root;
    }
}