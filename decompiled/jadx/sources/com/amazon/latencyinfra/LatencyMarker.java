package com.amazon.latencyinfra;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.latencyinfra.SingleEventInputArgument;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum LatencyMarker {
    COMMS_CSL("comms.end.cold_start.time"),
    PROFILE_OOBE_START_CSL("profileOOBE.start.cold_start.time"),
    PROFILE_OOBE_END_CSL("profileOOBE.end.cold_start.time"),
    ACCESSORIES_CSL("accessories.end.cold_start.time"),
    MAIN_APPLICATION_CSL("mainApplication.end.cold_start.time"),
    MAIN_ACTIVITY_COMPONENT_INJECT_CSL("mainActivityComponentInject.end.cold_start.time"),
    MAIN_ACTIVITY_CREATE_CSL("mainActivityCreate.end.cold_start.time"),
    MAIN_ACTIVITY_RESUME_CSL("mainActivityResume.end.cold_start.time"),
    MATTER_SERVICE_CSL("matter.end.cold_start.time"),
    HOME_VIEW_CREATE_CSL("homeViewCreate.end.cold_start.time"),
    VOX_INGRESS_CSL("voxIngress.end.cold_start.time"),
    APP_INSTALL_LATENCY("app.install_start.time"),
    APP_UPDATE_LATENCY("app.update_start.time"),
    COOL_START_LATENCY("app.cool_start.time"),
    MOSAIC_THEME_INIT_CSL_START("mosaic.theme_init.start.cold_start.time"),
    MOSAIC_THEME_INIT_CSL_END("mosaic.theme_init.end.cold_start.time"),
    GENERIC_CSL_COMPLETION("generic.cold_start.time"),
    HOME_TTA("home/cards-rendered-latency"),
    BOTTOM_NAV_LATENCY("BottomNavLatency"),
    CONTENT_VIEW_INFLATED("appstart.contentViewInflated.checkpoint.time"),
    FEATURE_STORE_INITIALIZED("appstart.featureStoreInitialized.checkpoint.time"),
    VIEW_MODEL_CREATED("appstart.viewModelCreated.checkpoint.time"),
    IDENTITY_RESOLVED("appstart.identityResolved.checkpoint.time"),
    FEATURE_FLAG_RESOLVED("appstart.featureFlagResolved.checkpoint.time");

    private final String metric;

    LatencyMarker(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Marker must have a valid metric");
            throw null;
        }
        this.metric = str;
    }

    public SingleEventInputArgument getEvent(String str) {
        return new SingleEventInputArgument.Builder().withMetricsOption(true).withLogOption(true).withCustomerOption(true).withNamespace(str).withEventName(this.metric).build();
    }

    public String getMetric() {
        return this.metric;
    }
}
