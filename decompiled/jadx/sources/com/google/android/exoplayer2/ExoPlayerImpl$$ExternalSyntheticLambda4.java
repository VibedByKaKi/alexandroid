package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class ExoPlayerImpl$$ExternalSyntheticLambda4 implements ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ExoPlayerImpl$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        Player.EventListener eventListener = (Player.EventListener) obj;
        switch (this.$r8$classId) {
            case 0:
                eventListener.onSeekProcessed();
                break;
            default:
                ExoPlayerImpl.lambda$release$5(eventListener);
                break;
        }
    }
}
