package com.amazon.alexa.api;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class UserInterfaceOptionsUtils {
    public static final AlexaUserInterfaceOptions DEFAULT = AlexaUserInterfaceOptions.builder().build();

    private UserInterfaceOptionsUtils() {
        throw new UnsupportedOperationException();
    }

    public static AlexaUserInterfaceOptions fromBundle(Bundle bundle) {
        return new AlexaUserInterfaceOptions(bundle);
    }

    public static Bundle getBundle(AlexaUserInterfaceOptions alexaUserInterfaceOptions) {
        return alexaUserInterfaceOptions.getBundle();
    }
}
