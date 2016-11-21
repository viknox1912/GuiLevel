package com.gui.sharemate.viknox.guilevel;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by x230 on 11/21/2016.
 */
public class FragmentHome extends android.support.v4.app.Fragment implements View.OnClickListener{
    ImageButton bt_search,bt_groups,bt_chat,bt_settings;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_search:
                Toast.makeText(getActivity(), "Slide to Search fragment", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_chat:
                Toast.makeText(getActivity(), "Slide to Chat Fragment", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_groups:
                Toast.makeText(getActivity(), "Go to Groups Fragment", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btn_settings:
                Toast.makeText(getActivity(), "Go to settings Fragment", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        bt_search = (ImageButton)view.findViewById(R.id.btn_search);
        bt_groups = (ImageButton)view.findViewById(R.id.btn_groups);
        bt_chat = (ImageButton)view.findViewById(R.id.btn_chat);
        bt_settings = (ImageButton)view.findViewById(R.id.btn_settings);
        bt_search.setOnClickListener(this);
        bt_groups.setOnClickListener(this);
        bt_chat.setOnClickListener(this);
        bt_settings.setOnClickListener(this);
    }
}
