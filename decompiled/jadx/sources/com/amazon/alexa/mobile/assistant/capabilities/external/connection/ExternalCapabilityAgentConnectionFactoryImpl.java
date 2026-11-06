package com.amazon.alexa.mobile.assistant.capabilities.external.connection;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionFactoryImpl;", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionFactory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "create", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnection;", "componentName", "Landroid/content/ComponentName;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ExternalCapabilityAgentConnectionFactoryImpl implements ExternalCapabilityAgentConnectionFactory {

    @NotNull
    private final Context context;

    public ExternalCapabilityAgentConnectionFactoryImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnectionFactory
    @NotNull
    public ExternalCapabilityAgentConnection create(@NotNull ComponentName componentName) {
        componentName.getClass();
        return new ExternalCapabilityAgentConnectionImpl(this.context, componentName);
    }
}
