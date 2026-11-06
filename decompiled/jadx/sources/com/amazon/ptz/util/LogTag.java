package com.amazon.ptz.util;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LogTag {
    private static final String TAG_PREFIX = "PtzLibrary.";

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private LogTag() {
    }

    public static String forClass(Class<?> cls) {
        return TAG_PREFIX.concat(cls.getSimpleName());
    }
}
