package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider.DefaultConfigProvider;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class RemoteConfigDeserializer {
    private static final String TAG = "RemoteConfigDeserializer";
    private final DefaultConfigProvider mDefaultConfigProvider;
    private final MetricsReporter mMetricsReporter;
    private final ObjectMapper mObjectMapper;

    @Inject
    public RemoteConfigDeserializer(@NonNull Context context, @NonNull MetricsReporter metricsReporter) {
        this(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).setSerializationInclusion(JsonInclude.Include.NON_NULL), metricsReporter, new DefaultConfigProvider(context));
    }

    @Nullable
    public RemoteConfig deserialize(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Log.d(TAG, "Deserializing remote config: ".concat(str));
                return (RemoteConfig) this.mObjectMapper.readValue(str, RemoteConfig.class);
            } catch (IOException | RuntimeException e) {
                Log.e(TAG, "Caught deserialization error", e, new Object[0]);
                this.mMetricsReporter.reportFetchFalcoRemoteConfigJobDeserializationFailure();
            }
        }
        return deserializeDefaultJson();
    }

    @Nullable
    @VisibleForTesting
    public RemoteConfig deserializeDefaultJson() {
        try {
            String defaultConfig = this.mDefaultConfigProvider.getDefaultConfig();
            Log.d(TAG, "Deserializing default config file: " + defaultConfig);
            return (RemoteConfig) this.mObjectMapper.readValue(defaultConfig, RemoteConfig.class);
        } catch (IOException e) {
            Log.e(TAG, "Caught deserialization error", e, new Object[0]);
            this.mMetricsReporter.reportFetchFalcoRemoteConfigJobDeserializationFailure();
            return null;
        }
    }

    @VisibleForTesting
    public RemoteConfigDeserializer(@NonNull ObjectMapper objectMapper, @NonNull MetricsReporter metricsReporter, @NonNull DefaultConfigProvider defaultConfigProvider) {
        this.mObjectMapper = objectMapper;
        this.mMetricsReporter = metricsReporter;
        this.mDefaultConfigProvider = defaultConfigProvider;
    }
}
