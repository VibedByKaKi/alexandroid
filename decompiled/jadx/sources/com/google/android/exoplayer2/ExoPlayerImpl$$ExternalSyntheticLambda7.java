package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda7 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda7(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        Player.EventListener eventListener = (Player.EventListener) obj;
        switch (i) {
            case 0:
                eventListener.onPositionDiscontinuity(i2);
                break;
            default:
                eventListener.onRepeatModeChanged(i2);
                break;
        }
    }
}
