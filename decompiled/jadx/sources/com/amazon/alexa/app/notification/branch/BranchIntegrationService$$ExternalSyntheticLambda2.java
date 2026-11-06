package com.amazon.alexa.app.notification.branch;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BranchIntegrationService$$ExternalSyntheticLambda2 implements TimeProvider, EventIdProvider, CorrelationIdProvider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BranchIntegrationService$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.app.notification.branch.EventIdProvider, com.amazon.alexa.app.notification.branch.CorrelationIdProvider
    public String create() {
        String lambda$new$0;
        String lambda$new$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$0 = BranchIntegrationService.lambda$new$0();
                return lambda$new$0;
            default:
                lambda$new$1 = BranchHighValueActionService.lambda$new$1();
                return lambda$new$1;
        }
    }

    @Override // com.amazon.alexa.app.notification.branch.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
