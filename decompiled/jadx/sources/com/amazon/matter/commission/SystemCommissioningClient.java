package com.amazon.matter.commission;

import android.content.Context;
import android.util.Log;
import com.amazon.deecomms.ndt.DevicesSource$$ExternalSyntheticLambda0;
import com.amazon.matter.eventbus.MatterEventType;
import com.amazon.matter.metrics.MatterMetricsService;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.home.matter.Matter;
import com.google.android.gms.home.matter.commissioning.CommissioningClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Optional;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SystemCommissioningClient {
    private static final String TAG = "SystemCommissioningClient";
    private final Context context;
    private Optional<Boolean> isCommissioningClientAvailable = Optional.empty();
    private final MatterMetricsService metricsService;

    @Inject
    public SystemCommissioningClient(Context context, MatterMetricsService matterMetricsService) {
        this.context = context;
        this.metricsService = matterMetricsService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$suppressSystemCommissioningOverlay$2(Void r3) {
        this.isCommissioningClientAvailable = Optional.of(Boolean.TRUE);
        this.metricsService.recordCountMetric(MatterEventType.COMMISSIONING_CLIENT_AVAILABILITY_SUCCESS_RATE, 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$suppressSystemCommissioningOverlay$3(Exception exc) {
        this.isCommissioningClientAvailable = Optional.of(Boolean.FALSE);
        this.metricsService.recordCountMetric(MatterEventType.COMMISSIONING_CLIENT_AVAILABILITY_SUCCESS_RATE, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$suppressSystemCommissioningOverlay$4(CommissioningClient commissioningClient, Void r2) throws Exception {
        return suppressSystemCommissioningOverlayTask(commissioningClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$suppressSystemCommissioningOverlayTask$0(Void r3) {
        this.metricsService.recordCountMetric(MatterEventType.SUPPRESS_SYSTEM_COMMISSIONING_OVERLAY_SUCCESS_RATE, 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$suppressSystemCommissioningOverlayTask$1(Exception exc) {
        Log.w(TAG, "CommissioningClient suppressHalfSheetNotification failure", exc);
        this.metricsService.recordCountMetric(MatterEventType.SUPPRESS_SYSTEM_COMMISSIONING_OVERLAY_SUCCESS_RATE, 0L);
    }

    private Task<Void> suppressSystemCommissioningOverlayTask(CommissioningClient commissioningClient) {
        SystemCommissioningClient$$ExternalSyntheticLambda0 systemCommissioningClient$$ExternalSyntheticLambda0 = new SystemCommissioningClient$$ExternalSyntheticLambda0(this, 2);
        return commissioningClient.suppressHalfSheetNotification().addOnSuccessListener(systemCommissioningClient$$ExternalSyntheticLambda0).addOnFailureListener(new SystemCommissioningClient$$ExternalSyntheticLambda0(this, 3));
    }

    public Task<Void> suppressSystemCommissioningOverlay() {
        if (!this.isCommissioningClientAvailable.orElse(Boolean.TRUE).booleanValue()) {
            return Tasks.forCanceled();
        }
        CommissioningClient commissioningClient = Matter.getCommissioningClient(this.context);
        if (this.isCommissioningClientAvailable.orElse(Boolean.FALSE).booleanValue()) {
            return suppressSystemCommissioningOverlayTask(commissioningClient);
        }
        SystemCommissioningClient$$ExternalSyntheticLambda0 systemCommissioningClient$$ExternalSyntheticLambda0 = new SystemCommissioningClient$$ExternalSyntheticLambda0(this, 0);
        return GoogleApiAvailability.getInstance().checkApiAvailability(commissioningClient, new HasApiKey[0]).addOnSuccessListener(systemCommissioningClient$$ExternalSyntheticLambda0).addOnFailureListener(new SystemCommissioningClient$$ExternalSyntheticLambda0(this, 1)).onSuccessTask(new DevicesSource$$ExternalSyntheticLambda0(this, commissioningClient, 25));
    }
}
