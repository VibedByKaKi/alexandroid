package com.google.android.exoplayer2.ui;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class StyledPlayerControlView$$ExternalSyntheticLambda2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StyledPlayerControlView$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i9) {
            case 0:
                ((StyledPlayerControlView) obj).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                ((StyledPlayerControlViewLayoutManager) obj).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
