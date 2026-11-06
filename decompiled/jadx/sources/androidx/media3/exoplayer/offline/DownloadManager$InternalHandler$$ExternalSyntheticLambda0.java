package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.offline.DownloadManager;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DownloadManager$InternalHandler$$ExternalSyntheticLambda0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareStartTimes;
        compareStartTimes = DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
        return compareStartTimes;
    }
}
