package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FuzzyMatcher {
    public static final double DEFAULT_WORD_SIMILARITY_THRESHOLD = 0.8d;

    private FuzzyMatcher() {
    }

    private static int[] evaluateWindow(@NonNull List<String> list, @NonNull List<String> list2, int i, double d) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int i6 = i + i5;
            if (i6 >= list2.size() || wordSimilarity(list.get(i5), list2.get(i6)) < d) {
                i4 = 0;
            } else {
                i2++;
                i4++;
                if (i4 > i3) {
                    i3 = i4;
                }
            }
        }
        return new int[]{i2, i3};
    }

    private static boolean isPunctuation(char c) {
        int type = Character.getType(c);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static int levenshteinDistance(@NonNull String str, @NonNull String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        int i = length2 + 1;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        for (int i2 = 0; i2 <= length2; i2++) {
            iArr[i2] = i2;
        }
        int i3 = 1;
        while (i3 <= length) {
            iArr2[0] = i3;
            for (int i4 = 1; i4 <= length2; i4++) {
                int i5 = i4 - 1;
                iArr2[i4] = Math.min(Math.min(iArr2[i5] + 1, iArr[i4] + 1), iArr[i5] + (str.charAt(i3 + (-1)) == str2.charAt(i5) ? 0 : 1));
            }
            i3++;
            int[] iArr3 = iArr;
            iArr = iArr2;
            iArr2 = iArr3;
        }
        return iArr[length2];
    }

    @NonNull
    public static FuzzyMatchResult match(@NonNull String str, @NonNull String str2, double d) {
        List<String> list = tokenize(str);
        List<String> list2 = tokenize(str2);
        if (list.isEmpty() || list2.isEmpty()) {
            return FuzzyMatchResult.EMPTY;
        }
        char c = 0;
        char c2 = 1;
        int max = Math.max(list.size() <= list2.size() ? list2.size() - list.size() : 0, list2.size() - 1);
        double d2 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i <= max) {
            int[] evaluateWindow = evaluateWindow(list, list2, i, d);
            int i4 = evaluateWindow[c];
            int i5 = evaluateWindow[c2];
            double d3 = d2;
            double size = i4 / list.size();
            if (size > d3) {
                i3 = i5;
                i2 = i4;
                d2 = size;
            } else {
                d2 = d3;
            }
            i++;
            c = 0;
            c2 = 1;
        }
        return FuzzyMatchResult.create(d2, i2, i3);
    }

    @NonNull
    public static List<String> tokenize(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            while (i < length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            if (i >= length) {
                break;
            }
            int i2 = i;
            while (i2 < length && !Character.isWhitespace(str.charAt(i2))) {
                i2++;
            }
            while (i < i2 && isPunctuation(str.charAt(i))) {
                i++;
            }
            int i3 = i2;
            while (i3 > i && isPunctuation(str.charAt(i3 - 1))) {
                i3--;
            }
            if (i3 > i) {
                arrayList.add(str.substring(i, i3).toLowerCase(Locale.ROOT));
            }
            i = i2;
        }
        return arrayList;
    }

    public static double wordSimilarity(@NonNull String str, @NonNull String str2) {
        int levenshteinDistance = levenshteinDistance(str, str2);
        int max = Math.max(str.length(), str2.length());
        if (max == 0) {
            return 1.0d;
        }
        return 1.0d - (levenshteinDistance / max);
    }

    @NonNull
    public static FuzzyMatchResult match(@NonNull String str, @NonNull String str2) {
        return match(str, str2, 0.8d);
    }
}
