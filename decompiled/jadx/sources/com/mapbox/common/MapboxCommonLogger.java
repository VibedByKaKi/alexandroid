package com.mapbox.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/MapboxCommonLogger;", "", "()V", "SDK_IDENTIFIER", "", "logD", "", "tag", "message", "logD$common_release", "logE", "logE$common_release", "logI", "logI$common_release", "logW", "logW$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxCommonLogger {

    @NotNull
    public static final MapboxCommonLogger INSTANCE = new MapboxCommonLogger();

    @NotNull
    private static final String SDK_IDENTIFIER = "common";

    private MapboxCommonLogger() {
    }

    public final void logD$common_release(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.debug(message, "common\\" + tag);
    }

    public final void logE$common_release(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.error(message, "common\\" + tag);
    }

    public final void logI$common_release(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.info(message, "common\\" + tag);
    }

    public final void logW$common_release(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.warning(message, "common\\" + tag);
    }
}
