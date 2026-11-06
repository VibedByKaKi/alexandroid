package com.amazon.whisperjoin.common.sharedtypes.devices.interfaces;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration.ConfigurationKeySet;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration.DataMap;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface Configuration {
    Future<Void> addConfiguration(DataMap dataMap);

    Future<Void> deleteConfiguration();

    Future<Void> deleteConfiguration(ConfigurationKeySet configurationKeySet);

    Future<DataMap> getConfiguration();
}
