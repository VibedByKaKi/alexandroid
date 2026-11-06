package com.amazon.dee.app.databinding;

import androidx.databinding.BindingAdapter;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class DrawerLayoutAdapter {
    private DrawerLayoutAdapter() {
    }

    @BindingAdapter({"locked"})
    public static void setDrawerLockMode(DrawerLayout drawerLayout, boolean z) {
        drawerLayout.setDrawerLockMode(z ? 1 : 0);
    }
}
