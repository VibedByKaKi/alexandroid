package com.amazon.alexa.handsfree.audio.features;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.audio.AlexaExperienceHelper;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AplAvailabilityResolver {
    private static final String TAG = "AplAvailabilityResolver";
    private final Context mContext;

    public AplAvailabilityResolver(Context context) {
        this.mContext = context;
    }

    @VisibleForTesting
    public synchronized boolean isAplEnabled(DeviceTypeInformationProvider deviceTypeInformationProvider) {
        boolean z;
        z = deviceTypeInformationProvider.getSupportedDeviceInformation(this.mContext).isFireOS() && !isGeminiAvailable();
        Log.d(TAG, "is Apl Enabled: " + z);
        return z;
    }

    @VisibleForTesting
    public boolean isGeminiAvailable() {
        return AlexaExperienceHelper.isGeminiAvailable(this.mContext);
    }

    public synchronized boolean isAplEnabled() {
        return isAplEnabled(DeviceTypeInformationProvider.getInstance(this.mContext));
    }
}
