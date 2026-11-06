package com.amazon.alexa.voice.tta.features;

import com.amazon.alexa.voice.tta.features.Feature;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"feature", "Lcom/amazon/alexa/voice/tta/features/Feature$Named;", "name", "", "Lcom/amazon/alexa/voice/tta/features/Feature$NameSpaced;", "namespace", "AlexaMobileAndroidVoice-TTA_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class FeatureKt {
    @NotNull
    public static final Feature.NameSpaced feature(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new Feature.NameSpaced(str, str2);
    }

    @NotNull
    public static final Feature.Named feature(@NotNull String str) {
        str.getClass();
        return new Feature.Named(str);
    }
}
