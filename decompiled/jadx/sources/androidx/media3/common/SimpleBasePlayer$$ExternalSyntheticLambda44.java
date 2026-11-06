package androidx.media3.common;

import androidx.media3.common.ForwardingSimpleBasePlayer;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SimpleBasePlayer$$ExternalSyntheticLambda44 implements SimpleBasePlayer.PositionSupplier, ListenerSet.IterationFinishedEvent {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SimpleBasePlayer$$ExternalSyntheticLambda44(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        int i = this.$r8$classId;
        ForwardingSimpleBasePlayer.ForwardingPositionSupplier forwardingPositionSupplier = (ForwardingSimpleBasePlayer.ForwardingPositionSupplier) this.f$0;
        switch (i) {
            case 1:
                return forwardingPositionSupplier.getBufferedPositionMs();
            case 2:
                return forwardingPositionSupplier.getCurrentPositionMs();
            case 3:
                return forwardingPositionSupplier.getContentBufferedPositionMs();
            case 4:
                return forwardingPositionSupplier.getContentPositionMs();
            default:
                return forwardingPositionSupplier.getTotalBufferedDurationMs();
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.f$0).lambda$new$0((Player.Listener) obj, flagSet);
    }
}
