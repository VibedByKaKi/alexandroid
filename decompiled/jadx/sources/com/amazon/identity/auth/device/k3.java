package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import com.amazon.identity.auth.device.api.MAPFuture;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class k3 implements l3 {
    @Override // com.amazon.identity.auth.device.l3
    public final MAPFuture a(Integer num, Integer num2, Bundle bundle, Callback callback) {
        throw new UnsupportedOperationException("updateAge is not supported on FireOS");
    }

    @Override // com.amazon.identity.auth.device.l3
    public final MAPAgeClassificationManager.AgeSignalCategory b() {
        throw new UnsupportedOperationException("getAgeSignalCategory is not supported on FireOS");
    }

    @Override // com.amazon.identity.auth.device.l3
    public final MAPAgeClassificationManager.AgeClassification a(Bundle bundle) {
        throw new UnsupportedOperationException("getAge is not supported on FireOS");
    }

    @Override // com.amazon.identity.auth.device.l3
    public final void a(MAPAgeClassificationManager.AgeClassificationListener ageClassificationListener) {
        throw new UnsupportedOperationException("registerAgeClassificationListener is not supported on FireOS");
    }

    @Override // com.amazon.identity.auth.device.l3
    public final void a() {
        throw new UnsupportedOperationException("unregisterAgeClassificationListener is not supported on FireOS");
    }

    @Override // com.amazon.identity.auth.device.l3
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        throw new UnsupportedOperationException("setAgeBoundary is not supported on FireOS");
    }
}
