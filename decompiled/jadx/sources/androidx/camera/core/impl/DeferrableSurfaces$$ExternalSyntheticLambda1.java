package androidx.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class DeferrableSurfaces$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver, DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ DeferrableSurfaces$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, boolean z) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$surfaceListWithTimeout$1;
        lambda$surfaceListWithTimeout$1 = DeferrableSurfaces.lambda$surfaceListWithTimeout$1((ListenableFuture) this.f$0, (Executor) this.f$1, this.f$2, (Collection) this.f$3, completer);
        return lambda$surfaceListWithTimeout$1;
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        List lambda$selectAudioTrack$2;
        lambda$selectAudioTrack$2 = ((DefaultTrackSelector) this.f$0).lambda$selectAudioTrack$2((DefaultTrackSelector.Parameters) this.f$1, this.f$2, (int[]) this.f$3, i, trackGroup, iArr);
        return lambda$selectAudioTrack$2;
    }
}
