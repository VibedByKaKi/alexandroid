package com.amazon.minerva.client.common.internal.compliance;

import com.amazon.minerva.client.thirdparty.compliance.ChildProfileVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ChildProfileVerifierAdapter implements ChildProfileVerifier {
    private com.amazon.minerva.client.common.compliance.ChildProfileVerifier mChildProfileVerifier;

    public ChildProfileVerifierAdapter(com.amazon.minerva.client.common.compliance.ChildProfileVerifier childProfileVerifier) {
        this.mChildProfileVerifier = childProfileVerifier;
    }

    @Override // com.amazon.minerva.client.thirdparty.compliance.ChildProfileVerifier
    public boolean isChildProfile() throws Exception {
        return this.mChildProfileVerifier.isChildProfile();
    }
}
