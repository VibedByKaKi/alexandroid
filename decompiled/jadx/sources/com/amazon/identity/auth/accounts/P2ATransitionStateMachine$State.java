package com.amazon.identity.auth.accounts;

import androidx.annotation.NonNull;
import com.amazon.identity.auth.device.utils.AccountConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum P2ATransitionStateMachine$State {
    INIT(AccountConstants.P2A_STATUS_MIGRATION_FAILED_BEFORE_ACCOUNT_ADDED),
    ACCOUNT_ADDED(AccountConstants.P2A_STATUS_MIGRATION_FAILED_AFTER_ACCOUNT_ADDED),
    COMPLETE(AccountConstants.P2A_STATUS_MIGRATION_COMPLETED);

    private final String mClientStatus;

    P2ATransitionStateMachine$State(@NonNull String str) {
        this.mClientStatus = str;
    }

    @NonNull
    public String toClientStatus() {
        return this.mClientStatus;
    }
}
