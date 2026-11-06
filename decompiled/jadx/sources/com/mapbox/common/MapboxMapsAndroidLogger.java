package com.mapbox.common;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u000eJ)\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0010J)\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0012J)\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/common/MapboxMapsAndroidLogger;", "", "()V", "SDK_IDENTIFIER", "", "internalIsLoggableD", "", "internalIsLoggableD$sdk_base_release", "internalLogD", "", "tag", "message", "logThrottler", "Lcom/mapbox/common/LogThrottler;", "internalLogD$sdk_base_release", "internalLogE", "internalLogE$sdk_base_release", "internalLogI", "internalLogI$sdk_base_release", "internalLogW", "internalLogW$sdk_base_release", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxMapsAndroidLogger {

    @NotNull
    public static final MapboxMapsAndroidLogger INSTANCE = new MapboxMapsAndroidLogger();

    @NotNull
    public static final String SDK_IDENTIFIER = "maps-android";

    private MapboxMapsAndroidLogger() {
    }

    public static /* synthetic */ void internalLogD$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogD$sdk_base_release(str, str2, logThrottler);
    }

    public static /* synthetic */ void internalLogE$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogE$sdk_base_release(str, str2, logThrottler);
    }

    public static /* synthetic */ void internalLogI$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogI$sdk_base_release(str, str2, logThrottler);
    }

    public static /* synthetic */ void internalLogW$sdk_base_release$default(MapboxMapsAndroidLogger mapboxMapsAndroidLogger, String str, String str2, LogThrottler logThrottler, int i, Object obj) {
        if ((i & 4) != 0) {
            logThrottler = null;
        }
        mapboxMapsAndroidLogger.internalLogW$sdk_base_release(str, str2, logThrottler);
    }

    public final boolean internalIsLoggableD$sdk_base_release() {
        try {
            return LogConfiguration.getLoggingLevel() == LoggingLevel.DEBUG;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final void internalLogD$sdk_base_release(@NotNull String tag, @NotNull String message, @Nullable LogThrottler logThrottler) {
        Unit unit;
        tag.getClass();
        message.getClass();
        if (logThrottler != null) {
            try {
                Log.debug(message, "maps-android\\" + tag, logThrottler);
                unit = Unit.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            Log.debug(message, "maps-android\\" + tag);
        }
    }

    public final void internalLogE$sdk_base_release(@NotNull String tag, @NotNull String message, @Nullable LogThrottler logThrottler) {
        Unit unit;
        tag.getClass();
        message.getClass();
        if (logThrottler != null) {
            try {
                Log.error(message, "maps-android\\" + tag, logThrottler);
                unit = Unit.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                android.util.Log.e("maps-android\\" + tag, message);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            Log.error(message, "maps-android\\" + tag);
        }
    }

    public final void internalLogI$sdk_base_release(@NotNull String tag, @NotNull String message, @Nullable LogThrottler logThrottler) {
        Unit unit;
        tag.getClass();
        message.getClass();
        if (logThrottler != null) {
            try {
                Log.info(message, "maps-android\\" + tag, logThrottler);
                unit = Unit.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                android.util.Log.i("maps-android\\" + tag, message);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            Log.info(message, "maps-android\\" + tag);
        }
    }

    public final void internalLogW$sdk_base_release(@NotNull String tag, @NotNull String message, @Nullable LogThrottler logThrottler) {
        Unit unit;
        tag.getClass();
        message.getClass();
        if (logThrottler != null) {
            try {
                Log.warning(message, "maps-android\\" + tag, logThrottler);
                unit = Unit.INSTANCE;
            } catch (UnsatisfiedLinkError unused) {
                android.util.Log.w("maps-android\\" + tag, message);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            Log.warning(message, "maps-android\\" + tag);
        }
    }
}
