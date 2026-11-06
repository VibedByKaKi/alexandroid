package com.amazon.alexa.enrollment.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.alexa.enrollment.R;
import com.amazon.alexa.enrollment.dialogs.AlertDialogFragment;
import com.amazon.alexa.enrollment.dialogs.DialogConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PermissionsHelper {
    private static final String TAG = "VoxEn_PermissionsHelper";

    private void showPermissionsDialog(Fragment fragment, String str, String str2, int i) {
        if (!fragementAdded(fragment)) {
            Log.e(TAG, "Fragment is not added to an activity");
            return;
        }
        AlertDialogFragment createAlertDialogInstance = createAlertDialogInstance(str, str2, getStringResource(fragment, R.string.dialog_settings_button), getStringResource(fragment, R.string.dialog_dont_allow_button));
        createAlertDialogInstance.setTargetFragment(fragment, i);
        createAlertDialogInstance.show(getSupportFragmentManagerForActivity(fragment), DialogConstants.PERMISSIONS_FRAGMENT_TAG);
    }

    public boolean checkPermission(Context context, String str) {
        return checkSelfPermission(context, str) == 0;
    }

    @VisibleForTesting
    public int checkSelfPermission(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str);
    }

    @VisibleForTesting
    public AlertDialogFragment createAlertDialogInstance(String str, String str2, String str3, String str4) {
        return AlertDialogFragment.createInstance(str, str2, str3, str4);
    }

    @VisibleForTesting
    public boolean fragementAdded(Fragment fragment) {
        return fragment.isAdded();
    }

    @VisibleForTesting
    public String getStringResource(Fragment fragment, int i) {
        return fragment.getString(i);
    }

    @VisibleForTesting
    public FragmentManager getSupportFragmentManagerForActivity(Fragment fragment) {
        return fragment.getActivity().getSupportFragmentManager();
    }

    public void openAppSettingsPermissions(Fragment fragment) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + fragment.getContext().getPackageName()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        fragment.getContext().startActivity(intent);
    }

    public void requestPermission(Fragment fragment, String str, String str2, String[] strArr, int i) {
        if (fragment == null) {
            return;
        }
        int length = strArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (fragment.shouldShowRequestPermissionRationale(strArr[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        String str3 = TAG;
        ParcelCompat$$ExternalSyntheticOutline0.m(Arrays.toString(strArr), str3, new StringBuilder("Requesting Permissions "));
        if (z) {
            Log.i(str3, "User has checked the never show again. Requesting permission from the user by navigating to App Settings page");
            showPermissionsDialog(fragment, str, str2, i);
        } else {
            Log.i(str3, "Requesting permission from the user");
            requestPermission(fragment, strArr, i);
        }
    }

    @VisibleForTesting
    public void requestPermission(Fragment fragment, String[] strArr, int i) {
        fragment.requestPermissions(strArr, i);
    }
}
