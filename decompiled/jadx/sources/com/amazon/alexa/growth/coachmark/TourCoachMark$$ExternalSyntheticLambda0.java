package com.amazon.alexa.growth.coachmark;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class TourCoachMark$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TourCoachMark f$0;

    public /* synthetic */ TourCoachMark$$ExternalSyntheticLambda0(TourCoachMark tourCoachMark, int i) {
        this.$r8$classId = i;
        this.f$0 = tourCoachMark;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        TourCoachMark tourCoachMark = this.f$0;
        switch (i) {
            case 0:
                tourCoachMark.lambda$requestFocus$0();
                break;
            default:
                tourCoachMark.lambda$removeFullScreenTouchView$4();
                break;
        }
    }
}
