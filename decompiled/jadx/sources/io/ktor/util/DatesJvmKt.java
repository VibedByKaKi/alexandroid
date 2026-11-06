package io.ktor.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.apache.commons.lang3.time.TimeZones;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\bH\u0007\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"GreenwichMeanTime", "Ljava/time/ZoneId;", "GreenwichMeanTime$annotations", "()V", "getGreenwichMeanTime", "()Ljava/time/ZoneId;", "toLocalDateTime", "Ljava/time/LocalDateTime;", "Ljava/util/Date;", "toZonedDateTime", "Ljava/time/ZonedDateTime;", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class DatesJvmKt {

    @NotNull
    private static final ZoneId GreenwichMeanTime;

    static {
        ZoneId of = ZoneId.of(TimeZones.GMT_ID);
        of.getClass();
        GreenwichMeanTime = of;
    }

    @NotNull
    public static final ZoneId getGreenwichMeanTime() {
        return GreenwichMeanTime;
    }

    @Deprecated(message = "Shouldn't be used outside of ktor")
    @NotNull
    public static final LocalDateTime toLocalDateTime(@NotNull Date date) {
        date.getClass();
        LocalDateTime ofInstant = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        ofInstant.getClass();
        return ofInstant;
    }

    @Deprecated(message = "Shouldn't be used outside of ktor")
    @NotNull
    public static final ZonedDateTime toZonedDateTime(@NotNull Date date) {
        date.getClass();
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(date.toInstant(), GreenwichMeanTime);
        ofInstant.getClass();
        return ofInstant;
    }

    @Deprecated(message = "Shouldn't be used outside of ktor")
    public static /* synthetic */ void GreenwichMeanTime$annotations() {
    }
}
