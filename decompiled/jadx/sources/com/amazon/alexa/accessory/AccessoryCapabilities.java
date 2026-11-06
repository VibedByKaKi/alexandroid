package com.amazon.alexa.accessory;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.SizedSource;
import com.amazon.alexa.accessory.transport.TransportDispatcher;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AccessoryCapabilities {
    private final List<AccessoryCapability> capabilityList;
    private final CapabilityDescriptor descriptor;
    private final TransportDispatcher dispatcherAuthenticationAgnostic;
    private final TransportDispatcher dispatcherAuthenticationAware;
    private volatile boolean initialized;
    private final Object lock;
    private volatile boolean released;
    private final SparseArray<List<AccessoryStream>> streamList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class CapabilityDescriptor implements AccessoryDescriptor {
        public CapabilityDescriptor() {
        }

        @Override // com.amazon.alexa.accessory.AccessoryDescriptor
        public void add(AccessoryStream accessoryStream) {
            Preconditions.notNull(accessoryStream, "stream");
            synchronized (AccessoryCapabilities.this.lock) {
                try {
                    List list = (List) AccessoryCapabilities.this.streamList.get(accessoryStream.getId());
                    if (list == null) {
                        list = new ArrayList();
                        AccessoryCapabilities.this.streamList.put(accessoryStream.getId(), list);
                    }
                    list.add(accessoryStream);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.amazon.alexa.accessory.AccessoryDescriptor
        public TransportDispatcher getAuthenticationAgnosticDispatcher() {
            return AccessoryCapabilities.this.dispatcherAuthenticationAgnostic;
        }

        @Override // com.amazon.alexa.accessory.AccessoryDescriptor
        public TransportDispatcher getAuthenticationAwareDispatcher() {
            return AccessoryCapabilities.this.dispatcherAuthenticationAware;
        }

        @Override // com.amazon.alexa.accessory.AccessoryDescriptor
        public void remove(AccessoryStream accessoryStream) {
            Preconditions.notNull(accessoryStream, "stream");
            synchronized (AccessoryCapabilities.this.lock) {
                try {
                    List list = (List) AccessoryCapabilities.this.streamList.get(accessoryStream.getId());
                    if (list != null) {
                        list.remove(accessoryStream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AccessoryCapabilities(TransportDispatcher transportDispatcher, TransportDispatcher transportDispatcher2) {
        Preconditions.notNull(transportDispatcher, "dispatcherAuthenticationAware");
        Preconditions.notNull(transportDispatcher2, "dispatcherAuthenticationAgnostic");
        this.dispatcherAuthenticationAware = transportDispatcher;
        this.dispatcherAuthenticationAgnostic = transportDispatcher2;
        this.capabilityList = new ArrayList();
        this.streamList = new SparseArray<>();
        this.lock = new Object();
        this.descriptor = new CapabilityDescriptor();
    }

    private void reset() {
        synchronized (this.lock) {
            try {
                if (!this.initialized) {
                    return;
                }
                this.initialized = false;
                int size = this.capabilityList.size() - 1;
                while (true) {
                    List<AccessoryCapability> list = this.capabilityList;
                    if (size < 0) {
                        list.clear();
                        this.streamList.clear();
                        return;
                    } else {
                        list.get(size).dispose(this.descriptor);
                        size--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void add(AccessoryCapability accessoryCapability) {
        Preconditions.notNull(accessoryCapability, "capability");
        synchronized (this.lock) {
            try {
                if (this.released) {
                    throw new IllegalStateException("Accessory capabilities were released, unable to add capability!");
                }
                this.capabilityList.add(accessoryCapability);
                if (this.initialized) {
                    accessoryCapability.initialize(this.descriptor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting(otherwise = 5)
    public int getSize() {
        synchronized (this.lock) {
            try {
                List<AccessoryCapability> list = this.capabilityList;
                if (list == null) {
                    return 0;
                }
                return list.size();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean handleData(SizedSource sizedSource, int i) throws Exception {
        synchronized (this.lock) {
            try {
                if (this.released) {
                    Logger.w("Accessory capabilities were released and should not handle a packet!");
                    return false;
                }
                List<AccessoryStream> list = this.streamList.get(i);
                ArrayList arrayList = list == null ? null : new ArrayList(list);
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((AccessoryStream) arrayList.get(i2)).handleData(sizedSource)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initialize() {
        synchronized (this.lock) {
            try {
                if (!this.released && !this.initialized) {
                    this.initialized = true;
                    for (int size = this.capabilityList.size() - 1; size >= 0; size--) {
                        this.capabilityList.get(size).initialize(this.descriptor);
                    }
                }
            } finally {
            }
        }
    }

    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        reset();
    }

    public void remove(AccessoryCapability accessoryCapability) {
        Preconditions.notNull(accessoryCapability, "capability");
        synchronized (this.lock) {
            try {
                if (this.capabilityList.remove(accessoryCapability)) {
                    accessoryCapability.dispose(this.descriptor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
