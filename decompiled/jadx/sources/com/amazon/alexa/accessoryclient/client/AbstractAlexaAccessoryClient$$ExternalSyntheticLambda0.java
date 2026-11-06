package com.amazon.alexa.accessoryclient.client;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AbstractAlexaAccessoryClient$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractAlexaAccessoryClient f$0;

    public /* synthetic */ AbstractAlexaAccessoryClient$$ExternalSyntheticLambda0(AbstractAlexaAccessoryClient abstractAlexaAccessoryClient, int i) {
        this.$r8$classId = i;
        this.f$0 = abstractAlexaAccessoryClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AbstractAlexaAccessoryClient abstractAlexaAccessoryClient = this.f$0;
        switch (i) {
            case 0:
                AbstractAlexaAccessoryClient.initialize$lambda$4$lambda$2(abstractAlexaAccessoryClient);
                break;
            case 1:
                AbstractAlexaAccessoryClient.disconnect$lambda$6$lambda$5(abstractAlexaAccessoryClient);
                break;
            default:
                AbstractAlexaAccessoryClient.record1MinuteMetrics$lambda$16(abstractAlexaAccessoryClient);
                break;
        }
    }
}
