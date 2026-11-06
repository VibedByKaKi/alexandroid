package com.amazon.alexa.accessorykit.utils;

import android.content.Context;
import android.provider.Settings;
import com.amazon.alexa.accessory.internal.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class AlexaAvailabilityHelper {
    public static final String ALEXA_AVAILABILITY = "alexa_availability";
    private static final String TAG = "AlexaAvailabilityHelper:";
    public static final int UNAVAILABLE_NON_SUPPORTED_MARKETPLACE = 8;

    private AlexaAvailabilityHelper() {
    }

    private static int getAlexaAvailabilityValue(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "alexa_availability", 0);
    }

    public static boolean isAlexaUnavailableDueToUnsupportedMarketPlace(Context context) {
        int alexaAvailabilityValue = getAlexaAvailabilityValue(context);
        Logger.d("%s: Value for ALEXA_AVAILABILITY is: %d", TAG, Integer.valueOf(alexaAvailabilityValue));
        return (alexaAvailabilityValue & 8) == 8;
    }
}
