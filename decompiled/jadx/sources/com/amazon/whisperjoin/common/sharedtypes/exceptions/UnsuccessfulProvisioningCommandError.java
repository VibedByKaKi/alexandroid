package com.amazon.whisperjoin.common.sharedtypes.exceptions;

import com.google.common.base.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UnsuccessfulProvisioningCommandError extends Exception {
    private final int mStatusCode;
    private final String mUUID;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsuccessfulProvisioningCommandError(String str, int i) {
        super("Command: " + str + " Failed with Status Code: " + i);
        Locale locale = Locale.ENGLISH;
        this.mUUID = str;
        this.mStatusCode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UnsuccessfulProvisioningCommandError unsuccessfulProvisioningCommandError = (UnsuccessfulProvisioningCommandError) obj;
            if (this.mStatusCode == unsuccessfulProvisioningCommandError.mStatusCode && Objects.equal(this.mUUID, unsuccessfulProvisioningCommandError.mUUID)) {
                return true;
            }
        }
        return false;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public String getUUID() {
        return this.mUUID;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mStatusCode), this.mUUID);
    }
}
