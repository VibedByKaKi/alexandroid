package com.amazon.alexa.routing.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes19.dex */
public @interface ContentMode {
    public static final int DEFAULT = 1;
    public static final int DRIVE_MODE_DEFAULT = 8;
    public static final int DRIVE_MODE_FULL_SCREEN = 9;
    public static final int DRIVE_MODE_NAV_BAR_ONLY = 11;
    public static final int DRIVE_MODE_TAB_BAR_ONLY = 10;
    public static final int FULLSCREEN = 2;
    public static final int INHERIT = 0;
    public static final int NAV_BAR_ONLY = 5;
    public static final int NAV_BAR_TITLE_ONLY = 6;
    public static final int OVERLAY = 7;
    public static final int TAB_BAR_ONLY = 3;
    public static final int TAB_BAR_ONLY_WITH_MENU_ACCESSIBLE = 4;
}
