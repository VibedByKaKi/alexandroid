package com.amazon.alexa.voice.ui.internal.widget;

import android.view.View;
import com.amazon.alexa.navigation.menu.util.PageHorizontalMargin;
import com.amazon.alexa.smarthomecameras.view.PortraitCameraView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationBarItemView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ContentLayout$$ExternalSyntheticLambda0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ContentLayout$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i9) {
            case 0:
                ((ContentLayout) obj).lambda$addView$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                PageHorizontalMargin.lambda$applyResponsivePadding$1((View) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                ((PortraitCameraView) obj).lambda$fitVideoToWindow$4(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                ((com.amazon.alexa.voice.ui.onedesign.widget.ContentLayout) obj).lambda$addView$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                ((CarouselLayoutManager) obj).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                ((NavigationBarItemView) obj).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
