package com.amazon.ion.system;

import com.amazon.ion.IonCatalog;
import com.amazon.ion.IonSystem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public final class SystemFactory {
    @Deprecated
    public static IonSystem newSystem(IonCatalog ionCatalog) {
        return IonSystemBuilder.standard().withCatalog(ionCatalog).build();
    }

    @Deprecated
    public static IonSystem newSystem() {
        return IonSystemBuilder.standard().build();
    }
}
