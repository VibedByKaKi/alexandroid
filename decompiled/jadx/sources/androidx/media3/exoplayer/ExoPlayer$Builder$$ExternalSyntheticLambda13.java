package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda13 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RenderersFactory f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda13(RenderersFactory renderersFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = renderersFactory;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        RenderersFactory lambda$setRenderersFactory$16;
        RenderersFactory lambda$new$6;
        RenderersFactory lambda$new$2;
        RenderersFactory lambda$new$8;
        int i = this.$r8$classId;
        RenderersFactory renderersFactory = this.f$0;
        switch (i) {
            case 0:
                lambda$setRenderersFactory$16 = ExoPlayer.Builder.lambda$setRenderersFactory$16(renderersFactory);
                return lambda$setRenderersFactory$16;
            case 1:
                lambda$new$6 = ExoPlayer.Builder.lambda$new$6(renderersFactory);
                return lambda$new$6;
            case 2:
                lambda$new$2 = ExoPlayer.Builder.lambda$new$2(renderersFactory);
                return lambda$new$2;
            default:
                lambda$new$8 = ExoPlayer.Builder.lambda$new$8(renderersFactory);
                return lambda$new$8;
        }
    }
}
