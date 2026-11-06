package com.amazon.deecomms.contacts.model.enums;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CommsProvisionStatus {
    UNKNOWN,
    AUTO_PROVISIONED,
    PROVISIONED,
    DEPROVISIONED;

    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsProvisionStatus.class);

    private static boolean compare(@Nullable String str, @NonNull CommsProvisionStatus commsProvisionStatus) {
        if (str != null) {
            try {
                if (valueOf(str) == commsProvisionStatus) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                LOG.w("Missing Provision Status value: ".concat(str), e);
            }
        }
        return false;
    }

    public static boolean isProvisioned(@Nullable String str) {
        return compare(str, PROVISIONED);
    }
}
