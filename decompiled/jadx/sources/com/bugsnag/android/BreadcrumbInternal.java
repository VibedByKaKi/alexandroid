package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.StringUtils;
import com.bugsnag.android.internal.TrimMetrics;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/BreadcrumbInternal;", "Lcom/bugsnag/android/JsonStream$Streamable;", "message", "", "(Ljava/lang/String;)V", "type", "Lcom/bugsnag/android/BreadcrumbType;", "metadata", "", "", "timestamp", "Ljava/util/Date;", "(Ljava/lang/String;Lcom/bugsnag/android/BreadcrumbType;Ljava/util/Map;Ljava/util/Date;)V", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "trimMetadataStringsTo", "Lcom/bugsnag/android/internal/TrimMetrics;", "maxStringLength", "", "trimMetadataStringsTo$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class BreadcrumbInternal implements JsonStream.Streamable {

    @JvmField
    @NotNull
    public String message;

    @JvmField
    @Nullable
    public Map<String, Object> metadata;

    @JvmField
    @NotNull
    public final Date timestamp;

    @JvmField
    @NotNull
    public BreadcrumbType type;

    public BreadcrumbInternal(@NotNull String str, @NotNull BreadcrumbType breadcrumbType, @Nullable Map<String, Object> map, @NotNull Date date) {
        str.getClass();
        breadcrumbType.getClass();
        date.getClass();
        this.message = str;
        this.type = breadcrumbType;
        this.metadata = map;
        this.timestamp = date;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        writer.beginObject();
        writer.name("timestamp").value(this.timestamp);
        writer.name("name").value(this.message);
        writer.name("type").value(this.type.getType());
        writer.name("metaData");
        writer.value(this.metadata, true);
        writer.endObject();
    }

    @NotNull
    public final TrimMetrics trimMetadataStringsTo$bugsnag_android_core_release(int maxStringLength) {
        Map<String, Object> map = this.metadata;
        return map != null ? StringUtils.INSTANCE.trimStringValuesTo(maxStringLength, map) : new TrimMetrics(0, 0);
    }

    public /* synthetic */ BreadcrumbInternal(String str, BreadcrumbType breadcrumbType, Map map, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, breadcrumbType, map, (i & 8) != 0 ? new Date() : date);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BreadcrumbInternal(@NotNull String str) {
        this(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
        str.getClass();
    }
}
