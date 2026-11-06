package com.amazonaws.mobileconnectors.remoteconfiguration.internal.model;

import com.amazonaws.mobileconnectors.remoteconfiguration.Configuration;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoteConfigurationImpl implements RemoteConfiguration {
    private final String mAppConfigurationId;
    private final Configuration mConfiguration;
    private final String mEntityTag;
    private final int mOrigin;
    private final boolean mUpdate;

    public RemoteConfigurationImpl(Configuration configuration, String str, int i, String str2, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The Application Configuration ID may not be null");
            throw null;
        }
        if (i != 1 && i != 2 && i != 3) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid configuration origin.");
            throw null;
        }
        this.mConfiguration = configuration;
        this.mAppConfigurationId = str;
        this.mOrigin = i;
        this.mEntityTag = str2;
        this.mUpdate = z;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.internal.model.RemoteConfiguration
    public String getAppConfigurationId() {
        return this.mAppConfigurationId;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.internal.model.RemoteConfiguration
    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.internal.model.RemoteConfiguration
    public String getEntityTag() {
        return this.mEntityTag;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.internal.model.RemoteConfiguration
    public int getOrigin() {
        return this.mOrigin;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.internal.model.RemoteConfiguration
    public boolean isUpdate() {
        return this.mUpdate;
    }
}
