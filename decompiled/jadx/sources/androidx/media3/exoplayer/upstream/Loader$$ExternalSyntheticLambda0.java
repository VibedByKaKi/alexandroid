package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Loader$$ExternalSyntheticLambda0 implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
