package com.google.android.play.core.install.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface InstallStatus {
    public static final int CANCELED = 6;
    public static final int DOWNLOADED = 11;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 5;
    public static final int INSTALLED = 4;
    public static final int INSTALLING = 3;
    public static final int PENDING = 1;

    @Deprecated
    public static final int REQUIRES_UI_INTENT = 10;
    public static final int UNKNOWN = 0;
}
