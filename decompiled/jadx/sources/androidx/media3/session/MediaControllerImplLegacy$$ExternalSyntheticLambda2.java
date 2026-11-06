package androidx.media3.session;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplLegacy$$ExternalSyntheticLambda2 implements ListenerSet.Event, ListenerSet.IterationFinishedEvent {
    public final /* synthetic */ MediaControllerImplLegacy f$0;

    public /* synthetic */ MediaControllerImplLegacy$$ExternalSyntheticLambda2(MediaControllerImplLegacy mediaControllerImplLegacy) {
        this.f$0 = mediaControllerImplLegacy;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        this.f$0.lambda$updateControllerInfo$12((Player.Listener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        this.f$0.lambda$new$0((Player.Listener) obj, flagSet);
    }
}
