package com.envyathletics.envy.training;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.envyathletics.envy.R;
import com.envyathletics.envy.beans.TrainingItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sora on 5/22/2016.
 */
public class TrainingListAdapter extends BaseAdapter {

    private final Context context;
    private final List<TrainingItem> trainingItems;

    public TrainingListAdapter(final Context context) {

        this.context = context;
        trainingItems = TrainingListUtil.loadAchievements(context);

    }

    @Override
    public int getCount() {
        return trainingItems.size();
    }

    @Override
    public Object getItem(final int position) {
        return trainingItems.get(position);
    }

    @Override
    public long getItemId(final int position) {
        return position;
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {

        View row = convertView;
        TraitHolder holder = null;

        final TrainingItem trainingItem = trainingItems.get(position);

        if (row == null) {
            final LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.adapter_layout_training_list, parent, false);

            holder = new TraitHolder();

            holder.title = (TextView) row.findViewById(R.id.adapter_layout_training_list_name);
            holder.detail = (TextView) row.findViewById(R.id.adapter_layout_training_list_detail);

            row.setTag(holder);

        } else {
            holder = (TraitHolder) row.getTag();
        }

        holder.title.setText(trainingItem.getName());
        holder.detail.setText(trainingItem.getDetail());

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(view.getContext(), TrainingVideo.class);
                intent.putExtra(TrainingVideo.INTENT_EXTRA_URL, trainingItem.getUrl());
                context.startActivity(intent);
            }
        });

        return row;

    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(final int position) {
        return true;
    }

    static class TraitHolder {
        TextView title;
        TextView detail;
    }

}
