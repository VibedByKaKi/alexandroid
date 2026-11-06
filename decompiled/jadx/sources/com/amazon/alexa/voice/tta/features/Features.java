package com.amazon.alexa.voice.tta.features;

import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;
import com.amazon.alexa.voice.tta.features.Feature;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/Features;", "", "<init>", "()V", "APL", "Lcom/amazon/alexa/voice/tta/features/Feature$Named;", "GEO_LOCATION_INFORMATION", "REMARKABLE_ALEXA", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class Features {

    @NotNull
    public static final Features INSTANCE = new Features();

    @JvmField
    @NotNull
    public static final Feature.Named APL = FeatureKt.feature(NativeFeatureRegistry.ALEXA_A4A_ANDROID_APL_GA);

    @JvmField
    @NotNull
    public static final Feature.Named GEO_LOCATION_INFORMATION = FeatureKt.feature(NativeFeatureRegistry.ALEXA_MOBILE_GEOLOCATION_DISCLOSURE);

    @JvmField
    @NotNull
    public static final Feature.Named REMARKABLE_ALEXA = FeatureKt.feature("ALEXA_VOX_ANDROID_RA_LAUNCH");

    private Features() {
    }
}
