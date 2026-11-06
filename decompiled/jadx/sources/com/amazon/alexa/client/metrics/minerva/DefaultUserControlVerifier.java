package com.amazon.alexa.client.metrics.minerva;

import com.amazon.minerva.client.thirdparty.compliance.UserControlVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DefaultUserControlVerifier implements UserControlVerifier {
    @Override // com.amazon.minerva.client.thirdparty.compliance.UserControlVerifier
    public boolean isUsageCollectionEnabled() throws Exception {
        return true;
    }
}
