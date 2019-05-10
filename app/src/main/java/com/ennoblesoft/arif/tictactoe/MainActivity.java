package com.ennoblesoft.arif.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.ennoblesoft.arif.tictactoe.utils.Result;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Activity activity;
    private Button btnA1, btnA2, btnA3, btnB1, btnB2, btnB3, btnC1, btnC2, btnC3;
    private LinearLayout btnPlayAgain, btnExit;
    private int turn;
    private LinearLayout.LayoutParams params;
    private int forX, forO, white, count, exit;
    private CardView cvEnd;
    Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        turn = 1;
        count = exit = 0;
        result = new Result(this);

        params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        params.setMargins(10, 10, 10, 10);
        params.weight = 1;

        FindViews();
        BtnClickEvent();

        cvEnd.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.btn_a1):
                ClickA1();
                break;
            case (R.id.btn_a2):
                ClickA2();
                break;
            case (R.id.btn_a3):
                ClickA3();
                break;
            case (R.id.btn_b1):
                ClickB1();
                break;
            case (R.id.btn_b2):
                ClickB2();
                break;
            case (R.id.btn_b3):
                ClickB3();
                break;
            case (R.id.btn_c1):
                ClickC1();
                break;
            case (R.id.btn_c2):
                ClickC2();
                break;
            case (R.id.btn_c3):
                ClickC3();
                break;
            case (R.id.ll_play_again):
                RePlay();
                break;
            case (R.id.ll_exit):
                Exit();
                break;
        }
    }

    private void ClickA1() {
        String a1 = btnA1.getText().toString().trim();
        btnA1.setTextColor(white);
        btnA1.setLayoutParams(params);
        if (a1.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnA1.setBackgroundColor(forX);
                btnA1.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnA1.setBackgroundColor(forO);
                btnA1.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickA2() {
        String a2 = btnA2.getText().toString().trim();
        btnA2.setTextColor(white);
        btnA2.setLayoutParams(params);
        if (a2.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnA2.setBackgroundColor(forX);
                btnA2.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnA2.setBackgroundColor(forO);
                btnA2.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickA3() {
        String a3 = btnA3.getText().toString().trim();
        btnA3.setTextColor(white);
        btnA3.setLayoutParams(params);
        if (a3.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnA3.setBackgroundColor(forX);
                btnA3.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnA3.setBackgroundColor(forO);
                btnA3.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickB1() {
        String b1 = btnB1.getText().toString().trim();
        btnB1.setTextColor(white);
        btnB1.setLayoutParams(params);
        if (b1.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnB1.setBackgroundColor(forX);
                btnB1.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnB1.setBackgroundColor(forO);
                btnB1.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickB2() {
        String b2 = btnB2.getText().toString().trim();
        btnB2.setTextColor(white);
        btnB2.setLayoutParams(params);
        if (b2.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnB2.setBackgroundColor(forX);
                btnB2.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnB2.setBackgroundColor(forO);
                btnB2.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickB3() {
        String b3 = btnB3.getText().toString().trim();
        btnB3.setTextColor(white);
        btnB3.setLayoutParams(params);
        if (b3.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnB3.setBackgroundColor(forX);
                btnB3.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnB3.setBackgroundColor(forO);
                btnB3.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickC1() {
        String c1 = btnC1.getText().toString().trim();
        btnC1.setTextColor(white);
        btnC1.setLayoutParams(params);
        if (c1.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnC1.setBackgroundColor(forX);
                btnC1.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnC1.setBackgroundColor(forO);
                btnC1.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickC2() {
        String c2 = btnC2.getText().toString().trim();
        btnC2.setTextColor(white);
        btnC2.setLayoutParams(params);
        if (c2.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnC2.setBackgroundColor(forX);
                btnC2.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnC2.setBackgroundColor(forO);
                btnC2.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void ClickC3() {
        String c3 = btnC3.getText().toString().trim();
        btnC3.setTextColor(white);
        btnC3.setLayoutParams(params);
        if (c3.equals("")) {
            if (turn == 1) {
                turn = 2;
                btnC3.setBackgroundColor(forX);
                btnC3.setText("X");
            } else if (turn == 2) {
                turn = 1;
                btnC3.setBackgroundColor(forO);
                btnC3.setText("O");
            }
            count++;
        }
        EndGame();
    }

    private void EndGame() {
        String a1, a2, a3, b1, b2, b3, c1, c2, c3;
        boolean end = false;


        a1 = btnA1.getText().toString().trim();
        a2 = btnA2.getText().toString().trim();
        a3 = btnA3.getText().toString().trim();

        b1 = btnB1.getText().toString().trim();
        b2 = btnB2.getText().toString().trim();
        b3 = btnB3.getText().toString().trim();

        c1 = btnC1.getText().toString().trim();
        c2 = btnC2.getText().toString().trim();
        c3 = btnC3.getText().toString().trim();

        //Condition for horizontal win for Player X
        if (a1.equals(a2) && a1.equals(a3) && a1.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(123);
        }
        if (b1.equals(b2) && b1.equals(b3) && b1.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(456);
        }
        if (c1.equals(c2) && c1.equals(c3) && c1.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(789);
        }

        //Condition for vertical win for Player X
        if (a1.equals(b1) && a1.equals(c1) && a1.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(147);
        }
        if (a2.equals(b2) && a2.equals(c2) && a2.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(258);
        }
        if (a3.equals(b3) && a3.equals(c3) && a3.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(369);
        }

        //Condition for diagonal win for Player X
        if (a1.equals(b2) && a1.equals(c3) && a1.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(159);
        }
        if (a3.equals(b2) && a3.equals(c1) && a3.equals("X")) {
            String message = "Player X Won!";
            result.Result(message);
            end = true;
            BtnColor(357);
        }

        //Condition for horizontal win for Player O
        if (a1.equals(a2) && a1.equals(a3) && a1.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(123);
        }
        if (b1.equals(b2) && b1.equals(b3) && b1.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(456);
        }
        if (c1.equals(c2) && c1.equals(c3) && c1.equals("X")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(789);
        }

        //Condition for vertical win for Player O
        if (a1.equals(b1) && a1.equals(c1) && a1.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(147);
        }
        if (a2.equals(b2) && a2.equals(c2) && a2.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(258);
        }
        if (a3.equals(b3) && a3.equals(c3) && a3.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(369);
        }

        //Condition for diagonal win for Player O
        if (a1.equals(b2) && a1.equals(c3) && a1.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(159);
        }
        if (a3.equals(b2) && a3.equals(c1) && a3.equals("O")) {
            String message = "Player O Won!";
            result.Result(message);
            end = true;
            BtnColor(357);
        }

        if (!end && count == 9) {
            String message = "Match Drawn!!";
            result.Result(message);
            end = true;
            BtnColor(0);
            BtnDisable();
        }

        if (end) {
            BtnDisable();
        }

    }

    private void BtnDisable() {
        btnA1.setEnabled(false);
        btnA2.setEnabled(false);
        btnA3.setEnabled(false);
        btnB1.setEnabled(false);
        btnB2.setEnabled(false);
        btnB3.setEnabled(false);
        btnC1.setEnabled(false);
        btnC2.setEnabled(false);
        btnC3.setEnabled(false);

        cvEnd.setVisibility(View.VISIBLE);
    }

    private void BtnColor(int i) {
        switch (i) {
            case 123:
                b123();
                break;
            case 456:
                b456();
                break;
            case 789:
                b789();
                break;
            case 147:
                b147();
                break;
            case 258:
                b258();
                break;
            case 369:
                b369();
                break;
            case 159:
                b159();
                break;
            case 357:
                b357();
                break;
            default:
                bAll();
                break;
        }

    }

    private void FindViews() {
        btnA1 = findViewById(R.id.btn_a1);
        btnA2 = findViewById(R.id.btn_a2);
        btnA3 = findViewById(R.id.btn_a3);
        btnB1 = findViewById(R.id.btn_b1);
        btnB2 = findViewById(R.id.btn_b2);
        btnB3 = findViewById(R.id.btn_b3);
        btnC1 = findViewById(R.id.btn_c1);
        btnC2 = findViewById(R.id.btn_c2);
        btnC3 = findViewById(R.id.btn_c3);

        btnPlayAgain = findViewById(R.id.ll_play_again);
        btnExit = findViewById(R.id.ll_exit);
        cvEnd = findViewById(R.id.cv_end);

        forX = getResources().getColor(R.color.forX);
        forO = getResources().getColor(R.color.forO);
        white = getResources().getColor(R.color.white);
    }

    private void RePlay() {
        activity.recreate();
        cvEnd.setVisibility(View.GONE);
    }

    private void Exit() {
        if (exit == 1) {
            finish();
        } else {
            exit++;
            result.Result("Please Click again to exit!");
        }
    }

    private void BtnClickEvent() {
        btnA1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnA3.setOnClickListener(this);
        btnB1.setOnClickListener(this);
        btnB2.setOnClickListener(this);
        btnB3.setOnClickListener(this);
        btnC1.setOnClickListener(this);
        btnC2.setOnClickListener(this);
        btnC3.setOnClickListener(this);
        btnPlayAgain.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    private void b123() {
        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB2.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);

        btnC1.setBackgroundResource(android.R.drawable.btn_default);
        btnC2.setBackgroundResource(android.R.drawable.btn_default);
        btnC3.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b456() {
        btnA1.setBackgroundResource(android.R.drawable.btn_default);
        btnA2.setBackgroundResource(android.R.drawable.btn_default);
        btnA3.setBackgroundResource(android.R.drawable.btn_default);

        btnC1.setBackgroundResource(android.R.drawable.btn_default);
        btnC2.setBackgroundResource(android.R.drawable.btn_default);
        btnC3.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b789() {
        btnA1.setBackgroundResource(android.R.drawable.btn_default);
        btnA2.setBackgroundResource(android.R.drawable.btn_default);
        btnA3.setBackgroundResource(android.R.drawable.btn_default);

        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB2.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b147() {
        btnA2.setBackgroundResource(android.R.drawable.btn_default);
        btnA3.setBackgroundResource(android.R.drawable.btn_default);

        btnB2.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);

        btnC2.setBackgroundResource(android.R.drawable.btn_default);
        btnC3.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b258() {
        btnA1.setBackgroundResource(android.R.drawable.btn_default);
        btnA3.setBackgroundResource(android.R.drawable.btn_default);

        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);

        btnC1.setBackgroundResource(android.R.drawable.btn_default);
        btnC3.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b369() {
        btnA1.setBackgroundResource(android.R.drawable.btn_default);
        btnA2.setBackgroundResource(android.R.drawable.btn_default);

        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB2.setBackgroundResource(android.R.drawable.btn_default);

        btnC1.setBackgroundResource(android.R.drawable.btn_default);
        btnC2.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b159() {
        btnA2.setBackgroundResource(android.R.drawable.btn_default);
        btnA3.setBackgroundResource(android.R.drawable.btn_default);

        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);

        btnC1.setBackgroundResource(android.R.drawable.btn_default);
        btnC2.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void b357() {
        btnA1.setBackgroundResource(android.R.drawable.btn_default);
        btnA2.setBackgroundResource(android.R.drawable.btn_default);

        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);

        btnC2.setBackgroundResource(android.R.drawable.btn_default);
        btnC3.setBackgroundResource(android.R.drawable.btn_default);
    }

    private void bAll() {
        btnA1.setBackgroundResource(android.R.drawable.btn_default);
        btnA2.setBackgroundResource(android.R.drawable.btn_default);
        btnA3.setBackgroundResource(android.R.drawable.btn_default);

        btnB1.setBackgroundResource(android.R.drawable.btn_default);
        btnB2.setBackgroundResource(android.R.drawable.btn_default);
        btnB3.setBackgroundResource(android.R.drawable.btn_default);

        btnC1.setBackgroundResource(android.R.drawable.btn_default);
        btnC2.setBackgroundResource(android.R.drawable.btn_default);
        btnC3.setBackgroundResource(android.R.drawable.btn_default);
    }

    @Override
    public void onBackPressed() {
        Exit();
    }
}
