package com.example.android.cisco;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    String arRespuesta = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText control = (EditText) findViewById(R.id.edit_control);
                String n = control.getText().toString();
                EditText t1 = (EditText) findViewById(R.id.texQ5);
                EditText t2 = (EditText) findViewById(R.id.texQ9);
                arRespuesta = "Numero de control: " + n + " \n";
                arRespuesta += "1.- " + q1 + " \n";
                arRespuesta += "2.- " + q2 + " \n";
                arRespuesta += "3.- " + q3 + " \n";
                arRespuesta += "4.- " + arRespuestaT + " \n";
                arRespuesta += "5.- " + t1.getText().toString() + " \n";
                arRespuesta += "6.- " + q6 + " \n";
                arRespuesta += "7.- " + q7 + " \n";
                arRespuesta += "8.- " + q8 + " \n";
                arRespuesta += "9.- " + t2.getText().toString() + " \n";
                arRespuesta += "10.- " + ArRespuestaT10;

                File internalStorageDir = getFilesDir();

                File alice = new File(internalStorageDir, "txt.csv");
                try {
                    // Create file output stream
                    FileOutputStream fos = new FileOutputStream(alice);
// Write a line to the file
                    fos.write("Alice,25,1".getBytes());
// Close the file output stream
                    fos.close();
                } catch (java.io.IOException ex) {

                }


                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"levy@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Respuestas Examen CCNA 4 Capitulo 1");
                intent.putExtra(Intent.EXTRA_TEXT, arRespuesta);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                Toast.makeText(getApplicationContext(), arRespuesta, Toast.LENGTH_LONG).show();

            }
        });


    }


    String q1, q2, q3, q5, q6, q7, q8, q9, arRespuestaT, ArRespuestaT10;


    public void RadioButtonQ1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        RadioButton r11 = (RadioButton) findViewById(R.id.R11);
        RadioButton r12 = (RadioButton) findViewById(R.id.R12);
        RadioButton r13 = (RadioButton) findViewById(R.id.R12);
        RadioButton r14 = (RadioButton) findViewById(R.id.R12);


        switch (view.getId()) {
            case R.id.R11:
                if (checked)


                    q1 = r11.getText().toString();

                break;
            case R.id.R12:
                if (checked)
                    q1 = r12.getText().toString();
                break;
            case R.id.R13:
                if (checked)
                    q1 = r13.getText().toString();
                break;
            case R.id.R14:
                if (checked)
                    q1 = r14.getText().toString();
                break;
        }


    }


    public void RadioButtonQ2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        RadioButton r21 = (RadioButton) findViewById(R.id.R21);
        RadioButton r22 = (RadioButton) findViewById(R.id.R22);
        RadioButton r23 = (RadioButton) findViewById(R.id.R22);
        RadioButton r24 = (RadioButton) findViewById(R.id.R22);


        switch (view.getId()) {
            case R.id.R21:
                if (checked)


                    q2 = r21.getText().toString();

                break;
            case R.id.R22:
                if (checked)
                    q2 = r22.getText().toString();
                break;
            case R.id.R23:
                if (checked)
                    q2 = r23.getText().toString();
                break;
            case R.id.R24:
                if (checked)
                    q2 = r24.getText().toString();
                break;
        }


    }


    public void RadioButtonQ3(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        RadioButton r1 = (RadioButton) findViewById(R.id.R31);
        RadioButton r2 = (RadioButton) findViewById(R.id.R32);
        RadioButton r3 = (RadioButton) findViewById(R.id.R32);
        RadioButton r4 = (RadioButton) findViewById(R.id.R32);


        switch (view.getId()) {
            case R.id.R31:
                if (checked)


                    q3 = r1.getText().toString();

                break;
            case R.id.R32:
                if (checked)
                    q3 = r2.getText().toString();
                break;
            case R.id.R33:
                if (checked)
                    q3 = r3.getText().toString();
                break;
            case R.id.R34:
                if (checked)
                    q3 = r4.getText().toString();
                break;
        }


    }

    public void RadioButtonQ6(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        RadioButton r1 = (RadioButton) findViewById(R.id.R61);
        RadioButton r2 = (RadioButton) findViewById(R.id.R62);
        RadioButton r3 = (RadioButton) findViewById(R.id.R63);
        RadioButton r4 = (RadioButton) findViewById(R.id.R64);


        switch (view.getId()) {
            case R.id.R61:
                if (checked)


                    q6 = r1.getText().toString();

                break;
            case R.id.R62:
                if (checked)
                    q6 = r2.getText().toString();
                break;
            case R.id.R63:
                if (checked)
                    q6 = r3.getText().toString();
                break;
            case R.id.R64:
                if (checked)
                    q6 = r4.getText().toString();
                break;
        }


    }


    public void RadioButtonQ7(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        RadioButton r1 = (RadioButton) findViewById(R.id.R71);
        RadioButton r2 = (RadioButton) findViewById(R.id.R72);
        RadioButton r3 = (RadioButton) findViewById(R.id.R73);
        RadioButton r4 = (RadioButton) findViewById(R.id.R74);


        switch (view.getId()) {
            case R.id.R71:
                if (checked)


                    q7 = r1.getText().toString();

                break;
            case R.id.R72:
                if (checked)
                    q7 = r2.getText().toString();
                break;
            case R.id.R73:
                if (checked)
                    q7 = r3.getText().toString();
                break;
            case R.id.R74:
                if (checked)
                    q7 = r4.getText().toString();
                break;
        }


    }


    public void RadioButtonQ8(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        RadioButton r1 = (RadioButton) findViewById(R.id.R81);
        RadioButton r2 = (RadioButton) findViewById(R.id.R82);
        RadioButton r3 = (RadioButton) findViewById(R.id.R83);
        RadioButton r4 = (RadioButton) findViewById(R.id.R84);


        switch (view.getId()) {
            case R.id.R81:
                if (checked)


                    q8 = r1.getText().toString();

                break;
            case R.id.R82:
                if (checked)
                    q8 = r2.getText().toString();
                break;
            case R.id.R83:
                if (checked)
                    q8 = r3.getText().toString();
                break;
            case R.id.R84:
                if (checked)
                    q8 = r4.getText().toString();
                break;
        }


    }


    public void onCheckboxQ1(View view) {

        CheckBox R41 = (CheckBox) findViewById(R.id.R41);
        CheckBox R42 = (CheckBox) findViewById(R.id.R42);
        CheckBox R43 = (CheckBox) findViewById(R.id.R43);
        CheckBox R44 = (CheckBox) findViewById(R.id.R44);


        if (R41.isChecked() && R42.isChecked()) {

            R43.setEnabled(false);
            R44.setEnabled(false);

            arRespuestaT = R41.getText().toString();
            arRespuestaT += "\n" + R42.getText().toString();

        }

        if (R41.isChecked() && R43.isChecked()) {

            R42.setEnabled(false);
            R44.setEnabled(false);

            arRespuestaT = R41.getText().toString();
            arRespuestaT += "\n" + R43.getText().toString();

        }

        if (R41.isChecked() && R44.isChecked()) {


            R43.setEnabled(false);
            R42.setEnabled(false);

            arRespuestaT = R41.getText().toString();
            arRespuestaT += "\n" + R44.getText().toString();
        }
        if (R41.isChecked()) {
            if (R42.isChecked()) {
            } else {
                if (R43.isChecked()) {
                } else {
                    if (R44.isChecked()) {
                    } else {
                        R42.setEnabled(true);
                        R43.setEnabled(true);
                        R44.setEnabled(true);
                    }
                }
            }

        } else {
            if (R42.isChecked()) {
                R44.setEnabled(true);
                R43.setEnabled(true);
            } else {
                R42.setEnabled(true);
                if (R43.isChecked()) {
                    R42.setEnabled(true);
                    R44.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R44.isChecked()) {
                        R43.setEnabled(true);
                        R42.setEnabled(true);
                    } else {
                        R44.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxQ2(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.R41);
        CheckBox R42 = (CheckBox) findViewById(R.id.R42);
        CheckBox R43 = (CheckBox) findViewById(R.id.R43);
        CheckBox R44 = (CheckBox) findViewById(R.id.R44);


        if (R42.isChecked() && R41.isChecked()) {


            R43.setEnabled(false);
            R44.setEnabled(false);

            arRespuestaT = R42.getText().toString();
            arRespuestaT += "\n" + R41.getText().toString();

        }

        if (R42.isChecked() && R43.isChecked()) {


            R41.setEnabled(false);
            R44.setEnabled(false);

            arRespuestaT = R42.getText().toString();
            arRespuestaT += "\n" + R43.getText().toString();
        }

        if (R42.isChecked() && R44.isChecked()) {


            R43.setEnabled(false);
            R41.setEnabled(false);

            arRespuestaT = R42.getText().toString();
            arRespuestaT += "\n" + R44.getText().toString();

        }
        if (R42.isChecked()) {
            if (R41.isChecked()) {
            } else {
                if (R43.isChecked()) {
                } else {
                    if (R44.isChecked()) {
                    } else {
                        R41.setEnabled(true);
                        R43.setEnabled(true);
                        R44.setEnabled(true);
                    }
                }
            }

        } else {
            if (R41.isChecked()) {
                R44.setEnabled(true);
                R43.setEnabled(true);
            } else {
                R41.setEnabled(true);
                if (R43.isChecked()) {
                    R41.setEnabled(true);
                    R44.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R44.isChecked()) {
                        R43.setEnabled(true);
                        R41.setEnabled(true);
                    } else {
                        R44.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxQ3(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.R41);
        CheckBox R42 = (CheckBox) findViewById(R.id.R42);
        CheckBox R43 = (CheckBox) findViewById(R.id.R43);
        CheckBox R44 = (CheckBox) findViewById(R.id.R44);


        if (R43.isChecked() && R41.isChecked()) {


            R42.setEnabled(false);
            R44.setEnabled(false);

            arRespuestaT = R43.getText().toString();
            arRespuestaT += "\n" + R41.getText().toString();

        }

        if (R43.isChecked() && R42.isChecked()) {


            R41.setEnabled(false);
            R44.setEnabled(false);

            arRespuestaT = R43.getText().toString();
            arRespuestaT += "\n" + R42.getText().toString();

        }

        if (R43.isChecked() && R44.isChecked()) {


            R41.setEnabled(false);
            R42.setEnabled(false);
            arRespuestaT = R43.getText().toString();
            arRespuestaT += "\n" + R44.getText().toString();

        }
        if (R43.isChecked()) {
            if (R42.isChecked()) {
            } else {
                if (R41.isChecked()) {
                } else {
                    if (R44.isChecked()) {
                    } else {
                        R42.setEnabled(true);
                        R41.setEnabled(true);
                        R44.setEnabled(true);
                    }
                }
            }

        } else {
            if (R42.isChecked()) {
                R44.setEnabled(true);
                R41.setEnabled(true);
            } else {
                R42.setEnabled(true);
                if (R41.isChecked()) {
                    R42.setEnabled(true);
                    R44.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R44.isChecked()) {
                        R41.setEnabled(true);
                        R42.setEnabled(true);
                    } else {
                        R44.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxQ4(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.R41);
        CheckBox R42 = (CheckBox) findViewById(R.id.R42);
        CheckBox R43 = (CheckBox) findViewById(R.id.R43);
        CheckBox R44 = (CheckBox) findViewById(R.id.R44);


        if (R44.isChecked() && R42.isChecked()) {


            R43.setEnabled(false);
            R41.setEnabled(false);

            arRespuestaT = R44.getText().toString();
            arRespuestaT += "\n" + R42.getText().toString();

        }

        if (R44.isChecked() && R43.isChecked()) {


            R42.setEnabled(false);
            R41.setEnabled(false);

            arRespuestaT = R44.getText().toString();
            arRespuestaT += "\n" + R43.getText().toString();

        }

        if (R44.isChecked() && R41.isChecked()) {


            R43.setEnabled(false);
            R42.setEnabled(false);

            arRespuestaT = R44.getText().toString();
            arRespuestaT += "\n" + R41.getText().toString();
        }
        if (R44.isChecked()) {
            if (R42.isChecked()) {
            } else {
                if (R43.isChecked()) {
                } else {
                    if (R41.isChecked()) {
                    } else {
                        R42.setEnabled(true);
                        R43.setEnabled(true);
                        R41.setEnabled(true);
                    }
                }
            }

        } else {
            if (R42.isChecked()) {
                R41.setEnabled(true);
                R43.setEnabled(true);
            } else {
                R42.setEnabled(true);
                if (R43.isChecked()) {
                    R42.setEnabled(true);
                    R41.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R41.isChecked()) {
                        R43.setEnabled(true);
                        R42.setEnabled(true);
                    } else {
                        R41.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxR10_1(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.ch10_1);
        CheckBox R42 = (CheckBox) findViewById(R.id.ch10_2);
        CheckBox R43 = (CheckBox) findViewById(R.id.ch10_3);
        CheckBox R44 = (CheckBox) findViewById(R.id.ch10_4);
        if (R41.isChecked() && R42.isChecked()) {


            R43.setEnabled(false);
            R44.setEnabled(false);

            ArRespuestaT10 = R41.getText().toString();
            ArRespuestaT10 += R42.getText().toString();

        }

        if (R41.isChecked() && R43.isChecked()) {


            R42.setEnabled(false);
            R44.setEnabled(false);

            ArRespuestaT10 = R41.getText().toString();
            ArRespuestaT10 += R43.getText().toString();

        }

        if (R41.isChecked() && R44.isChecked()) {


            R43.setEnabled(false);
            R42.setEnabled(false);

            ArRespuestaT10 = R41.getText().toString();
            ArRespuestaT10 += R44.getText().toString();

        }
        if (R41.isChecked()) {
            if (R42.isChecked()) {
            } else {
                if (R43.isChecked()) {
                } else {
                    if (R44.isChecked()) {
                    } else {
                        R42.setEnabled(true);
                        R43.setEnabled(true);
                        R44.setEnabled(true);
                    }
                }
            }

        } else {
            if (R42.isChecked()) {
                R44.setEnabled(true);
                R43.setEnabled(true);
            } else {
                R42.setEnabled(true);
                if (R43.isChecked()) {
                    R42.setEnabled(true);
                    R44.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R44.isChecked()) {
                        R43.setEnabled(true);
                        R42.setEnabled(true);
                    } else {
                        R44.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxR10_2(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.ch10_1);
        CheckBox R42 = (CheckBox) findViewById(R.id.ch10_2);
        CheckBox R43 = (CheckBox) findViewById(R.id.ch10_3);
        CheckBox R44 = (CheckBox) findViewById(R.id.ch10_4);
        if (R42.isChecked() && R41.isChecked()) {


            R43.setEnabled(false);
            R44.setEnabled(false);

            ArRespuestaT10 = R42.getText().toString();
            ArRespuestaT10 += R41.getText().toString();

        }

        if (R42.isChecked() && R43.isChecked()) {


            R41.setEnabled(false);
            R44.setEnabled(false);

            ArRespuestaT10 = R42.getText().toString();
            ArRespuestaT10 += R43.getText().toString();

        }

        if (R42.isChecked() && R44.isChecked()) {


            R43.setEnabled(false);
            R41.setEnabled(false);

            ArRespuestaT10 = R42.getText().toString();
            ArRespuestaT10 += R44.getText().toString();

        }
        if (R42.isChecked()) {
            if (R41.isChecked()) {
            } else {
                if (R43.isChecked()) {
                } else {
                    if (R44.isChecked()) {
                    } else {
                        R41.setEnabled(true);
                        R43.setEnabled(true);
                        R44.setEnabled(true);
                    }
                }
            }

        } else {
            if (R41.isChecked()) {
                R44.setEnabled(true);
                R43.setEnabled(true);
            } else {
                R41.setEnabled(true);
                if (R43.isChecked()) {
                    R41.setEnabled(true);
                    R44.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R44.isChecked()) {
                        R43.setEnabled(true);
                        R41.setEnabled(true);
                    } else {
                        R44.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxR10_3(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.ch10_1);
        CheckBox R42 = (CheckBox) findViewById(R.id.ch10_2);
        CheckBox R43 = (CheckBox) findViewById(R.id.ch10_3);
        CheckBox R44 = (CheckBox) findViewById(R.id.ch10_4);
        if (R43.isChecked() && R42.isChecked()) {


            R41.setEnabled(false);
            R44.setEnabled(false);


            ArRespuestaT10 = R43.getText().toString();
            ArRespuestaT10 += R42.getText().toString();

        }

        if (R43.isChecked() && R41.isChecked()) {


            R42.setEnabled(false);
            R44.setEnabled(false);

            ArRespuestaT10 = R43.getText().toString();
            ArRespuestaT10 += R41.getText().toString();

        }

        if (R43.isChecked() && R44.isChecked()) {


            R41.setEnabled(false);
            R42.setEnabled(false);

            ArRespuestaT10 = R43.getText().toString();
            ArRespuestaT10 += R44.getText().toString();

        }
        if (R43.isChecked()) {
            if (R42.isChecked()) {
            } else {
                if (R41.isChecked()) {
                } else {
                    if (R44.isChecked()) {
                    } else {
                        R42.setEnabled(true);
                        R41.setEnabled(true);
                        R44.setEnabled(true);
                    }
                }
            }

        } else {
            if (R42.isChecked()) {
                R44.setEnabled(true);
                R41.setEnabled(true);
            } else {
                R42.setEnabled(true);
                if (R41.isChecked()) {
                    R42.setEnabled(true);
                    R44.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R44.isChecked()) {
                        R41.setEnabled(true);
                        R42.setEnabled(true);
                    } else {
                        R44.setEnabled(true);
                    }
                }
            }
        }


    }


    public void onCheckboxR10_4(View view) {
        CheckBox R41 = (CheckBox) findViewById(R.id.ch10_1);
        CheckBox R42 = (CheckBox) findViewById(R.id.ch10_2);
        CheckBox R43 = (CheckBox) findViewById(R.id.ch10_3);
        CheckBox R44 = (CheckBox) findViewById(R.id.ch10_4);
        if (R44.isChecked() && R42.isChecked()) {


            R43.setEnabled(false);
            R41.setEnabled(false);

            ArRespuestaT10 = R44.getText().toString();
            ArRespuestaT10 += R42.getText().toString();

        }

        if (R44.isChecked() && R43.isChecked()) {


            R42.setEnabled(false);
            R41.setEnabled(false);

            ArRespuestaT10 = R44.getText().toString();
            ArRespuestaT10 += R43.getText().toString();

        }

        if (R44.isChecked() && R41.isChecked()) {


            R43.setEnabled(false);
            R42.setEnabled(false);

            ArRespuestaT10 = R44.getText().toString();
            ArRespuestaT10 += R41.getText().toString();
        }
        if (R44.isChecked()) {
            if (R42.isChecked()) {
            } else {
                if (R43.isChecked()) {
                } else {
                    if (R41.isChecked()) {
                    } else {
                        R42.setEnabled(true);
                        R43.setEnabled(true);
                        R41.setEnabled(true);
                    }
                }
            }

        } else {
            if (R42.isChecked()) {
                R41.setEnabled(true);
                R43.setEnabled(true);
            } else {
                R42.setEnabled(true);
                if (R43.isChecked()) {
                    R42.setEnabled(true);
                    R41.setEnabled(true);
                } else {
                    R43.setEnabled(true);
                    if (R41.isChecked()) {
                        R43.setEnabled(true);
                        R42.setEnabled(true);
                    } else {
                        R41.setEnabled(true);
                    }
                }
            }
        }


    }


}
