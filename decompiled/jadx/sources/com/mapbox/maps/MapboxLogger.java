package com.mapbox.maps;

import androidx.annotation.RestrictTo;
import com.mapbox.common.LogThrottler;
import com.mapbox.common.MapboxMapsAndroidLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0086\bø\u0001\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\"\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"isLoggableD", "", "logD", "", "tag", "", "message", "Lkotlin/Function0;", "logThrottler", "Lcom/mapbox/common/LogThrottler;", "logE", "logI", "logW", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "MapboxLogger")
/* loaded from: classes8.dex */
public final class MapboxLogger {
    public static final boolean isLoggableD() {
        return MapboxMapsAndroidLogger.INSTANCE.internalIsLoggableD$sdk_base_release();
    }

    public static final void logD(@NotNull String str, @NotNull Function0<String> function0) {
        str.getClass();
        function0.getClass();
        if (isLoggableD()) {
            logD(str, function0.invoke());
        }
    }

    public static final void logE(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogE$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }

    public static final void logI(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogI$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }

    public static final void logW(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogW$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void logE(@NotNull String str, @NotNull String str2, @Nullable LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogE$sdk_base_release(str, str2, logThrottler);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void logI(@NotNull String str, @NotNull String str2, @Nullable LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogI$sdk_base_release(str, str2, logThrottler);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void logW(@NotNull String str, @NotNull String str2, @Nullable LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogW$sdk_base_release(str, str2, logThrottler);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void logD(@NotNull String str, @NotNull String str2, @Nullable LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogD$sdk_base_release(str, str2, logThrottler);
    }

    public static final void logD(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogD$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }
}
