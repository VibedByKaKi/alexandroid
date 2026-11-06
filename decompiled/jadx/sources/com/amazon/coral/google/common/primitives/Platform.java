package com.amazon.coral.google.common.primitives;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.base.Strings;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
final class Platform {
    private static final Logger logger = Logger.getLogger(Platform.class.getName());

    private Platform() {
    }

    public static void checkGwtRpcEnabled() {
        if (Boolean.parseBoolean(System.getProperty("guava.gwt.emergency_reenable_rpc", "false"))) {
            logger.log(Level.WARNING, "Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this warning because you are sending a Guava type over GWT-RPC, which will break. You can identify which type by looking at the class name in the attached stack trace.", new Throwable());
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat("We are removing GWT-RPC support for Guava types. You can temporarily reenable support by setting the system property %s to true. For more about system properties, see %s. For more about Guava's GWT-RPC support, see %s.", "guava.gwt.emergency_reenable_rpc", "https://stackoverflow.com/q/5189914/28465", "https://groups.google.com/d/msg/guava-announce/zHZTFg7YF3o/rQNnwdHeEwAJ"));
        }
    }
}
