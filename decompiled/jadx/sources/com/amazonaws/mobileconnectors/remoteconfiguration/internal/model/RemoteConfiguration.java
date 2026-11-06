package com.amazonaws.mobileconnectors.remoteconfiguration.internal.model;

import com.amazonaws.mobileconnectors.remoteconfiguration.Configuration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface RemoteConfiguration {
    public static final int ORIGIN_DEFAULT = 1;
    public static final int ORIGIN_OVERWRITTEN = 3;
    public static final int ORIGIN_SYNCED = 2;

    String getAppConfigurationId();

    Configuration getConfiguration();

    String getEntityTag();

    int getOrigin();

    boolean isUpdate();
}
