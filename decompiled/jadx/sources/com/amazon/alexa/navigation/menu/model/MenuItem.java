package com.amazon.alexa.navigation.menu.model;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.amazon.alexa.navigation.menu.R;
import com.amazon.alexa.navigation.menu.constants.TestId;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public abstract class MenuItem {
    public static final int NO_NEW_COLOR = 0;
    private final int iconId;
    private final boolean lineUnderneath;
    private final int nameId;
    private final TestId testId;
    private int textColor = R.color.main_menu_primary_text;
    private int iconColor = 0;
    public boolean isPromoted = false;

    public MenuItem(int i, int i2, boolean z, TestId testId) {
        this.nameId = i;
        this.iconId = i2;
        this.lineUnderneath = z;
        this.testId = testId;
    }

    public int getIconColor() {
        return this.iconColor;
    }

    public int getIconId() {
        return this.iconId;
    }

    @LayoutRes
    public abstract int getMenuItemLayout();

    public int getNameId() {
        return this.nameId;
    }

    public TestId getTestId() {
        return this.testId;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public boolean isLineUnderneath() {
        return this.lineUnderneath;
    }

    public abstract void onClick(View view);

    public void setIconColor(int i) {
        this.iconColor = i;
    }

    public void setTextColor(int i) {
        this.textColor = i;
    }

    public MenuItem withIconColor(int i) {
        setIconColor(i);
        return this;
    }

    public MenuItem withTextColor(int i) {
        setTextColor(i);
        return this;
    }
}
