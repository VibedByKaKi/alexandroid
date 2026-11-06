package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda2 implements AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda2(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f$0).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        WindowInsetsCompat lambda$setUpToolbarInsetListener$4;
        lambda$setUpToolbarInsetListener$4 = ((SearchView) this.f$0).lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
        return lambda$setUpToolbarInsetListener$4;
    }
}
