package com.mapbox.common.logger;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/mapbox/common/logger/LogEntry;", "", "tag", "", "message", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getTag", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "liblogger_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LogEntry {

    @NotNull
    private final String message;

    @Nullable
    private final String tag;

    @Nullable
    private final Throwable throwable;

    public LogEntry(@Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        str2.getClass();
        this.tag = str;
        this.message = str2;
        this.throwable = th;
    }

    public static /* synthetic */ LogEntry copy$default(LogEntry logEntry, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logEntry.tag;
        }
        if ((i & 2) != 0) {
            str2 = logEntry.message;
        }
        if ((i & 4) != 0) {
            th = logEntry.throwable;
        }
        return logEntry.copy(str, str2, th);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    public final LogEntry copy(@Nullable String tag, @NotNull String message, @Nullable Throwable throwable) {
        message.getClass();
        return new LogEntry(tag, message, throwable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEntry)) {
            return false;
        }
        LogEntry logEntry = (LogEntry) other;
        return Intrinsics.areEqual(this.tag, logEntry.tag) && Intrinsics.areEqual(this.message, logEntry.message) && Intrinsics.areEqual(this.throwable, logEntry.throwable);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        String str = this.tag;
        int m = ArcMode$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        Throwable th = this.throwable;
        return m + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LogEntry(tag=" + this.tag + ", message=" + this.message + ", throwable=" + this.throwable + ')';
    }
}
