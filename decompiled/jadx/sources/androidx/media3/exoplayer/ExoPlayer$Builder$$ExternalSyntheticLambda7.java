package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda7 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaSource.Factory f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda7(MediaSource.Factory factory, int i) {
        this.$r8$classId = i;
        this.f$0 = factory;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        MediaSource.Factory lambda$new$5;
        MediaSource.Factory lambda$new$7;
        MediaSource.Factory lambda$new$9;
        MediaSource.Factory lambda$setMediaSourceFactory$17;
        int i = this.$r8$classId;
        MediaSource.Factory factory = this.f$0;
        switch (i) {
            case 0:
                lambda$new$5 = ExoPlayer.Builder.lambda$new$5(factory);
                return lambda$new$5;
            case 1:
                lambda$new$7 = ExoPlayer.Builder.lambda$new$7(factory);
                return lambda$new$7;
            case 2:
                lambda$new$9 = ExoPlayer.Builder.lambda$new$9(factory);
                return lambda$new$9;
            default:
                lambda$setMediaSourceFactory$17 = ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
                return lambda$setMediaSourceFactory$17;
        }
    }
}
