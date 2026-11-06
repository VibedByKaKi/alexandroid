package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ProgressiveMediaSource$Factory$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ProgressiveMediaSource$Factory$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        ReleasableExecutor lambda$setDownloadExecutor$1;
        MediaSource.Factory lambda$loadSupplier$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$setDownloadExecutor$1 = ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1((Supplier) this.f$0, (Consumer) this.f$1);
                return lambda$setDownloadExecutor$1;
            default:
                lambda$loadSupplier$4 = ((DefaultMediaSourceFactory.DelegateFactoryLoader) this.f$0).lambda$loadSupplier$4((DataSource.Factory) this.f$1);
                return lambda$loadSupplier$4;
        }
    }
}
