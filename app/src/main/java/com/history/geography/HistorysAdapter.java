package com.history.geography;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class HistorysAdapter extends BaseAdapter {
        List<Historys> mList;
        Context mContext;

    public HistorysAdapter(Context pContext, List<Historys> pList) {
            this.mContext = pContext;
            this.mList = pList;
        }

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Object getItem(int position) {
            return mList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        /**
         * 下面是重要代码
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater _LayoutInflater=LayoutInflater.from(mContext);
            convertView=_LayoutInflater.inflate(R.layout.item, null);
            if(convertView!=null)
            {
                TextView _TextView1=(TextView)convertView.findViewById(R.id.textView1);
                //TextView _TextView2=(TextView)convertView.findViewById(R.id.textView2);
                _TextView1.setText(mList.get(position).getRegion());
                //_TextView2.setText(mList.get(position).getRegion());
            }
            return convertView;
        }
}
