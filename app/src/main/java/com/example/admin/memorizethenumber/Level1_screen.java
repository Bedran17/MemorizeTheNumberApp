package com.example.admin.memorizethenumber;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Level1_screen extends Activity {

    private List<String> level1 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
    private CharSequence button_one;
    private CharSequence button_two;
    private CharSequence button_three;
    private CharSequence button_four;
    private CharSequence button_five;
    private CharSequence button_six;
    private CharSequence button_seven;
    private CharSequence button_eight;
    private CharSequence button_nine;
    private int tabix;
    private boolean activate_buttons;

    //shake
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;

    private Handler handler = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1_screen);
        try {
            setButtons();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Button back = (Button) findViewById(R.id.level1_back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Select_level_screen.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button first_button = (Button) findViewById(R.id.level1_one);
        first_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_one)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_one)).setText(String.valueOf(tabix));
                }
            }
        });

        Button second_button = (Button) findViewById(R.id.level1_two);
        second_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_two)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button) findViewById(R.id.level1_two)).setText(String.valueOf(tabix));
                }
            }
        });

        Button third_button = (Button) findViewById(R.id.level1_three);
        third_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_three)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_three)).setText(String.valueOf(tabix));
                }
            }
        });

        Button fourth_button = (Button) findViewById(R.id.level1_four);
        fourth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_four)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_four)).setText(String.valueOf(tabix));
                }
            }
        });

        Button fifth_button = (Button) findViewById(R.id.level1_five);
        fifth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_five)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_five)).setText(String.valueOf(tabix));
                }
            }
        });

        Button sixth_button = (Button) findViewById(R.id.level1_six);
        sixth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_six)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_six)).setText(String.valueOf(tabix));
                }
            }
        });

        Button seventh_button = (Button) findViewById(R.id.level1_seven);
        seventh_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_seven)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_seven)).setText(String.valueOf(tabix));
                }
            }
        });

        Button eight_button = (Button) findViewById(R.id.level1_eight);
        eight_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_eight)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_eight)).setText(String.valueOf(tabix));
                }
            }
        });

        Button ninth_button = (Button) findViewById(R.id.level1_nine);
        ninth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 9 && ((Button)findViewById(R.id.level1_nine)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level1_nine)).setText(String.valueOf(tabix));
                }
            }
        });

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) throws InterruptedException {
                handleShakeEvent();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        mSensorManager.registerListener(mShakeDetector, mAccelerometer,	SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }

    private void handleShakeEvent() throws InterruptedException {
        setButtons();
    }

    public void setButtons() throws InterruptedException {

        handler.removeCallbacksAndMessages(null);
        tabix = 0;
        activate_buttons = false;

        Collections.shuffle(level1);
        Iterator<String> it1 = level1.iterator();
        ((Button)findViewById(R.id.level1_one)).setText(it1.next());
        ((Button)findViewById(R.id.level1_two)).setText(it1.next());
        ((Button)findViewById(R.id.level1_three)).setText(it1.next());
        ((Button)findViewById(R.id.level1_four)).setText(it1.next());
        ((Button)findViewById(R.id.level1_five)).setText(it1.next());
        ((Button)findViewById(R.id.level1_six)).setText(it1.next());
        ((Button)findViewById(R.id.level1_seven)).setText(it1.next());
        ((Button)findViewById(R.id.level1_eight)).setText(it1.next());
        ((Button)findViewById(R.id.level1_nine)).setText(it1.next());

        buffer();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((Button)findViewById(R.id.level1_one)).setText("");
                ((Button)findViewById(R.id.level1_one)).setText("");
                ((Button)findViewById(R.id.level1_two)).setText("");
                ((Button)findViewById(R.id.level1_three)).setText("");
                ((Button)findViewById(R.id.level1_four)).setText("");
                ((Button)findViewById(R.id.level1_five)).setText("");
                ((Button)findViewById(R.id.level1_six)).setText("");
                ((Button)findViewById(R.id.level1_seven)).setText("");
                ((Button)findViewById(R.id.level1_eight)).setText("");
                ((Button)findViewById(R.id.level1_nine)).setText("");

                activate_buttons = true;

            }
        }, 10000);
    }

    public void buffer() {
        button_one = ((Button)findViewById(R.id.level1_one)).getText();
        button_two = ((Button)findViewById(R.id.level1_two)).getText();
        button_three = ((Button)findViewById(R.id.level1_three)).getText();
        button_four = ((Button)findViewById(R.id.level1_four)).getText();
        button_five = ((Button)findViewById(R.id.level1_five)).getText();
        button_six = ((Button)findViewById(R.id.level1_six)).getText();
        button_seven = ((Button)findViewById(R.id.level1_seven)).getText();
        button_eight = ((Button)findViewById(R.id.level1_eight)).getText();
        button_nine = ((Button)findViewById(R.id.level1_nine)).getText();
    }

    public void showPopup(View view) {
        if (activate_buttons == true) {
            AlertDialog alertDialog = new AlertDialog.Builder(Level1_screen.this).create();
            alertDialog.setTitle("Result");
            if ((button_one == ((Button)findViewById(R.id.level1_one)).getText()) &&
                    (button_two == ((Button)findViewById(R.id.level1_two)).getText()) &&
                    (button_three == ((Button)findViewById(R.id.level1_three)).getText()) &&
                    (button_four == ((Button)findViewById(R.id.level1_four)).getText()) &&
                    (button_five == ((Button)findViewById(R.id.level1_five)).getText()) &&
                    (button_six == ((Button)findViewById(R.id.level1_six)).getText()) &&
                    (button_seven == ((Button)findViewById(R.id.level1_seven)).getText()) &&
                    (button_eight == ((Button)findViewById(R.id.level1_eight)).getText()) &&
                    (button_nine == ((Button)findViewById(R.id.level1_nine)).getText())) {

                alertDialog.setMessage("Congratulations! You win! :)");
            } else {
                alertDialog.setMessage("Unfortunately there are some differences :(");
            }
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    }
}
