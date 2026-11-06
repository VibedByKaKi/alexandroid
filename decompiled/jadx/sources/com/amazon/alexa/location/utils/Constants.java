package com.amazon.alexa.location.utils;

import com.amazon.alexa.location.LocationErrorCode;
import com.amazon.alexa.location.models.Code;
import com.amazon.alexa.location.utils.MetricsUtil;
import com.google.common.collect.ImmutableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Constants {
    public static final ImmutableMap<LocationErrorCode, Code> ERROR_CODE_MAP;
    public static final ImmutableMap<Integer, String> GEOFENCE_TRANSITION_TO_METRICS_ID;

    static {
        ImmutableMap.Builder put = new ImmutableMap.Builder().put(LocationErrorCode.ALS_TIMEOUT, Code.S202).put(LocationErrorCode.BEYOND_20_LIMIT, Code.A103);
        LocationErrorCode locationErrorCode = LocationErrorCode.GENERIC_ERROR;
        Code code = Code.A101;
        ERROR_CODE_MAP = put.put(locationErrorCode, code).put(LocationErrorCode.PERMISSION_ERROR, Code.A102).put(LocationErrorCode.ALS_PAYLOAD_ERROR, code).put(LocationErrorCode.ALS_500, Code.S201).build();
        GEOFENCE_TRANSITION_TO_METRICS_ID = new ImmutableMap.Builder().put(1, MetricsUtil.MetricsId.GEOFENCE_ENTER_TRIGGERED).put(2, MetricsUtil.MetricsId.GEOFENCE_EXIT_TRIGGERED).build();
    }

    private Constants() {
    }
}
