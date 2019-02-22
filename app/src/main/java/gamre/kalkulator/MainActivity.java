package gamre.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnZero, btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnClear;
    Button btnEqual;
    Button btnOpposite;
    Button btnComma;
    Button btnPlus;
    Button btnMinus;
    Button btnTimes;
    Button btnDivide;
    Button btnPercentage;
    Button btnBrackets;
    TextView textView;

    Boolean notDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtField);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);

        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);
        btnOpposite = findViewById(R.id.btnOpposite);
        btnComma = findViewById(R.id.btnComma);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnTimes = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        btnPercentage = findViewById(R.id.btnPercent);
        btnBrackets = findViewById(R.id.btnParant);


        btnZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "0";
                notDone = true;
                textView.setText(txt);
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "1";
                textView.setText(txt);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "2";
                textView.setText(txt);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "3";
                textView.setText(txt);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "4";
                textView.setText(txt);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "5";
                textView.setText(txt);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "6";
                textView.setText(txt);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "7";
                textView.setText(txt);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "8";
                textView.setText(txt);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "9";
                textView.setText(txt);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("");
                btnZero.setEnabled(true);
                btnOne.setEnabled(true);
                btnTwo.setEnabled(true);
                btnThree.setEnabled(true);
                btnFour.setEnabled(true);
                btnFive.setEnabled(true);
                btnSix.setEnabled(true);
                btnSeven.setEnabled(true);
                btnEight.setEnabled(true);
                btnNine.setEnabled(true);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String sum = textView.getText() + "";
                Expression calc = new ExpressionBuilder(sum).build();
                double result1 = calc.evaluate();
                sum = "=" + result1;
                textView.setText(sum);

                btnZero.setEnabled(false);
                btnOne.setEnabled(false);
                btnTwo.setEnabled(false);
                btnThree.setEnabled(false);
                btnFour.setEnabled(false);
                btnFive.setEnabled(false);
                btnSix.setEnabled(false);
                btnSeven.setEnabled(false);
                btnEight.setEnabled(false);
                btnNine.setEnabled(false);
            }
        });


        btnOpposite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt = textView.getText() + "";
                // Go to the first number in sequence and insert (- and ) to the end. IF (- is there, remove the -
                for (int i = txt.length() - 1; i >= 0; i--) {
                    if (i == 0) {
                        txt = "(-" + txt + ")";
                        break;
                    }
                    // Checks if it
                    if (!Character.isDigit(txt.charAt(i - 1)) && txt.charAt(i - 2) != ')') {
                        txt = txt.substring(0,i) +"(-" +txt.substring(i,txt.length())+")";
                        break;
                    }
                    if (!Character.isDigit(txt.charAt(i - 1)) && txt.charAt(i - 2) == ')') {
                        txt = txt.substring(0,i) +"(-" +txt.substring(i,txt.length())+")";
                        break;
                    }
                }
                textView.setText(txt);

            }
        });
        btnComma.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + ",";
                textView.setText(txt);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + "+";
                textView.setText(txt);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + "-";
                textView.setText(txt);
            }
        });
        btnTimes.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + "*";
                textView.setText(txt);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + "/";
                textView.setText(txt);
            }
        });
        btnPercentage.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + "%";
                textView.setText(txt);
            }
        });
        // Inserts brackets () dempending on the situation.
        btnBrackets.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                String txt = textView.getText() + "";
                for (int i = txt.length() - 1; i >= 0; i--) {
                    Log.d("tst", txt.length() + "");
                    if (i == 0) {
                        if (Character.isDigit(txt.charAt(txt.length() - 1))) {
                            txt += "*(";
                            break;
                        }
                        txt += "(";
                        break;
                    }
                    if (txt.charAt(i) == '(') {
                        txt += ")";
                        break;
                    }
                    if (txt.charAt(i) == ')') {
                        if (Character.isDigit(txt.charAt(txt.length() - 1))) {
                            txt += "*(";
                            break;
                        }
                        txt += "(";
                        break;
                    }
                }
                textView.setText(txt);
            }
        });


    }
}
