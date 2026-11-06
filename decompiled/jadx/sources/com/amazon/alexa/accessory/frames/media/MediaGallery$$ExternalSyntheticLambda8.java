package com.amazon.alexa.accessory.frames.media;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaGallery$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaGallery f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ MediaGallery$$ExternalSyntheticLambda8(MediaGallery mediaGallery, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaGallery;
        this.f$1 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$reconcileWithMediaStore$4((ArrayList) this.f$1);
                break;
            case 1:
                this.f$0.lambda$executeDeleteItems$17(this.f$1);
                break;
            case 2:
                this.f$0.lambda$showDeleteConfirmationDialog$16(this.f$1);
                break;
            default:
                this.f$0.lambda$applyFilters$11(this.f$1);
                break;
        }
    }
}
