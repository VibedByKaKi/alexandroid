package org.apache.commons.text.similarity;

import java.lang.reflect.Array;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LevenshteinDetailedDistance implements EditDistance<LevenshteinResults> {
    private static final LevenshteinDetailedDistance INSTANCE = new LevenshteinDetailedDistance();
    private final Integer threshold;

    public LevenshteinDetailedDistance(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.threshold = num;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Threshold must not be negative");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r16 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r4 = r4 + 1;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        r3 = r3 + 1;
        r6 = true;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007f, code lost:
    
        if (r16 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <E> org.apache.commons.text.similarity.LevenshteinResults findDetailedResults(org.apache.commons.text.similarity.SimilarityInput<E> r13, org.apache.commons.text.similarity.SimilarityInput<E> r14, int[][] r15, boolean r16) {
        /*
            int r0 = r14.length()
            int r1 = r13.length()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        Lc:
            if (r0 < 0) goto L8b
            if (r1 < 0) goto L8b
            r6 = -1
            if (r1 != 0) goto L15
            r7 = r6
            goto L1b
        L15:
            r7 = r15[r0]
            int r8 = r1 + (-1)
            r7 = r7[r8]
        L1b:
            if (r0 != 0) goto L1f
            r8 = r6
            goto L25
        L1f:
            int r8 = r0 + (-1)
            r8 = r15[r8]
            r8 = r8[r1]
        L25:
            if (r0 <= 0) goto L32
            if (r1 <= 0) goto L32
            int r9 = r0 + (-1)
            r9 = r15[r9]
            int r10 = r1 + (-1)
            r9 = r9[r10]
            goto L33
        L32:
            r9 = r6
        L33:
            if (r7 != r6) goto L3a
            if (r8 != r6) goto L3a
            if (r9 != r6) goto L3a
            goto L8b
        L3a:
            r10 = r15[r0]
            r10 = r10[r1]
            if (r1 <= 0) goto L59
            if (r0 <= 0) goto L59
            int r11 = r1 + (-1)
            java.lang.Object r11 = r13.at(r11)
            int r12 = r0 + (-1)
            java.lang.Object r12 = r14.at(r12)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L59
        L54:
            int r1 = r1 + (-1)
            int r0 = r0 + (-1)
            goto Lc
        L59:
            int r11 = r10 + (-1)
            r12 = 1
            if (r11 != r7) goto L62
            if (r10 > r9) goto L62
            if (r10 <= r8) goto L66
        L62:
            if (r9 != r6) goto L73
            if (r8 != r6) goto L73
        L66:
            int r1 = r1 + (-1)
            if (r16 == 0) goto L6e
        L6a:
            int r4 = r4 + 1
            r6 = r2
            goto L84
        L6e:
            int r3 = r3 + 1
            r6 = r12
            r12 = r2
            goto L84
        L73:
            if (r11 != r8) goto L79
            if (r10 > r9) goto L79
            if (r10 <= r7) goto L7d
        L79:
            if (r9 != r6) goto L82
            if (r7 != r6) goto L82
        L7d:
            int r0 = r0 + (-1)
            if (r16 == 0) goto L6a
            goto L6e
        L82:
            r6 = r2
            r12 = r6
        L84:
            if (r12 != 0) goto Lc
            if (r6 != 0) goto Lc
            int r5 = r5 + 1
            goto L54
        L8b:
            org.apache.commons.text.similarity.LevenshteinResults r13 = new org.apache.commons.text.similarity.LevenshteinResults
            int r14 = r4 + r3
            int r14 = r14 + r5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r13.<init>(r14, r0, r1, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.text.similarity.LevenshteinDetailedDistance.findDetailedResults(org.apache.commons.text.similarity.SimilarityInput, org.apache.commons.text.similarity.SimilarityInput, int[][], boolean):org.apache.commons.text.similarity.LevenshteinResults");
    }

    public static LevenshteinDetailedDistance getDefaultInstance() {
        return INSTANCE;
    }

    private static <E> LevenshteinResults limitedCompare(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2, int i) {
        boolean z;
        int i2;
        int i3;
        SimilarityInput<E> similarityInput3;
        SimilarityInput<E> similarityInput4;
        char c = 0;
        if (similarityInput == null || similarityInput2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CharSequences must not be null");
            return null;
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Threshold must not be negative");
            return null;
        }
        int length = similarityInput.length();
        int length2 = similarityInput2.length();
        if (length == 0) {
            return length2 <= i ? new LevenshteinResults(Integer.valueOf(length2), Integer.valueOf(length2), 0, 0) : new LevenshteinResults(-1, 0, 0, 0);
        }
        if (length2 == 0) {
            return length <= i ? new LevenshteinResults(Integer.valueOf(length), 0, Integer.valueOf(length), 0) : new LevenshteinResults(-1, 0, 0, 0);
        }
        int i4 = 1;
        if (length > length2) {
            i3 = similarityInput.length();
            i2 = length2;
            z = true;
            similarityInput4 = similarityInput;
            similarityInput3 = similarityInput2;
        } else {
            z = false;
            i2 = length;
            i3 = length2;
            similarityInput3 = similarityInput;
            similarityInput4 = similarityInput2;
        }
        int i5 = i2 + 1;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3 + 1, i5);
        for (int i6 = 0; i6 <= i2; i6++) {
            iArr3[0][i6] = i6;
        }
        for (int i7 = 0; i7 <= i3; i7++) {
            iArr3[i7][0] = i7;
        }
        int min = Math.min(i2, i) + 1;
        for (int i8 = 0; i8 < min; i8++) {
            iArr[i8] = i8;
        }
        int i9 = Integer.MAX_VALUE;
        Arrays.fill(iArr, min, i5, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i10 = 1;
        while (i10 <= i3) {
            E at = similarityInput4.at(i10 - 1);
            iArr2[c] = i10;
            int max = Math.max(i4, i10 - i);
            int i11 = i9;
            int min2 = i10 > i11 - i ? i2 : Math.min(i2, i10 + i);
            if (max > min2) {
                return new LevenshteinResults(-1, 0, 0, 0);
            }
            if (max > i4) {
                iArr2[max - 1] = i11;
            }
            while (max <= min2) {
                int i12 = i4;
                int i13 = max - 1;
                int i14 = max;
                if (similarityInput3.at(i13).equals(at)) {
                    iArr2[i14] = iArr[i13];
                } else {
                    iArr2[i14] = Math.min(Math.min(iArr2[i13], iArr[i14]), iArr[i13]) + 1;
                }
                iArr3[i10][i14] = iArr2[i14];
                max = i14 + 1;
                i4 = i12;
            }
            i10++;
            int[] iArr4 = iArr2;
            iArr2 = iArr;
            iArr = iArr4;
            i9 = i11;
            c = 0;
        }
        return iArr[i2] <= i ? findDetailedResults(similarityInput3, similarityInput4, iArr3, z) : new LevenshteinResults(-1, 0, 0, 0);
    }

    private static <E> LevenshteinResults unlimitedCompare(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        boolean z;
        int i;
        int i2;
        SimilarityInput<E> similarityInput3;
        SimilarityInput<E> similarityInput4;
        char c = 0;
        if (similarityInput == null || similarityInput2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CharSequences must not be null");
            return null;
        }
        int length = similarityInput.length();
        int length2 = similarityInput2.length();
        if (length == 0) {
            return new LevenshteinResults(Integer.valueOf(length2), Integer.valueOf(length2), 0, 0);
        }
        if (length2 == 0) {
            return new LevenshteinResults(Integer.valueOf(length), 0, Integer.valueOf(length), 0);
        }
        if (length > length2) {
            z = true;
            i2 = similarityInput.length();
            i = length2;
            similarityInput4 = similarityInput;
            similarityInput3 = similarityInput2;
        } else {
            z = false;
            i = length;
            i2 = length2;
            similarityInput3 = similarityInput;
            similarityInput4 = similarityInput2;
        }
        int i3 = i + 1;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 1, i3);
        for (int i4 = 0; i4 <= i; i4++) {
            iArr3[0][i4] = i4;
        }
        for (int i5 = 0; i5 <= i2; i5++) {
            iArr3[i5][0] = i5;
        }
        for (int i6 = 0; i6 <= i; i6++) {
            iArr[i6] = i6;
        }
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int i7 = 1;
        while (i7 <= i2) {
            E at = similarityInput4.at(i7 - 1);
            iArr5[c] = i7;
            for (int i8 = 1; i8 <= i; i8++) {
                int i9 = i8 - 1;
                int min = Math.min(Math.min(iArr5[i9] + 1, iArr4[i8] + 1), iArr4[i9] + (!similarityInput3.at(i9).equals(at) ? 1 : 0));
                iArr5[i8] = min;
                iArr3[i7][i8] = min;
            }
            i7++;
            int[] iArr6 = iArr4;
            iArr4 = iArr5;
            iArr5 = iArr6;
            c = 0;
        }
        return findDetailedResults(similarityInput3, similarityInput4, iArr3, z);
    }

    public <E> LevenshteinResults apply(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        Integer num = this.threshold;
        return num != null ? limitedCompare(similarityInput, similarityInput2, num.intValue()) : unlimitedCompare(similarityInput, similarityInput2);
    }

    public Integer getThreshold() {
        return this.threshold;
    }

    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public LevenshteinResults apply(CharSequence charSequence, CharSequence charSequence2) {
        return apply((SimilarityInput) SimilarityInput.input(charSequence), (SimilarityInput) SimilarityInput.input(charSequence2));
    }

    @Deprecated
    public LevenshteinDetailedDistance() {
        this(null);
    }
}
