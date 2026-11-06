package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GenericDeviceStatus<ConnectionStatus, RegistrationStatus> {
    private final ConnectionStatus mConnectionStatus;
    private final List<RegistrationStatus> mRegistrationStatus;

    public GenericDeviceStatus(ConnectionStatus connectionstatus, Collection<RegistrationStatus> collection) {
        this.mConnectionStatus = connectionstatus;
        this.mRegistrationStatus = new ArrayList(collection);
    }

    public ConnectionStatus getConnectionStatus() {
        return this.mConnectionStatus;
    }

    public Collection<RegistrationStatus> getRegistrationStatus() {
        return Collections.unmodifiableCollection(this.mRegistrationStatus);
    }
}
