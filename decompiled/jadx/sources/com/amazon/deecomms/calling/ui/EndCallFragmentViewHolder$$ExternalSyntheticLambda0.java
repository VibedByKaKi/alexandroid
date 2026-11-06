package com.amazon.deecomms.calling.ui;

import android.widget.RatingBar;
import com.amazon.comms.calling.presentation.ui.RatingViewHolder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class EndCallFragmentViewHolder$$ExternalSyntheticLambda0 implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ EndCallFragmentViewHolder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((EndCallFragmentViewHolder) obj).lambda$initializeListeners$0(ratingBar, f, z);
                break;
            default:
                RatingViewHolder.initializeListeners$lambda$3((RatingViewHolder) obj, ratingBar, f, z);
                break;
        }
    }
}
