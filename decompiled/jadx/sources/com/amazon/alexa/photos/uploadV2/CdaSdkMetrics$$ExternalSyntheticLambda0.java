package com.amazon.alexa.photos.uploadV2;

import com.amazon.clouddrive.android.core.interfaces.MetricName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CdaSdkMetrics$$ExternalSyntheticLambda0 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ CdaSdkMetrics$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String lambda$recordCallSuccess$0;
        String lambda$recordCallSuccess$2;
        String lambda$recordCallError$4;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$recordCallSuccess$0 = CdaSdkMetrics.lambda$recordCallSuccess$0(str);
                return lambda$recordCallSuccess$0;
            case 1:
                lambda$recordCallSuccess$2 = CdaSdkMetrics.lambda$recordCallSuccess$2(str);
                return lambda$recordCallSuccess$2;
            default:
                lambda$recordCallError$4 = CdaSdkMetrics.lambda$recordCallError$4(str);
                return lambda$recordCallError$4;
        }
    }
}
