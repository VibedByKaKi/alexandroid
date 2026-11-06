package com.amazon.alexa.handsfree.ui.views;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.enrollment.dialogs.AlertDialogFragment$$ExternalSyntheticLambda2;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"ValidFragment"})
/* loaded from: classes17.dex */
public class AlertDialogFragment extends DialogFragment {
    private static final String TAG = "AlertDialogFragment";

    @NonNull
    private OnDialogActionCallback mDialogActionCallback;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnDialogActionCallback {
        void onDismiss(String str, int i);

        void onNegativeButtonTap(String str, int i);

        void onPositiveButtonTap(String str, int i);
    }

    @SuppressLint({"ValidFragment"})
    public AlertDialogFragment(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull OnDialogActionCallback onDialogActionCallback) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("title", str);
        bundle.putSerializable("description", str2);
        bundle.putSerializable("positiveButtonString", str3);
        bundle.putSerializable("negativeButtonString", str4);
        setArguments(bundle);
        this.mDialogActionCallback = onDialogActionCallback;
    }

    private DialogInterface.OnClickListener getNegativeButtonClickListener(@NonNull String str, int i) {
        return new AlertDialogFragment$$ExternalSyntheticLambda0(this, str, i, 1);
    }

    private DialogInterface.OnClickListener getPositiveButtonClickListener(@NonNull String str, int i) {
        return new AlertDialogFragment$$ExternalSyntheticLambda0(this, str, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNegativeButtonClickListener$2(String str, int i, DialogInterface dialogInterface, int i2) {
        this.mDialogActionCallback.onNegativeButtonTap(str, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getPositiveButtonClickListener$1(String str, int i, DialogInterface dialogInterface, int i2) {
        this.mDialogActionCallback.onPositiveButtonTap(str, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateDialog$0(String str, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        String str2 = TAG;
        StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "Inside key event pressed: ", " key event: ");
        m0m.append(keyEvent.getAction());
        Log.i(str2, m0m.toString());
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Log.i(str2, "Inside onback pressed key event");
        this.mDialogActionCallback.onDismiss(str, getTargetRequestCode());
        dialogInterface.dismiss();
        return true;
    }

    @VisibleForTesting
    public Dialog createDialogWithOneButton(@NonNull Bundle bundle, @NonNull String str) {
        return getAlertDialogBuilder(bundle).setPositiveButton(bundle.getString("positiveButtonString"), getPositiveButtonClickListener(str, getTargetRequestCode())).create();
    }

    @VisibleForTesting
    public Dialog createDialogWithTwoButton(@NonNull Bundle bundle, @NonNull String str) {
        int targetRequestCode = getTargetRequestCode();
        return getAlertDialogBuilder(bundle).setPositiveButton(bundle.getString("positiveButtonString"), getPositiveButtonClickListener(str, targetRequestCode)).setNegativeButton(bundle.getString("negativeButtonString"), getNegativeButtonClickListener(str, targetRequestCode)).create();
    }

    @VisibleForTesting
    public AlertDialog.Builder getAlertDialogBuilder(@NonNull Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setTitle(bundle.getString("title")).setMessage(bundle.getString("description"));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(@NonNull Bundle bundle) {
        Dialog createDialogWithOneButton;
        String str = TAG;
        Log.i(str, "entering AlertDialogFragment onCreateDialog method");
        Bundle arguments = getArguments();
        String tag = getTag();
        String string = arguments.getString("positiveButtonString");
        String string2 = arguments.getString("negativeButtonString");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            createDialogWithOneButton = createDialogWithOneButton(arguments, tag);
        } else {
            Log.d(str, "Both positive and negative button is not null, showing two button dialog");
            createDialogWithOneButton = createDialogWithTwoButton(arguments, tag);
        }
        createDialogWithOneButton.setOnKeyListener(new AlertDialogFragment$$ExternalSyntheticLambda2(1, tag, this));
        createDialogWithOneButton.setCancelable(false);
        createDialogWithOneButton.setCanceledOnTouchOutside(false);
        return createDialogWithOneButton;
    }

    public void show(@NonNull Fragment fragment, @NonNull FragmentManager fragmentManager) {
        if (!fragment.isAdded()) {
            Log.e(TAG, "Fragment is not attached to activity, not showing alert dialog");
            return;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("dialog");
        if (findFragmentByTag != null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.commit();
        }
        setTargetFragment(fragment, 0);
        show(fragmentManager, "dialog");
    }
}
