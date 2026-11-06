package com.facebook.react.views.view;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class WindowUtilKt$$ExternalSyntheticLambda0 implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets statusBarTranslucency$lambda$0;
        statusBarTranslucency$lambda$0 = WindowUtilKt.setStatusBarTranslucency$lambda$0(view, windowInsets);
        return statusBarTranslucency$lambda$0;
    }
}
