package com.amazon.alexa.handsfree.protocols.metrics.builders;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolComponent;
import com.amazon.alexa.handsfree.protocols.metrics.MetricsConfiguration;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class MetricsBuilderProvider {
    private static final String TAG = "MetricsBuilderProvider";
    private final MetricsConfiguration mMetricsConfiguration;

    @Inject
    public MetricsBuilderProvider(@NonNull MetricsConfiguration metricsConfiguration) {
        this.mMetricsConfiguration = metricsConfiguration;
    }

    public static MetricsBuilderProvider getInstance(Context context) {
        return ((FalcoProtocolComponent) AhfComponentsProvider.getComponent(context, FalcoProtocolComponent.class)).metricsBuilderProvider();
    }

    public MetricsBuilder newBuilder() {
        return new DefaultMetricsBuilder(this.mMetricsConfiguration);
    }
}
