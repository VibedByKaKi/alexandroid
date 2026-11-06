package com.amazon.apl.viewhost.config;

import android.util.Log;
import com.amazon.alexaext.ExtensionRegistrar;
import com.amazon.apl.android.ExtensionMediator;
import com.amazon.apl.android.dependencies.IUserPerceivedFatalCallback;
import com.amazon.apl.android.metrics.MetricsOptions;
import com.amazon.apl.android.providers.ITelemetryProvider;
import com.amazon.apl.viewhost.config.AutoValue_DocumentOptions;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class DocumentOptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DocumentOptions build();

        public abstract Builder embeddedDocumentFactory(EmbeddedDocumentFactory embeddedDocumentFactory);

        public abstract Builder extensionFlags(Map<String, Object> map);

        public abstract Builder extensionGrantRequestCallback(ExtensionMediator.IExtensionGrantRequestCallback iExtensionGrantRequestCallback);

        public abstract Builder extensionRegistrar(ExtensionRegistrar extensionRegistrar);

        public abstract Builder metricsOptions(MetricsOptions metricsOptions);

        public abstract Builder properties(Map<String, Object> map);

        public abstract Builder telemetryProvider(ITelemetryProvider iTelemetryProvider);

        public abstract Builder userPerceivedFatalCallback(IUserPerceivedFatalCallback iUserPerceivedFatalCallback);
    }

    public static Builder builder() {
        return new AutoValue_DocumentOptions.Builder().properties(new HashMap());
    }

    private <T> T chooseValue(T t, T t2) {
        return t != null ? t : t2;
    }

    private Map<String, Object> mergeMaps(Map<String, Object> map, Map<String, Object> map2) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        return hashMap;
    }

    @Nullable
    public abstract EmbeddedDocumentFactory getEmbeddedDocumentFactory();

    @Nullable
    public abstract Map<String, Object> getExtensionFlags();

    @Nullable
    public abstract ExtensionMediator.IExtensionGrantRequestCallback getExtensionGrantRequestCallback();

    @Nullable
    public abstract ExtensionRegistrar getExtensionRegistrar();

    @Nullable
    public abstract MetricsOptions getMetricsOptions();

    @Nullable
    public abstract Map<String, Object> getProperties();

    @Nullable
    public abstract ITelemetryProvider getTelemetryProvider();

    @Nullable
    public abstract IUserPerceivedFatalCallback getUserPerceivedFatalCallback();

    public boolean isAsyncCoreUpdateEnabled() {
        Map<String, Object> properties = getProperties();
        if (properties == null) {
            return false;
        }
        boolean equals = Boolean.TRUE.equals(properties.get("-experimentalAsyncCoreUpdate"));
        Object obj = properties.get("overrideConfig");
        return obj instanceof JSONObject ? ((JSONObject) obj).optBoolean("-experimentalAsyncCoreUpdate", equals) : equals;
    }

    public boolean isSceneGraphEnabled() {
        Map<String, Object> properties = getProperties();
        if (properties == null) {
            return false;
        }
        if (properties.get("overrideConfig") instanceof JSONObject) {
            try {
                return ((JSONObject) properties.get("overrideConfig")).getBoolean("-experimentalEnableSceneGraph");
            } catch (JSONException unused) {
                Log.w("DocumentOptions", "Error parsing DocumentOptions overrideConfig");
            }
        }
        return Boolean.TRUE.equals(properties.get("-experimentalEnableSceneGraph"));
    }

    public DocumentOptions merge(DocumentOptions documentOptions) {
        if (documentOptions == null) {
            return this;
        }
        Builder builder = builder();
        builder.extensionGrantRequestCallback((ExtensionMediator.IExtensionGrantRequestCallback) chooseValue(documentOptions.getExtensionGrantRequestCallback(), getExtensionGrantRequestCallback()));
        builder.extensionRegistrar((ExtensionRegistrar) chooseValue(documentOptions.getExtensionRegistrar(), getExtensionRegistrar()));
        builder.extensionFlags(mergeMaps(getExtensionFlags(), documentOptions.getExtensionFlags()));
        builder.telemetryProvider((ITelemetryProvider) chooseValue(documentOptions.getTelemetryProvider(), getTelemetryProvider()));
        builder.metricsOptions((MetricsOptions) chooseValue(documentOptions.getMetricsOptions(), getMetricsOptions()));
        builder.embeddedDocumentFactory((EmbeddedDocumentFactory) chooseValue(documentOptions.getEmbeddedDocumentFactory(), getEmbeddedDocumentFactory()));
        builder.userPerceivedFatalCallback((IUserPerceivedFatalCallback) chooseValue(documentOptions.getUserPerceivedFatalCallback(), getUserPerceivedFatalCallback()));
        builder.properties(mergeMaps(getProperties(), documentOptions.getProperties()));
        return builder.build();
    }
}
