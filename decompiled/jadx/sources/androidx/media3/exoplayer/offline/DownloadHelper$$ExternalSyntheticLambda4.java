package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadService;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DownloadHelper$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DownloadHelper$$ExternalSyntheticLambda4(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((DownloadHelper) this.f$0).lambda$onMediaPreparationFailed$5((IOException) this.f$1);
                break;
            case 1:
                ((DownloadService.DownloadManagerHelper) this.f$0).lambda$attachService$0((DownloadService) this.f$1);
                break;
            default:
                ((DownloadHelper) this.f$0).lambda$prepare$3((DownloadHelper.Callback) this.f$1);
                break;
        }
    }
}
