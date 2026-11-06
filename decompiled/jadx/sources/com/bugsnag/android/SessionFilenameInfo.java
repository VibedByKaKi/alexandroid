package com.bugsnag.android;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/SessionFilenameInfo;", "", "timestamp", "", "uuid", "", "(JLjava/lang/String;)V", "getTimestamp", "()J", "getUuid", "()Ljava/lang/String;", "component1", "component2", "copy", "encode", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class SessionFilenameInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int uuidLength = 36;
    private final long timestamp;

    @NotNull
    private final String uuid;

    public SessionFilenameInfo(long j, @NotNull String str) {
        str.getClass();
        this.timestamp = j;
        this.uuid = str;
    }

    public static /* synthetic */ SessionFilenameInfo copy$default(SessionFilenameInfo sessionFilenameInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sessionFilenameInfo.timestamp;
        }
        if ((i & 2) != 0) {
            str = sessionFilenameInfo.uuid;
        }
        return sessionFilenameInfo.copy(j, str);
    }

    @JvmStatic
    @NotNull
    public static final String defaultFilename() {
        return INSTANCE.defaultFilename();
    }

    @JvmStatic
    public static final long findTimestampInFilename(@NotNull File file) {
        return INSTANCE.findTimestampInFilename(file);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final SessionFilenameInfo copy(long timestamp, @NotNull String uuid) {
        uuid.getClass();
        return new SessionFilenameInfo(timestamp, uuid);
    }

    @NotNull
    public final String encode() {
        return INSTANCE.toFilename(this.timestamp, this.uuid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionFilenameInfo)) {
            return false;
        }
        SessionFilenameInfo sessionFilenameInfo = (SessionFilenameInfo) other;
        return this.timestamp == sessionFilenameInfo.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.uuid, sessionFilenameInfo.uuid);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        long j = this.timestamp;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.uuid;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionFilenameInfo(timestamp=");
        sb.append(this.timestamp);
        sb.append(", uuid=");
        return a$$ExternalSyntheticOutline0.m(sb, this.uuid, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/SessionFilenameInfo$Companion;", "", "()V", "uuidLength", "", "defaultFilename", "", "findTimestampInFilename", "", "file", "Ljava/io/File;", "findUuidInFilename", "fromFile", "Lcom/bugsnag/android/SessionFilenameInfo;", "toFilename", "timestamp", "uuid", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        private final String findUuidInFilename(File file) {
            String name = file.getName();
            name.getClass();
            if (name != null) {
                return name.substring(0, 35);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("null cannot be cast to non-null type java.lang.String");
            return null;
        }

        @JvmStatic
        @NotNull
        public final String defaultFilename() {
            long currentTimeMillis = System.currentTimeMillis();
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            return toFilename(currentTimeMillis, uuid);
        }

        @JvmStatic
        public final long findTimestampInFilename(@NotNull File file) {
            int indexOf$default;
            file.getClass();
            String name = file.getName();
            name.getClass();
            String name2 = file.getName();
            name2.getClass();
            indexOf$default = StringsKt__StringsKt.indexOf$default(name2, "_", 0, false, 6, (Object) null);
            Long longOrNull = StringsKt.toLongOrNull(name.substring(36, indexOf$default));
            if (longOrNull != null) {
                return longOrNull.longValue();
            }
            return -1L;
        }

        @NotNull
        public final SessionFilenameInfo fromFile(@NotNull File file) {
            file.getClass();
            return new SessionFilenameInfo(findTimestampInFilename(file), findUuidInFilename(file));
        }

        @NotNull
        public final String toFilename(long timestamp, @NotNull String uuid) {
            uuid.getClass();
            return uuid + timestamp + "_v2.json";
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
