package com.amazon.alexa.api;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class AlexaServiceIntentFactory {
    static final String ACTION_CLIENT_STARTING_SERVICE = "ACTION_CLIENT_STARTING_SERVICE";
    static final String EXTRA_EXTENDED_CLIENT = "EXTRA_EXTENDED_CLIENT";
    static final String EXTRA_REQUIRES_FOREGROUND = "EXTRA_REQUIRES_FOREGROUND";

    public static Intent createIntent(ExtendedClient extendedClient, ComponentName componentName, boolean z) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.setAction("ACTION_CLIENT_STARTING_SERVICE");
        intent.putExtra("EXTRA_EXTENDED_CLIENT", extendedClient.getBundle());
        intent.putExtra("EXTRA_REQUIRES_FOREGROUND", z);
        return intent;
    }
}
