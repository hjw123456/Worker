package com.soboot.mike.worker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.soboot.mike.worker.R;
import com.soboot.mike.worker.base.MyBaseAdapter;
import com.soboot.mike.worker.enity.WorkListInfo;

import java.util.zip.Inflater;

/**
 * Created by Wing on 2016/5/28.
 */
public class WorkListAdapter extends MyBaseAdapter<WorkListInfo> {
    private Context context;

    public WorkListAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.my_lv_item, null);
            holder.img_work_list_name = (ImageView) convertView.findViewById(R.id.img_work_list_name);
            holder.tv_my_work_list_name = (TextView) convertView.findViewById(R.id.tv_my_work_list_name);
            holder.tv_my_work_list_state = (TextView) convertView.findViewById(R.id.tv_my_work_list_state);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        WorkListInfo info = getItem(position);
        holder.img_work_list_name.setImageResource(info.getImgId());
        holder.tv_my_work_list_name.setText(info.getWorkListName());
        holder.tv_my_work_list_state.setText(info.getWorkListState());
        return convertView;
    }

    class ViewHolder {
        TextView tv_my_work_list_name;
        TextView tv_my_work_list_state;
        ImageView img_work_list_name;
    }
}
