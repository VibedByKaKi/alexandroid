package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaDataSink;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"unwrapVoxSdkDataSink", "Lcom/amazon/alexa/api/AlexaDataSink;", "Lcom/amazon/alexa/api/compat/model/AlexaDataSink;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaDataSinkAdapterV2Kt {
    @NotNull
    public static final AlexaDataSink unwrapVoxSdkDataSink(@NotNull com.amazon.alexa.api.compat.model.AlexaDataSink alexaDataSink) {
        alexaDataSink.getClass();
        Object nativeHandle = alexaDataSink.getNativeHandle();
        AlexaDataSink alexaDataSink2 = nativeHandle instanceof AlexaDataSink ? (AlexaDataSink) nativeHandle : null;
        if (alexaDataSink2 != null) {
            return alexaDataSink2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("AlexaDataSink does not wrap a Vox SDK data sink");
        return null;
    }
}
