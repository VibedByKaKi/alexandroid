package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ConcatenatingMediaSource$$ExternalSyntheticLambda0 implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CompositeMediaSource f$0;

    public /* synthetic */ ConcatenatingMediaSource$$ExternalSyntheticLambda0(CompositeMediaSource compositeMediaSource, int i) {
        this.$r8$classId = i;
        this.f$0 = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleMessage;
        boolean handleMessage2;
        int i = this.$r8$classId;
        CompositeMediaSource compositeMediaSource = this.f$0;
        switch (i) {
            case 0:
                handleMessage = ((ConcatenatingMediaSource) compositeMediaSource).handleMessage(message);
                return handleMessage;
            default:
                handleMessage2 = ((ConcatenatingMediaSource2) compositeMediaSource).handleMessage(message);
                return handleMessage2;
        }
    }
}
