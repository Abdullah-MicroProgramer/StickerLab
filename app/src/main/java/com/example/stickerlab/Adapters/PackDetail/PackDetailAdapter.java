package com.example.stickerlab.Adapters.PackDetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stickerlab.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PackDetailAdapter extends RecyclerView.Adapter<PackDetailAdapter.VH> {
    Context context;
    public PackDetailAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pack_detail_act_adapter_item, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

        holder.itemView.setOnClickListener(v -> {
//            if (position == 0) {
//                Intent intent = new Intent(context, PlanDetailActivity.class);
//                context.startActivity(intent);
//            } else if (position == 1) {
//                Intent intent = new Intent(context, StartImagePlanActivity.class);
//                context.startActivity(intent);
//            }
        });

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class VH extends RecyclerView.ViewHolder {
        ImageView imageView;

        public VH(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
