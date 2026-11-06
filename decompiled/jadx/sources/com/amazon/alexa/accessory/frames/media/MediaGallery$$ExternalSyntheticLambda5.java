package com.amazon.alexa.accessory.frames.media;

import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaGallery$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaGallery f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ MobilyticsMetricsTimer f$2;

    public /* synthetic */ MediaGallery$$ExternalSyntheticLambda5(MediaGallery mediaGallery, List list, MobilyticsMetricsTimer mobilyticsMetricsTimer, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaGallery;
        this.f$1 = list;
        this.f$2 = mobilyticsMetricsTimer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$initializeMediaGalleryData$1(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$initializeMediaGalleryData$2(this.f$1, this.f$2);
                break;
        }
    }
}
