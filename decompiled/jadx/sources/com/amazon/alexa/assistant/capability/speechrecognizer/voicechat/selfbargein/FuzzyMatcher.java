package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J@\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u001d\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001eJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0000¢\u0006\u0002\b\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/FuzzyMatcher;", "", "<init>", "()V", "DEFAULT_WORD_SIMILARITY_THRESHOLD", "", "match", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/FuzzyMatchResult;", LivePreviewBundleKeys.TRANSCRIPT, "", "caption", "wordSimilarityThreshold", "tokenize", "", "text", "tokenize$voice_release", "isPunctuation", "", "c", "", "evaluateWindow", "Lkotlin/Pair;", "", "transcriptWords", "captionWords", "offset", "threshold", "wordSimilarity", "word1", "word2", "wordSimilarity$voice_release", "levenshteinDistance", "a", "b", "levenshteinDistance$voice_release", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FuzzyMatcher {
    public static final double DEFAULT_WORD_SIMILARITY_THRESHOLD = 0.8d;

    @NotNull
    public static final FuzzyMatcher INSTANCE = new FuzzyMatcher();

    private FuzzyMatcher() {
    }

    private final Pair<Integer, Integer> evaluateWindow(List<String> transcriptWords, List<String> captionWords, int offset, double threshold) {
        int size = transcriptWords.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = offset + i4;
            if (i5 >= captionWords.size() || wordSimilarity$voice_release(transcriptWords.get(i4), captionWords.get(i5)) < threshold) {
                i3 = 0;
            } else {
                i++;
                i3++;
                i2 = Math.max(i2, i3);
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final boolean isPunctuation(char c) {
        int type = Character.getType(c);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static /* synthetic */ FuzzyMatchResult match$default(FuzzyMatcher fuzzyMatcher, String str, String str2, double d, int i, Object obj) {
        if ((i & 4) != 0) {
            d = 0.8d;
        }
        return fuzzyMatcher.match(str, str2, d);
    }

    public final int levenshteinDistance$voice_release(@NotNull String a2, @NotNull String b) {
        a2.getClass();
        b.getClass();
        int length = a2.length();
        int length2 = b.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        int i = length2 + 1;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        if (length2 >= 0) {
            int i2 = 0;
            while (true) {
                iArr[i2] = i2;
                if (i2 == length2) {
                    break;
                }
                i2++;
            }
        }
        if (1 <= length) {
            iArr = iArr2;
            int[] iArr3 = iArr;
            int i3 = 1;
            while (true) {
                iArr[0] = i3;
                if (1 <= length2) {
                    int i4 = 1;
                    while (true) {
                        int i5 = i4 - 1;
                        iArr[i4] = Math.min(iArr[i5] + 1, Math.min(iArr3[i4] + 1, iArr3[i5] + (a2.charAt(i3 + (-1)) == b.charAt(i5) ? 0 : 1)));
                        if (i4 == length2) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                int[] iArr4 = iArr;
                iArr = iArr3;
                iArr3 = iArr4;
            }
        }
        return iArr[length2];
    }

    @NotNull
    public final FuzzyMatchResult match(@NotNull String transcript, @NotNull String caption, double wordSimilarityThreshold) {
        double d;
        int i;
        transcript.getClass();
        caption.getClass();
        List<String> list = tokenize$voice_release(transcript);
        List<String> list2 = tokenize$voice_release(caption);
        if (list.isEmpty() || list2.isEmpty()) {
            return FuzzyMatchResult.INSTANCE.getEMPTY();
        }
        int i2 = 0;
        int max = Math.max(list.size() <= list2.size() ? list2.size() - list.size() : 0, list2.size() - 1);
        if (max >= 0) {
            int i3 = 0;
            d = 0.0d;
            int i4 = 0;
            i = 0;
            while (true) {
                Pair<Integer, Integer> evaluateWindow = evaluateWindow(list, list2, i3, wordSimilarityThreshold);
                int i5 = i3;
                int intValue = evaluateWindow.component1().intValue();
                int intValue2 = evaluateWindow.component2().intValue();
                double size = intValue / list.size();
                if (size > d) {
                    i4 = intValue;
                    i = intValue2;
                    d = size;
                }
                if (i5 == max) {
                    break;
                }
                i3 = i5 + 1;
            }
            i2 = i4;
        } else {
            d = 0.0d;
            i = 0;
        }
        return new FuzzyMatchResult(d, i2, i);
    }

    @NotNull
    public final List<String> tokenize$voice_release(@NotNull String text) {
        text.getClass();
        ArrayList arrayList = new ArrayList();
        int length = text.length();
        int i = 0;
        while (i < length) {
            while (i < length && Character.isWhitespace(text.charAt(i))) {
                i++;
            }
            if (i >= length) {
                break;
            }
            int i2 = i;
            while (i2 < length && !Character.isWhitespace(text.charAt(i2))) {
                i2++;
            }
            while (i < i2 && isPunctuation(text.charAt(i))) {
                i++;
            }
            int i3 = i2;
            while (i3 > i && isPunctuation(text.charAt(i3 - 1))) {
                i3--;
            }
            if (i3 > i) {
                String substring = text.substring(i, i3);
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = substring.toLowerCase(locale);
                lowerCase.getClass();
                arrayList.add(lowerCase);
            }
            i = i2;
        }
        return arrayList;
    }

    public final double wordSimilarity$voice_release(@NotNull String word1, @NotNull String word2) {
        word1.getClass();
        word2.getClass();
        int levenshteinDistance$voice_release = levenshteinDistance$voice_release(word1, word2);
        int max = Math.max(word1.length(), word2.length());
        if (max == 0) {
            return 1.0d;
        }
        return 1.0d - (levenshteinDistance$voice_release / max);
    }
}
