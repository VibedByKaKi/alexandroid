package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface EventStore {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface EventIterator extends Iterator<String> {
        String peek();

        void removeReadEvents();
    }

    EventIterator iterator();

    boolean put(String str) throws EventStoreException;
}
