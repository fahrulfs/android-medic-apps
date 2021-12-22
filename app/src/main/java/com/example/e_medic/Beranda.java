package com.example.e_medic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.DocumentsContract;
import android.sax.RootElement;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Beranda extends Fragment {
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_beranda, container, false);

        ImageView toPesan = (ImageView) rootView.findViewById(R.id.obat1);
        toPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toPesan=new Intent(getActivity(),pesan_screen.class);
                startActivity(toPesan);
            }
        });

        return rootView;
    }
}