package com.amazon.alexa.mobile.assistant.client.apis;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaApiCallbacks;
import com.amazon.alexa.api.compat.model.AlexaEndpointConfiguration;
import com.amazon.alexa.api.compat.model.AlexaEndpointsListener;
import com.amazon.alexa.api.compat.model.EndpointsApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/EndpointsApiImpl;", "Lcom/amazon/alexa/api/compat/model/EndpointsApi;", "<init>", "()V", "registerEndpointsListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaEndpointsListener;", "deregisterEndpointsListener", "registerEndpoint", "configuration", "Lcom/amazon/alexa/api/compat/model/AlexaEndpointConfiguration;", "apiCallbacks", "Lcom/amazon/alexa/api/compat/model/AlexaApiCallbacks;", "deregisterEndpoint", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class EndpointsApiImpl implements EndpointsApi {
    public static final int $stable = 0;

    @Override // com.amazon.alexa.api.compat.model.EndpointsApi
    public void deregisterEndpoint(@NotNull AlexaEndpointConfiguration configuration) {
        configuration.getClass();
    }

    @Override // com.amazon.alexa.api.compat.model.EndpointsApi
    public void deregisterEndpointsListener(@NotNull AlexaEndpointsListener listener) {
        listener.getClass();
    }

    @Override // com.amazon.alexa.api.compat.model.EndpointsApi
    public void registerEndpoint(@NotNull AlexaEndpointConfiguration configuration, @NotNull AlexaApiCallbacks apiCallbacks) {
        configuration.getClass();
        apiCallbacks.getClass();
    }

    @Override // com.amazon.alexa.api.compat.model.EndpointsApi
    public void registerEndpointsListener(@NotNull AlexaEndpointsListener listener) {
        listener.getClass();
    }
}
