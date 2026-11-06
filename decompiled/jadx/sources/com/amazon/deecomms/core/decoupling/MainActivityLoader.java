package com.amazon.deecomms.core.decoupling;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.dee.app.ui.main.MainActivity;
import com.amazon.deecomms.api.navigation.CommsView;
import com.amazon.deecomms.common.Constants;
import javax.inject.Inject;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MainActivityLoader {
    @Inject
    public MainActivityLoader() {
    }

    public boolean startMainActivity(@NonNull Context context, CommsView commsView) {
        String string;
        string = context.getSharedPreferences(Constants.MAIN_IN_FG, 0).getString(Constants.MAIN_IN_FG, Constants.GONE);
        string.getClass();
        switch (string) {
            case "BACKGROUND":
            case "GONE":
                try {
                    int i = MainActivity.$r8$clinit;
                    Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                    intent.setAction(Constants.COMMS_VOICE_NAV_ACTION);
                    intent.putExtra(Constants.COMMS_VOICE_NAV_ACTION, commsView.name());
                    intent.setFlags(131072);
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    return true;
                } catch (ClassNotFoundException e) {
                    Buffer$$ExternalSyntheticBUOutline0.m$3(e.getCause(), "Main activity not found: ");
                }
            case "FOREGROUND":
                return false;
            default:
                Log.w("MainActivityLoader", "The status of MainActivity was an unhandled value of ".concat(string));
                return false;
        }
    }
}
