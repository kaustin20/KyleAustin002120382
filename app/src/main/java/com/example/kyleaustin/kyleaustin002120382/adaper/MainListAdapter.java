package com.example.kyleaustin.kyleaustin002120382.adaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.kyleaustin.kyleaustin002120382.R;

import java.util.List;



    class MainListAdapter extends BaseAdapter {
      private LayoutInflater inflater;
        private Context context;
        private List<String> list;
          //private View textView;


        public MainListAdapter(Context context,List<String> list){

            this.list = list;
            this.context = context;
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.item_listview_main, parent);
           TextView textView = convertView.findViewById(R.id.main_adapter_tv);
            textView.setText(list.get(position));
            return convertView;
        }

}
