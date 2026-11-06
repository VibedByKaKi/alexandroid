package com.amazon.devicesetup.provisioning.data.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ConfigurationKeySet {
    private final Collection<String> keySet;

    public ConfigurationKeySet(Collection<String> collection) {
        if (collection != null) {
            this.keySet = new ArrayList(collection);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("configurations can not be null or empty");
            throw null;
        }
    }

    public Collection<String> getKeySet() {
        return Collections.unmodifiableCollection(this.keySet);
    }

    public void validate() {
        if (this.keySet != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("configurations can not be null or empty");
    }
}
