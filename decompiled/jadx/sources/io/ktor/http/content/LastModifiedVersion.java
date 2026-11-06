package io.ktor.http.content;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.http.DateUtilsKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.DateKt;
import io.ktor.util.date.GMTDate;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lio/ktor/http/content/LastModifiedVersion;", "Lio/ktor/http/content/Version;", "lastModified", "Ljava/util/Date;", "(Ljava/util/Date;)V", "Lio/ktor/util/date/GMTDate;", "(Lio/ktor/util/date/GMTDate;)V", "getLastModified", "()Lio/ktor/util/date/GMTDate;", "appendHeadersTo", "", "builder", "Lio/ktor/http/HeadersBuilder;", "check", "Lio/ktor/http/content/VersionCheckResult;", "requestHeaders", "Lio/ktor/http/Headers;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class LastModifiedVersion implements Version {

    @NotNull
    private final GMTDate lastModified;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LastModifiedVersion(@NotNull Date date) {
        this(DateJvmKt.GMTDate(Long.valueOf(date.getTime())));
        date.getClass();
    }

    @NotNull
    public static /* synthetic */ LastModifiedVersion copy$default(LastModifiedVersion lastModifiedVersion, GMTDate gMTDate, int i, Object obj) {
        if ((i & 1) != 0) {
            gMTDate = lastModifiedVersion.lastModified;
        }
        return lastModifiedVersion.copy(gMTDate);
    }

    @Override // io.ktor.http.content.Version
    public void appendHeadersTo(@NotNull HeadersBuilder builder) {
        builder.getClass();
        builder.set(HttpHeaders.INSTANCE.getLastModified(), DateUtilsKt.toHttpDate(this.lastModified));
    }

    @Override // io.ktor.http.content.Version
    @NotNull
    public VersionCheckResult check(@NotNull Headers requestHeaders) {
        requestHeaders.getClass();
        GMTDate truncateToSeconds = DateKt.truncateToSeconds(this.lastModified);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = requestHeaders.get(httpHeaders.getIfModifiedSince());
        GMTDate fromHttpToGmtDate = str != null ? DateUtilsKt.fromHttpToGmtDate(str) : null;
        String str2 = requestHeaders.get(httpHeaders.getIfUnmodifiedSince());
        GMTDate fromHttpToGmtDate2 = str2 != null ? DateUtilsKt.fromHttpToGmtDate(str2) : null;
        return (fromHttpToGmtDate == null || truncateToSeconds.compareTo(fromHttpToGmtDate) > 0) ? (fromHttpToGmtDate2 == null || truncateToSeconds.compareTo(fromHttpToGmtDate2) <= 0) ? VersionCheckResult.OK : VersionCheckResult.PRECONDITION_FAILED : VersionCheckResult.NOT_MODIFIED;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GMTDate getLastModified() {
        return this.lastModified;
    }

    @NotNull
    public final LastModifiedVersion copy(@NotNull GMTDate lastModified) {
        lastModified.getClass();
        return new LastModifiedVersion(lastModified);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof LastModifiedVersion) && Intrinsics.areEqual(this.lastModified, ((LastModifiedVersion) other).lastModified);
        }
        return true;
    }

    @NotNull
    public final GMTDate getLastModified() {
        return this.lastModified;
    }

    public int hashCode() {
        GMTDate gMTDate = this.lastModified;
        if (gMTDate != null) {
            return gMTDate.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "LastModifiedVersion(lastModified=" + this.lastModified + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public LastModifiedVersion(@NotNull GMTDate gMTDate) {
        gMTDate.getClass();
        this.lastModified = gMTDate;
    }
}
