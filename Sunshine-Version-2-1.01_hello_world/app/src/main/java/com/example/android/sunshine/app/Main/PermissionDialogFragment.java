package com.example.android.sunshine.app.Main;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.android.sunshine.app.R;

/**
 * Created by reyma on 22/12/2016.
 */
//se crea el fragmento, para implementarlo, se debe llamar + .show()
public class PermissionDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.permission_dialog_fragment).setTitle(R.string.permission_dialog_fragment_title);
        /*
        //cuando se necesita la interaccion del usuario puedo manejar los botones asi:

                    .setPositiveButton(R.string.permission_dialog_fragment_yes, new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog, int id) {

                        }
        })
                    .setNegativeButton(R.string.permission_dialog_fragment_no, new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog, int id) {

                        }
        });
        */
        return builder.create();
    }
}
