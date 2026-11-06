package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class l8 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final MAPAgeClassificationManager.AgeClassification f785a;
    public final int b;

    public l8(MAPAgeClassificationManager.AgeClassification ageClassification) {
        this.f785a = ageClassification;
        int i = k8.f767a[ageClassification.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else {
                if (i != 3) {
                    Gson$$ExternalSyntheticBUOutline0.m((Object) ageClassification, "Unknown AgeClassification: ");
                    throw null;
                }
                i2 = 0;
            }
        }
        this.b = i2;
    }

    public final int a(l8 l8Var) {
        return Integer.compare(this.b, l8Var.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((l8) obj).b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        if (this.b != l8Var.b) {
            return false;
        }
        MAPAgeClassificationManager.AgeClassification ageClassification = this.f785a;
        MAPAgeClassificationManager.AgeClassification ageClassification2 = l8Var.f785a;
        return ageClassification != null ? ageClassification.equals(ageClassification2) : ageClassification2 == null;
    }

    public final int hashCode() {
        int i = this.b + 59;
        MAPAgeClassificationManager.AgeClassification ageClassification = this.f785a;
        return (i * 59) + (ageClassification == null ? 43 : ageClassification.hashCode());
    }
}
