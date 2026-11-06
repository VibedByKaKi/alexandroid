package com.google.android.play.core.install.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface InstallErrorCode {
    public static final int ERROR_API_NOT_AVAILABLE = -3;
    public static final int ERROR_APP_NOT_OWNED = -10;
    public static final int ERROR_DOWNLOAD_NOT_PRESENT = -7;
    public static final int ERROR_INSTALL_NOT_ALLOWED = -6;
    public static final int ERROR_INSTALL_UNAVAILABLE = -5;
    public static final int ERROR_INTERNAL_ERROR = -100;
    public static final int ERROR_INVALID_REQUEST = -4;
    public static final int ERROR_PLAY_STORE_NOT_FOUND = -9;
    public static final int ERROR_UNKNOWN = -2;
    public static final int NO_ERROR = 0;

    @Deprecated
    public static final int NO_ERROR_PARTIALLY_ALLOWED = 1;
}
