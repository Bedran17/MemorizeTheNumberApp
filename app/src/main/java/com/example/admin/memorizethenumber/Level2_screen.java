package com.example.admin.memorizethenumber;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Level2_screen extends Activity {

    private List<String> level2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
    private CharSequence button_one;
    private CharSequence button_two;
    private CharSequence button_three;
    private CharSequence button_four;
    private CharSequence button_five;
    private CharSequence button_six;
    private CharSequence button_seven;
    private CharSequence button_eight;
    private CharSequence button_nine;
    private CharSequence button_ten;
    private CharSequence button_eleven;
    private CharSequence button_twelve;
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
        setContentView(R.layout.level2_screen);
        try {
            setButtons();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Button back = (Button) findViewById(R.id.level2_back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Select_level_screen.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button first_button = (Button) findViewById(R.id.level2_one);
        first_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_one)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_one)).setText(String.valueOf(tabix));
                }
            }
        });

        Button second_button = (Button) findViewById(R.id.level2_two);
        second_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_two)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_two)).setText(String.valueOf(tabix));
                }
            }
        });

        Button third_button = (Button) findViewById(R.id.level2_three);
        third_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_three)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_three)).setText(String.valueOf(tabix));
                }
            }
        });

        Button fourth_button = (Button) findViewById(R.id.level2_four);
        fourth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_four)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_four)).setText(String.valueOf(tabix));
                }
            }
        });

        Button fifth_button = (Button) findViewById(R.id.level2_five);
        fifth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_five)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_five)).setText(String.valueOf(tabix));
                }
            }
        });

        Button sixth_button = (Button) findViewById(R.id.level2_six);
        sixth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_six)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_six)).setText(String.valueOf(tabix));
                }
            }
        });

        Button seventh_button = (Button) findViewById(R.id.level2_seven);
        seventh_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_seven)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_seven)).setText(String.valueOf(tabix));
                }
            }
        });

        Button eight_button = (Button) findViewById(R.id.level2_eight);
        eight_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_eight)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_eight)).setText(String.valueOf(tabix));
                }
            }
        });

        Button ninth_button = (Button) findViewById(R.id.level2_nine);
        ninth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_nine)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_nine)).setText(String.valueOf(tabix));
                }
            }
        });

        Button tenth_button = (Button) findViewById(R.id.level2_ten);
        tenth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_ten)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_ten)).setText(String.valueOf(tabix));
                }
            }
        });

        Button eleventh_button = (Button) findViewById(R.id.level2_eleven);
        eleventh_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_eleven)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_eleven)).setText(String.valueOf(tabix));
                }
            }
        });

        Button twelvth_button = (Button) findViewById(R.id.level2_twelve);
        twelvth_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (activate_buttons == true && tabix < 12 && ((Button)findViewById(R.id.level2_twelve)).getText() == "") {
                    tabix = tabix + 1;
                    ((Button)findViewById(R.id.level2_twelve)).setText(String.valueOf(tabix));
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

        Collections.shuffle(level2);
        Iterator<String> it2 = level2.iterator();
        ((Button)findViewById(R.id.level2_one)).setText(it2.next());
        ((Button)findViewById(R.id.level2_two)).setText(it2.next());
        ((Button)findViewById(R.id.level2_three)).setText(it2.next());
        ((Button)findViewById(R.id.level2_four)).setText(it2.next());
        ((Button)findViewById(R.id.level2_five)).setText(it2.next());
        ((Button)findViewById(R.id.level2_six)).setText(it2.next());
        ((Button)findViewById(R.id.level2_seven)).setText(it2.next());
        ((Button)findViewById(R.id.level2_eight)).setText(it2.next());
        ((Button)findViewById(R.id.level2_nine)).setText(it2.next());
        ((Button)findViewById(R.id.level2_ten)).setText(it2.next());
        ((Button)findViewById(R.id.level2_eleven)).setText(it2.next());
        ((Button)findViewById(R.id.level2_twelve)).setText(it2.next());

        buffer();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((Button)findViewById(R.id.level2_one)).setText("");
                ((Button)findViewById(R.id.level2_two)).setText("");
                ((Button)findViewById(R.id.level2_three)).setText("");
                ((Button)findViewById(R.id.level2_four)).setText("");
                ((Button)findViewById(R.id.level2_five)).setText("");
                ((Button)findViewById(R.id.level2_six)).setText("");
                ((Button)findViewById(R.id.level2_seven)).setText("");
                ((Button)findViewById(R.id.level2_eight)).setText("");
                ((Button)findViewById(R.id.level2_nine)).setText("");
                ((Button)findViewById(R.id.level2_ten)).setText("");
                ((Button)findViewById(R.id.level2_eleven)).setText("");
                ((Button)findViewById(R.id.level2_twelve)).setText("");

                activate_buttons = true;

            }
        }, 10000);
    }

    public void buffer() {
        button_one = ((Button)findViewById(R.id.level2_one)).getText();
        button_two = ((Button)findViewById(R.id.level2_two)).getText();
        button_three = ((Button)findViewById(R.id.level2_three)).getText();
        button_four = ((Button)findViewById(R.id.level2_four)).getText();
        button_five = ((Button)findViewById(R.id.level2_five)).getText();
        button_six = ((Button)findViewById(R.id.level2_six)).getText();
        button_seven = ((Button)findViewById(R.id.level2_seven)).getText();
        button_eight = ((Button)findViewById(R.id.level2_eight)).getText();
        button_nine = ((Button)findViewById(R.id.level2_nine)).getText();
        button_ten = ((Button)findViewById(R.id.level2_ten)).getText();
        button_eleven = ((Button)findViewById(R.id.level2_nine)).getText();
        button_twelve = ((Button)findViewById(R.id.level2_nine)).getText();
    }

    public void showPopup(View view) {
        if (activate_buttons == true) {
            AlertDialog alertDialog = new AlertDialog.Builder(Level2_screen.this).create();
            alertDialog.setTitle("Result");
            if ((button_one == ((Button)findViewById(R.id.level2_one)).getText()) &&
                    (button_two == ((Button)findViewById(R.id.level2_two)).getText()) &&
                    (button_three == ((Button)findViewById(R.id.level2_three)).getText()) &&
                    (button_four == ((Button)findViewById(R.id.level2_four)).getText()) &&
                    (button_five == ((Button)findViewById(R.id.level2_five)).getText()) &&
                    (button_six == ((Button)findViewById(R.id.level2_six)).getText()) &&
                    (button_seven == ((Button)findViewById(R.id.level2_seven)).getText()) &&
                    (button_eight == ((Button)findViewById(R.id.level2_eight)).getText()) &&
                    (button_nine == ((Button)findViewById(R.id.level2_nine)).getText()) &&
                    (button_ten == ((Button)findViewById(R.id.level2_eight)).getText()) &&
                    (button_eleven == ((Button)findViewById(R.id.level2_eight)).getText()) &&
                    (button_twelve == ((Button)findViewById(R.id.level2_eight)).getText()) ) {

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
