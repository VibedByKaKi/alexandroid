package com.amazon.alexa.navigation.menu.model;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.navigation.menu.constants.TestId;
import com.amazon.alexa.navigation.menu.navigationcontroller.NavigationController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class NavigationMenuItem extends MenuItem {
    private final int layoutId;

    @VisibleForTesting
    NavigationController navigationController;

    public NavigationMenuItem(int i, int i2, NavigationController navigationController, boolean z, @NonNull TestId testId, int i3) {
        super(i, i2, z, testId);
        this.layoutId = i3;
        this.navigationController = navigationController;
    }

    @Override // com.amazon.alexa.navigation.menu.model.MenuItem
    public int getMenuItemLayout() {
        return this.layoutId;
    }

    @Override // com.amazon.alexa.navigation.menu.model.MenuItem
    public void onClick(View view) {
        this.navigationController.navigate();
    }
}
