package com.amazon.alexa.accessorykit.cloudpairing.keyrotation;

import com.amazon.alexa.accessorykit.metrics.MetricsConstants;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DefaultDpsClient$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ DefaultDpsClient$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                DefaultDpsClient.recordEventMetric(MetricsConstants.CloudPairing.GET_PAIRING_ENABLEMENT_STATUS_PREPARED_REQUEST, false, str);
                break;
            case 1:
                DefaultDpsClient.recordEventMetric(MetricsConstants.CloudPairing.LIST_PAIRED_DEVICES_PREPARED_REQUEST, false, str);
                break;
            default:
                DefaultDpsClient.recordEventMetric(MetricsConstants.CloudPairing.ACKNOWLEDGE_PAIRING_DATA_PREPARED_REQUEST, false, str);
                break;
        }
    }
}
