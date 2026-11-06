package io.ktor.util.date;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toGMTDate", "Lio/ktor/util/date/GMTDate;", "Ljava/time/Instant;", "Ljava/time/ZonedDateTime;", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class DateUtilsKt {
    @NotNull
    public static final GMTDate toGMTDate(@NotNull Instant instant) {
        instant.getClass();
        return DateJvmKt.GMTDate(Long.valueOf(TimeUnit.SECONDS.toMillis(instant.atZone(ZoneOffset.UTC).toEpochSecond())));
    }

    @NotNull
    public static final GMTDate toGMTDate(@NotNull ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        Instant instant = zonedDateTime.toInstant();
        instant.getClass();
        return toGMTDate(instant);
    }
}
