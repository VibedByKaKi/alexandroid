package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import java.util.Comparator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class g3 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MAPAgeClassificationManager.AgeClassification ageClassification = (MAPAgeClassificationManager.AgeClassification) obj;
        MAPAgeClassificationManager.AgeClassification ageClassification2 = (MAPAgeClassificationManager.AgeClassification) obj2;
        if (ageClassification == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("AgeClassification cannot be null");
            return 0;
        }
        l8 l8Var = new l8(ageClassification);
        if (ageClassification2 != null) {
            return l8Var.a(new l8(ageClassification2));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("AgeClassification cannot be null");
        return 0;
    }
}
