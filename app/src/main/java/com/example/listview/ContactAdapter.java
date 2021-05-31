package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<ContactModel> listContacts;
    private Activity activity;

    public ContactAdapter(List<ContactModel> listContacts, Activity activity) {
        this.listContacts = listContacts;
        this.activity = activity;
    }

    public int getCount(){
        return listContacts.size();
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_contact,parent,false);
            RecyclerView.ViewHolder holder = new RecyclerView.ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            holder.tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
            holder.ivAvatar = (TextView) convertView.findViewById(R.id.ivAvatar);
            convertView.setTag(holder);
        }
        RecyclerView.ViewHolder holder = (RecyclerView.ViewHolder) convertView.getTag();
        ContactModel model = listContacts.get(position);
        holder.tvName.setText(model.getName());
        holder.tvPhone.setText(model.getPhone());
        holder.ivAvatar.setImageResource(model.getAvatar());
        return convertView;
    }

    static class ViewHolder{
        TextView tvName;
        TextView tvPhone;
        TextView ivAvatar;
    }
}
