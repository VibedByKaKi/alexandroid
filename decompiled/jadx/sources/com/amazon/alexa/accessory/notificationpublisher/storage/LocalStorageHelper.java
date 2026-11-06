package com.amazon.alexa.accessory.notificationpublisher.storage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LocalStorageHelper {
    public static final String DATA_ENTRY_TIMESTAMP = "timestamp";
    public static final String DATA_ENTRY_TTL = "ttl";
    protected static final int DATA_ENTRY_TTL_VALUE = 60000;
    public static final String EMPTY_VALUE_JSON_OBJECT_STR = "{\"value\":\"{}\"}";
    public static final String ENCRYPT_KEY = "encrypt";
    public static final String EVICTION_TIER_1 = "1";
    public static final String EVICTION_TIER_KEY = "evictionTier";
    public static final String EXTRACT_VALUE_FROM_JSON = "extractValueFromJson";
    public static final String FOCUS_FILTER_TAG = "NotificationFilterSettings";
    public static final String JSONIFY = "jsonify";
    public static final String KEY_KEY = "key";
    public static final String VALUE_KEY = "value";

    private LocalStorageHelper() {
        throw new UnsupportedOperationException();
    }
}
