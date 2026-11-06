package com.amazon.alexa.client.alexaservice.base.application.ipc;

import android.content.ComponentName;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.utils.security.SignatureVerifier;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MessageReceiverAuthority {
    private static final String TAG = "MessageReceiverAuthority";
    private final MessageReceiversManager alexaServiceMessageReceiverManager;
    private final Map<ComponentName, MessageReceiversManager> capabilityAgentMessengerManagers;
    private final Map<ExtendedClient, MessageReceiversManager> clientMessengerManagers;
    private final ErrorReporter errorReporter;
    private final SignatureVerifier signatureVerifier;

    @VisibleForTesting
    public MessageReceiverAuthority(SignatureVerifier signatureVerifier, ErrorReporter errorReporter, MessageReceiversManager messageReceiversManager, Map<ExtendedClient, MessageReceiversManager> map, Map<ComponentName, MessageReceiversManager> map2) {
        Preconditions.notNull(signatureVerifier, "signature verifier is null");
        Preconditions.notNull(errorReporter, "error reporter is null");
        Preconditions.notNull(messageReceiversManager, "alexaServiceMessageReceiverManager map is null");
        Preconditions.notNull(map, "clientMessengerManagers map is null");
        Preconditions.notNull(map2, "capabilityAgentMessengerManagers map is null");
        this.signatureVerifier = signatureVerifier;
        this.errorReporter = errorReporter;
        this.alexaServiceMessageReceiverManager = messageReceiversManager;
        this.clientMessengerManagers = map;
        this.capabilityAgentMessengerManagers = map2;
    }

    public synchronized MessageReceiversManager getAlexaServiceMessageReceiverManager() {
        return this.alexaServiceMessageReceiverManager;
    }

    public synchronized MessageReceiversManager getReceiversManagerForClient(ExtendedClient extendedClient) {
        try {
            if (!this.clientMessengerManagers.containsKey(extendedClient)) {
                Objects.toString(extendedClient);
                this.clientMessengerManagers.put(extendedClient, new MessageReceiversManager(this.signatureVerifier, this.errorReporter));
            }
            Objects.toString(extendedClient);
        } catch (Throwable th) {
            throw th;
        }
        return this.clientMessengerManagers.get(extendedClient);
    }

    public synchronized MessageReceiversManager getReceiversManagerForComponent(ComponentName componentName) {
        try {
            if (!this.capabilityAgentMessengerManagers.containsKey(componentName)) {
                Objects.toString(componentName);
                this.capabilityAgentMessengerManagers.put(componentName, new MessageReceiversManager(this.signatureVerifier, this.errorReporter));
            }
            Objects.toString(componentName);
        } catch (Throwable th) {
            throw th;
        }
        return this.capabilityAgentMessengerManagers.get(componentName);
    }

    public synchronized void removeClient(ExtendedClient extendedClient) {
        Preconditions.notNull(extendedClient, "client is null");
        Objects.toString(extendedClient);
        MessageReceiversManager remove = this.clientMessengerManagers.remove(extendedClient);
        if (remove != null) {
            remove.clear();
        }
    }

    public synchronized void removeComponent(ComponentName componentName) {
        Preconditions.notNull(componentName, "componentName is null");
        Objects.toString(componentName);
        MessageReceiversManager remove = this.capabilityAgentMessengerManagers.remove(componentName);
        if (remove != null) {
            remove.clear();
        }
    }

    public synchronized void teardown() {
        try {
            this.alexaServiceMessageReceiverManager.clear();
            Iterator<MessageReceiversManager> it2 = this.clientMessengerManagers.values().iterator();
            while (it2.hasNext()) {
                it2.next().clear();
            }
            this.clientMessengerManagers.clear();
            Iterator<MessageReceiversManager> it3 = this.capabilityAgentMessengerManagers.values().iterator();
            while (it3.hasNext()) {
                it3.next().clear();
            }
            this.capabilityAgentMessengerManagers.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Inject
    public MessageReceiverAuthority(SignatureVerifier signatureVerifier, ErrorReporter errorReporter) {
        this(signatureVerifier, errorReporter, new MessageReceiversManager(signatureVerifier, errorReporter), new HashMap(), new HashMap());
    }
}
