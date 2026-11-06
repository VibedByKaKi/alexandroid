package com.amazon.alexa.client.alexaservice.ui.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.AlexaStateChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.AlexaUserSpeechVolumeChangedEvent;
import com.amazon.alexa.utils.device.FireTabletUtils;
import java.util.function.BiConsumer;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda17;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SystemUiChromeStateObserver {

    @VisibleForTesting
    static final String CONTENT_AUTHORITY_SUFFIX = ".ra.chrome.renderer.provider";

    @VisibleForTesting
    static final String CONTENT_KEY_ALEXA_STATE = "alexaState";

    @VisibleForTesting
    static final String CONTENT_KEY_ALEXA_UI_STATE = "alexaUiState";

    @VisibleForTesting
    static final String CONTENT_KEY_VOLUME_LEVEL = "volumeLevel";
    private static final String TAG = "SystemUiChromeStateObserver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isRegistered = false;

    @Inject
    public SystemUiChromeStateObserver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$on$1(AlexaUserSpeechVolumeChangedEvent alexaUserSpeechVolumeChangedEvent, String str, ContentValues contentValues) {
        contentValues.put(str, Float.valueOf(alexaUserSpeechVolumeChangedEvent.getScaledVolume()));
    }

    private boolean updateUiChromeRendererProvider(String str, BiConsumer<String, ContentValues> biConsumer) {
        ContentResolver contentResolver = this.context.getContentResolver();
        ContentValues contentValues = new ContentValues(1);
        biConsumer.accept(str, contentValues);
        try {
            contentResolver.update(new Uri.Builder().scheme("content").authority(this.context.getPackageName() + ".ra.chrome.renderer.provider").appendPath("alexaUiState").build(), contentValues, null, null);
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Unable to update ui chrome renderer provider", e);
            return false;
        }
    }

    @Subscribe(sticky = true)
    public void on(AlexaStateChangedEvent alexaStateChangedEvent) {
        if (updateUiChromeRendererProvider("alexaState", new Functions$$ExternalSyntheticLambda17(alexaStateChangedEvent.getAlexaState().convertToExternalState().name(), 4))) {
            return;
        }
        Log.e(TAG, "Unable to send state change event to ui chrome renderer provider");
    }

    public void register() {
        if (FireTabletUtils.hasSystemUiVoiceChromeFeature(this.context)) {
            this.eventBus.register(this);
            this.isRegistered = true;
        }
    }

    public void unregister() {
        if (this.isRegistered) {
            this.eventBus.unregister(this);
            this.isRegistered = false;
        }
    }

    @Subscribe
    public void on(AlexaUserSpeechVolumeChangedEvent alexaUserSpeechVolumeChangedEvent) {
        if (updateUiChromeRendererProvider("volumeLevel", new Functions$$ExternalSyntheticLambda17(alexaUserSpeechVolumeChangedEvent, 3))) {
            return;
        }
        Log.e(TAG, "Unable to send volume change event to ui chrome renderer provider");
    }
}
