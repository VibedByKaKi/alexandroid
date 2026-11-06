package io.ktor.http;

import io.ktor.util.KtorExperimentalAPI;
import kotlin.Metadata;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"contentRangeHeaderValue", "", "range", "Lkotlin/ranges/LongRange;", "fullLength", "", "unit", "Lio/ktor/http/RangeUnits;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;Lio/ktor/http/RangeUnits;)Ljava/lang/String;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ContentRangeKt {
    @KtorExperimentalAPI
    @NotNull
    public static final String contentRangeHeaderValue(@Nullable LongRange longRange, @Nullable Long l, @NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        if (longRange != null) {
            sb.append(longRange.getStart().longValue());
            sb.append('-');
            sb.append(longRange.getEndInclusive().longValue());
        } else {
            sb.append('*');
        }
        sb.append('/');
        Object obj = l;
        if (l == null) {
            obj = "*";
        }
        sb.append(obj);
        return sb.toString();
    }

    @KtorExperimentalAPI
    @NotNull
    public static /* synthetic */ String contentRangeHeaderValue$default(LongRange longRange, Long l, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        return contentRangeHeaderValue(longRange, l, str);
    }

    @KtorExperimentalAPI
    @NotNull
    public static /* synthetic */ String contentRangeHeaderValue$default(LongRange longRange, Long l, RangeUnits rangeUnits, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            rangeUnits = RangeUnits.Bytes;
        }
        return contentRangeHeaderValue(longRange, l, rangeUnits);
    }

    @KtorExperimentalAPI
    @NotNull
    public static final String contentRangeHeaderValue(@Nullable LongRange longRange, @Nullable Long l, @NotNull RangeUnits rangeUnits) {
        rangeUnits.getClass();
        return contentRangeHeaderValue(longRange, l, rangeUnits.getUnitToken());
    }
}
