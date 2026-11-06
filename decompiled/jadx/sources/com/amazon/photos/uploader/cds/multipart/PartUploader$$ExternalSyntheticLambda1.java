package com.amazon.photos.uploader.cds.multipart;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class PartUploader$$ExternalSyntheticLambda1 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref.ObjectRef f$0;

    public /* synthetic */ PartUploader$$ExternalSyntheticLambda1(Ref.ObjectRef objectRef, int i) {
        this.$r8$classId = i;
        this.f$0 = objectRef;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String handlePartFailure$lambda$2;
        String initiateRetrieveMultipart$lambda$0;
        String handlePartFailure$lambda$4;
        int i = this.$r8$classId;
        Ref.ObjectRef objectRef = this.f$0;
        switch (i) {
            case 0:
                handlePartFailure$lambda$2 = PartUploader.handlePartFailure$lambda$2(objectRef);
                return handlePartFailure$lambda$2;
            case 1:
                initiateRetrieveMultipart$lambda$0 = MultipartUploadVerifier.initiateRetrieveMultipart$lambda$0(objectRef);
                return initiateRetrieveMultipart$lambda$0;
            default:
                handlePartFailure$lambda$4 = PartUploader.handlePartFailure$lambda$4(objectRef);
                return handlePartFailure$lambda$4;
        }
    }
}
