package io.ktor.http.content;

import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.DateUtilsKt;
import java.nio.file.attribute.FileTime;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"LastModifiedVersion", "Lio/ktor/http/content/LastModifiedVersion;", "lastModified", "Ljava/nio/file/attribute/FileTime;", "Ljava/time/ZonedDateTime;", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class LastModifiedJavaTimeKt {
    @NotNull
    public static final LastModifiedVersion LastModifiedVersion(@NotNull FileTime fileTime) {
        fileTime.getClass();
        return new LastModifiedVersion(DateJvmKt.GMTDate(Long.valueOf(fileTime.toMillis())));
    }

    @NotNull
    public static final LastModifiedVersion LastModifiedVersion(@NotNull ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        return new LastModifiedVersion(DateUtilsKt.toGMTDate(zonedDateTime));
    }
}
