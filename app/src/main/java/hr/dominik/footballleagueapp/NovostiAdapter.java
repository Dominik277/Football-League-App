package hr.dominik.footballleagueapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NovostiAdapter extends RecyclerView.Adapter<NovostiAdapter.ViewHolder> {

    public interface OnItemClickListener{
        void onItemClick(long id);
    }

    private OnItemClickListener mOnItemClickListener;

    private Context context;
    private ArrayList<ModelNovosti> modelNovostiArrayList;
    private ModelNovosti modelNovosti;

    public NovostiAdapter(Context context, ArrayList<ModelNovosti> modelNovostiArrayList) {
        this.context = context;
        this.modelNovostiArrayList = modelNovostiArrayList;
    }

    @NonNull
    @Override
    public NovostiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.novosti_card_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NovostiAdapter.ViewHolder holder, int position) {
        ModelNovosti modelNovosti = modelNovostiArrayList.get(position);
        holder.cardViewSlika.setImageResource(modelNovosti.getSlika());
        holder.cardViewDatum.setText(modelNovosti.getDatum());
        holder.cardViewNaslov.setText(modelNovosti.getNaslov());
        holder.cardViewTekst.setText(modelNovosti.getTekst());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,modelNovosti.getNaslov(),Toast.LENGTH_LONG).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelNovostiArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView cardViewSlika;
        TextView cardViewDatum;
        TextView cardViewNaslov;
        TextView cardViewTekst;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardViewSlika = itemView.findViewById(R.id.cardView_slika);
            cardViewDatum = itemView.findViewById(R.id.cardView_datum);
            cardViewNaslov = itemView.findViewById(R.id.cardView_naslov);
            cardViewTekst = itemView.findViewById(R.id.cardView_tekst);
        }
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener){
        this.mOnItemClickListener = mItemClickListener;
    }

}
