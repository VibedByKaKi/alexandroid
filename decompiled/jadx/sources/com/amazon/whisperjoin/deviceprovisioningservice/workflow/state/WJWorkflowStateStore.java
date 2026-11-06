package com.amazon.whisperjoin.deviceprovisioningservice.workflow.state;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.device.WJProvisionee;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.result.WJResult;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.DiscoveredProvisionable;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WJWorkflowStateStore {
    private static final String TAG = "WJWorkflowStateStore";
    private final Map<WJProvisionee, DeviceSession> mActiveSessions;
    private final List<DiscoveredProvisionable> mDiscoveredDevices;
    private final boolean mIsDiscoveryActive;
    private final WJResult mLastWJResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Mutator {
        private Map<WJProvisionee, DeviceSession> mActiveSessions;
        private List<DiscoveredProvisionable> mDiscoveredDevices;
        private boolean mIsDiscoveryActive;
        private WJResult mLastEvent;

        public Mutator(WJWorkflowStateStore wJWorkflowStateStore) {
            this.mLastEvent = wJWorkflowStateStore.mLastWJResult;
            this.mDiscoveredDevices = new ArrayList(wJWorkflowStateStore.mDiscoveredDevices);
            this.mIsDiscoveryActive = wJWorkflowStateStore.mIsDiscoveryActive;
            this.mActiveSessions = new HashMap(wJWorkflowStateStore.mActiveSessions);
        }

        private void assertSessionExists(WJProvisionee wJProvisionee) {
            if (this.mActiveSessions.containsKey(wJProvisionee)) {
                return;
            }
            throw new IllegalStateException("No session for " + wJProvisionee.toString());
        }

        private DeviceSession createSession(DiscoveredProvisionable discoveredProvisionable) {
            if (!this.mActiveSessions.containsKey(discoveredProvisionable.getWJProvisionee())) {
                DeviceSession deviceSession = new DeviceSession(discoveredProvisionable);
                this.mActiveSessions.put(discoveredProvisionable.getWJProvisionee(), deviceSession);
                return deviceSession;
            }
            throw new IllegalStateException("Session already exists for " + discoveredProvisionable.getWJProvisionee().toString());
        }

        public Mutator addDiscoveredDevice(DiscoveredProvisionable discoveredProvisionable) {
            Iterator<DiscoveredProvisionable> it2 = this.mDiscoveredDevices.iterator();
            while (it2.hasNext()) {
                WJProvisionee wJProvisionee = it2.next().getWJProvisionee();
                if (wJProvisionee.getPeripheralDeviceDetails().getDeviceIdentity().equals(discoveredProvisionable.getWJProvisionee().getPeripheralDeviceDetails().getDeviceIdentity())) {
                    WJLog.d(WJWorkflowStateStore.TAG, "Removing discovered device old entry for wjProvisionee: " + wJProvisionee.getPeripheralDeviceDetails().getDeviceIdentity());
                    it2.remove();
                }
            }
            this.mDiscoveredDevices.add(0, discoveredProvisionable);
            createSession(discoveredProvisionable);
            return this;
        }

        public Mutator addDiscoveredDevices(List<DiscoveredProvisionable> list) {
            Iterator<DiscoveredProvisionable> it2 = list.iterator();
            while (it2.hasNext()) {
                addDiscoveredDevice(it2.next());
            }
            return this;
        }

        public Mutator clearDiscoveredDevices() {
            this.mDiscoveredDevices.clear();
            return this;
        }

        public WJWorkflowStateStore create() {
            return new WJWorkflowStateStore(this.mLastEvent, this.mDiscoveredDevices, this.mIsDiscoveryActive, this.mActiveSessions, 0);
        }

        public Mutator removeSession(WJProvisionee wJProvisionee) {
            if (this.mActiveSessions.remove(wJProvisionee) == null) {
                WJLog.w(WJWorkflowStateStore.TAG, "Attempted to remove session that was not found");
            }
            return this;
        }

        public Mutator reset() {
            this.mActiveSessions.clear();
            this.mDiscoveredDevices.clear();
            this.mIsDiscoveryActive = false;
            return this;
        }

        public Mutator setDiscoveryActive(boolean z) {
            this.mIsDiscoveryActive = z;
            return this;
        }

        public Mutator setLastResult(WJResult wJResult) {
            this.mLastEvent = wJResult;
            return this;
        }

        public Mutator updateSession(WJProvisionee wJProvisionee, DeviceSession deviceSession) {
            assertSessionExists(wJProvisionee);
            this.mActiveSessions.put(wJProvisionee, deviceSession);
            return this;
        }
    }

    private WJWorkflowStateStore(WJResult wJResult, List<DiscoveredProvisionable> list, boolean z, Map<WJProvisionee, DeviceSession> map) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("DiscoveredDevices can't be null");
            throw null;
        }
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Active Sessions can't be null");
            throw null;
        }
        this.mLastWJResult = wJResult;
        this.mDiscoveredDevices = list;
        this.mActiveSessions = map;
        this.mIsDiscoveryActive = z;
    }

    public Iterator<Map.Entry<WJProvisionee, DeviceSession>> getActiveSessions() {
        return Collections.unmodifiableSet(this.mActiveSessions.entrySet()).iterator();
    }

    public List<DiscoveredProvisionable> getDiscoveredDevices() {
        return this.mDiscoveredDevices;
    }

    public WJResult getLastWJResult() {
        return this.mLastWJResult;
    }

    public DeviceSession getSession(WJProvisionee wJProvisionee) {
        return this.mActiveSessions.get(wJProvisionee);
    }

    public boolean isDiscoveryActive() {
        return this.mIsDiscoveryActive;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mLastWJResult", this.mLastWJResult).add("mDiscoveredDevices", this.mDiscoveredDevices).add("mIsDiscoveryActive", this.mIsDiscoveryActive).add("mActiveSessions", this.mActiveSessions).toString();
    }

    public WJWorkflowStateStore() {
        this(null, new ArrayList(), false, new HashMap());
    }

    public /* synthetic */ WJWorkflowStateStore(WJResult wJResult, List list, boolean z, Map map, int i) {
        this(wJResult, list, z, map);
    }
}
