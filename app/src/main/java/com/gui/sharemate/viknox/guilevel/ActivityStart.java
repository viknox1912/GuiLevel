package com.gui.sharemate.viknox.guilevel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by x230 on 11/21/2016.
 */

public class ActivityStart extends AppCompatActivity implements View.OnClickListener{
    private FrameLayout frameLayout;
    private RelativeLayout addTagsContainter;
    Button bt_login,bt_addTags;
    EditText et_add_tags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        addTagsContainter = (RelativeLayout) findViewById(R.id.add_tags_containter);
        et_add_tags =(EditText)findViewById(R.id.et_add_tag);
        addTagsContainter.setVisibility(View.INVISIBLE);
        bt_login = (Button)findViewById(R.id.login_button);
        bt_addTags = (Button)findViewById(R.id.add_tag_button);
        bt_login.setOnClickListener(this);
        bt_addTags.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_button:
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                addTagsContainter.setVisibility(View.VISIBLE);
                break;
            case R.id.add_tag_button:
                Toast.makeText(this, "Taggs" + et_add_tags.getText() + "added", Toast.LENGTH_SHORT).show();
                Intent am = new Intent(ActivityStart.this,ActivityMain.class);
                startActivity(am);
        }
    }
}
