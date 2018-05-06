package com.example.rom.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TicTacToe extends AppCompatActivity {

    public Button player;
    public void play1() {
        player=(Button)findViewById(R.id.play);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent play2=new Intent(TicTacToe.this,ttt2.class);
                startActivity(play2);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        play1();
    }
}
