package io.ktor.http;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"expires", "", "Lio/ktor/http/HeadersBuilder;", "Ljava/time/LocalDateTime;", "lastModified", "dateTime", "Ljava/time/ZonedDateTime;", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ApplicationResponsePropertiesJvmKt {
    public static final void expires(@NotNull HeadersBuilder headersBuilder, @NotNull LocalDateTime localDateTime) {
        headersBuilder.getClass();
        localDateTime.getClass();
        headersBuilder.set(HttpHeaders.INSTANCE.getExpires(), HttpDateKt.toHttpDateString(localDateTime));
    }

    public static final void lastModified(@NotNull HeadersBuilder headersBuilder, @NotNull ZonedDateTime zonedDateTime) {
        headersBuilder.getClass();
        zonedDateTime.getClass();
        headersBuilder.set(HttpHeaders.INSTANCE.getLastModified(), HttpDateKt.toHttpDateString(zonedDateTime));
    }
}
