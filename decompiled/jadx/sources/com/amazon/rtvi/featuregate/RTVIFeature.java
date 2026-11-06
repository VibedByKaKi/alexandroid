package com.amazon.rtvi.featuregate;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/rtvi/featuregate/RTVIFeature;", "", "featureName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "ENABLEMENT_BETA", "VIO_GATEWAY_EVENT_SENDER", "FRAME_MULTIPART", "VIO_GATEWAY_CONNECTION_PREWARM", "CONTINUOUS_SESSION_MAX_DURATION", "RTVIAndroidAlexaAvsSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RTVIFeature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RTVIFeature[] $VALUES;

    @NotNull
    private final String featureName;
    public static final RTVIFeature ENABLEMENT_BETA = new RTVIFeature("ENABLEMENT_BETA", 0, "ALEXA_MOBILE_RTVI_ANDROID_BETA");
    public static final RTVIFeature VIO_GATEWAY_EVENT_SENDER = new RTVIFeature("VIO_GATEWAY_EVENT_SENDER", 1, "VIO_GATEWAY_EVENT_SENDER");
    public static final RTVIFeature FRAME_MULTIPART = new RTVIFeature("FRAME_MULTIPART", 2, "RTVI_FRAME_MULTIPART_ANDROID");
    public static final RTVIFeature VIO_GATEWAY_CONNECTION_PREWARM = new RTVIFeature("VIO_GATEWAY_CONNECTION_PREWARM", 3, "RTVI_VIO_GATEWAY_CONNECTION_PREWARM_ANDROID");
    public static final RTVIFeature CONTINUOUS_SESSION_MAX_DURATION = new RTVIFeature("CONTINUOUS_SESSION_MAX_DURATION", 4, "RTVI_CONTINUOUS_SESSION_MAX_DURATION_ANDROID");

    private static final /* synthetic */ RTVIFeature[] $values() {
        return new RTVIFeature[]{ENABLEMENT_BETA, VIO_GATEWAY_EVENT_SENDER, FRAME_MULTIPART, VIO_GATEWAY_CONNECTION_PREWARM, CONTINUOUS_SESSION_MAX_DURATION};
    }

    static {
        RTVIFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RTVIFeature(String str, int i, String str2) {
        this.featureName = str2;
    }

    @NotNull
    public static EnumEntries<RTVIFeature> getEntries() {
        return $ENTRIES;
    }

    public static RTVIFeature valueOf(String str) {
        return (RTVIFeature) Enum.valueOf(RTVIFeature.class, str);
    }

    public static RTVIFeature[] values() {
        return (RTVIFeature[]) $VALUES.clone();
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }
}
