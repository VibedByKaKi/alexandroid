package com.amazon.alexa.hho.stickynotes;

import com.amazon.alexa.hho.metrics.HHOMetricsService;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class StickyNotesMediaProvider$$ExternalSyntheticLambda11 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StickyNotesMediaProvider f$0;
    public final /* synthetic */ HHOMetricsService.Timer f$1;

    public /* synthetic */ StickyNotesMediaProvider$$ExternalSyntheticLambda11(StickyNotesMediaProvider stickyNotesMediaProvider, HHOMetricsService.Timer timer, int i) {
        this.$r8$classId = i;
        this.f$0 = stickyNotesMediaProvider;
        this.f$1 = timer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleDownloadRequest$3(this.f$1, (String) obj);
                break;
            default:
                this.f$0.lambda$downloadAndCacheMedia$17(this.f$1, (String) obj);
                break;
        }
    }
}
