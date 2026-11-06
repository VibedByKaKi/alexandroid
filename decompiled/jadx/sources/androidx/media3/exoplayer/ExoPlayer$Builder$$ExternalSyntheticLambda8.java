package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda8 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TrackSelector f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda8(TrackSelector trackSelector, int i) {
        this.$r8$classId = i;
        this.f$0 = trackSelector;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        TrackSelector lambda$setTrackSelector$18;
        TrackSelector lambda$new$10;
        int i = this.$r8$classId;
        TrackSelector trackSelector = this.f$0;
        switch (i) {
            case 0:
                lambda$setTrackSelector$18 = ExoPlayer.Builder.lambda$setTrackSelector$18(trackSelector);
                return lambda$setTrackSelector$18;
            default:
                lambda$new$10 = ExoPlayer.Builder.lambda$new$10(trackSelector);
                return lambda$new$10;
        }
    }
}
