package com.amazon.apl.android.utils;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TDigest {
    private final double compression;
    private final List<Centroid> centroids = new ArrayList();
    private double count = 0.0d;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Centroid implements Comparable<Centroid> {
        private double count;
        private double mean;

        public Centroid(double d, double d2) {
            this.mean = d;
            this.count = d2;
        }

        public void add(double d, double d2) {
            double d3 = this.mean;
            double d4 = this.count;
            double d5 = (d * d2) + (d3 * d4);
            double d6 = d4 + d2;
            this.count = d6;
            this.mean = d5 / d6;
        }

        @Override // java.lang.Comparable
        public int compareTo(Centroid centroid) {
            return Double.compare(this.mean, centroid.mean);
        }
    }

    public TDigest(double d) {
        this.compression = d;
    }

    private void compress() {
        ArrayList arrayList = new ArrayList();
        double d = 0.0d;
        Centroid centroid = null;
        for (Centroid centroid2 : this.centroids) {
            if (centroid == null) {
                centroid = new Centroid(centroid2.mean, centroid2.count);
            } else {
                double d2 = this.count;
                double d3 = d / d2;
                if (centroid.count + centroid2.count <= ((1.0d - d3) * ((d2 * 4.0d) * d3)) / this.compression) {
                    centroid.add(centroid2.mean, centroid2.count);
                } else {
                    arrayList.add(centroid);
                    centroid = new Centroid(centroid2.mean, centroid2.count);
                }
            }
            d += centroid2.count;
        }
        if (centroid != null) {
            arrayList.add(centroid);
        }
        this.centroids.clear();
        this.centroids.addAll(arrayList);
    }

    private double sumWeight(int i, int i2) {
        double d = 0.0d;
        while (i < i2) {
            d += this.centroids.get(i).count;
            i++;
        }
        return d;
    }

    @VisibleForTesting
    public void add(double d, double d2) {
        Centroid centroid;
        boolean isEmpty = this.centroids.isEmpty();
        List<Centroid> list = this.centroids;
        if (isEmpty) {
            list.add(new Centroid(d, d2));
            this.count = d2;
            return;
        }
        int binarySearch = Collections.binarySearch(list, new Centroid(d, 0.0d));
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch <= 0 || binarySearch >= this.centroids.size()) {
            List<Centroid> list2 = this.centroids;
            centroid = binarySearch == 0 ? list2.get(0) : (Centroid) ErrorUtils$$ExternalSyntheticOutline0.m(list2, 1);
        } else {
            centroid = this.centroids.get(binarySearch - 1);
            Centroid centroid2 = this.centroids.get(binarySearch);
            if (Math.abs(centroid.mean - d) < Math.abs(centroid2.mean - d)) {
                binarySearch--;
            } else {
                centroid = centroid2;
            }
        }
        double sumWeight = (centroid.count / 2.0d) + sumWeight(0, binarySearch);
        double d3 = this.count;
        double d4 = sumWeight / (d3 + d2);
        if (centroid.count + d2 <= ((1.0d - d4) * (((d3 + d2) * 4.0d) * d4)) / this.compression) {
            centroid.add(d, d2);
        } else {
            this.centroids.add(binarySearch, new Centroid(d, d2));
        }
        this.count += d2;
        if (this.centroids.size() > this.compression * 10.0d) {
            compress();
        }
    }

    public double getSum() {
        double d = 0.0d;
        for (int i = 0; i < this.centroids.size(); i++) {
            d += this.centroids.get(i).count * this.centroids.get(i).mean;
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[EDGE_INSN: B:16:0x007f->B:17:0x007f BREAK  A[LOOP:0: B:6:0x001c->B:22:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:6:0x001c->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double trimmedMean(double r19, double r21) {
        /*
            r18 = this;
            r0 = r18
            java.util.List<com.amazon.apl.android.utils.TDigest$Centroid> r1 = r0.centroids
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            double r4 = r0.count
            double r6 = r19 * r4
            double r4 = r4 * r21
            java.util.List<com.amazon.apl.android.utils.TDigest$Centroid> r0 = r0.centroids
            java.util.Iterator r0 = r0.iterator()
            r8 = r2
            r10 = r8
            r12 = r10
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            com.amazon.apl.android.utils.TDigest$Centroid r1 = (com.amazon.apl.android.utils.TDigest.Centroid) r1
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 < 0) goto L46
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
            double r14 = r14 + r8
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 > 0) goto L46
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$000(r1)
            double r16 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
            double r14 = r14 * r16
            double r10 = r10 + r14
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
        L44:
            double r12 = r12 + r14
            goto L76
        L46:
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 >= 0) goto L62
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
            double r14 = r14 + r8
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 <= 0) goto L62
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
            double r14 = r14 + r8
            double r14 = r14 - r6
            double r16 = com.amazon.apl.android.utils.TDigest.Centroid.access$000(r1)
        L5d:
            double r16 = r16 * r14
            double r10 = r16 + r10
            goto L44
        L62:
            int r14 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r14 >= 0) goto L76
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
            double r14 = r14 + r8
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 <= 0) goto L76
            double r14 = r4 - r8
            double r16 = com.amazon.apl.android.utils.TDigest.Centroid.access$000(r1)
            goto L5d
        L76:
            double r14 = com.amazon.apl.android.utils.TDigest.Centroid.access$100(r1)
            double r8 = r8 + r14
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 < 0) goto L1c
        L7f:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L85
            double r10 = r10 / r12
            return r10
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.apl.android.utils.TDigest.trimmedMean(double, double):double");
    }

    public void add(double d) {
        add(d, 1.0d);
    }
}
