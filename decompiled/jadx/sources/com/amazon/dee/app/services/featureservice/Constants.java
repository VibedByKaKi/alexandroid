package com.amazon.dee.app.services.featureservice;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/services/featureservice/Constants;", "", "<init>", "()V", "KEY_FEATURE_SERVICE", "", "WEBLAB_FSV2_CRASH_MITIGATION", "WEBLAB_FSV2_CRASH_MITIGATION_MONITOR", "WEBLAB_FSV2_STORE_FEATURES_IN_BATCH", "WEBLAB_FSV2_TRIGGERSV2_THROTTLE", "WEBLAB_FSV2_TRIGGERSV2_DEDUP", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Constants {

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String KEY_FEATURE_SERVICE = "featureService";

    @NotNull
    public static final String WEBLAB_FSV2_CRASH_MITIGATION = "ALEXA_CORE_FSV2_CRASH_MITIGATION_ANDROID";

    @NotNull
    public static final String WEBLAB_FSV2_CRASH_MITIGATION_MONITOR = "ALEXA_CORE_FSV2_CRASH_MITIGATION_MONITOR_ANDROID";

    @NotNull
    public static final String WEBLAB_FSV2_STORE_FEATURES_IN_BATCH = "ALEXA_CORE_FSV2_STORE_FEATURES_IN_BATCH_ANDROID";

    @NotNull
    public static final String WEBLAB_FSV2_TRIGGERSV2_DEDUP = "ALEXA_CORE_FSV2_TRIGGERSV2_API_DEDUP_ANDROID";

    @NotNull
    public static final String WEBLAB_FSV2_TRIGGERSV2_THROTTLE = "ALEXA_CORE_FSV2_TRIGGERSV2_API_THROTTLE_ANDROID";

    private Constants() {
    }
}
