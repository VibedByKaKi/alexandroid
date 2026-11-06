package androidx.compose.foundation.text.input;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001TB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0014\u0010/\u001a\u00060\u0001j\u0002`\u00022\u0006\u00100\u001a\u000201H\u0016J\u0016\u0010/\u001a\u00060\u0001j\u0002`\u00022\b\u00102\u001a\u0004\u0018\u00010#H\u0016J&\u0010/\u001a\u00060\u0001j\u0002`\u00022\b\u00102\u001a\u0004\u0018\u00010#2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001bH\u0016J\u0006\u00105\u001a\u00020#J\u000e\u00106\u001a\u0002012\u0006\u00107\u001a\u00020\u001bJ\b\u00108\u001a\u000209H\u0002J \u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001bH\u0002J\u000e\u0010>\u001a\u0002092\u0006\u00107\u001a\u00020\u001bJ\u000e\u0010?\u001a\u0002092\u0006\u00107\u001a\u00020\u001bJ\u001e\u0010@\u001a\u0002092\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00102\u001a\u00020#J9\u0010@\u001a\u0002092\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00102\u001a\u00020#2\b\b\u0002\u0010A\u001a\u00020\u001b2\b\b\u0002\u0010B\u001a\u00020\u001bH\u0000¢\u0006\u0002\bCJ \u0010D\u001a\u0002092\u0006\u00107\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u0018H\u0002J\u001a\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bI\u0010,J\u0006\u0010J\u001a\u000209J\u0015\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020#H\u0000¢\u0006\u0002\bMJ\b\u0010N\u001a\u00020OH\u0016J(\u0010P\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u001f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010SR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\u00020\u001f8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R*\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialChanges", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "originalValue", "offsetMappingCalculator", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "backingChangeTracker", "buffer", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "changeTracker", "getChangeTracker", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changes", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges$annotations", "()V", "getChanges", "()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "hasSelection", "", "()Z", "length", "", "getLength", "()I", "originalSelection", "Landroidx/compose/ui/text/TextRange;", "getOriginalSelection-d9O1mEE", "()J", "originalText", "", "getOriginalText", "()Ljava/lang/CharSequence;", "getOriginalValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "value", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "selectionInChars", "J", "append", "char", "", "text", "start", "end", "asCharSequence", "charAt", "index", "clearChangeList", "", "onTextWillChange", "replaceStart", "replaceEnd", "newLength", "placeCursorAfterCharAt", "placeCursorBeforeCharAt", "replace", "textStart", "textEnd", "replace$foundation_release", "requireValidIndex", "startExclusive", "endExclusive", "requireValidRange", "range", "requireValidRange-5zc-tL8", "revertAllChanges", "setTextIfChanged", "newText", "setTextIfChanged$foundation_release", "toString", "", "toTextFieldCharSequence", "composition", "toTextFieldCharSequence-udt6zUU$foundation_release", "(JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "ChangeList", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,552:1\n1#2:553\n509#3,43:554\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n182#1:554,43\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;

    @Nullable
    private ChangeTracker backingChangeTracker;

    @NotNull
    private final PartialGapBuffer buffer;

    @Nullable
    private final OffsetMappingCalculator offsetMappingCalculator;

    @NotNull
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo1289getOriginalRangejx7JFs(int changeIndex);

        /* renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo1290getRangejx7JFs(int changeIndex);
    }

    public TextFieldBuffer(@NotNull TextFieldCharSequence textFieldCharSequence, @Nullable ChangeTracker changeTracker, @NotNull TextFieldCharSequence textFieldCharSequence2, @Nullable OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.getSelection();
    }

    private final void clearChangeList() {
        getChangeTracker().clearChanges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ChangeTracker getChangeTracker() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r5 == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onTextWillChange(int r4, int r5, int r6) {
        /*
            r3 = this;
            androidx.compose.foundation.text.input.internal.ChangeTracker r0 = r3.getChangeTracker()
            r0.trackChange(r4, r5, r6)
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r0 = r3.offsetMappingCalculator
            if (r0 == 0) goto Le
            r0.recordEditOperation(r4, r5, r6)
        Le:
            int r0 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r4, r5)
            long r1 = r3.getSelectionInChars()
            int r5 = androidx.compose.ui.text.TextRange.m6828getMinimpl(r1)
            long r1 = r3.getSelectionInChars()
            int r1 = androidx.compose.ui.text.TextRange.m6827getMaximpl(r1)
            if (r1 >= r0) goto L29
            return
        L29:
            if (r5 > r0) goto L35
            if (r4 > r1) goto L35
            int r4 = r4 - r0
            int r6 = r6 - r4
            if (r5 != r1) goto L32
            goto L40
        L32:
            int r0 = r1 + r6
            goto L4a
        L35:
            if (r5 <= r0) goto L3c
            if (r1 >= r4) goto L3c
            int r0 = r0 + r6
            r5 = r0
            goto L4a
        L3c:
            if (r5 < r4) goto L42
            int r4 = r4 - r0
            int r6 = r6 - r4
        L40:
            int r5 = r5 + r6
            goto L32
        L42:
            if (r0 >= r5) goto L4a
            int r5 = r0 + r6
            int r4 = r4 - r0
            int r6 = r6 - r4
            int r0 = r6 + r1
        L4a:
            long r4 = androidx.compose.ui.text.TextRangeKt.TextRange(r5, r0)
            r3.selectionInChars = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldBuffer.onTextWillChange(int, int, int):void");
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i, i2, charSequence, i6, i4);
    }

    private final void requireValidIndex(int index, boolean startExclusive, boolean endExclusive) {
        int i = startExclusive ? 0 : -1;
        int length = getLength();
        if (!endExclusive) {
            length++;
        }
        if (i > index || index >= length) {
            Path$$ExternalSyntheticBUOutline0.m((Object) ErrorUtils$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m29m(index, i, "Expected ", " to be in [", ", "), length, ')'));
        }
    }

    /* renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m1283requireValidRange5zctL8(long range) {
        long TextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m6820contains5zctL8(TextRange, range)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append((Object) TextRange.m6833toStringimpl(range));
        CodecsKt$$ExternalSyntheticBUOutline0.m((Object) " to be in ", (Object) TextRange.m6833toStringimpl(TextRange), sb);
    }

    /* renamed from: toTextFieldCharSequence-udt6zUU$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1284toTextFieldCharSequenceudt6zUU$foundation_release$default(TextFieldBuffer textFieldBuffer, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textFieldBuffer.getSelectionInChars();
        }
        if ((i & 2) != 0) {
            textRange = null;
        }
        return textFieldBuffer.m1288toTextFieldCharSequenceudt6zUU$foundation_release(j, textRange);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence text, int start, int end) {
        if (text != null) {
            onTextWillChange(getLength(), getLength(), end - start);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text.subSequence(start, end), 0, 0, 24, null);
        }
        return this;
    }

    @NotNull
    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int index) {
        return this.buffer.charAt(index);
    }

    @NotNull
    public final ChangeList getChanges() {
        return getChangeTracker();
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1285getOriginalSelectiond9O1mEE() {
        return this.originalValue.getSelection();
    }

    @NotNull
    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    @NotNull
    /* renamed from: getOriginalValue$foundation_release, reason: from getter */
    public final TextFieldCharSequence getOriginalValue() {
        return this.originalValue;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelectionInChars() {
        return this.selectionInChars;
    }

    @JvmName(name = "hasSelection")
    public final boolean hasSelection() {
        return !TextRange.m6824getCollapsedimpl(getSelectionInChars());
    }

    public final void placeCursorAfterCharAt(int index) {
        requireValidIndex(index, false, true);
        this.selectionInChars = TextRangeKt.TextRange(RangesKt.coerceAtMost(index + 1, getLength()));
    }

    public final void placeCursorBeforeCharAt(int index) {
        requireValidIndex(index, true, false);
        this.selectionInChars = TextRangeKt.TextRange(index);
    }

    public final void replace(int start, int end, @NotNull CharSequence text) {
        replace$foundation_release(start, end, text, 0, text.length());
    }

    public final void replace$foundation_release(int start, int end, @NotNull CharSequence text, int textStart, int textEnd) {
        if (start > end) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("Expected start=", start, " <= end=", end));
        } else if (textStart > textEnd) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("Expected textStart=", textStart, " <= textEnd=", textEnd));
        } else {
            onTextWillChange(start, end, textEnd - textStart);
            this.buffer.replace(start, end, text, textStart, textEnd);
        }
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m1287setSelection5zctL8(this.originalValue.getSelection());
        clearChangeList();
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1287setSelection5zctL8(long j) {
        m1283requireValidRange5zctL8(j);
        this.selectionInChars = j;
    }

    public final void setTextIfChanged$foundation_release(@NotNull CharSequence newText) {
        int i;
        int i2;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = newText.length();
        boolean z = false;
        if (partialGapBuffer.length() <= 0 || newText.length() <= 0) {
            i = 0;
            i2 = 0;
        } else {
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (partialGapBuffer.charAt(i3) == newText.charAt(i4)) {
                        i3++;
                        i4++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    if (partialGapBuffer.charAt(length - 1) == newText.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z2 = true;
                    }
                }
                if (i3 >= length || i4 >= length2 || (z && z2)) {
                    break;
                }
            }
            i = i3;
            i2 = i4;
        }
        int i5 = length;
        int i6 = length2;
        if (i < i5 || i2 < i6) {
            replace$foundation_release(i, i5, newText, i2, i6);
        }
    }

    @NotNull
    public String toString() {
        return this.buffer.toString();
    }

    @NotNull
    /* renamed from: toTextFieldCharSequence-udt6zUU$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m1288toTextFieldCharSequenceudt6zUU$foundation_release(long selection, @Nullable TextRange composition) {
        return new TextFieldCharSequence(this.buffer.toString(), selection, composition, null, 8, null);
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getChanges$annotations() {
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldCharSequence, (i & 2) != 0 ? null : changeTracker, (i & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i & 8) != 0 ? null : offsetMappingCalculator);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence text) {
        if (text != null) {
            onTextWillChange(getLength(), getLength(), text.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char r12) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(r12), 0, 0, 24, null);
        return this;
    }
}
