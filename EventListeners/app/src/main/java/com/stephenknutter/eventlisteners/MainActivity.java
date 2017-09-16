package com.stephenknutter.eventlisteners;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Button click handler
    public void onButtonClicked(View view) {
        AlertDialog alertDialog = createDialog("Hello, From Dialog Button", "Button");
        alertDialog.show();
    }

    // ToggleButton click handler
    public void onToggleButtonClicked(View view) {
        AlertDialog alertDialog;
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            alertDialog = createDialog("Toggle is ON", "ToggleButton");
        } else {
            alertDialog = createDialog("Toggle is OFF", "ToggleButton");
        }
        alertDialog.show();
    }

    // SwitchView click handler
    public void onSwitchClicked(View view) {
        AlertDialog alertDialog;
        boolean on = ((Switch) view).isChecked();
        if (on) {
            alertDialog = createDialog("Switch is ON", "SwitchView");
        } else {
            alertDialog = createDialog("Switch is OFF", "SwitchView");
        }
        alertDialog.show();
    }

    public void onCheckboxClicked(View view) {
        AlertDialog alertDialog;
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkbox_milk:
                if (checked) {
                    alertDialog = createDialog("Milk is checked", "CheckBox");
                } else {
                    alertDialog = createDialog("Milk is unchecked", "CheckBox");
                }
                break;
            case R.id.checkbox_sugar:
                if (checked) {
                    alertDialog = createDialog("Sugar is checked", "CheckBox");
                } else {
                    alertDialog = createDialog("Sugar is unchecked", "CheckBox");
                }
                break;
            default:
                alertDialog = createDialog("???", "CheckBox");
                break;

        }
        alertDialog.show();
    }

    // RadioButton click handler
    public void onRadioButtonClicked(View view) {
        AlertDialog alertDialog;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radio_caveman:
                alertDialog = createDialog("Caveman selected", "RadioButton");
                break;
            case R.id.radio_astronaut:
                alertDialog = createDialog("Astronaut selected", "RadioButton");
                break;
            default:
                alertDialog = createDialog("Radio Button", "RadioButton");
                break;
        }
        alertDialog.show();
    }

    // Spinner click handler
    public void onSpinnerSelect(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selected = String.valueOf(spinner.getSelectedItem());
        AlertDialog alertDialog = createDialog(selected, "Spinner");
        alertDialog.show();
    }

    // Creates AlertDialog
    private AlertDialog createDialog(String msg, String title) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(msg);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener()  {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        return alertDialog;
    }
}
