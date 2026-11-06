package com.amazon.alexa.ra.sdk.audio;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/sdk/audio/SoundEffectsAudioConfig;", "Lcom/amazon/alexa/ra/sdk/audio/SoundPoolAudioConfig;", "<init>", "()V", "usageAttribute", "", "getUsageAttribute", "()I", "contentTypeAttribute", "getContentTypeAttribute", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SoundEffectsAudioConfig implements SoundPoolAudioConfig {
    public static final int $stable = 0;

    @NotNull
    public static final SoundEffectsAudioConfig INSTANCE = new SoundEffectsAudioConfig();
    private static final int usageAttribute = 1;
    private static final int contentTypeAttribute = 2;

    private SoundEffectsAudioConfig() {
    }

    @Override // com.amazon.alexa.ra.sdk.audio.SoundPoolAudioConfig
    public int getContentTypeAttribute() {
        return contentTypeAttribute;
    }

    @Override // com.amazon.alexa.ra.sdk.audio.SoundPoolAudioConfig
    public int getUsageAttribute() {
        return usageAttribute;
    }
}
