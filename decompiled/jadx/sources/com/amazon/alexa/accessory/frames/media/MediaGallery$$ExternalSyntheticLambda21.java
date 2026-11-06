package com.amazon.alexa.accessory.frames.media;

import android.app.Activity;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaGallery$$ExternalSyntheticLambda21 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MediaGallery f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Activity f$2;

    public /* synthetic */ MediaGallery$$ExternalSyntheticLambda21(MediaGallery mediaGallery, Activity activity, List list) {
        this.f$0 = mediaGallery;
        this.f$2 = activity;
        this.f$1 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$shareItems$15(this.f$1, this.f$2);
                break;
            default:
                this.f$0.showDeleteConfirmationDialog(this.f$2, this.f$1);
                break;
        }
    }

    public /* synthetic */ MediaGallery$$ExternalSyntheticLambda21(MediaGallery mediaGallery, List list, Activity activity) {
        this.f$0 = mediaGallery;
        this.f$1 = list;
        this.f$2 = activity;
    }
}
