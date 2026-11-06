package com.amazon.photos.uploader.internal;

import com.amazon.photos.uploader.observables.UploadSummary;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadSummaryNotifier$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ UploadSummary f$1;

    public /* synthetic */ UploadSummaryNotifier$$ExternalSyntheticLambda0(Map.Entry entry, UploadSummary uploadSummary, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = uploadSummary;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UploadSummaryNotifier.onUploaderStarted$lambda$3$lambda$2(this.f$0, this.f$1);
                break;
            case 1:
                UploadSummaryNotifier.onUploaderStopped$lambda$5$lambda$4(this.f$0, this.f$1);
                break;
            default:
                UploadSummaryNotifier.onChanged$lambda$1$lambda$0(this.f$0, this.f$1);
                break;
        }
    }
}
