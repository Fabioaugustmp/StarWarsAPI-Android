package com.example.starwarsapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.starwarsapi.R;
import com.example.starwarsapi.models.StarWars;

import java.util.ArrayList;
import java.util.List;


public class ListaStarWarsAdapter extends BaseAdapter {

    private ArrayList<StarWars> dataset;
    private Context context;

    public ListaStarWarsAdapter(List<StarWars> people, Context context) {
        this.dataset = dataset;
        this.context = context;
        dataset = new ArrayList<>();
    }


    @Override
    public int getCount() {
        return this.dataset != null ? this.dataset.size() : 0;
    }

    @Override
    public StarWars getItem(int i) {
        return this.dataset.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_starwarspeople,
                    viewGroup, false);
        }

        StarWars dataset = getItem(position);

        TextView
                txtItemName,
                txtItemBirthYear,
                txtItemEyeColor,
                txtItemGender,
                txtItemHairColor,
                txtItemHeight,
                txtItemMass,
                txtItemSkinColor,
                txtItemHomeworld,
                txtItemCreated,
                txtItemEdited;



        try {
            txtItemName = view.findViewById(R.id.textName);
            txtItemBirthYear = view.findViewById(R.id.textBirth_year);
            txtItemEyeColor = view.findViewById(R.id.textEye_color);
            txtItemGender = view.findViewById(R.id.textGender);
            txtItemHairColor = view.findViewById(R.id.textHair_color);
            txtItemHeight = view.findViewById(R.id.textHeight);
            txtItemMass = view.findViewById(R.id.textMass);
            txtItemSkinColor = view.findViewById(R.id.textSkin_color);
            txtItemHomeworld = view.findViewById(R.id.textHomeworld);
            txtItemCreated = view.findViewById(R.id.textCreated);
            txtItemEdited = view.findViewById(R.id.textEdited);


            txtItemName.setText(dataset.getName());
            txtItemBirthYear.setText(String.valueOf(dataset.getBirth_year()));
            txtItemEyeColor.setText(dataset.getEye_color());
            txtItemGender.setText(dataset.getGender());
            txtItemHairColor.setText(dataset.getHair_color());
            txtItemHeight.setText(String.valueOf(dataset.getHeight()));
            txtItemMass.setText(String.valueOf(dataset.getMass()));
            txtItemSkinColor.setText(dataset.getSkin_color());
            txtItemHomeworld.setText(dataset.getHomeworld());
            txtItemCreated.setText(dataset.getCreated());
            txtItemEdited.setText(dataset.getEdited());

        } catch (Exception e) {
            System.out.println("-- Erro ao listar, verifique com seu DEV. --");
            e.printStackTrace();
        }
        return view;
    }
}
