package androidx.media3.session;

import android.os.Handler;
import android.os.Message;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.MediaControllerImplLegacy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaControllerImplBase$FlushCommandQueueHandler$$ExternalSyntheticLambda0 implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MediaControllerImplBase$FlushCommandQueueHandler$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleMessage;
        boolean lambda$new$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                handleMessage = ((MediaControllerImplBase.FlushCommandQueueHandler) obj).handleMessage(message);
                return handleMessage;
            default:
                lambda$new$0 = ((MediaControllerImplLegacy.ControllerCompatCallback) obj).lambda$new$0(message);
                return lambda$new$0;
        }
    }
}
