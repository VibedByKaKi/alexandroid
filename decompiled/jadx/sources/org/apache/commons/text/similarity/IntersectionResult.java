package org.apache.commons.text.similarity;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IntersectionResult {
    private final int intersection;
    private final int sizeA;
    private final int sizeB;

    public IntersectionResult(int i, int i2, int i3) {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Set size |A| is not positive: "));
            throw null;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Set size |B| is not positive: "));
            throw null;
        }
        if (i3 < 0 || i3 > Math.min(i, i2)) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i3, "Invalid intersection of A and B: "));
            throw null;
        }
        this.sizeA = i;
        this.sizeB = i2;
        this.intersection = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IntersectionResult intersectionResult = (IntersectionResult) obj;
            if (this.sizeA == intersectionResult.sizeA && this.sizeB == intersectionResult.sizeB && this.intersection == intersectionResult.intersection) {
                return true;
            }
        }
        return false;
    }

    public int getIntersection() {
        return this.intersection;
    }

    public int getSizeA() {
        return this.sizeA;
    }

    public int getSizeB() {
        return this.sizeB;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.sizeA), Integer.valueOf(this.sizeB), Integer.valueOf(this.intersection));
    }

    public String toString() {
        return "Size A: " + this.sizeA + ", Size B: " + this.sizeB + ", Intersection: " + this.intersection;
    }
}
