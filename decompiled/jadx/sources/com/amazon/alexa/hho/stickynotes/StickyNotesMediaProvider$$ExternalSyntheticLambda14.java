package com.amazon.alexa.hho.stickynotes;

import com.amazon.alexa.hho.metrics.HHOMetricsService;
import io.reactivex.rxjava3.functions.Action;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class StickyNotesMediaProvider$$ExternalSyntheticLambda14 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StickyNotesMediaProvider f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ StickyNotesMediaProvider$$ExternalSyntheticLambda14(StickyNotesMediaProvider stickyNotesMediaProvider, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = stickyNotesMediaProvider;
        this.f$1 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteOldFiles$21((List) this.f$1);
                break;
            case 1:
                this.f$0.lambda$deleteMemoryExceedingFiles$24((List) this.f$1);
                break;
            default:
                this.f$0.lambda$handleDownloadRequest$5((HHOMetricsService.Timer) this.f$1);
                break;
        }
    }
}
