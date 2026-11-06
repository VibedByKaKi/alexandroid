package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f$0;
    public final /* synthetic */ LoadEventInfo f$1;
    public final /* synthetic */ MediaLoadData f$2;

    public /* synthetic */ MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.$r8$classId = i;
        this.f$0 = eventDispatcher;
        this.f$1 = loadEventInfo;
        this.f$2 = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStarted$0(this.f$1, this.f$2, (MediaSourceEventListener) obj);
                break;
            case 1:
                this.f$0.lambda$loadCompleted$1(this.f$1, this.f$2, (MediaSourceEventListener) obj);
                break;
            default:
                this.f$0.lambda$loadCanceled$2(this.f$1, this.f$2, (MediaSourceEventListener) obj);
                break;
        }
    }
}
