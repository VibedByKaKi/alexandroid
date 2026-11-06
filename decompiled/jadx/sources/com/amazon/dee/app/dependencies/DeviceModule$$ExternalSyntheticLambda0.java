package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.useragent.UserAgent;
import com.amazon.dee.app.services.useragent.UserAgentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class DeviceModule$$ExternalSyntheticLambda0 implements UserAgentService {
    @Override // com.amazon.dee.app.services.useragent.UserAgentService
    public final String build() {
        return UserAgent.get();
    }
}
