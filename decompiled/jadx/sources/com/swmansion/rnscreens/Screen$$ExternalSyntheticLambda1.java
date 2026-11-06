package com.swmansion.rnscreens;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class Screen$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Screen f$0;

    public /* synthetic */ Screen$$ExternalSyntheticLambda1(Screen screen, int i) {
        this.$r8$classId = i;
        this.f$0 = screen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Screen screen = this.f$0;
        switch (i) {
            case 0:
                Screen.updateSheetContentHeightWithAnimation$lambda$3(screen);
                break;
            default:
                screen.startRemovalTransition();
                break;
        }
    }
}
