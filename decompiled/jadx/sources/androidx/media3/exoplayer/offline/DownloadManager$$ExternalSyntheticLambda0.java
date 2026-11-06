package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.offline.DownloadHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda0 implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleMainMessage;
        boolean handleDownloadHelperCallbackMessage;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                handleMainMessage = ((DownloadManager) obj).handleMainMessage(message);
                return handleMainMessage;
            default:
                handleDownloadHelperCallbackMessage = ((DownloadHelper.MediaPreparer) obj).handleDownloadHelperCallbackMessage(message);
                return handleDownloadHelperCallbackMessage;
        }
    }
}
