package com.amazon.alexa.photos.uploadV2;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.clouddrive.cdasdk.CloudDriveException;
import com.amazon.clouddrive.cdasdk.cdus.CDUSException;
import com.amazon.photos.uploader.cds.UrlConnectionUploader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CdaSdkMetrics$$ExternalSyntheticLambda9 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Exception f$1;

    public /* synthetic */ CdaSdkMetrics$$ExternalSyntheticLambda9(String str, Exception exc, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = exc;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String lambda$recordCallError$8;
        String recordErrorMetric$lambda$10;
        String recordErrorMetric$lambda$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$recordCallError$8 = CdaSdkMetrics.lambda$recordCallError$8(this.f$0, this.f$1);
                return lambda$recordCallError$8;
            case 1:
                recordErrorMetric$lambda$10 = UrlConnectionUploader.recordErrorMetric$lambda$10(this.f$0, (CloudDriveException) this.f$1);
                return recordErrorMetric$lambda$10;
            default:
                recordErrorMetric$lambda$11 = UrlConnectionUploader.recordErrorMetric$lambda$11(this.f$0, (CDUSException) this.f$1);
                return recordErrorMetric$lambda$11;
        }
    }
}
