package com.amazon.alexa.accessory.davs;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DavsArtifactsSender$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DavsArtifactsSender f$0;

    public /* synthetic */ DavsArtifactsSender$$ExternalSyntheticLambda2(DavsArtifactsSender davsArtifactsSender, int i) {
        this.$r8$classId = i;
        this.f$0 = davsArtifactsSender;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DavsArtifactsSender davsArtifactsSender = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                davsArtifactsSender.lambda$transferDavsArtifacts$3(th);
                break;
            default:
                davsArtifactsSender.lambda$transferDavsArtifacts$0(th);
                break;
        }
    }
}
