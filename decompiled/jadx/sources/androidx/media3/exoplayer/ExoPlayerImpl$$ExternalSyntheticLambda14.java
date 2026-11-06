package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda14 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda14(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        Player.Listener listener = (Player.Listener) obj;
        switch (i) {
            case 0:
                listener.onSkipSilenceEnabledChanged(z);
                break;
            case 1:
                listener.onShuffleModeEnabledChanged(z);
                break;
            default:
                listener.onSkipSilenceEnabledChanged(z);
                break;
        }
    }
}
