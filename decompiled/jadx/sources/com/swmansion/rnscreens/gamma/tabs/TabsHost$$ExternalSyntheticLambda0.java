package com.swmansion.rnscreens.gamma.tabs;

import android.view.View;
import com.amazon.alexa.redesign.utils.PageHorizontalMargin;
import com.amazon.leapfrogmapgl.indoor.NativeIndoorViewManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class TabsHost$$ExternalSyntheticLambda0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TabsHost$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$r8$classId) {
            case 0:
                TabsHost._init_$lambda$22(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                PageHorizontalMargin.wrapWithResponsiveMargin$lambda$3$lambda$1(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                com.amazon.dee.app.ui.util.PageHorizontalMargin.lambda$setup$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                NativeIndoorViewManager.createViewInstance$lambda$24(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
