package com.amazon.alexa.handsfree.protocols.metrics.interprocess;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class InterProcessMetric implements Parcelable {
    @Nullable
    public abstract MetricsBuilder populateMetricsBuilder(MetricsBuilder metricsBuilder);
}
