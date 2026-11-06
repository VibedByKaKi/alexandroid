package com.amazon.alexa.biloba.storage;

import com.amazon.alexa.biloba.metrics.MetricsConstants;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AlertConfigurationStore$$ExternalSyntheticLambda1 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlertConfigurationStore f$0;

    public /* synthetic */ AlertConfigurationStore$$ExternalSyntheticLambda1(AlertConfigurationStore alertConfigurationStore, int i) {
        this.$r8$classId = i;
        this.f$0 = alertConfigurationStore;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        AlertConfigurationStore alertConfigurationStore = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                alertConfigurationStore.lambda$deleteAlertConfig$7(MetricsConstants.OperationalMetrics.DELETE_ALERT_CONFIGURATION_API, th);
                break;
            case 1:
                alertConfigurationStore.lambda$createAlertConfig$5(MetricsConstants.OperationalMetrics.CREATE_ALERT_CONFIGURATIONS_API, th);
                break;
            case 2:
                alertConfigurationStore.lambda$requestAlertConfigurations$1(th);
                break;
            default:
                alertConfigurationStore.lambda$updateAlertConfig$3(MetricsConstants.OperationalMetrics.UPDATE_ALERT_CONFIGURATIONS_API, th);
                break;
        }
    }
}
