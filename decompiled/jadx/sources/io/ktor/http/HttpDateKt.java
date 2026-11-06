package io.ktor.http;

import com.amazonaws.util.DateUtils;
import io.ktor.util.KtorExperimentalAPI;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.time.TimeZones;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0007\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\f\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\rH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"GreenwichMeanTime", "Ljava/time/ZoneId;", "httpDateFormat", "Ljava/time/format/DateTimeFormatter;", "httpDateFormat$annotations", "()V", "getHttpDateFormat", "()Ljava/time/format/DateTimeFormatter;", "fromHttpDateString", "Ljava/time/ZonedDateTime;", "", "toHttpDateString", "Ljava/time/temporal/Temporal;", "", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HttpDateKt {
    private static final ZoneId GreenwichMeanTime;

    @NotNull
    private static final DateTimeFormatter httpDateFormat;

    static {
        ZoneId of = ZoneId.of(TimeZones.GMT_ID);
        of.getClass();
        GreenwichMeanTime = of;
        DateTimeFormatter withZone = DateTimeFormatter.ofPattern(DateUtils.RFC822_DATE_PATTERN).withLocale(Locale.US).withZone(of);
        if (withZone == null) {
            Intrinsics.throwNpe();
        }
        httpDateFormat = withZone;
    }

    @KtorExperimentalAPI
    @NotNull
    public static final ZonedDateTime fromHttpDateString(@NotNull String str) {
        str.getClass();
        ZonedDateTime parse = ZonedDateTime.parse(str, httpDateFormat);
        parse.getClass();
        return parse;
    }

    @NotNull
    public static final DateTimeFormatter getHttpDateFormat() {
        return httpDateFormat;
    }

    @NotNull
    public static final String toHttpDateString(@NotNull Temporal temporal) {
        temporal.getClass();
        String format = httpDateFormat.format(temporal);
        format.getClass();
        return format;
    }

    @KtorExperimentalAPI
    @NotNull
    public static final String toHttpDateString(long j) {
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        ofEpochMilli.getClass();
        return toHttpDateString(ofEpochMilli);
    }

    @KtorExperimentalAPI
    public static /* synthetic */ void httpDateFormat$annotations() {
    }
}
