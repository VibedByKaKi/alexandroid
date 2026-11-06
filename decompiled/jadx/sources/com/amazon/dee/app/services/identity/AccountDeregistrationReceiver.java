package com.amazon.dee.app.services.identity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AccountDeregistrationReceiver extends BroadcastReceiver {
    public static final String ACTION_PRIMARY_ACCOUNT_REMOVED = "com.amazon.dcp.sso.action.account.removed";
    public static final String ACTION_STREAMLINE_ACCOUNT_REMOVED = "com.amazon.identity.mobi.streamline.action.account.removed";
    public static final String PERMISSION_ACCOUNT_CHANGED = "com.amazon.dcp.sso.permission.account.changed";
    private static final String TAG = "AccountDeregistrationReceiver";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PrimaryAccountReceiver extends AccountDeregistrationReceiver {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class StreamlineReceiver extends AccountDeregistrationReceiver {
    }

    private void clearLegacySharedPrefs(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SHARED_PREFS", 0).edit();
        edit.remove(Constants.DIRECTED_ID_PREF);
        edit.remove(Constants.COMMS_ID_PREF);
        edit.remove(Constants.HASHED_COMMS_ID_PREF);
        edit.remove(Constants.USER_AOR_PREF);
        edit.remove(Constants.FIRST_NAME_PREF);
        edit.remove(Constants.LAST_NAME_PREF);
        edit.remove(Constants.PHONETIC_FIRST_NAME_PREF);
        edit.remove(Constants.PHONETIC_LAST_NAME_PREF);
        edit.remove(Constants.PHONE_NUMBER_PREF);
        edit.remove(Constants.HOMEGROUP_ID_PREF);
        edit.remove(Constants.EMAIL_PREF);
        edit.remove(Constants.HAS_DEVICES_PREF);
        edit.remove(Constants.OOBE_USER_DIRECTEDID);
        edit.remove(Constants.OOBE_COMMS_ID);
        edit.remove(Constants.OOBE_HASHED_COMMS_ID);
        edit.remove(Constants.OOBE_USER_AOR);
        edit.remove(Constants.OOBE_FNAME);
        edit.remove(Constants.OOBE_LNAME);
        edit.remove(Constants.OOBE_PHONETIC_FIRST_NAME);
        edit.remove(Constants.OOBE_PHONETIC_LAST_NAME);
        edit.remove(Constants.OOBE_PHONE_CODE);
        edit.remove(Constants.OOBE_PHONE_NUM);
        edit.remove(Constants.OOBE_USER_HOMEGROUP_ID);
        edit.remove(Constants.OOBE_IS_FNF);
        edit.remove(Constants.OOBE_COMMS_PROV);
        edit.remove(Constants.OOBE_SPEAKER_PROV);
        edit.remove(Constants.OOBE_COMMS_PROVISION_STATUS);
        edit.remove(Constants.OOBE_USER_PROVISION_STATUS);
        edit.commit();
    }

    private void clearV2IdentitySharedPrefs(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SHARED_PREFS_IDENTITY", 0).edit();
        edit.remove(Constants.DIRECTED_ID_PREF);
        edit.remove(Constants.COMMS_ID_PREF);
        edit.remove(Constants.HASHED_COMMS_ID_PREF);
        edit.remove(Constants.USER_AOR_PREF);
        edit.remove(Constants.FIRST_NAME_PREF);
        edit.remove(Constants.LAST_NAME_PREF);
        edit.remove(Constants.PHONETIC_FIRST_NAME_PREF);
        edit.remove(Constants.PHONETIC_LAST_NAME_PREF);
        edit.remove(Constants.PHONE_NUMBER_PREF);
        edit.remove(Constants.HOMEGROUP_ID_PREF);
        edit.remove(Constants.EMAIL_PREF);
        edit.remove(Constants.HAS_DEVICES_PREF);
        edit.remove(Constants.PROVISION_STATUS_PREF);
        edit.remove(Constants.MARKETPLACE_ID_PREF);
        edit.remove(Constants.COUNTRY_CODE_PREF);
        edit.remove(Constants.RESIDENCE_COUNTRY_PREF);
        edit.commit();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.w(TAG, "Ignoring null intent");
            return;
        }
        String action = intent.getAction();
        if (!"com.amazon.dcp.sso.action.account.removed".equals(action) && !"com.amazon.identity.mobi.streamline.action.account.removed".equals(action)) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m("Ignoring unexpected action: ", action, TAG);
            return;
        }
        clearLegacySharedPrefs(context);
        clearV2IdentitySharedPrefs(context);
        Log.i(TAG, "Cleared identity keys from both legacy and V2 (SHARED_PREFS_IDENTITY) SharedPreferences");
    }
}
