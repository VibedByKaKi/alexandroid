package com.amazon.minerva.client.common.internal.compliance;

import com.amazon.minerva.client.thirdparty.compliance.UserControlVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UserControlVerifierAdapter implements UserControlVerifier {
    private com.amazon.minerva.client.common.compliance.UserControlVerifier mUserControlVerifier;

    public UserControlVerifierAdapter(com.amazon.minerva.client.common.compliance.UserControlVerifier userControlVerifier) {
        this.mUserControlVerifier = userControlVerifier;
    }

    @Override // com.amazon.minerva.client.thirdparty.compliance.UserControlVerifier
    public boolean isUsageCollectionEnabled() throws Exception {
        return this.mUserControlVerifier.isUsageCollectionEnabled();
    }
}
