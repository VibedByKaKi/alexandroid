package com.amazon.whisperjoin.common.sharedtypes.radios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RadioCollection {
    private ArrayList<String> mRadios;

    public RadioCollection(Collection<String> collection) {
        if (collection == null || collection.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("radios can not be null, and must have size > 0");
            throw null;
        }
        this.mRadios = new ArrayList<>(collection);
    }

    public Collection<String> getRadios() {
        return Collections.unmodifiableList(this.mRadios);
    }
}
