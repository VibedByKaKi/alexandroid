package com.amazon.dee.app.ui.menu;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum MenuOperationStatus {
    SUCCESS("Success"),
    MENU_ITEM_NOT_FOUND("Unknown menu item"),
    BADGE_ICON_NOT_FOUND("Unknown badge icon");

    private final String description;

    MenuOperationStatus(String str) {
        this.description = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.description;
    }
}
