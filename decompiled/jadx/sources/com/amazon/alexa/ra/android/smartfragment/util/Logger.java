package com.amazon.alexa.ra.android.smartfragment.util;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/util/Logger;", "", "<init>", "()V", Constants.LOG_TAG, "", LogLevel.INFO, "", "msg", "warning", "error", "t", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Logger {
    public static final int $stable = 0;

    @NotNull
    public static final Logger INSTANCE = new Logger();

    @NotNull
    private static final String TAG = "SmartFragment";

    private Logger() {
    }

    public final int error(@NotNull String msg, @NotNull Throwable t) {
        msg.getClass();
        t.getClass();
        return Log.e(TAG, msg, t);
    }

    public final int info(@NotNull String msg) {
        msg.getClass();
        return Log.i(TAG, msg);
    }

    public final int warning(@NotNull String msg) {
        msg.getClass();
        return Log.w(TAG, msg);
    }

    public final int error(@NotNull String msg) {
        msg.getClass();
        return Log.e(TAG, msg);
    }
}
