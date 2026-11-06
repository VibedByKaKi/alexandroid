package com.amazon.photos.uploader.internal;

import com.amazon.photos.discovery.internal.observers.ContentChangeNotifier;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadRequestUpdatesNotifier$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ UploadRequestUpdatesNotifier$$ExternalSyntheticLambda0(Map.Entry entry, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UploadRequestUpdatesNotifier.onRequestsAbandoned$lambda$15$lambda$14(this.f$0, this.f$1);
                break;
            default:
                ContentChangeNotifier.onContentDeduped$lambda$5$lambda$4(this.f$0, this.f$1);
                break;
        }
    }
}
