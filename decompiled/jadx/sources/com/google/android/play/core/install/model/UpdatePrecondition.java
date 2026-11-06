package com.google.android.play.core.install.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes7.dex */
public @interface UpdatePrecondition {
    public static final int APP_VERSION_FRESH = 5;
    public static final int CANNOT_DISPLAY = 1;
    public static final int DEVICE_STATUS = 4;
    public static final int INSUFFICIENT_STORAGE = 3;
    public static final int NEED_STORE_TO_PROCEED = 2;
    public static final int UNKNOWN = 0;
}
