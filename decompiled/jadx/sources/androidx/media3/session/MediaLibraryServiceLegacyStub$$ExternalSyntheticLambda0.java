package androidx.media3.session;

import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ListenableFuture f$0;
    public final /* synthetic */ MediaBrowserServiceCompat.Result f$1;

    public /* synthetic */ MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda0(ListenableFuture listenableFuture, MediaBrowserServiceCompat.Result result, int i) {
        this.$r8$classId = i;
        this.f$0 = listenableFuture;
        this.f$1 = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemWhenReady$8(this.f$0, this.f$1);
                break;
            case 1:
                MediaLibraryServiceLegacyStub.lambda$sendCustomActionResultWhenReady$7(this.f$0, this.f$1);
                break;
            default:
                MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemsWhenReady$9(this.f$0, this.f$1);
                break;
        }
    }
}
