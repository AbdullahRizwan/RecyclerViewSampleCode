package com.example.myapplication;

import android.content.pm.LauncherActivityInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.Vector;

public class CustomAdaptor extends RecyclerView.Adapter <CustomAdaptor.ViewHoler> {

    private Vector<World_Time> data;

    public CustomAdaptor(Vector<World_Time> data) {
        this.data= data;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.single_row,parent,false);
        return  new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        holder.name.setText( data.get(position).getCountryName()) ;
        holder.time.setText(data.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder{
        TextView name;
        TextView time;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.contact_name);
            time = itemView.findViewById(R.id.time);

        }
    }
}
