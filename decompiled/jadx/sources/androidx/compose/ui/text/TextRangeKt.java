package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000b\u001a\u0013\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001a!\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0015"}, d2 = {"substring", "", "", "range", "Landroidx/compose/ui/text/TextRange;", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "TextRange", "start", "", "end", "(II)J", "index", "(I)J", "coerceIn", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "packWithCheck", "", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n101#2,10:124\n101#2,10:134\n118#3,4:144\n80#4:148\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n109#1:124,10\n110#1:134,10\n118#1:144,4\n121#1:148\n*E\n"})
/* loaded from: classes13.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m6819constructorimpl(packWithCheck(i, i2));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m6836coerceIn8ffj60Q(long j, int i, int i2) {
        int m6830getStartimpl = TextRange.m6830getStartimpl(j);
        if (m6830getStartimpl < i) {
            m6830getStartimpl = i;
        }
        if (m6830getStartimpl > i2) {
            m6830getStartimpl = i2;
        }
        int m6825getEndimpl = TextRange.m6825getEndimpl(j);
        if (m6825getEndimpl >= i) {
            i = m6825getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (m6830getStartimpl == TextRange.m6830getStartimpl(j) && i2 == TextRange.m6825getEndimpl(j)) ? j : TextRange(m6830getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + AbstractJsonLexerKt.END_LIST);
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    @NotNull
    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m6837substringFDrldGo(@NotNull CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m6828getMinimpl(j), TextRange.m6827getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
