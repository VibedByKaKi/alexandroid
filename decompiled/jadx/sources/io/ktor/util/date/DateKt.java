package io.ktor.util.date;

import io.ktor.util.KtorExperimentalAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"minus", "Lio/ktor/util/date/GMTDate;", "milliseconds", "", "plus", "truncateToSeconds", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class DateKt {
    @NotNull
    public static final GMTDate minus(@NotNull GMTDate gMTDate, long j) {
        gMTDate.getClass();
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() - j));
    }

    @NotNull
    public static final GMTDate plus(@NotNull GMTDate gMTDate, long j) {
        gMTDate.getClass();
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() + j));
    }

    @KtorExperimentalAPI
    @NotNull
    public static final GMTDate truncateToSeconds(@NotNull GMTDate gMTDate) {
        gMTDate.getClass();
        return DateJvmKt.GMTDate(gMTDate.getSeconds(), gMTDate.getMinutes(), gMTDate.getHours(), gMTDate.getDayOfMonth(), gMTDate.getMonth(), gMTDate.getYear());
    }
}
