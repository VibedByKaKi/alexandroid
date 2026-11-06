package com.here.sdk.core.errors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum InstantiationErrorCode {
    ILLEGAL_ARGUMENTS(1),
    FAILED(2),
    SHARED_SDK_ENGINE_NOT_INSTANTIATED(3),
    CACHE_FOLDER_ACCESS_DENIED(4),
    PERSISTENT_MAP_STORAGE_FOLDER_ACCESS_DENIED(5),
    FAILED_TO_LOCK_CACHE_FOLDER(6),
    FAILED_TO_CREATE_ANALYTICS_SERVICE(7),
    ACCESS_KEY_CONTAINS_ILLEGAL_SYMBOL(8),
    ACCESS_KEY_SECRET_CONTAINS_ILLEGAL_SYMBOL(9),
    LAYER_CONFIGURATION_MISMATCH(10),
    SDK_ENGINE_ALREADY_DISPOSED(11),
    INVALID_CATALOG_CONFIGURATION(12),
    DATA_FOLDER_ACCESS_DENIED(13);

    public final int value;

    InstantiationErrorCode(int i) {
        this.value = i;
    }
}
