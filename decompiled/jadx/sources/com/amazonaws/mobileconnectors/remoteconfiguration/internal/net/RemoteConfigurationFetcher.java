package com.amazonaws.mobileconnectors.remoteconfiguration.internal.net;

import com.amazonaws.mobileconnectors.remoteconfiguration.Attributes;
import com.amazonaws.mobileconnectors.remoteconfiguration.internal.model.RemoteConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes20.dex */
public interface RemoteConfigurationFetcher {
    RemoteConfiguration fetch(String str, Attributes attributes, String str2, String str3);
}
