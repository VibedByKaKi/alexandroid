package com.amazon.alexa.accessory.frames.greeting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class BudGreetingManager$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BudGreetingManager f$0;

    public /* synthetic */ BudGreetingManager$$ExternalSyntheticLambda2(BudGreetingManager budGreetingManager, int i) {
        this.$r8$classId = i;
        this.f$0 = budGreetingManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BudGreetingManager budGreetingManager = this.f$0;
        switch (i) {
            case 0:
                budGreetingManager.lambda$start$2();
                break;
            case 1:
                budGreetingManager.onSettleDelayElapsed();
                break;
            case 2:
                budGreetingManager.lambda$stop$8();
                break;
            case 3:
                budGreetingManager.lambda$onUserLogout$11();
                break;
            case 4:
                budGreetingManager.lambda$audioFocusLost$13();
                break;
            case 5:
                budGreetingManager.lambda$onUserLogout$10();
                break;
            case 6:
                budGreetingManager.lambda$audioFocusAcquired$12();
                break;
            case 7:
                budGreetingManager.onFocusAcquired();
                break;
            case 8:
                budGreetingManager.lambda$startGreeting$14();
                break;
            default:
                budGreetingManager.reset();
                break;
        }
    }
}
