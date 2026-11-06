package com.amazon.alexa.assistant.authorization;

import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/authorization/AuthorizationCoordinator;", "Lcom/amazon/alexa/assistant/authorization/AuthorizationProvider;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "start", "", "stop", "authorization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AuthorizationCoordinator extends AuthorizationProvider, LifecycleComponent {
    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Startable
    void start();

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Stoppable
    void stop();
}
