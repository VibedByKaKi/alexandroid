package com.amazon.photos.discovery.internal.observers;

import com.amazon.photos.discovery.observers.LocalContentType;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContentChangeNotifier$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ LocalContentType f$1;
    public final /* synthetic */ List f$2;

    public /* synthetic */ ContentChangeNotifier$$ExternalSyntheticLambda1(Map.Entry entry, LocalContentType localContentType, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = localContentType;
        this.f$2 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ContentChangeNotifier.onContentDeleted$lambda$3$lambda$2(this.f$0, this.f$1, this.f$2);
                break;
            default:
                ContentChangeNotifier.onContentAdded$lambda$1$lambda$0(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
