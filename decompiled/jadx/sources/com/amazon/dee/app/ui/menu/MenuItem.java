package com.amazon.dee.app.ui.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MenuItem {
    private int badgeId;
    private Context context;
    private boolean hasDividerBelow;
    private final MenuIdentifier identifier;
    private boolean isVisible;
    private int textId;

    public MenuItem(Context context, MenuIdentifier menuIdentifier, @StringRes int i, boolean z, boolean z2) {
        this.context = context;
        this.identifier = menuIdentifier;
        this.hasDividerBelow = z;
        this.isVisible = z2;
        this.textId = i;
    }

    public MenuItem copy() {
        MenuItem menuItem = new MenuItem(this.context, this.identifier, this.textId, this.hasDividerBelow, this.isVisible);
        menuItem.setBadgeId(this.badgeId);
        return menuItem;
    }

    public Drawable getBadgeIcon() {
        int i = this.badgeId;
        if (i > 0) {
            return this.context.getDrawable(i);
        }
        return null;
    }

    public MenuIdentifier getIdentifier() {
        return this.identifier;
    }

    public CharSequence getText() {
        int i = this.textId;
        if (i > 0) {
            return this.context.getText(i);
        }
        return null;
    }

    public boolean isEqual(Object obj) {
        if (obj != null && (obj instanceof MenuItem)) {
            MenuItem menuItem = (MenuItem) obj;
            boolean equals = getBadgeIcon() != null ? getBadgeIcon().equals(menuItem.getBadgeIcon()) : menuItem.getBadgeIcon() == null;
            if (getIdentifier() == menuItem.getIdentifier() && getText().equals(menuItem.getText()) && isVisible() == menuItem.isVisible() && showDivider() == menuItem.showDivider() && equals) {
                return true;
            }
        }
        return false;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void removeBadgeId() {
        this.badgeId = 0;
    }

    public void setBadgeId(@StringRes int i) {
        this.badgeId = i;
    }

    public void setDivider(boolean z) {
        this.hasDividerBelow = z;
    }

    public void setText(@StringRes int i) {
        this.textId = i;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public boolean showDivider() {
        return this.hasDividerBelow;
    }
}
