package com.amazon.deecomms.calling.incallexperiences.effects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class EffectsMenuPresenter$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EffectsMenuPresenter f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ EffectsMenuPresenter$$ExternalSyntheticLambda1(EffectsMenuPresenter effectsMenuPresenter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = effectsMenuPresenter;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onRemoveFailed$4(this.f$1);
                break;
            default:
                this.f$0.lambda$onApplyFailed$3(this.f$1);
                break;
        }
    }
}
