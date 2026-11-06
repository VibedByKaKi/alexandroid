package com.amazon.alexa.mosaic.components;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Subscriber;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class ThemePreferenceSubscriber implements Subscriber {
    private static final String DEFAULT_THEME_OPTION = "system theme";
    private static final String TAG = "ThemePreferenceSubscriber";
    private static final String THEME_EVENT_PAYLOAD_KEY = "selectedTheme";
    private static final String THEME_PREFERENCE_ACTION = "ui:theme:preference";
    public static final String THEME_PREFERENCE_STORAGE_KEY = "userThemePreference";
    private static ThemePreferenceSubscriber instance;
    private final PersistentStorage persistentStorage;
    private final Runnable runOnUiThread;

    private ThemePreferenceSubscriber(Runnable runnable, PersistentStorage persistentStorage) {
        this.runOnUiThread = runnable;
        this.persistentStorage = persistentStorage;
    }

    public static ThemePreferenceSubscriber getInstance(Runnable runnable, PersistentStorage persistentStorage) {
        if (instance == null) {
            instance = new ThemePreferenceSubscriber(runnable, persistentStorage);
        }
        return instance;
    }

    private void updateUIonMainThread() {
        new Handler(Looper.getMainLooper()).post(this.runOnUiThread);
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public UUID getUUID() {
        return UUID.randomUUID();
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public void onMessageReceived(@NonNull Message message) {
        String eventType = message.getEventType();
        eventType.getClass();
        switch (eventType) {
            case "identity:signOut:success":
                ThemeUtil.resetAppTheme();
                break;
            case "identity:signIn:success":
                updateUIonMainThread();
                break;
            case "ui:theme:preference":
                try {
                    String optString = new JSONObject(message.getPayloadAsString()).optString(THEME_EVENT_PAYLOAD_KEY);
                    boolean equals = optString.equals(DEFAULT_THEME_OPTION);
                    PersistentStorage persistentStorage = this.persistentStorage;
                    if (equals) {
                        persistentStorage.edit().remove(THEME_PREFERENCE_STORAGE_KEY).commit();
                    } else {
                        persistentStorage.edit().set(THEME_PREFERENCE_STORAGE_KEY, optString).commit();
                    }
                    updateUIonMainThread();
                    break;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            default:
                Log.e(TAG, "Invalid error message");
                break;
        }
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public boolean supportsMessage(@NonNull Message message) {
        String eventType = message.getEventType();
        if (eventType == null) {
            return false;
        }
        switch (eventType) {
            case "identity:signOut:success":
            case "identity:signIn:success":
            case "ui:theme:preference":
                return true;
            default:
                return false;
        }
    }
}
