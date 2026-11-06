package com.amazon.alexa.client.alexaservice.base.componentstate;

import android.provider.BaseColumns;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalComponentStateContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExternalComponentStateCachingPreferenceEntry implements BaseColumns {
        public static final String COLUMN_NAME_IS_CACHING_ENABLED = "isCachingEnabled";
        public static final String EXTERNAL_COMPONENT_STATE_CACHING_PREFERENCE_TABLE_NAME = "externalComponentStateCachingPreference";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExternalComponentStateEntry implements BaseColumns {
        public static final String COLUMN_NAME_DATE_UPDATED = "dateUpdated";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_NAMESPACE = "namespace";
        public static final String COLUMN_NAME_PACKAGE_NAME = "packageName";
        public static final String COLUMN_NAME_PACKAGE_VERSION_CODE = "packageVersionCode";
        public static final String COLUMN_NAME_PAYLOAD = "payload";
        public static final String EXTERNAL_COMPONENT_STATE_TABLE_NAME = "externalComponentState";
    }

    private ExternalComponentStateContract() {
    }
}
