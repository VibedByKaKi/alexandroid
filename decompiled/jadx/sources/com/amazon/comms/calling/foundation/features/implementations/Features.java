package com.amazon.comms.calling.foundation.features.implementations;

import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/amazon/comms/calling/foundation/features/implementations/Features;", "", "featureName", "", "nameSpace", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getNameSpace", NativeFeatureRegistry.COMMS_ALL_FEATURES, NativeFeatureRegistry.COMMS_ALL_FEATURES_NEW, NativeFeatureRegistry.TACHYON_FEATURE_LINDAIYU, NativeFeatureRegistry.ALEXA_COMMS_ENABLE_INSIGHTS_ON_AMA, NativeFeatureRegistry.TACHYON_FEATURE_MIAOYU, "TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID", "SEPIA", "REACTIONS", "DESPACITO", "MPU_DYNAMIC_PIP", "CALLING_MPU_VIDEO_EVENT", "CALLING_ENABLE_FROSTED_EFFECT_DISMISS", "CALLING_DECOUPLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID", "CALLING_MOVABLE_PIP", "ANDROID_CALLING_DECOUPLING_ENABLE_SIEGE_ENCRYPTION", "CALLING_ENABLE_SIP_MODERNIZATION", "CALLING_DECOUPLING_ENABLE_METRICS", "CALLING_DECOUPLING_DISABLE_SIP_INITIALIZATION", "CALLING_DECOUPLING_APP_LIFECYCLE_HANDLING", "CALLING_HIDE_AUDIO_DOWNGRADE_MESSAGE_ANDROID", "AUTO_MODE_SUNSET", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class Features {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Features[] $VALUES;
    public static final Features CALLING_ENABLE_SIP_MODERNIZATION;
    public static final Features REACTIONS;

    @NotNull
    private final String featureName;

    @NotNull
    private final String nameSpace;
    public static final Features COMMS_ALL_FEATURES = new Features(NativeFeatureRegistry.COMMS_ALL_FEATURES, 0, NativeFeatureRegistry.COMMS_ALL_FEATURES, null, 2, null);
    public static final Features COMMS_ALL_FEATURES_NEW = new Features(NativeFeatureRegistry.COMMS_ALL_FEATURES_NEW, 1, NativeFeatureRegistry.COMMS_ALL_FEATURES_NEW, null, 2, null);
    public static final Features TACHYON_FEATURE_LINDAIYU = new Features(NativeFeatureRegistry.TACHYON_FEATURE_LINDAIYU, 2, NativeFeatureRegistry.TACHYON_FEATURE_LINDAIYU, null, 2, null);
    public static final Features ALEXA_COMMS_ENABLE_INSIGHTS_ON_AMA = new Features(NativeFeatureRegistry.ALEXA_COMMS_ENABLE_INSIGHTS_ON_AMA, 3, NativeFeatureRegistry.ALEXA_COMMS_ENABLE_INSIGHTS_ON_AMA, null, 2, null);
    public static final Features TACHYON_FEATURE_MIAOYU = new Features(NativeFeatureRegistry.TACHYON_FEATURE_MIAOYU, 4, NativeFeatureRegistry.TACHYON_FEATURE_MIAOYU, null, 2, null);
    public static final Features TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID = new Features("TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID", 5, "TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID", null, 2, null);
    public static final Features SEPIA = new Features("SEPIA", 6, NativeFeatureRegistry.TACHYON_FEATURE_SEPIA_ANDROID, null, 2, null);
    public static final Features DESPACITO = new Features("DESPACITO", 8, NativeFeatureRegistry.TACHYON_CALLING_FEATURE_DESPACITO, null, 2, null);
    public static final Features MPU_DYNAMIC_PIP = new Features("MPU_DYNAMIC_PIP", 9, NativeFeatureRegistry.TACHYON_FEATURE_SELFVIEW_PIP, null, 2, null);
    public static final Features CALLING_MPU_VIDEO_EVENT = new Features("CALLING_MPU_VIDEO_EVENT", 10, "CALLING_ENABLE_MPU_VIDEO_EVENT", null, 2, null);
    public static final Features CALLING_ENABLE_FROSTED_EFFECT_DISMISS = new Features("CALLING_ENABLE_FROSTED_EFFECT_DISMISS", 11, "CALLING_ENABLE_FROSTED_EFFECT_DISMISS", null, 2, null);
    public static final Features CALLING_DECOUPLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID = new Features("CALLING_DECOUPLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID", 12, "CALLING_DECOUPLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID", null, 2, null);
    public static final Features CALLING_MOVABLE_PIP = new Features("CALLING_MOVABLE_PIP", 13, "CALLING_ENABLE_MOVABLE_PIP", null, 2, 0 == true ? 1 : 0);
    public static final Features ANDROID_CALLING_DECOUPLING_ENABLE_SIEGE_ENCRYPTION = new Features("ANDROID_CALLING_DECOUPLING_ENABLE_SIEGE_ENCRYPTION", 14, "ANDROID_CALLING_DECOUPLING_ENABLE_SIEGE_ENCRYPTION", null, 2, null);
    public static final Features CALLING_DECOUPLING_ENABLE_METRICS = new Features("CALLING_DECOUPLING_ENABLE_METRICS", 16, "CALLING_DECOUPLING_ENABLE_METRICS", null, 2, null);
    public static final Features CALLING_DECOUPLING_DISABLE_SIP_INITIALIZATION = new Features("CALLING_DECOUPLING_DISABLE_SIP_INITIALIZATION", 17, "CALLING_DECOUPLING_DISABLE_SIP_INITIALIZATION", null, 2, null);
    public static final Features CALLING_DECOUPLING_APP_LIFECYCLE_HANDLING = new Features("CALLING_DECOUPLING_APP_LIFECYCLE_HANDLING", 18, "CALLING_DECOUPLING_APP_LIFECYCLE_HANDLING", null, 2, null);
    public static final Features CALLING_HIDE_AUDIO_DOWNGRADE_MESSAGE_ANDROID = new Features("CALLING_HIDE_AUDIO_DOWNGRADE_MESSAGE_ANDROID", 19, "CALLING_HIDE_AUDIO_DOWNGRADE_MESSAGE_ANDROID", null, 2, null);
    public static final Features AUTO_MODE_SUNSET = new Features("AUTO_MODE_SUNSET", 20, NativeFeatureRegistry.ALEXA_AUTO_ANDROID_SUNSET, null, 2, null);

    private static final /* synthetic */ Features[] $values() {
        return new Features[]{COMMS_ALL_FEATURES, COMMS_ALL_FEATURES_NEW, TACHYON_FEATURE_LINDAIYU, ALEXA_COMMS_ENABLE_INSIGHTS_ON_AMA, TACHYON_FEATURE_MIAOYU, TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID, SEPIA, REACTIONS, DESPACITO, MPU_DYNAMIC_PIP, CALLING_MPU_VIDEO_EVENT, CALLING_ENABLE_FROSTED_EFFECT_DISMISS, CALLING_DECOUPLING_ENABLE_AUTH_TOKEN_HANDLER_ANDROID, CALLING_MOVABLE_PIP, ANDROID_CALLING_DECOUPLING_ENABLE_SIEGE_ENCRYPTION, CALLING_ENABLE_SIP_MODERNIZATION, CALLING_DECOUPLING_ENABLE_METRICS, CALLING_DECOUPLING_DISABLE_SIP_INITIALIZATION, CALLING_DECOUPLING_APP_LIFECYCLE_HANDLING, CALLING_HIDE_AUDIO_DOWNGRADE_MESSAGE_ANDROID, AUTO_MODE_SUNSET};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        REACTIONS = new Features("REACTIONS", 7, NativeFeatureRegistry.TACHYON_FEATURE_REACTIONS_ANDROID, null, 2, defaultConstructorMarker);
        CALLING_ENABLE_SIP_MODERNIZATION = new Features("CALLING_ENABLE_SIP_MODERNIZATION", 15, "CALLING_ENABLE_SIP_MODERNIZATION", null, 2, defaultConstructorMarker);
        Features[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public /* synthetic */ Features(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? "ALEXA_MOBILE_CALLING" : str3);
    }

    @NotNull
    public static EnumEntries<Features> getEntries() {
        return $ENTRIES;
    }

    public static Features valueOf(String str) {
        return (Features) Enum.valueOf(Features.class, str);
    }

    public static Features[] values() {
        return (Features[]) $VALUES.clone();
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    @NotNull
    public final String getNameSpace() {
        return this.nameSpace;
    }

    private Features(String str, int i, String str2, String str3) {
        this.featureName = str2;
        this.nameSpace = str3;
    }
}
