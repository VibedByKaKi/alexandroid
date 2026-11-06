package com.mapbox.common;

import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ3\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0014J-\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0006@BX\u0087\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/MapboxTracing;", "", "()V", "MAPBOX_TRACE_ID", "", "<set-?>", "", "platformTracingEnabled", "getPlatformTracingEnabled", "()Z", "disableAll", "", "enableAll", "enableCore", "enablePlatform", "traceSync", ExifInterface.GPS_DIRECTION_TRUE, "sectionName", "Lkotlin/Function0;", "section", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxTracing {

    @NotNull
    public static final MapboxTracing INSTANCE = new MapboxTracing();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final String MAPBOX_TRACE_ID = "mbx";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private static boolean platformTracingEnabled;

    private MapboxTracing() {
    }

    public final void disableAll() {
        platformTracingEnabled = false;
        Tracing.setTracingBackendType(TracingBackendType.NOOP);
    }

    public final void enableAll() {
        platformTracingEnabled = true;
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enableCore() {
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enablePlatform() {
        platformTracingEnabled = true;
    }

    public final boolean getPlatformTracingEnabled() {
        return platformTracingEnabled;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final <T> T traceSync(@NotNull Function0<String> sectionName, @NotNull Function0<? extends T> section) {
        sectionName.getClass();
        section.getClass();
        if (!getPlatformTracingEnabled()) {
            return section.invoke();
        }
        Trace.beginSection("mbx: " + sectionName.invoke());
        try {
            return section.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            Trace.endSection();
            InlineMarker.finallyEnd(1);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final <T> T traceSync(@NotNull String sectionName, @NotNull Function0<? extends T> section) {
        sectionName.getClass();
        section.getClass();
        if (getPlatformTracingEnabled()) {
            Trace.beginSection("mbx: " + sectionName);
            try {
                return section.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                Trace.endSection();
                InlineMarker.finallyEnd(1);
            }
        }
        return section.invoke();
    }
}
