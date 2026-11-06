package com.amazon.alexa.voice.settings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class EarconSettingsHandler$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarconSettingsHandler f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ EarconSettingsHandler$$ExternalSyntheticLambda0(EarconSettingsHandler earconSettingsHandler, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = earconSettingsHandler;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setEndpointSoundEnabled$1(this.f$1);
                break;
            default:
                this.f$0.lambda$setWakeSoundEnabled$0(this.f$1);
                break;
        }
    }
}
