package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.SyncStateContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity implements View.OnClickListener {

    public String phoneNumber;

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bStar;
    private Button bDiez;
    private ImageButton bBackspace;
    private ImageButton bCall;
    private ImageButton bEnd;

    private EditText phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        phoneNumber = new String();

        phoneText = (EditText) findViewById(R.id.phone_number);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        bStar = (Button) findViewById(R.id.buttonstar);
        bDiez = (Button) findViewById(R.id.buttondiez);
        bBackspace = (ImageButton) findViewById(R.id.buttonbackspace);
        bCall = (ImageButton) findViewById(R.id.buttoncall);
        bEnd = (ImageButton) findViewById(R.id.buttonend);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bStar.setOnClickListener(this);
        bDiez.setOnClickListener(this);
        bBackspace.setOnClickListener(this);
        bCall.setOnClickListener(this);
        bEnd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                // do your code
                phoneNumber += '1';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button2:
                // do your code
                phoneNumber += '2';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button3:
                // do your code
                phoneNumber += '3';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button4:
                phoneNumber += '4';
                phoneText.setText(phoneNumber);
                // do your code
                break;

            case R.id.button5:
                // do your code
                phoneNumber += '5';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button6:
                // do your code
                phoneNumber += '6';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button7:
                // do your code
                phoneNumber += '7';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button8:
                // do your code
                phoneNumber += '8';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button9:
                // do your code
                phoneNumber += '9';
                phoneText.setText(phoneNumber);
                break;

            case R.id.button0:
                // do your code
                phoneNumber += '0';
                phoneText.setText(phoneNumber);
                break;

            case R.id.buttonstar:
                // do your code
                phoneNumber += '*';
                phoneText.setText(phoneNumber);
                break;

            case R.id.buttondiez:
                // do your code
                phoneNumber += '#';
                phoneText.setText(phoneNumber);
                break;

            case R.id.buttonbackspace:
                if (phoneNumber.length() > 0) {
                    phoneNumber = phoneNumber.substring(0, phoneNumber.length() - 1);
                    phoneText.setText(phoneNumber);
                }
                break;

            case R.id.buttoncall:
                    if (ContextCompat.checkSelfPermission(PhoneDialerActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(
                                PhoneDialerActivity.this,
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                    } else {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + phoneNumber.toString()));
                        startActivity(intent);
                    }
                break;

            case R.id.buttonend:
                    finish();
                break;
            default:
                break;
        }
    }
}
