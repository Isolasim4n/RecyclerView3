package id.sch.smktelkom_mlg.learn.recyclerview3.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.recyclerview3.R;
import id.sch.smktelkom_mlg.learn.recyclerview3.model.hotel;

/**
 * Created by WINDOWS 8.1 on 4/11/2016.
 */

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    ArrayList<hotel> hotelList;
    IHotelAdapter mIHotelAdapter;

    public HotelAdapter(Context context, ArrayList<hotel> hotelList) {
        this.hotelList = hotelList;
        mIHotelAdapter = (IHotelAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        hotel Hotel = hotelList.get(position);
        holder.tvJudul.setText(Hotel.judul);
        holder.tvDeskripsi.setText(Hotel.deskripsi);
        holder.ivFoto.setImageURI(Uri.parse(Hotel.foto));
    }

    @Override
    public int getItemCount() {

        if (hotelList != null)
            return hotelList.size();
        return 0;
    }

    public interface IHotelAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIHotelAdapter.doClick(getAdapterPosition());
                }
            });

        }


    }
}
