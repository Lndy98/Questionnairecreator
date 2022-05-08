package com.exemple.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.questionnairecreator.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exemple.item.StatementItem;

import java.util.List;

public class StatementItemAdapter extends RecyclerView.Adapter<StatementItemAdapter.ViewHolder>{
    private Context mContext;
    private List<StatementItem> statementItems;
    private int lastPosition;

    StatementItemAdapter(Context mContext, List<StatementItem> statementItems) {
        this.mContext = mContext;
        this.statementItems = statementItems;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext)
                .inflate(R.layout.statement_item, parent, false));
    }

    @Override
    public void onBindViewHolder(StatementItemAdapter.ViewHolder holder, int position) {
        StatementItem statementItem = statementItems.get(position);
        holder.bindTo(statementItem);
    }

    @Override
    public int getItemCount() {
        return statementItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            description = itemView.findViewById(R.id.description);

        }

        public void bindTo(StatementItem currentItem) {
            description.setText(currentItem.getDescription());

        }
    }
}

