package com.amazon.alexa.voice.tta.typing;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.tta.TtaNavigator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultTtaNavigator implements TtaNavigator {
    private static final String ACTION_SHOW_ALEXA_VOICE_UI = "amazon.intent.action.SHOW_ALEXA_VOICE_UI";
    private static final String ALEXA_VOICE_ACTIVITY_CLASS_NAME = "com.amazon.alexa.voice.ui.VoiceActivity";
    static final Uri IN_APP_PAGE_BASE_URI = Uri.parse("https://alexa.amazon.com/spa/index.html");
    private static final String MAIN_MODE_ACTIVITY_NAME = "com.amazon.dee.app.ui.main.MainActivity";
    private static final String PACKAGE_NAME = "com.amazon.dee.app";
    static final String TAG = "DefaultTtaNavigator";

    @Override // com.amazon.alexa.voice.ui.tta.TtaNavigator
    public void navigateInApp(@NonNull Context context, @NonNull String str, @Nullable Map<String, String> map) {
        Uri.Builder path = new Uri.Builder().path(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                path.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String uri = path.build().toString();
        Intent intent = new Intent("android.intent.action.VIEW", IN_APP_PAGE_BASE_URI.buildUpon().encodedFragment(uri).build());
        intent.addFlags(131072);
        intent.setPackage(context.getPackageName());
        intent.addFlags(268435456);
        intent.setClassName("com.amazon.dee.app", "com.amazon.dee.app.ui.main.MainActivity");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "navigateInApp: Failed to open in-app page " + uri, e);
        }
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaNavigator
    public void navigateToExternalUrl(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "navigateToExternalUrl: Failed to open external URL " + str, e);
        }
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaNavigator
    public void openVoiceScrim(@NonNull Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), ALEXA_VOICE_ACTIVITY_CLASS_NAME));
        intent.setAction("amazon.intent.action.SHOW_ALEXA_VOICE_UI");
        intent.setFlags(67108864);
        context.startActivity(intent);
    }
}
