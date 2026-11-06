package com.amazon.apl.android;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayout$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ APLLayout f$0;

    public /* synthetic */ APLLayout$$ExternalSyntheticLambda1(APLLayout aPLLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = aPLLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        APLLayout aPLLayout = this.f$0;
        switch (i) {
            case 0:
                aPLLayout.requestLayout();
                break;
            default:
                aPLLayout.clear();
                break;
        }
    }
}
