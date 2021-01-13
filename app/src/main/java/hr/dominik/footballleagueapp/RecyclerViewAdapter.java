package hr.dominik.footballleagueapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    RecyclerViewDataModel[] recyclerViewDataModels;

    public RecyclerViewAdapter(RecyclerViewDataModel[] recyclerViewDataModels){
        this.recyclerViewDataModels = recyclerViewDataModels;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_spinner, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        RecyclerViewDataModel myRecyclerViewDataModel = recyclerViewDataModels[position];
        holder.spinner.setTe
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        Spinner spinner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            spinner = itemView.findViewById(R.id.spinner);
        }
    }

}
