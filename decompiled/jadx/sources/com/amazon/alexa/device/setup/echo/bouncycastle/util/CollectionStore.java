package com.amazon.alexa.device.setup.echo.bouncycastle.util;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CollectionStore implements Store {
    private final Collection _local;

    public CollectionStore(Collection collection) {
        this._local = new ArrayList(collection);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.util.Store
    public Collection getMatches(Selector selector) {
        if (selector == null) {
            return new ArrayList(this._local);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this._local) {
            if (selector.match(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
