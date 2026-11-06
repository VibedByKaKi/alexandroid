package androidx.media3.session;

import androidx.media3.session.MediaSessionLegacyStub;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaSessionLegacyStub$$ExternalSyntheticLambda12 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ MediaSessionLegacyStub$$ExternalSyntheticLambda12(MediaControllerImplLegacy mediaControllerImplLegacy, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i) {
        this.f$0 = mediaControllerImplLegacy;
        this.f$1 = atomicInteger;
        this.f$3 = list;
        this.f$4 = arrayList;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaSessionLegacyStub) this.f$0).lambda$dispatchSessionTaskWithSessionCommandInternal$22((SessionCommand) this.f$1, this.f$2, (MediaSessionManager.RemoteUserInfo) this.f$3, (MediaSessionLegacyStub.SessionTask) this.f$4);
                break;
            default:
                ((MediaControllerImplLegacy) this.f$0).lambda$addQueueItems$4((AtomicInteger) this.f$1, (List) this.f$3, (ArrayList) this.f$4, this.f$2);
                break;
        }
    }

    public /* synthetic */ MediaSessionLegacyStub$$ExternalSyntheticLambda12(MediaSessionLegacyStub mediaSessionLegacyStub, SessionCommand sessionCommand, int i, MediaSessionManager.RemoteUserInfo remoteUserInfo, MediaSessionLegacyStub.SessionTask sessionTask) {
        this.f$0 = mediaSessionLegacyStub;
        this.f$1 = sessionCommand;
        this.f$2 = i;
        this.f$3 = remoteUserInfo;
        this.f$4 = sessionTask;
    }
}
