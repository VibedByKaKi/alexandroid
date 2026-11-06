package com.amazon.photos.uploader.cds;

import android.os.SystemClock;
import com.amazon.photos.uploader.log.UploadLogger;
import com.dee.app.contacts.common.constants.Constants;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/photos/uploader/cds/ProgressUpdateEnabledWriter;", "", "progressSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "expectedContentLength", "logger", "Lcom/amazon/photos/uploader/log/UploadLogger;", "(Lio/reactivex/rxjava3/subjects/PublishSubject;Ljava/io/InputStream;Ljava/io/OutputStream;JLcom/amazon/photos/uploader/log/UploadLogger;)V", "inputToOutput", "blockSize", "", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressUpdateEnabledWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressUpdateEnabledWriter.kt\ncom/amazon/photos/uploader/cds/ProgressUpdateEnabledWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes5.dex */
public final class ProgressUpdateEnabledWriter {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "ProgressUpdateEnabledWriter";
    private final long expectedContentLength;

    @NotNull
    private final InputStream inputStream;

    @NotNull
    private final UploadLogger logger;

    @NotNull
    private final OutputStream outputStream;

    @NotNull
    private final PublishSubject<Long> progressSubject;

    public ProgressUpdateEnabledWriter(@NotNull PublishSubject<Long> publishSubject, @NotNull InputStream inputStream, @NotNull OutputStream outputStream, long j, @NotNull UploadLogger uploadLogger) {
        publishSubject.getClass();
        inputStream.getClass();
        outputStream.getClass();
        uploadLogger.getClass();
        this.progressSubject = publishSubject;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.expectedContentLength = j;
        this.logger = uploadLogger;
    }

    public final long inputToOutput(int blockSize) {
        byte[] bArr = new byte[blockSize];
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 0;
        while (true) {
            try {
                try {
                    int read = this.inputStream.read(bArr, 0, blockSize);
                    if (read <= 0) {
                        break;
                    }
                    j += read;
                    this.progressSubject.onNext(Long.valueOf(j));
                    if (j > this.expectedContentLength) {
                        break;
                    }
                    this.outputStream.write(bArr, 0, read);
                } catch (Exception e) {
                    this.logger.e$AndroidPhotosUploader_release(TAG, "Exception received during writing to output stream.", e);
                    throw e;
                }
            } finally {
                this.logger.v$AndroidPhotosUploader_release(TAG, " Time to post body = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        return j;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/photos/uploader/cds/ProgressUpdateEnabledWriter$Companion;", "", "()V", Constants.LOG_TAG, "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
