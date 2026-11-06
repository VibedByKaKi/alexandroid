package com.amazon.alexa.configservice.metadata;

import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.google.common.collect.ImmutableMap;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetadataProvider {
    private static final String UNKNOWN = "UNKNOWN";
    private final EnvironmentService environmentService;
    private final Map<MetadataKey, Supplier<String>> metadataSupplierMap;

    public MetadataProvider(@NonNull EnvironmentService environmentService) {
        final int i = 0;
        final int i2 = 1;
        this.metadataSupplierMap = ImmutableMap.of(MetadataKey.DEVICE_TYPE, new Supplier(this) { // from class: com.amazon.alexa.configservice.metadata.MetadataProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ MetadataProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                String deviceType;
                String appVersion;
                int i3 = i;
                MetadataProvider metadataProvider = this.f$0;
                switch (i3) {
                    case 0:
                        deviceType = metadataProvider.getDeviceType();
                        return deviceType;
                    default:
                        appVersion = metadataProvider.getAppVersion();
                        return appVersion;
                }
            }
        }, MetadataKey.APP_VERSION, new Supplier(this) { // from class: com.amazon.alexa.configservice.metadata.MetadataProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ MetadataProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                String deviceType;
                String appVersion;
                int i3 = i2;
                MetadataProvider metadataProvider = this.f$0;
                switch (i3) {
                    case 0:
                        deviceType = metadataProvider.getDeviceType();
                        return deviceType;
                    default:
                        appVersion = metadataProvider.getAppVersion();
                        return appVersion;
                }
            }
        });
        this.environmentService = environmentService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getAppVersion() {
        String versionName = this.environmentService.getVersionName();
        return versionName == null ? "UNKNOWN" : versionName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getDeviceType() {
        return "A2TF17PFR55MTB";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getMetadataValue$0() {
        return "UNKNOWN";
    }

    @NonNull
    public String getMetadataValue(@NonNull MetadataKey metadataKey) {
        return this.metadataSupplierMap.getOrDefault(metadataKey, new Stats$$ExternalSyntheticLambda0(8)).get();
    }
}
