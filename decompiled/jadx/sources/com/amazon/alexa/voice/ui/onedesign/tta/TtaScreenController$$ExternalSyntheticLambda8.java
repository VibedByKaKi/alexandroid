package com.amazon.alexa.voice.ui.onedesign.tta;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TtaScreenController$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TtaScreenController f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TtaScreenController$$ExternalSyntheticLambda8(TtaScreenController ttaScreenController, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = ttaScreenController;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$add$7(this.f$1);
                break;
            default:
                this.f$0.lambda$remove$8(this.f$1);
                break;
        }
    }
}
