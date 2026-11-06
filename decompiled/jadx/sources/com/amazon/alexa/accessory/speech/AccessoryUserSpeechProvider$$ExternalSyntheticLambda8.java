package com.amazon.alexa.accessory.speech;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryUserSpeechProvider$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryUserSpeechProvider f$0;

    public /* synthetic */ AccessoryUserSpeechProvider$$ExternalSyntheticLambda8(AccessoryUserSpeechProvider accessoryUserSpeechProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryUserSpeechProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AccessoryUserSpeechProvider accessoryUserSpeechProvider = this.f$0;
        switch (i) {
            case 0:
                accessoryUserSpeechProvider.assignPendingToCurrent();
                break;
            case 1:
                accessoryUserSpeechProvider.lambda$onDialogStarted$13();
                break;
            case 2:
                accessoryUserSpeechProvider.lambda$onDialogTurnFinished$15();
                break;
            default:
                accessoryUserSpeechProvider.lambda$onDialogFinished$16();
                break;
        }
    }
}
