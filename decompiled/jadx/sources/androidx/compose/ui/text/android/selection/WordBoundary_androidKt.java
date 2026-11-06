package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"getWordStart", "", "Landroidx/compose/ui/text/android/selection/WordIterator;", "offset", "getWordEnd", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(@NotNull WordIterator wordIterator, int i) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i)) ? wordIterator.getPunctuationEnd(i) : wordIterator.getNextWordEndOnTwoWordBoundary(i);
        return punctuationEnd == -1 ? i : punctuationEnd;
    }

    public static final int getWordStart(@NotNull WordIterator wordIterator, int i) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i)) ? wordIterator.getPunctuationBeginning(i) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        return punctuationBeginning == -1 ? i : punctuationBeginning;
    }
}
