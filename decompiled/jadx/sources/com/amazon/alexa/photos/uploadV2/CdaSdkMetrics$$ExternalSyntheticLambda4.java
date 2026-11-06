package com.amazon.alexa.photos.uploadV2;

import com.amazon.alexa.photos.uploadV2.CdaSdkPreferences;
import com.amazon.alexa.photos.uploadV2.EndpointsHelper;
import com.amazon.clouddrive.android.core.interfaces.MetricName;
import com.amazon.clouddrive.cdasdk.SdkMetrics;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CdaSdkMetrics$$ExternalSyntheticLambda4 implements MetricName {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializable f$0;

    public /* synthetic */ CdaSdkMetrics$$ExternalSyntheticLambda4(Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = serializable;
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    public final String getEventName() {
        String lambda$getComponentNameForService$10;
        String name;
        String lambda$recordCallError$9;
        int i = this.$r8$classId;
        Serializable serializable = this.f$0;
        switch (i) {
            case 0:
                lambda$getComponentNameForService$10 = CdaSdkMetrics.lambda$getComponentNameForService$10((SdkMetrics.Service) serializable);
                return lambda$getComponentNameForService$10;
            case 1:
                name = ((CdaSdkPreferences.MetricsEvent) serializable).name();
                return name;
            case 2:
                return ((EndpointsHelper.MetricsEvent) serializable).name();
            default:
                lambda$recordCallError$9 = CdaSdkMetrics.lambda$recordCallError$9((Exception) serializable);
                return lambda$recordCallError$9;
        }
    }
}
