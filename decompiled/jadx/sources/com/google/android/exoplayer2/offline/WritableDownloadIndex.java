package com.google.android.exoplayer2.offline;

import androidx.annotation.WorkerThread;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@WorkerThread
/* loaded from: classes7.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download) throws IOException;

    void removeDownload(String str) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int i) throws IOException;

    void setStopReason(String str, int i) throws IOException;
}
