package com.amazon.whisperjoin.common.sharedtypes.radios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RadioPreferences {
    private final Collection<RadioPreference> mPreferences;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RadioPreference {
        long getMaximumWaitTime(TimeUnit timeUnit);

        long getMinimumSignalStrength();

        String getRadioType();
    }

    public RadioPreferences(Collection<RadioPreference> collection) {
        if (collection == null || collection.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("preferences must not be null");
            throw null;
        }
        this.mPreferences = new ArrayList(collection);
    }

    public Collection<RadioPreference> getRadioPreferences() {
        return Collections.unmodifiableCollection(this.mPreferences);
    }
}
