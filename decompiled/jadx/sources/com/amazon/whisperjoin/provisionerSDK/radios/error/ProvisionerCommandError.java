package com.amazon.whisperjoin.provisionerSDK.radios.error;

import com.amazon.whisperbridge.constants.Command;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ProvisionerCommandError extends Exception {
    private final Command mCommand;
    private final Throwable mFailureCause;

    public ProvisionerCommandError(Throwable th, Command command) {
        this.mFailureCause = th;
        this.mCommand = command;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisionerCommandError provisionerCommandError = (ProvisionerCommandError) obj;
            if (Objects.equal(this.mFailureCause, provisionerCommandError.mFailureCause) && Objects.equal(this.mCommand, provisionerCommandError.mCommand)) {
                return true;
            }
        }
        return false;
    }

    public Command getCommand() {
        return this.mCommand;
    }

    public Throwable getFailureCause() {
        return this.mFailureCause;
    }

    public int hashCode() {
        return Objects.hashCode(this.mFailureCause, this.mCommand);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return MoreObjects.toStringHelper(this).add("mFailureCause", this.mFailureCause).add("mCommandMessage", this.mCommand).toString();
    }
}
