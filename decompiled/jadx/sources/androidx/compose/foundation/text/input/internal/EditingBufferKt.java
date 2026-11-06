package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m1328updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m6826getLengthimpl;
        int m6828getMinimpl = TextRange.m6828getMinimpl(j);
        int m6827getMaximpl = TextRange.m6827getMaximpl(j);
        if (TextRange.m6832intersects5zctL8(j2, j)) {
            if (TextRange.m6820contains5zctL8(j2, j)) {
                m6828getMinimpl = TextRange.m6828getMinimpl(j2);
                m6827getMaximpl = m6828getMinimpl;
            } else {
                if (TextRange.m6820contains5zctL8(j, j2)) {
                    m6826getLengthimpl = TextRange.m6826getLengthimpl(j2);
                } else if (TextRange.m6821containsimpl(j2, m6828getMinimpl)) {
                    m6828getMinimpl = TextRange.m6828getMinimpl(j2);
                    m6826getLengthimpl = TextRange.m6826getLengthimpl(j2);
                } else {
                    m6827getMaximpl = TextRange.m6828getMinimpl(j2);
                }
                m6827getMaximpl -= m6826getLengthimpl;
            }
        } else if (m6827getMaximpl > TextRange.m6828getMinimpl(j2)) {
            m6828getMinimpl -= TextRange.m6826getLengthimpl(j2);
            m6826getLengthimpl = TextRange.m6826getLengthimpl(j2);
            m6827getMaximpl -= m6826getLengthimpl;
        }
        return TextRangeKt.TextRange(m6828getMinimpl, m6827getMaximpl);
    }
}
