package com.amazon.alexa.mosaic.apl.dependencies;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.storage.PersistentStorage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class VoiceUserPreference {

    @VisibleForTesting
    static final String BMCL_ENTITLEMENT_STATUS = "bmcl_entitlement_status";

    @VisibleForTesting
    static final String ENTITLED = "ENTITLED";

    @VisibleForTesting
    static final String NOT_ENTITLED = "NOT_ENTITLED";

    @VisibleForTesting
    static final String VOICE_STORAGE = "voice";
    private PersistentStorage mStorage;

    @VisibleForTesting
    public VoiceUserPreference(PersistentStorage.Factory factory) {
        this.mStorage = factory.create("voice");
    }

    private synchronized PersistentStorage getStorage() {
        try {
            if (this.mStorage == null) {
                this.mStorage = ((PersistentStorage.Factory) ComponentRegistry.getInstance().get(PersistentStorage.Factory.class).get()).create("voice");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mStorage;
    }

    public String getBmclEntitlementStatus() {
        return getStorage().getBoolean(BMCL_ENTITLEMENT_STATUS, false) ? ENTITLED : "NOT_ENTITLED";
    }

    public VoiceUserPreference() {
    }
}
