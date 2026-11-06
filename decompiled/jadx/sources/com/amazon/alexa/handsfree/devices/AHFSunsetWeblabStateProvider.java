package com.amazon.alexa.handsfree.devices;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AHFSunsetWeblabStateProvider {

    @VisibleForTesting
    static final String AHF_SUNSET_STATE_PREFERENCE = "AHFSUNSET";

    @VisibleForTesting
    static final String REMOVE_AHF_FOR_ALL_CUSTOMERS = HandsFreeComponent.REMOVE_AHF_FOR_ALL_CUSTOMERS.name();
    private static AHFSunsetWeblabStateProvider mInstance;
    private SharedPreferences mAHFSunsetPreferences = null;
    private final Context mContext;

    @VisibleForTesting
    public AHFSunsetWeblabStateProvider(Context context) {
        this.mContext = context;
    }

    public static synchronized AHFSunsetWeblabStateProvider getInstance(Context context) {
        AHFSunsetWeblabStateProvider aHFSunsetWeblabStateProvider;
        synchronized (AHFSunsetWeblabStateProvider.class) {
            try {
                if (mInstance == null) {
                    mInstance = new AHFSunsetWeblabStateProvider(context);
                }
                aHFSunsetWeblabStateProvider = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aHFSunsetWeblabStateProvider;
    }

    public synchronized boolean getAHFSunsetWeblabState(@NonNull HandsFreeComponent handsFreeComponent) {
        try {
            Context applicationContext = this.mContext.getApplicationContext();
            if (this.mAHFSunsetPreferences == null && applicationContext != null) {
                this.mAHFSunsetPreferences = applicationContext.getSharedPreferences(AHF_SUNSET_STATE_PREFERENCE, 0);
            }
            SharedPreferences sharedPreferences = this.mAHFSunsetPreferences;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(handsFreeComponent.name(), false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateAHFSunsetWeblabState(@NonNull HandsFreeComponent handsFreeComponent, boolean z) {
        try {
            Context applicationContext = this.mContext.getApplicationContext();
            if (this.mAHFSunsetPreferences == null && applicationContext != null) {
                this.mAHFSunsetPreferences = applicationContext.getSharedPreferences(AHF_SUNSET_STATE_PREFERENCE, 0);
            }
            SharedPreferences sharedPreferences = this.mAHFSunsetPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(handsFreeComponent.name(), z).apply();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
