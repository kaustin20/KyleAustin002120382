package com.example.kyleaustin.kyleaustin002120382.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.kyleaustin.kyleaustin002120382.R;

import java.util.ArrayList;
import java.util.List;


public class DemoFragment extends Fragment {
   //private final MainListAdapter adapter;
    public List<String> list = new ArrayList<String>();
    private ListView listView;
  // private final MainListAdapter adapter;
    public DemoFragment() {
        // Required empty public constructor


            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
            list.add("F");
            list.add("G");
            list.add("H");
            //adapter = new MainListAdapter(getContext(),list);

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_demo,container,false);
       listView = view.findViewById(R.id.main_demo_lv);
       //listView.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }


}
