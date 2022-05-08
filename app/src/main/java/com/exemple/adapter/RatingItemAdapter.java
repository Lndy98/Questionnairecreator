package com.exemple.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.questionnairecreator.R;
import com.exemple.item.RatingItem;
import com.exemple.item.StatementItem;

public class RatingItemAdapter extends RecyclerView.Adapter<RatingItemAdapter.ViewHolder> {
    private Context mContext;
    private StatementItemAdapter statementItemAdapter;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView ratingItemQuestion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ratingItemQuestion = itemView.findViewById(R.id.description);

        }

        public void bindTo(StatementItem currentItem) {
            ratingItemQuestion.setText(currentItem.getDescription());

        }
    }
}
