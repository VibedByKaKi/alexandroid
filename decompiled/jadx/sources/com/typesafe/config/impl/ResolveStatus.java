package com.typesafe.config.impl;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
enum ResolveStatus {
    UNRESOLVED,
    RESOLVED;

    public static final ResolveStatus fromBoolean(boolean z) {
        return z ? RESOLVED : UNRESOLVED;
    }

    public static final ResolveStatus fromValues(Collection<? extends AbstractConfigValue> collection) {
        Iterator<? extends AbstractConfigValue> it2 = collection.iterator();
        while (it2.hasNext()) {
            ResolveStatus resolveStatus = it2.next().resolveStatus();
            ResolveStatus resolveStatus2 = UNRESOLVED;
            if (resolveStatus == resolveStatus2) {
                return resolveStatus2;
            }
        }
        return RESOLVED;
    }
}
