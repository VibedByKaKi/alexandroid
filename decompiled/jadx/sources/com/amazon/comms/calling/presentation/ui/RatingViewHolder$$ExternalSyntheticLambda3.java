package com.amazon.comms.calling.presentation.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RatingViewHolder$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RatingViewHolder f$0;

    public /* synthetic */ RatingViewHolder$$ExternalSyntheticLambda3(RatingViewHolder ratingViewHolder, int i) {
        this.$r8$classId = i;
        this.f$0 = ratingViewHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RatingViewHolder ratingViewHolder = this.f$0;
        switch (i) {
            case 0:
                RatingViewHolder.showRateCallAndHideRatingButtonGroup$lambda$0(ratingViewHolder);
                break;
            default:
                ratingViewHolder.hideRateCallAndShowRatingButtonGroup();
                break;
        }
    }
}
