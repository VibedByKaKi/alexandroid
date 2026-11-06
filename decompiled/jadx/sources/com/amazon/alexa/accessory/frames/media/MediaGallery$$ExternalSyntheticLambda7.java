package com.amazon.alexa.accessory.frames.media;

import com.amazon.alexa.accessory.frames.media.models.progressiveLoad.GalleryItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaGallery$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaGallery f$0;
    public final /* synthetic */ GalleryItem f$1;

    public /* synthetic */ MediaGallery$$ExternalSyntheticLambda7(MediaGallery mediaGallery, GalleryItem galleryItem, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaGallery;
        this.f$1 = galleryItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$renderTrueMedia$7(this.f$1);
                break;
            case 1:
                this.f$0.lambda$removeMedia$8(this.f$1);
                break;
            case 2:
                this.f$0.lambda$renderPreview$6(this.f$1);
                break;
            case 3:
                this.f$0.lambda$updateMediaInPlace$9(this.f$1);
                break;
            default:
                this.f$0.lambda$renderSkeleton$5(this.f$1);
                break;
        }
    }
}
