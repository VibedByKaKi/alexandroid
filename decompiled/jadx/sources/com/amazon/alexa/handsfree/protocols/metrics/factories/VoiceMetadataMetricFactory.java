package com.amazon.alexa.handsfree.protocols.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface VoiceMetadataMetricFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ParameterType {
        INT,
        DOUBLE,
        BOOLEAN,
        STRING
    }

    Metric buildVoiceMetadataMetric(@NonNull String str, @NonNull String str2, @NonNull ParameterType parameterType, @NonNull String str3);
}
