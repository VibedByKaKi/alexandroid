package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import com.google.common.base.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean lambda$onTracksSelected$1;
        boolean lambda$onSourcePrepared$0;
        DefaultPreloadManager.Status status = (DefaultPreloadManager.Status) obj;
        switch (this.$r8$classId) {
            case 0:
                lambda$onTracksSelected$1 = DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1(status);
                return lambda$onTracksSelected$1;
            default:
                lambda$onSourcePrepared$0 = DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0(status);
                return lambda$onSourcePrepared$0;
        }
    }
}
