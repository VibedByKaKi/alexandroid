package com.amazon.deecomms.calling.incallexperiences.effects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class EffectsMenuPresenter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EffectsMenuPresenter f$0;

    public /* synthetic */ EffectsMenuPresenter$$ExternalSyntheticLambda0(EffectsMenuPresenter effectsMenuPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = effectsMenuPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        EffectsMenuPresenter effectsMenuPresenter = this.f$0;
        switch (i) {
            case 0:
                effectsMenuPresenter.lambda$new$0();
                break;
            case 1:
                effectsMenuPresenter.lambda$onApplied$1();
                break;
            default:
                effectsMenuPresenter.lambda$onRemoved$2();
                break;
        }
    }
}
