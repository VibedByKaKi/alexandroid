package com.amazon.alexa.mobile.assistant.capabilities.external.connection;

import android.content.ComponentName;
import android.os.Bundle;
import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0018\u0010\n\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH&J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnection;", "", "getComponentName", "Landroid/content/ComponentName;", "isConnected", "", MissingTokenPull.TRIGGER_CONNECT, "disconnect", "", "release", "setConnectionLostListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "preprocess", "directiveBundle", "Landroid/os/Bundle;", "callbacks", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalDirectiveProcessingCallbacks;", "process", "directiveId", "", "cancel", "getCapabilities", "", "getContext", "Lcom/amazon/alexa/api/compat/model/AlexaContext;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ExternalCapabilityAgentConnection {
    void cancel(@NotNull String directiveId) throws ExternalCapabilityAgentException;

    boolean connect();

    void disconnect();

    @NotNull
    List<Bundle> getCapabilities() throws ExternalCapabilityAgentException;

    @NotNull
    ComponentName getComponentName();

    @Nullable
    AlexaContext getContext();

    boolean isConnected();

    void preprocess(@NotNull Bundle directiveBundle, @NotNull ExternalDirectiveProcessingCallbacks callbacks) throws ExternalCapabilityAgentException;

    void process(@NotNull String directiveId) throws ExternalCapabilityAgentException;

    void release();

    void setConnectionLostListener(@Nullable Function0<Unit> listener);
}
