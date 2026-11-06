package com.amazon.alexa.mobile.assistant.client.device;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.client.metrics.AppInformationProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/device/DeviceAppInformationProvider;", "Lcom/amazon/alexa/mobile/assistant/client/metrics/AppInformationProvider;", "deviceInformationProvider", "Lcom/amazon/alexa/mobile/assistant/client/device/DeviceInformationProvider;", "packageName", "", "<init>", "(Lcom/amazon/alexa/mobile/assistant/client/device/DeviceInformationProvider;Ljava/lang/String;)V", "getMetricsServiceName", "getAwsMobileAnalyticsApplicationId", "getMetricsDeviceType", "getMetricsDeviceSerialNumber", "getDeviceId", "getAttributionTag", "getAndroidId", "context", "Landroid/content/Context;", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DeviceAppInformationProvider implements AppInformationProvider {

    @NotNull
    private static final String AWS_MOBILE_ANALYTICS_APP_ID = "901ad8be11e4424f875dc792db51f34d";

    @NotNull
    private static final String BASE_METRICS_SERVICE_NAME = "AlexaMobileAndroid";

    @NotNull
    private static final String PREVIEW_PACKAGE_NAME = "com.amazon.dee.app.beta";

    @NotNull
    private static final String PREVIEW_SUFFIX = "_preview";

    @NotNull
    private static final String PROD_PACKAGE_NAME = "com.amazon.dee.app";

    @NotNull
    private static final String PROD_SUFFIX = "_prod";

    @NotNull
    private static final String UNKNOWN_SUFFIX = "_unknown";

    @NotNull
    private final DeviceInformationProvider deviceInformationProvider;

    @NotNull
    private final String packageName;
    public static final int $stable = 8;

    public DeviceAppInformationProvider(@NotNull DeviceInformationProvider deviceInformationProvider, @NotNull String str) {
        deviceInformationProvider.getClass();
        str.getClass();
        this.deviceInformationProvider = deviceInformationProvider;
        this.packageName = str;
    }

    @Override // com.amazon.alexa.mobile.assistant.client.metrics.AppInformationProvider
    @Nullable
    public String getAndroidId(@NotNull Context context) {
        context.getClass();
        return this.deviceInformationProvider.getAndroidId(context);
    }

    @Override // com.amazon.alexa.client.metrics.core.PreloadAttributionProvider
    @Nullable
    public String getAttributionTag() {
        return null;
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    @NotNull
    public String getAwsMobileAnalyticsApplicationId() {
        return "901ad8be11e4424f875dc792db51f34d";
    }

    @Override // com.amazon.alexa.client.metrics.core.DeviceIdProvider
    @NotNull
    public String getDeviceId() {
        return this.deviceInformationProvider.getDeviceId();
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    @NotNull
    public String getMetricsDeviceSerialNumber() {
        return this.deviceInformationProvider.getDeviceSerialNumber();
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    @NotNull
    public String getMetricsDeviceType() {
        return this.deviceInformationProvider.getDeviceType();
    }

    @Override // com.amazon.alexa.client.metrics.core.configuration.MetricsClientConfiguration
    @NotNull
    public String getMetricsServiceName() {
        String str = this.packageName;
        return Intrinsics.areEqual(str, "com.amazon.dee.app") ? "AlexaMobileAndroid_prod" : Intrinsics.areEqual(str, "com.amazon.dee.app.beta") ? "AlexaMobileAndroid_preview" : "AlexaMobileAndroid_unknown";
    }
}
