package com.amazon.alexa.voice.handsfree.features;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.handsfree.R;
import com.amazon.alexa.voice.handsfree.utils.KetDeviceCheck;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AskAlexaShareSheetActivity extends Activity {
    private static final String ACTION_EXTERNAL_RA_AUTO_SEND = "amazon.intent.action.EXTERNAL_RA_AUTO_SEND";
    private static final String CATEGORY_APP_MODE = "com.amazon.alexa.intent.category.APP_MODE";
    private static final String CATEGORY_ASSIST_MODE = "com.amazon.alexa.intent.category.ASSIST_MODE";
    private static final String EXTRA_HINT = "hint";
    private static final String EXTRA_REFERER = "referer";
    private static final String KEY_ALEXA_WINDOW_BOUNDS = "alexa_window_bounds";
    private static final String KEY_LAUNCH_WINDOWING_MODE = "android.activity.windowingMode";
    private static final int MAX_TEXT_LENGTH = 500;
    private static final String REFERER_VALUE = "tablet-askalexa";
    private static final String TAG = "AskAlexaShareSheetActivity";
    private static final int WINDOWING_MODE_MULTI_WINDOW = 6;

    private Bundle applyConversationCategories(Intent intent) {
        String assistWindowBounds = getAssistWindowBounds();
        if (assistWindowBounds != null) {
            Rect unflattenFromString = Rect.unflattenFromString(assistWindowBounds);
            if (unflattenFromString == null) {
                Log.w(TAG, "Malformed alexa_window_bounds, falling back to app mode");
            } else {
                if (new Intent(ACTION_EXTERNAL_RA_AUTO_SEND).setPackage(getPackageName()).addCategory(CATEGORY_ASSIST_MODE).resolveActivity(getPackageManager()) != null) {
                    intent.addCategory(CATEGORY_ASSIST_MODE);
                    Bundle bundle = ActivityOptions.makeBasic().setLaunchBounds(unflattenFromString).toBundle();
                    bundle.putInt(KEY_LAUNCH_WINDOWING_MODE, 6);
                    return bundle;
                }
                Log.w(TAG, "ASSIST_MODE activity not found, falling back to app mode");
            }
        }
        if (new Intent(ACTION_EXTERNAL_RA_AUTO_SEND).setPackage(getPackageName()).addCategory(CATEGORY_APP_MODE).resolveActivity(getPackageManager()) != null) {
            intent.addCategory(CATEGORY_APP_MODE);
            return null;
        }
        Log.w(TAG, "APP_MODE activity not found, launching without category");
        return null;
    }

    private Intent buildBaseIntent(String str) {
        return new Intent(ACTION_EXTERNAL_RA_AUTO_SEND).setPackage(getPackageName()).putExtra("hint", str).putExtra("referer", REFERER_VALUE);
    }

    private String getAssistWindowBounds() {
        try {
            String string = Settings.Secure.getString(getContentResolver(), KEY_ALEXA_WINDOW_BOUNDS);
            if (string != null) {
                if (!string.isEmpty()) {
                    return string;
                }
            }
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Failed to read alexa_window_bounds", e);
            return null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!FireTabletUtils.isKHTablet()) {
            finish();
            return;
        }
        if (KetDeviceCheck.isKetDevice(getApplicationContext())) {
            Log.i(TAG, "Suppressing Ask Alexa PROCESS_TEXT action on KET device");
            finish();
            return;
        }
        CharSequence charSequenceExtra = getIntent().getCharSequenceExtra("android.intent.extra.PROCESS_TEXT");
        String trim = charSequenceExtra == null ? null : charSequenceExtra.toString().trim();
        if (trim == null || trim.isEmpty()) {
            Log.w(TAG, "No text received from PROCESS_TEXT intent");
            finish();
            return;
        }
        if (trim.length() > 500) {
            trim = trim.substring(0, 500);
        }
        Intent buildBaseIntent = buildBaseIntent(getApplicationContext().getString(R.string.ask_alexa_utterance_prefix) + " " + trim);
        try {
            startActivity(buildBaseIntent, applyConversationCategories(buildBaseIntent));
        } catch (ActivityNotFoundException e) {
            Log.e(TAG, "No activity found to handle auto-send intent", e);
        }
        finish();
    }
}
