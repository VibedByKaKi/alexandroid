package com.amazon.commscore.commsbridge.dependencies;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.protocols.service.api.ComponentGetter;
import com.amazon.commscore.api.commsbridge.CommsBridgeError;
import com.amazon.commscore.api.commsbridge.CommsBridgeService;
import com.amazon.commscore.api.commsbridge.EventListener;
import com.amazon.commscore.api.commsbridge.MessageHandle;
import com.amazon.commscore.api.commsbridge.RequestHandler;
import com.amazon.commscore.dependencies.BaseComponentWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CommsBridgeServiceWrapper extends BaseComponentWrapper<CommsBridgeService> implements CommsBridgeService {
    public CommsBridgeServiceWrapper(ComponentGetter componentGetter, Context context) {
        super(componentGetter, context);
    }

    @Override // com.amazon.commscore.api.commsbridge.CommsBridgeService
    public MessageHandle addEventListener(@NonNull String str, @NonNull EventListener<String> eventListener) {
        return getImplementation().addEventListener(str, eventListener);
    }

    @Override // com.amazon.commscore.api.commsbridge.CommsBridgeService
    public void emitEventToReact(@NonNull String str, @Nullable Object obj) {
        getImplementation().emitEventToReact(str, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.commscore.dependencies.BaseComponentWrapper
    public CommsBridgeService getImplementation() {
        return this.commsCoreComponent.getCommsBridgeService();
    }

    @Override // com.amazon.commscore.api.commsbridge.CommsBridgeService
    public boolean isRequestHandlerRegistered(@NonNull String str) {
        return getImplementation().isRequestHandlerRegistered(str);
    }

    @Override // com.amazon.commscore.api.commsbridge.CommsBridgeService
    public MessageHandle registerRequestHandler(@NonNull String str, @NonNull RequestHandler<String> requestHandler) throws CommsBridgeError {
        return getImplementation().registerRequestHandler(str, requestHandler);
    }
}
