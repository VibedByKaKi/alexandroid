package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import org.apache.commons.lang.exception.ExceptionUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WJErrorUtils {
    public static Throwable getRootCause(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable rootCause = ExceptionUtils.getRootCause(th);
        return rootCause != null ? rootCause : th;
    }
}
