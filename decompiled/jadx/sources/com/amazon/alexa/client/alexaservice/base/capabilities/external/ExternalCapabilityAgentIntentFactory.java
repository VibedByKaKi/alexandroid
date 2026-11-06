package com.amazon.alexa.client.alexaservice.base.capabilities.external;

import android.content.ComponentName;
import android.content.Intent;
import com.amazon.alexa.api.ExtendedClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalCapabilityAgentIntentFactory {
    private static final String EXTRA_CLIENT = "EXTRA_CLIENT";
    private static final String EXTRA_EXTENDED_CLIENT = "EXTRA_EXTENDED_CLIENT";

    public static Intent createConnectionIntent(ExtendedClient extendedClient, ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("EXTRA_EXTENDED_CLIENT", extendedClient.getBundle());
        intent.putExtra("EXTRA_CLIENT", extendedClient.asClient());
        return intent;
    }
}
