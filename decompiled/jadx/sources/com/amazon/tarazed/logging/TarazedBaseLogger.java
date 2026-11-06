package com.amazon.tarazed.logging;

import android.util.Log;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.tarazed.TarazedBuildConfig;
import java.util.logging.Level;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/amazon/tarazed/logging/TarazedBaseLogger;", "", "()V", "appender", "Lcom/amazon/tarazed/logging/TarazedLogFileAppender;", "getAppender", "()Lcom/amazon/tarazed/logging/TarazedLogFileAppender;", "d", "", "tag", "", "msg", "e", "tr", "", "i", "v", "w", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class TarazedBaseLogger {
    public final void d(@NotNull String tag, @NotNull String msg) {
        TarazedLogFileAppender appender;
        tag.getClass();
        msg.getClass();
        if (!TarazedBuildConfig.INSTANCE.isDebugBuild() || (appender = getAppender()) == null) {
            return;
        }
        Level level = Level.FINE;
        level.getClass();
        TarazedLogFileAppender.appendLog$default(appender, level, tag, msg, null, 8, null);
    }

    public final void e(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        Log.e(tag, msg);
        TarazedLogFileAppender appender = getAppender();
        if (appender != null) {
            Level level = Level.SEVERE;
            level.getClass();
            TarazedLogFileAppender.appendLog$default(appender, level, tag, msg, null, 8, null);
        }
    }

    @Nullable
    public abstract TarazedLogFileAppender getAppender();

    public final void i(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        Log.i(tag, msg);
        TarazedLogFileAppender appender = getAppender();
        if (appender != null) {
            Level level = Level.INFO;
            level.getClass();
            TarazedLogFileAppender.appendLog$default(appender, level, tag, msg, null, 8, null);
        }
    }

    public final void v(@NotNull String tag, @NotNull String msg) {
        TarazedLogFileAppender appender;
        tag.getClass();
        msg.getClass();
        if (!TarazedBuildConfig.INSTANCE.isDebugBuild() || (appender = getAppender()) == null) {
            return;
        }
        Level level = Level.FINER;
        level.getClass();
        TarazedLogFileAppender.appendLog$default(appender, level, tag, msg, null, 8, null);
    }

    public final void w(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        Log.w(tag, msg);
        TarazedLogFileAppender appender = getAppender();
        if (appender != null) {
            Level level = Level.WARNING;
            level.getClass();
            TarazedLogFileAppender.appendLog$default(appender, level, tag, msg, null, 8, null);
        }
    }

    public final void e(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, msg, tr);
        Log.e(tag, msg, tr);
        TarazedLogFileAppender appender = getAppender();
        if (appender != null) {
            Level level = Level.SEVERE;
            level.getClass();
            appender.appendLog(level, tag, msg, tr);
        }
    }

    public final void i(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, msg, tr);
        Log.i(tag, msg, tr);
        TarazedLogFileAppender appender = getAppender();
        if (appender != null) {
            Level level = Level.INFO;
            level.getClass();
            appender.appendLog(level, tag, msg, tr);
        }
    }

    public final void w(@NotNull String tag, @NotNull String msg, @NotNull Throwable tr) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, msg, tr);
        Log.w(tag, msg, tr);
        TarazedLogFileAppender appender = getAppender();
        if (appender != null) {
            Level level = Level.WARNING;
            level.getClass();
            appender.appendLog(level, tag, msg, tr);
        }
    }
}
