package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class DownloadException extends IOException {
    public DownloadException(String str) {
        super(str);
    }

    public DownloadException(Throwable th) {
        super(th);
    }
}
