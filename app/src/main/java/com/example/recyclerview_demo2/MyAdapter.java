package com.example.recyclerview_demo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Clase del adaptador extiende de RecyclerView.Adapter<MyAdapter.MyViewHolder>
 *     myViewAdapter es la clase interna que creamos
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    // atributos
    String data1[];
    String data2[];
    int imagenes[];
    Context context;

    /**
     *  CONSTRUCTOR
     * @param context context
     * @param string1 array de string titulos
     * @param string2 array de string descripciones
     * @param images array de imagenes
     */
    public MyAdapter(Context context, String string1[], String string2[], int images[]){
        this.context = context;
        this.data1 = string1;
        this.data2 = string2;
        this.imagenes = images;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);
        holder.myImage.setImageResource(imagenes[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    /**
     * clase interna
     */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // atributos
        TextView mytext1;
        TextView mytext2;
        ImageView myImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            // relacionamos java con xml
            mytext1 = itemView.findViewById(R.id.textView_item_title);
            mytext2 = itemView.findViewById(R.id.textView_item_desc);
            myImage = itemView.findViewById(R.id.imageView_item);

        }
    }
}
