package com.amazon.apl.android.media;

import com.amazon.apl.android.image.filters.bitmap.Size;
import com.amazon.apl.android.media.MediaManager;
import com.amazon.apl.android.primitive.MediaSources;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class MediaPlayer$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MediaPlayer$$ExternalSyntheticLambda8(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaPlayer) this.f$0).lambda$setTrackList$7((MediaSources) this.f$1);
                break;
            default:
                ((MediaManager.DownloadOnlyCallback) this.f$0).lambda$onSuccess$0((Size) this.f$1);
                break;
        }
    }
}
