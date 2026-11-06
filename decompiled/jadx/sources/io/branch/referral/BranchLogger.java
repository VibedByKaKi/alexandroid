package io.branch.referral;

import android.util.Log;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.dee.app.contacts.common.constants.Constants;
import io.branch.interfaces.IBranchLoggingCallbacks;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020\rH\u0002J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lio/branch/referral/BranchLogger;", "", "()V", Constants.LOG_TAG, "", "loggerCallback", "Lio/branch/interfaces/IBranchLoggingCallbacks;", "getLoggerCallback$annotations", "getLoggerCallback", "()Lio/branch/interfaces/IBranchLoggingCallbacks;", "setLoggerCallback", "(Lio/branch/interfaces/IBranchLoggingCallbacks;)V", "loggingEnabled", "", "getLoggingEnabled$annotations", "getLoggingEnabled", "()Z", "setLoggingEnabled", "(Z)V", "loggingLevel", "Lio/branch/referral/BranchLogger$BranchLogLevel;", "getLoggingLevel$annotations", "getLoggingLevel", "()Lio/branch/referral/BranchLogger$BranchLogLevel;", "setLoggingLevel", "(Lio/branch/referral/BranchLogger$BranchLogLevel;)V", "d", "", "message", "e", "i", "logAlways", "shouldLog", ModelTransformer.KEY_BATTERY_LEVEL, "stackTraceToString", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "useCustomLogger", "v", "w", "BranchLogLevel", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BranchLogger {

    @NotNull
    private static final String TAG = "BranchSDK";

    @Nullable
    private static IBranchLoggingCallbacks loggerCallback;
    private static boolean loggingEnabled;

    @NotNull
    public static final BranchLogger INSTANCE = new BranchLogger();

    @NotNull
    private static BranchLogLevel loggingLevel = BranchLogLevel.DEBUG;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/branch/referral/BranchLogger$BranchLogLevel;", "", ModelTransformer.KEY_BATTERY_LEVEL, "", "(Ljava/lang/String;II)V", "getLevel", "()I", "ERROR", "WARN", "INFO", "DEBUG", "VERBOSE", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum BranchLogLevel {
        ERROR(1),
        WARN(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        BranchLogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private BranchLogger() {
    }

    @JvmStatic
    public static final void d(@Nullable String message) {
        IBranchLoggingCallbacks iBranchLoggingCallbacks;
        if (loggingEnabled) {
            BranchLogger branchLogger = INSTANCE;
            if (!branchLogger.shouldLog(BranchLogLevel.DEBUG) || message == null || message.length() <= 0 || !branchLogger.useCustomLogger() || (iBranchLoggingCallbacks = loggerCallback) == null) {
                return;
            }
            iBranchLoggingCallbacks.onBranchLog(message, "DEBUG");
        }
    }

    @JvmStatic
    public static final void e(@NotNull String message) {
        message.getClass();
        if (loggingEnabled) {
            BranchLogger branchLogger = INSTANCE;
            if (!branchLogger.shouldLog(BranchLogLevel.ERROR) || message.length() <= 0) {
                return;
            }
            if (!branchLogger.useCustomLogger()) {
                Log.e(TAG, message);
                return;
            }
            IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
            if (iBranchLoggingCallbacks != null) {
                iBranchLoggingCallbacks.onBranchLog(message, "ERROR");
            }
        }
    }

    @Nullable
    public static final IBranchLoggingCallbacks getLoggerCallback() {
        return loggerCallback;
    }

    public static final boolean getLoggingEnabled() {
        return loggingEnabled;
    }

    @NotNull
    public static final BranchLogLevel getLoggingLevel() {
        return loggingLevel;
    }

    @JvmStatic
    public static final void i(@NotNull String message) {
        message.getClass();
        if (loggingEnabled) {
            BranchLogger branchLogger = INSTANCE;
            if (!branchLogger.shouldLog(BranchLogLevel.INFO) || message.length() <= 0) {
                return;
            }
            if (!branchLogger.useCustomLogger()) {
                Log.i(TAG, message);
                return;
            }
            IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
            if (iBranchLoggingCallbacks != null) {
                iBranchLoggingCallbacks.onBranchLog(message, "INFO");
            }
        }
    }

    @JvmStatic
    public static final void logAlways(@NotNull String message) {
        message.getClass();
        if (message.length() > 0) {
            if (!INSTANCE.useCustomLogger()) {
                Log.i(TAG, message);
                return;
            }
            IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
            if (iBranchLoggingCallbacks != null) {
                iBranchLoggingCallbacks.onBranchLog(message, "INFO");
            }
        }
    }

    public static final void setLoggerCallback(@Nullable IBranchLoggingCallbacks iBranchLoggingCallbacks) {
        loggerCallback = iBranchLoggingCallbacks;
    }

    public static final void setLoggingEnabled(boolean z) {
        loggingEnabled = z;
    }

    public static final void setLoggingLevel(@NotNull BranchLogLevel branchLogLevel) {
        branchLogLevel.getClass();
        loggingLevel = branchLogLevel;
    }

    private final boolean shouldLog(BranchLogLevel level) {
        return level.getLevel() <= loggingLevel.getLevel();
    }

    @JvmStatic
    @NotNull
    public static final String stackTraceToString(@NotNull Exception exception) {
        exception.getClass();
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private final boolean useCustomLogger() {
        return loggerCallback != null;
    }

    @JvmStatic
    public static final void v(@NotNull String message) {
        IBranchLoggingCallbacks iBranchLoggingCallbacks;
        message.getClass();
        if (loggingEnabled) {
            BranchLogger branchLogger = INSTANCE;
            if (!branchLogger.shouldLog(BranchLogLevel.VERBOSE) || message.length() <= 0 || !branchLogger.useCustomLogger() || (iBranchLoggingCallbacks = loggerCallback) == null) {
                return;
            }
            iBranchLoggingCallbacks.onBranchLog(message, "VERBOSE");
        }
    }

    @JvmStatic
    public static final void w(@NotNull String message) {
        message.getClass();
        if (loggingEnabled) {
            BranchLogger branchLogger = INSTANCE;
            if (!branchLogger.shouldLog(BranchLogLevel.WARN) || message.length() <= 0) {
                return;
            }
            if (!branchLogger.useCustomLogger()) {
                Log.w(TAG, message);
                return;
            }
            IBranchLoggingCallbacks iBranchLoggingCallbacks = loggerCallback;
            if (iBranchLoggingCallbacks != null) {
                iBranchLoggingCallbacks.onBranchLog(message, "WARN");
            }
        }
    }

    @JvmStatic
    public static /* synthetic */ void getLoggerCallback$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLoggingEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getLoggingLevel$annotations() {
    }
}
