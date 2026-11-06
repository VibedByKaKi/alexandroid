package io.ktor.http.content;

import io.ktor.http.CacheControl;
import io.ktor.util.date.DateUtilsKt;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"CachingOptions", "Lio/ktor/http/content/CachingOptions;", "cacheControl", "Lio/ktor/http/CacheControl;", "expires", "Ljava/time/ZonedDateTime;", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class CachingOptionsJvmKt {
    @NotNull
    public static final CachingOptions CachingOptions(@Nullable CacheControl cacheControl, @NotNull ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        return new CachingOptions(cacheControl, DateUtilsKt.toGMTDate(zonedDateTime));
    }

    @NotNull
    public static /* synthetic */ CachingOptions CachingOptions$default(CacheControl cacheControl, ZonedDateTime zonedDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheControl = null;
        }
        return CachingOptions(cacheControl, zonedDateTime);
    }
}
