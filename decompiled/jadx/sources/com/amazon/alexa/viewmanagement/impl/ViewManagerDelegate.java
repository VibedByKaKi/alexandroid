package com.amazon.alexa.viewmanagement.impl;

import android.view.Menu;
import androidx.annotation.MenuRes;
import androidx.appcompat.widget.Toolbar;
import com.amazon.alexa.viewmanagement.api.ViewManagerEventNotifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ViewManagerDelegate extends ViewManagerEventNotifier {
    void resetHeaderMenu();

    Menu setHeaderMenu(@MenuRes int i, Toolbar.OnMenuItemClickListener onMenuItemClickListener);

    void setHeaderTitle(CharSequence charSequence);
}
