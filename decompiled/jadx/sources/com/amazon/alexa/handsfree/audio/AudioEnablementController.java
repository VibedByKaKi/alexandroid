package com.amazon.alexa.handsfree.audio;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.audio.features.ComponentEnablementResolver;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AudioEnablementController {
    static final String SHARED_PREFS_FILE = "com.amazon.alexa.handsfree.wakewordsettings";
    static final String SHARED_PREFS_WW_KEY = "ahf_disable_source";
    private static final String TAG = "AudioEnablementController";
    private ComponentEnablementResolver mComponentEnablementResolver;
    private Context mContext;
    private SharedPreferences mSharedPreferences;

    public AudioEnablementController(@NonNull Context context) {
        this.mContext = context;
        this.mSharedPreferences = context.getSharedPreferences(SHARED_PREFS_FILE, 0);
        this.mComponentEnablementResolver = new ComponentEnablementResolver(this.mContext);
    }

    public boolean shouldIgnoreAudio() {
        return this.mComponentEnablementResolver.isComponentEnabled(HandsFreeComponent.ENABLE_SYNCED_AHF_AND_IN_APP_WW) && this.mSharedPreferences.contains(SHARED_PREFS_WW_KEY);
    }

    public AudioEnablementController(@NonNull Context context, @NonNull SharedPreferences sharedPreferences, @Nullable ComponentEnablementResolver componentEnablementResolver) {
        this.mContext = context;
        this.mSharedPreferences = sharedPreferences;
        this.mComponentEnablementResolver = componentEnablementResolver;
    }
}
