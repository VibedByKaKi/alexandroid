package com.amazon.coral.model;

import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TraitRepositoryImpl implements TraitRepository {
    private final Map<String, TraitDescriptor> traits;

    public TraitRepositoryImpl(Map<String, TraitDescriptor> map) {
        if (map != null) {
            this.traits = map;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("traits cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.model.TraitRepository
    public boolean containsTrait(String str) {
        return this.traits.containsKey(str);
    }

    @Override // com.amazon.coral.model.TraitRepository
    public TraitDescriptor get(String str) {
        return this.traits.get(str);
    }
}
