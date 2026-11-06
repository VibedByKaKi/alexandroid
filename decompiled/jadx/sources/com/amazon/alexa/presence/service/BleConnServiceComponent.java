package com.amazon.alexa.presence.service;

import com.amazon.alexa.presence.bleconn.service.handlers.IdentityRequestHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/presence/service/BleConnServiceComponent;", "", "identityComponent", "Lcom/amazon/alexa/presence/service/BleConnIdentityComponent;", "(Lcom/amazon/alexa/presence/service/BleConnIdentityComponent;)V", "identityRequestHandler", "Lcom/amazon/alexa/presence/bleconn/service/handlers/IdentityRequestHandler;", "getIdentityRequestHandler", "()Lcom/amazon/alexa/presence/bleconn/service/handlers/IdentityRequestHandler;", "Companion", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BleConnServiceComponent {
    private static final String TAG = BleConnServiceComponent.class.getName();

    @NotNull
    private final IdentityRequestHandler identityRequestHandler;

    @Inject
    public BleConnServiceComponent(@NotNull BleConnIdentityComponent bleConnIdentityComponent) {
        bleConnIdentityComponent.getClass();
        this.identityRequestHandler = new IdentityRequestHandler(bleConnIdentityComponent.getIdentityController());
    }

    @NotNull
    public final IdentityRequestHandler getIdentityRequestHandler() {
        return this.identityRequestHandler;
    }
}
