package com.amazon.apl.android;

import com.amazon.apl.android.dependencies.IAPLSessionListener;
import com.amazon.common.BoundObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Session extends BoundObject {
    private IAPLSessionListener mListener;
    private final List<LogInfo> mLogList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LogEntryLevel {
        NONE,
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR,
        CRITICAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LogEntrySource {
        SESSION,
        VIEW,
        COMMAND
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LogInfo {
        private final Object[] mArguments;
        private final LogEntryLevel mLevel;
        private final String mMessage;
        private final LogEntrySource mSource;

        public LogInfo(LogEntryLevel logEntryLevel, LogEntrySource logEntrySource, String str, Object[] objArr) {
            this.mLevel = logEntryLevel;
            this.mSource = logEntrySource;
            this.mMessage = str;
            this.mArguments = objArr;
        }

        public Object[] getArguments() {
            return this.mArguments;
        }

        public LogEntryLevel getLevel() {
            return this.mLevel;
        }

        public String getMessage() {
            return this.mMessage;
        }

        public LogEntrySource getSource() {
            return this.mSource;
        }
    }

    public Session() {
        bind(nCreate());
        this.mLogList = Collections.synchronizedList(new ArrayList());
    }

    private native long nCreate();

    private static native String nGetLogId(long j);

    private static native void nSetDebuggingEnabled(boolean z);

    private void reportExistingLogs() {
        for (LogInfo logInfo : this.mLogList) {
            this.mListener.write(logInfo.getLevel(), logInfo.getSource(), logInfo.getMessage(), logInfo.getArguments());
        }
    }

    public static void setSensitiveLoggingEnabled(boolean z) {
        nSetDebuggingEnabled(z);
    }

    public String getLogId() {
        return nGetLogId(getNativeHandle());
    }

    public void setAPLListener(IAPLSessionListener iAPLSessionListener) {
        this.mListener = iAPLSessionListener;
        reportExistingLogs();
    }

    public void write(LogEntryLevel logEntryLevel, LogEntrySource logEntrySource, String str, Object[] objArr) {
        IAPLSessionListener iAPLSessionListener = this.mListener;
        if (iAPLSessionListener != null) {
            iAPLSessionListener.write(logEntryLevel, logEntrySource, str, objArr);
        }
        this.mLogList.add(new LogInfo(logEntryLevel, logEntrySource, str, objArr));
    }

    public void write(LogEntryLevel logEntryLevel, LogEntrySource logEntrySource, String str) {
        write(logEntryLevel, logEntrySource, str, null);
    }
}
