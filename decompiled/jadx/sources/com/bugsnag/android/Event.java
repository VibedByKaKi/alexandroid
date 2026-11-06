package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.InternalMetrics;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Event implements JsonStream.Streamable, MetadataAware, UserAware, FeatureFlagAware {
    private final EventInternal impl;
    private final Logger logger;

    public Event(@Nullable Throwable th, @NonNull ImmutableConfig immutableConfig, @NonNull SeverityReason severityReason, @NonNull Logger logger) {
        this(th, immutableConfig, severityReason, new Metadata(), new FeatureFlags(), logger);
    }

    private void logNull(String str) {
        this.logger.e("Invalid null value supplied to config." + str + ", ignoring");
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(@NonNull String str) {
        if (str != null) {
            this.impl.addFeatureFlag(str);
        } else {
            logNull("addFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlags(@NonNull Iterable<FeatureFlag> iterable) {
        if (iterable != null) {
            this.impl.addFeatureFlags(iterable);
        } else {
            logNull("addFeatureFlags");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(@NonNull String str, @NonNull Map<String, ?> map) {
        if (str == null || map == null) {
            logNull("addMetadata");
        } else {
            this.impl.addMetadata(str, map);
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlag(@NonNull String str) {
        if (str != null) {
            this.impl.clearFeatureFlag(str);
        } else {
            logNull("clearFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void clearFeatureFlags() {
        this.impl.clearFeatureFlags();
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(@NonNull String str, @NonNull String str2) {
        if (str == null || str2 == null) {
            logNull("clearMetadata");
        } else {
            this.impl.clearMetadata(str, str2);
        }
    }

    @NonNull
    public String getApiKey() {
        return this.impl.getApiKey();
    }

    @NonNull
    public AppWithState getApp() {
        return this.impl.getApp();
    }

    @NonNull
    public List<Breadcrumb> getBreadcrumbs() {
        return this.impl.getBreadcrumbs();
    }

    @Nullable
    public String getContext() {
        return this.impl.getContext();
    }

    @NonNull
    public DeviceWithState getDevice() {
        return this.impl.getDevice();
    }

    @NonNull
    public List<Error> getErrors() {
        return this.impl.getErrors();
    }

    @NonNull
    public List<FeatureFlag> getFeatureFlags() {
        return this.impl.getFeatureFlags().toList();
    }

    @Nullable
    public String getGroupingHash() {
        return this.impl.getGroupingHash();
    }

    public EventInternal getImpl() {
        return this.impl;
    }

    @Override // com.bugsnag.android.MetadataAware
    @Nullable
    public Object getMetadata(@NonNull String str, @NonNull String str2) {
        if (str != null && str2 != null) {
            return this.impl.getMetadata(str, str2);
        }
        logNull("getMetadata");
        return null;
    }

    @Nullable
    public Throwable getOriginalError() {
        return this.impl.getOriginalError();
    }

    @Nullable
    public Session getSession() {
        return this.impl.session;
    }

    @NonNull
    public Severity getSeverity() {
        return this.impl.getSeverity();
    }

    @NonNull
    public List<Thread> getThreads() {
        return this.impl.getThreads();
    }

    @Override // com.bugsnag.android.UserAware
    @NonNull
    /* renamed from: getUser */
    public User getUserImpl() {
        return this.impl.getUserImpl();
    }

    public boolean isUnhandled() {
        return this.impl.getUnhandled();
    }

    public void setApiKey(@NonNull String str) {
        if (str != null) {
            this.impl.setApiKey(str);
        } else {
            logNull("apiKey");
        }
    }

    public void setApp(@NonNull AppWithState appWithState) {
        this.impl.setApp(appWithState);
    }

    public void setBreadcrumbs(@NonNull List<Breadcrumb> list) {
        this.impl.setBreadcrumbs(list);
    }

    public void setContext(@Nullable String str) {
        this.impl.setContext(str);
    }

    public void setDevice(@NonNull DeviceWithState deviceWithState) {
        this.impl.setDevice(deviceWithState);
    }

    public void setGroupingHash(@Nullable String str) {
        this.impl.setGroupingHash(str);
    }

    public void setInternalMetrics(InternalMetrics internalMetrics) {
        this.impl.setInternalMetrics(internalMetrics);
    }

    public void setRedactedKeys(Collection<String> collection) {
        this.impl.setRedactedKeys(collection);
    }

    public void setSession(@Nullable Session session) {
        this.impl.session = session;
    }

    public void setSeverity(@NonNull Severity severity) {
        if (severity != null) {
            this.impl.setSeverity(severity);
        } else {
            logNull("severity");
        }
    }

    public void setUnhandled(boolean z) {
        this.impl.setUnhandled(z);
    }

    @Override // com.bugsnag.android.UserAware
    public void setUser(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.impl.setUser(str, str2, str3);
    }

    public boolean shouldDiscardClass() {
        return this.impl.shouldDiscardClass();
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NonNull JsonStream jsonStream) throws IOException {
        this.impl.toStream(jsonStream);
    }

    public void updateSeverityInternal(@NonNull Severity severity) {
        this.impl.updateSeverityInternal(severity);
    }

    public void updateSeverityReason(@NonNull String str) {
        this.impl.updateSeverityReason(str);
    }

    @Override // com.bugsnag.android.FeatureFlagAware
    public void addFeatureFlag(@NonNull String str, @Nullable String str2) {
        if (str != null) {
            this.impl.addFeatureFlag(str, str2);
        } else {
            logNull("addFeatureFlag");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(@NonNull String str, @NonNull String str2, @Nullable Object obj) {
        if (str != null && str2 != null) {
            this.impl.addMetadata(str, str2, obj);
        } else {
            logNull("addMetadata");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(@NonNull String str) {
        if (str != null) {
            this.impl.clearMetadata(str);
        } else {
            logNull("clearMetadata");
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    @Nullable
    public Map<String, Object> getMetadata(@NonNull String str) {
        if (str != null) {
            return this.impl.getMetadata(str);
        }
        logNull("getMetadata");
        return null;
    }

    public Event(@Nullable Throwable th, @NonNull ImmutableConfig immutableConfig, @NonNull SeverityReason severityReason, @NonNull Metadata metadata, @NonNull FeatureFlags featureFlags, @NonNull Logger logger) {
        this(new EventInternal(th, immutableConfig, severityReason, metadata, featureFlags), logger);
    }

    public Event(@NonNull EventInternal eventInternal, @NonNull Logger logger) {
        this.impl = eventInternal;
        this.logger = logger;
    }
}
