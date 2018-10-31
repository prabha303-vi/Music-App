package com.prabha.player.Dialogs;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.prabha.player.R;

/**
 * Created by Prabha Raj on 8/4/2018.
 */

public class PropertiesDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_properties, null);
        builder.setView(view);
        builder.setTitle(R.string.properties);
        builder.setPositiveButton(R.string.ok, (dialog, which) -> dialog.dismiss());
        return builder.create();
    }
}
