package com.amazon.alexa.mobile.assistant.client.metrics;

import android.content.Context;
import com.amazon.alexa.client.metrics.core.DeviceIdProvider;
import com.amazon.alexa.client.metrics.core.PreloadAttributionProvider;
import com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/metrics/AppInformationProvider;", "Lcom/amazon/alexa/client/metrics/core/configuration/MetricsClientConfiguration;", "Lcom/amazon/alexa/client/metrics/core/DeviceIdProvider;", "Lcom/amazon/alexa/client/metrics/core/PreloadAttributionProvider;", "getAndroidId", "", "context", "Landroid/content/Context;", "metrics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AppInformationProvider extends MetricsClientConfiguration, DeviceIdProvider, PreloadAttributionProvider {
    @Nullable
    String getAndroidId(@NotNull Context context);
}
