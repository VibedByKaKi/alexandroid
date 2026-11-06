package com.amazon.alexa.client.alexaservice.base.capabilities.external;

import android.provider.BaseColumns;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalCapabilitiesContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExternalCapabilitiesEntry implements BaseColumns {
        static final String COLUMN_NAME_AUTO_UPDATE_PREFERENCE = "autoUpdatePreference";
        static final String COLUMN_NAME_CAPABILITY_AGENT_METADATA = "capabilityAgentMetadata";
        static final String COLUMN_NAME_CAPABILITY_AGENT_VERSION = "capabilityAgentVersion";
        static final String COLUMN_NAME_CAPABILITY_COMPONENT_NAME = "capabilityComponentName";
        static final String COLUMN_NAME_REGISTRATION_STATUS = "registrationStatus";
        static final String COLUMN_NAME_SOURCE_PACKAGE_NAME = "sourcePackageName";
        static final String EXTERNAL_CAPABILITIES_TABLE_NAME = "externalCapabilities";
    }

    private ExternalCapabilitiesContract() {
    }
}
