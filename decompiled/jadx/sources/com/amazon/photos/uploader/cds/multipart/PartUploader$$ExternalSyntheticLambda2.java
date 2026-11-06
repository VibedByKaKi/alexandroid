package com.amazon.photos.uploader.cds.multipart;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.photos.uploader.cds.error.CdsConflictResolverImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class PartUploader$$ExternalSyntheticLambda2 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Throwable f$0;

    public /* synthetic */ PartUploader$$ExternalSyntheticLambda2(Throwable th, int i) {
        this.$r8$classId = i;
        this.f$0 = th;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String handlePartFailure$lambda$3;
        String handleException$lambda$0;
        String handlePartFailure$lambda$6;
        int i = this.$r8$classId;
        Throwable th = this.f$0;
        switch (i) {
            case 0:
                handlePartFailure$lambda$3 = PartUploader.handlePartFailure$lambda$3(th);
                return handlePartFailure$lambda$3;
            case 1:
                handleException$lambda$0 = CdsConflictResolverImpl.handleException$lambda$0(th);
                return handleException$lambda$0;
            default:
                handlePartFailure$lambda$6 = PartUploader.handlePartFailure$lambda$6(th);
                return handlePartFailure$lambda$6;
        }
    }
}
