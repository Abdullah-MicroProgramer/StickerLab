package com.example.stickerlab.Adapters.MainActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stickerlab.Activities.Detail.PackDetailActivity;
import com.example.stickerlab.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.VH> {
    Context context;
    private List<Integer> drawableIds;
    public PopularAdapter(Context context) {

        this.drawableIds = new ArrayList<>();
        drawableIds.add(R.drawable.iv_blue);
        drawableIds.add(R.drawable.iv_red);
        drawableIds.add(R.drawable.iv_gray);
        drawableIds.add(R.drawable.iv_yellow);
        drawableIds.add(R.drawable.iv_purple);
        drawableIds.add(R.drawable.iv_orange);
        Collections.shuffle(drawableIds);
        this.context = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_adapter_item, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

        int drawableId = drawableIds.get(position % drawableIds.size());
        // Set the drawable to the ImageView
        holder.imageView.setImageResource(drawableId);

        holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, PackDetailActivity.class);
                context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return 14;
    }

    public class VH extends RecyclerView.ViewHolder {
        ImageView imageView;

        public VH(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
