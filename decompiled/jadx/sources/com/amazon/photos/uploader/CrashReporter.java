package com.amazon.photos.uploader;

import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/amazon/photos/uploader/CrashReporter;", "", "reportCrash", "", "throwable", "", "samplePercentage", "", "extraCrashLog", "Lcom/amazon/photos/uploader/ExtraCrashLog;", "extraDataStr", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CrashReporter {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void reportCrash$default(CrashReporter crashReporter, Throwable th, int i, ExtraCrashLog extraCrashLog, String str, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: reportCrash");
                return;
            }
            if ((i2 & 2) != 0) {
                i = 100;
            }
            if ((i2 & 4) != 0) {
                extraCrashLog = ExtraCrashLog.NONE;
            }
            if ((i2 & 8) != 0) {
                str = null;
            }
            crashReporter.reportCrash(th, i, extraCrashLog, str);
        }
    }

    void reportCrash(@NotNull Throwable throwable, int samplePercentage, @NotNull ExtraCrashLog extraCrashLog, @Nullable String extraDataStr);
}
