package org.apache.commons.text.similarity;

import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LevenshteinDistance implements EditDistance<Integer> {
    private static final LevenshteinDistance INSTANCE = new LevenshteinDistance();
    private final Integer threshold;

    public LevenshteinDistance(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.threshold = num;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Threshold must not be negative");
            throw null;
        }
    }

    public static LevenshteinDistance getDefaultInstance() {
        return INSTANCE;
    }

    private static <E> int limitedCompare(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2, int i) {
        int i2;
        int i3;
        SimilarityInput<E> similarityInput3;
        SimilarityInput<E> similarityInput4;
        if (similarityInput == null || similarityInput2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CharSequences must not be null");
            return 0;
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Threshold must not be negative");
            return 0;
        }
        int length = similarityInput.length();
        int length2 = similarityInput2.length();
        int i4 = -1;
        if (length == 0) {
            if (length2 <= i) {
                return length2;
            }
            return -1;
        }
        if (length2 == 0) {
            if (length <= i) {
                return length;
            }
            return -1;
        }
        if (length > length2) {
            i3 = similarityInput.length();
            i2 = length2;
            similarityInput4 = similarityInput;
            similarityInput3 = similarityInput2;
        } else {
            i2 = length;
            i3 = length2;
            similarityInput3 = similarityInput;
            similarityInput4 = similarityInput2;
        }
        if (i3 - i2 > i) {
            return -1;
        }
        int i5 = i2 + 1;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        int i6 = 1;
        int min = Math.min(i2, i) + 1;
        char c = 0;
        for (int i7 = 0; i7 < min; i7++) {
            iArr[i7] = i7;
        }
        Arrays.fill(iArr, min, i5, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i8 = 1;
        while (i8 <= i3) {
            E at = similarityInput4.at(i8 - 1);
            iArr2[c] = i8;
            int max = Math.max(i6, i8 - i);
            int min2 = i8 > Integer.MAX_VALUE - i ? i2 : Math.min(i2, i8 + i);
            if (max > i6) {
                iArr2[max - 1] = Integer.MAX_VALUE;
            }
            int i9 = Integer.MAX_VALUE;
            while (max <= min2) {
                int i10 = i4;
                int i11 = max - 1;
                int i12 = i6;
                if (similarityInput3.at(i11).equals(at)) {
                    iArr2[max] = iArr[i11];
                } else {
                    iArr2[max] = Math.min(Math.min(iArr2[i11], iArr[max]), iArr[i11]) + 1;
                }
                i9 = Math.min(i9, iArr2[max]);
                max++;
                i6 = i12;
                i4 = i10;
            }
            int i13 = i4;
            int i14 = i6;
            if (i9 > i) {
                return i13;
            }
            i8++;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
            i6 = i14;
            i4 = i13;
            c = 0;
        }
        int i15 = i4;
        int i16 = iArr[i2];
        return i16 <= i ? i16 : i15;
    }

    private static <E> int unlimitedCompare(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        if (similarityInput == null || similarityInput2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CharSequences must not be null");
            return 0;
        }
        int length = similarityInput.length();
        int length2 = similarityInput2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = similarityInput.length();
            length = length2;
        } else {
            similarityInput2 = similarityInput;
            similarityInput = similarityInput2;
        }
        int[] iArr = new int[length + 1];
        for (int i = 0; i <= length; i++) {
            iArr[i] = i;
        }
        for (int i2 = 1; i2 <= length2; i2++) {
            int i3 = iArr[0];
            E at = similarityInput.at(i2 - 1);
            iArr[0] = i2;
            int i4 = 1;
            while (i4 <= length) {
                int i5 = iArr[i4];
                int i6 = i4 - 1;
                iArr[i4] = Math.min(Math.min(iArr[i6] + 1, iArr[i4] + 1), i3 + (!similarityInput2.at(i6).equals(at) ? 1 : 0));
                i4++;
                i3 = i5;
            }
        }
        return iArr[length];
    }

    public <E> Integer apply(SimilarityInput<E> similarityInput, SimilarityInput<E> similarityInput2) {
        Integer num = this.threshold;
        return num != null ? Integer.valueOf(limitedCompare(similarityInput, similarityInput2, num.intValue())) : Integer.valueOf(unlimitedCompare(similarityInput, similarityInput2));
    }

    public Integer getThreshold() {
        return this.threshold;
    }

    @Deprecated
    public LevenshteinDistance() {
        this(null);
    }

    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        return apply((SimilarityInput) SimilarityInput.input(charSequence), (SimilarityInput) SimilarityInput.input(charSequence2));
    }
}
