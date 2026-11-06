package com.amazon.alexa.crashreporting;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class DefaultCrashReportingService$$ExternalSyntheticLambda1 implements MessageFilter {
    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public final boolean isMatch(Message message) {
        boolean lambda$startObservingIdentityAvailability$0;
        lambda$startObservingIdentityAvailability$0 = DefaultCrashReportingService.lambda$startObservingIdentityAvailability$0(message);
        return lambda$startObservingIdentityAvailability$0;
    }
}
