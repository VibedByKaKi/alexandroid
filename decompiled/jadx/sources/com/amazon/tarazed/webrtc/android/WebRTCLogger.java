package com.amazon.tarazed.webrtc.android;

import com.amazon.alexa.presence.service.PresenceJobService;
import com.amazon.tarazed.logging.TarazedSessionLogger;
import com.dee.app.contacts.common.constants.Constants;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/tarazed/webrtc/android/WebRTCLogger;", "Ljava/util/logging/Handler;", "logger", "Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "(Lcom/amazon/tarazed/logging/TarazedSessionLogger;)V", "close", "", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "publish", "record", "Ljava/util/logging/LogRecord;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class WebRTCLogger extends Handler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "WebRTCLogger";

    @NotNull
    private final TarazedSessionLogger logger;

    public WebRTCLogger(@NotNull TarazedSessionLogger tarazedSessionLogger) {
        tarazedSessionLogger.getClass();
        this.logger = tarazedSessionLogger;
    }

    @Override // java.util.logging.Handler
    public void publish(@Nullable LogRecord record) {
        if (record == null) {
            this.logger.w(TAG, "WebRTC passed a null log record");
            return;
        }
        Level level = record.getLevel();
        if (Intrinsics.areEqual(level, Level.SEVERE)) {
            TarazedSessionLogger tarazedSessionLogger = this.logger;
            String loggerName = record.getLoggerName();
            loggerName.getClass();
            String message = record.getMessage();
            message.getClass();
            tarazedSessionLogger.e(loggerName, message);
            return;
        }
        if (Intrinsics.areEqual(level, Level.WARNING)) {
            TarazedSessionLogger tarazedSessionLogger2 = this.logger;
            String loggerName2 = record.getLoggerName();
            loggerName2.getClass();
            String message2 = record.getMessage();
            message2.getClass();
            tarazedSessionLogger2.w(loggerName2, message2);
            return;
        }
        boolean areEqual = Intrinsics.areEqual(level, Level.INFO);
        TarazedSessionLogger tarazedSessionLogger3 = this.logger;
        if (areEqual) {
            String loggerName3 = record.getLoggerName();
            loggerName3.getClass();
            String message3 = record.getMessage();
            message3.getClass();
            tarazedSessionLogger3.i(loggerName3, message3);
            return;
        }
        String loggerName4 = record.getLoggerName();
        loggerName4.getClass();
        String message4 = record.getMessage();
        message4.getClass();
        tarazedSessionLogger3.v(loggerName4, message4);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/tarazed/webrtc/android/WebRTCLogger$Companion;", "", "()V", Constants.LOG_TAG, "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
