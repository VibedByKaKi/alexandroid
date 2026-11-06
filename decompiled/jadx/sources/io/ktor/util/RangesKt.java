package io.ktor.util;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0087\u0002\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"length", "", "Lkotlin/ranges/LongRange;", "length$annotations", "(Lkotlin/ranges/LongRange;)V", "getLength", "(Lkotlin/ranges/LongRange;)J", "contains", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class RangesKt {
    @InternalAPI
    public static final boolean contains(@NotNull LongRange longRange, @NotNull LongRange longRange2) {
        longRange.getClass();
        longRange2.getClass();
        return longRange2.getStart().longValue() >= longRange.getStart().longValue() && longRange2.getEndInclusive().longValue() <= longRange.getEndInclusive().longValue();
    }

    public static final long getLength(@NotNull LongRange longRange) {
        longRange.getClass();
        return kotlin.ranges.RangesKt.coerceAtLeast((longRange.getEndInclusive().longValue() - longRange.getStart().longValue()) + 1, 0L);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Not supported anymore.")
    public static /* synthetic */ void length$annotations(LongRange longRange) {
    }
}
