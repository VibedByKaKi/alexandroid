package com.amazon.alexa.growth.coachmark;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CoachMark$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoachMark f$0;

    public /* synthetic */ CoachMark$$ExternalSyntheticLambda2(CoachMark coachMark, int i) {
        this.$r8$classId = i;
        this.f$0 = coachMark;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CoachMark coachMark = this.f$0;
        switch (i) {
            case 0:
                coachMark.lambda$show$2();
                break;
            case 1:
                coachMark.renderCoachMark();
                break;
            default:
                coachMark.lambda$show$4();
                break;
        }
    }
}
