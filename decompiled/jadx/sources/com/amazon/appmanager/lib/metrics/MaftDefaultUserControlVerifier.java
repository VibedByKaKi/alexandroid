package com.amazon.appmanager.lib.metrics;

import com.amazon.minerva.client.common.compliance.UserControlVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MaftDefaultUserControlVerifier implements UserControlVerifier {
    @Override // com.amazon.minerva.client.common.compliance.UserControlVerifier
    public boolean isUsageCollectionEnabled() throws Exception {
        return true;
    }
}
