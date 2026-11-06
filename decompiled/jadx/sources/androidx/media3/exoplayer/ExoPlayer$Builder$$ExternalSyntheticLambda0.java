package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LoadControl f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda0(LoadControl loadControl, int i) {
        this.$r8$classId = i;
        this.f$0 = loadControl;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        LoadControl lambda$setLoadControl$19;
        LoadControl lambda$new$11;
        int i = this.$r8$classId;
        LoadControl loadControl = this.f$0;
        switch (i) {
            case 0:
                lambda$setLoadControl$19 = ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
                return lambda$setLoadControl$19;
            default:
                lambda$new$11 = ExoPlayer.Builder.lambda$new$11(loadControl);
                return lambda$new$11;
        }
    }
}
