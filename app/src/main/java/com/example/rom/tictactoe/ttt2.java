package com.example.rom.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ttt2 extends AppCompatActivity {

    Button r1c1,r1c2,r1c3,r2c1,r2c2,r2c3,r3c1,r3c2,r3c3,reset;
    int count=0;
    String a11,a12,a13,a21,a22,a23,a31,a32,a33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt2);
        r1c1 = (Button) findViewById(R.id.button00);
        r1c2 = (Button) findViewById(R.id.button01);
        r1c3 = (Button) findViewById(R.id.button02);
        r2c1 = (Button) findViewById(R.id.button10);
        r2c2 = (Button) findViewById(R.id.button11);
        r2c3 = (Button) findViewById(R.id.button12);
        r3c1 = (Button) findViewById(R.id.button20);
        r3c2 = (Button) findViewById(R.id.button21);
        r3c3 = (Button) findViewById(R.id.button22);
        reset = (Button) findViewById(R.id.reset);
        r1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r1c1.setText("O");
                } else {
                    r1c1.setText("X");
                }
                r1c1.setEnabled(false);
                game();
            }
        });
        r1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r1c2.setText("O");
                } else {
                    r1c2.setText("X");
                }
                r1c2.setEnabled(false);
                game();
            }
        });
        r1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r1c3.setText("O");
                } else {
                    r1c3.setText("X");
                }
                r1c3.setEnabled(false);
                game();
            }
        });
        r2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r2c1.setText("O");
                } else {
                    r2c1.setText("X");
                }
                r2c1.setEnabled(false);
                game();
            }
        });
        r2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r2c2.setText("O");
                } else {
                    r2c2.setText("X");
                }
                r2c2.setEnabled(false);
                game();
            }
        });
        r2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r2c3.setText("O");
                } else {
                    r2c3.setText("X");
                }
                r2c3.setEnabled(false);
                game();
            }
        });
        r3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r3c1.setText("O");
                } else {
                    r3c1.setText("X");
                }
                r3c1.setEnabled(false);
                game();
            }
        });
        r3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r3c2.setText("O");
                } else {
                    r3c2.setText("X");
                }
                r3c2.setEnabled(false);
                game();
            }
        });
        r3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count % 2 == 0) {
                    r3c3.setText("O");
                } else {
                    r3c3.setText("X");
                }
                r3c3.setEnabled(false);
                game();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1c1.setEnabled(true);
                r1c2.setEnabled(true);
                r1c3.setEnabled(true);
                r2c1.setEnabled(true);
                r2c2.setEnabled(true);
                r2c3.setEnabled(true);
                r3c1.setEnabled(true);
                r3c2.setEnabled(true);
                r3c3.setEnabled(true);
                r1c1.setText("R");
                r1c2.setText("R");
                r1c3.setText("R");
                r2c1.setText("R");
                r2c2.setText("R");
                r2c3.setText("R");
                r3c1.setText("R");
                r3c2.setText("R");
                r3c3.setText("R");
                count = 0;
            }
        });
        // if(count>=5)
        //{
        Toast.makeText(getApplicationContext(), "hii", Toast.LENGTH_SHORT).show();
    //}
    }

    public void game()
    {
        a11=r1c1.getText().toString();
        a12=r1c2.getText().toString();
        a13=r1c3.getText().toString();
        a21=r2c1.getText().toString();
        a22=r2c2.getText().toString();
        a23=r2c3.getText().toString();
        a31=r3c1.getText().toString();
        a32=r3c2.getText().toString();
        a33=r3c3.getText().toString();
        if((a11.equals(a12)&&a12.equals(a13)&&a13.equals("X"))||(a21.equals(a22)&&a22.equals(a23)&&a23.equals("X"))||(a31.equals(a32)&&a32.equals(a33)&&a33.equals("X"))||(a11.equals(a22)&&a22.equals(a33)&&a33.equals("X"))||(a13.equals(a22)&&a22.equals(a31)&&a31.equals("X"))||(a11.equals(a21)&&a21.equals(a31)&&a31.equals("X"))||(a12.equals(a22)&&a22.equals(a32)&&a32.equals("X"))||(a13.equals(a23)&&a23.equals(a33)&&a33.equals("X")))
        {
            Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_SHORT).show();
            endgame();
        }
        else if((a11.equals(a12)&&a12.equals(a13)&&a13.equals("O"))||(a21.equals(a22)&&a22.equals(a23)&&a23.equals("O"))||(a31.equals(a32)&&a32.equals(a33)&&a33.equals("O"))||(a11.equals(a22)&&a22.equals(a33)&&a33.equals("O"))||(a13.equals(a22)&&a22.equals(a31)&&a31.equals("O"))||(a11.equals(a21)&&a21.equals(a31)&&a31.equals("O"))||(a12.equals(a22)&&a22.equals(a32)&&a32.equals("O"))||(a13.equals(a23)&&a23.equals(a33)&&a33.equals("O")))
        {
            Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_SHORT).show();
            endgame();
        }
        else if(count==9)
        {
            Toast.makeText(getApplicationContext(), "Draw", Toast.LENGTH_SHORT).show();
        }
    }
    public void endgame()
    {
        r1c1.setEnabled(false);
        r1c2.setEnabled(false);
        r1c3.setEnabled(false);
        r2c1.setEnabled(false);
        r2c2.setEnabled(false);
        r2c3.setEnabled(false);
        r3c1.setEnabled(false);
        r3c2.setEnabled(false);
        r3c3.setEnabled(false);
    }
}


