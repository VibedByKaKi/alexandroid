package com.amazon.dee.app.services.alexadevicebackground;

import com.amazon.comms.ringservice.MetricsSession;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\fB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/DeviceDownloadFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "<init>", "(I)V", "cause", "", "(Ljava/lang/Throwable;I)V", "message", "", "(Ljava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/Throwable;I)V", "getErrorCode", MetricsSession.ERROR_CODE_PIVOT, CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceDownloadFailedException extends Exception {
    private final int errorCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/DeviceDownloadFailedException$ErrorCode;", "", "<init>", "()V", "DOWNLOAD_TIMED_OUT", "", "DOWNLOAD_FAILED", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ErrorCode {
        public static final int DOWNLOAD_FAILED = -2;
        public static final int DOWNLOAD_TIMED_OUT = -1;

        @NotNull
        public static final ErrorCode INSTANCE = new ErrorCode();

        private ErrorCode() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDownloadFailedException(@NotNull String str, @NotNull Throwable th, int i) {
        super(str, th);
        str.getClass();
        th.getClass();
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDownloadFailedException(@NotNull Throwable th, int i) {
        super(th);
        th.getClass();
        this.errorCode = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDownloadFailedException(@NotNull String str, int i) {
        super(str);
        str.getClass();
        this.errorCode = i;
    }

    public DeviceDownloadFailedException(int i) {
        this.errorCode = i;
    }
}
