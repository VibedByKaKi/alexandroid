package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsAuthority;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.RawStringPayload;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AgentResponseFilter {
    private static final Map<Namespace, Set<Name>> ACCEPTED_DIRECTIVES;

    @VisibleForTesting
    static final String DISPLAY_HINT_PEEK = "\"displayHint\":\"PEEK\"";
    private static final String TAG = "AgentResponseFilter";
    private static final String WHITESPACE_REGEX = "\\s";

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AvsApiConstants.SpeechSynthesizer.NAMESPACE, new HashSet<Name>() { // from class: com.amazon.alexa.client.alexaservice.dialog.core.AgentResponseFilter.1
            {
                add(AvsApiConstants.SpeechSynthesizer.Directives.Speak.NAME);
            }
        });
        hashMap.put(AvsApiConstants.Alexa.Camera.PhotoCaptureController.NAMESPACE, new HashSet<Name>() { // from class: com.amazon.alexa.client.alexaservice.dialog.core.AgentResponseFilter.2
            {
                add(AvsApiConstants.Alexa.Camera.PhotoCaptureController.Directives.Capture.NAME);
            }
        });
        hashMap.put(AvsApiConstants.Alexa.Camera.VideoCaptureController.NAMESPACE, new HashSet<Name>() { // from class: com.amazon.alexa.client.alexaservice.dialog.core.AgentResponseFilter.3
            {
                add(AvsApiConstants.Alexa.Camera.VideoCaptureController.Directives.Start.NAME);
                add(AvsApiConstants.Alexa.Camera.VideoCaptureController.Directives.Stop.NAME);
            }
        });
        hashMap.put(AvsApiConstants.Alexa.Camera.AutoCaptureSessionController.NAMESPACE, new HashSet<Name>() { // from class: com.amazon.alexa.client.alexaservice.dialog.core.AgentResponseFilter.4
            {
                add(AvsApiConstants.Alexa.Camera.AutoCaptureSessionController.Directives.Start.NAME);
                add(AvsApiConstants.Alexa.Camera.AutoCaptureSessionController.Directives.Stop.NAME);
            }
        });
        ACCEPTED_DIRECTIVES = Collections.unmodifiableMap(hashMap);
    }

    @Inject
    public AgentResponseFilter() {
    }

    public boolean isMessageAPreambleFragmentResponse(Message message) {
        if (message == null || message.getHeader() == null) {
            return false;
        }
        Namespace namespace = message.getHeader().getNamespace();
        Name name = message.getHeader().getName();
        if (!AvsApiConstants.Alexa.Conversation.NAMESPACE.equals(namespace) || !AvsApiConstants.Alexa.Conversation.Directives.AddFragments.NAME.equals(name) || !(message.getPayload() instanceof RawStringPayload)) {
            return false;
        }
        String replaceAll = ((RawStringPayload) message.getPayload()).getValue().replaceAll(WHITESPACE_REGEX, "");
        return replaceAll.contains(ConversationsAuthority.PURPOSE_AGENT) && replaceAll.contains(DISPLAY_HINT_PEEK);
    }

    public boolean isMessageAnAgentFragment(Message message) {
        if (message == null || message.getHeader() == null) {
            return false;
        }
        Namespace namespace = message.getHeader().getNamespace();
        Name name = message.getHeader().getName();
        if (AvsApiConstants.Alexa.Conversation.NAMESPACE.equals(namespace) && AvsApiConstants.Alexa.Conversation.Directives.AddFragments.NAME.equals(name) && (message.getPayload() instanceof RawStringPayload)) {
            return ((RawStringPayload) message.getPayload()).getValue().replaceAll(WHITESPACE_REGEX, "").contains(ConversationsAuthority.PURPOSE_AGENT);
        }
        return false;
    }

    public boolean isMessageAnAgentFragmentResponse(Message message) {
        if (message == null || message.getHeader() == null) {
            return false;
        }
        Namespace namespace = message.getHeader().getNamespace();
        Name name = message.getHeader().getName();
        if (!AvsApiConstants.Alexa.Conversation.NAMESPACE.equals(namespace) || !AvsApiConstants.Alexa.Conversation.Directives.AddFragments.NAME.equals(name) || !(message.getPayload() instanceof RawStringPayload)) {
            return false;
        }
        String replaceAll = ((RawStringPayload) message.getPayload()).getValue().replaceAll(WHITESPACE_REGEX, "");
        return replaceAll.contains(ConversationsAuthority.PURPOSE_AGENT) && !replaceAll.contains(DISPLAY_HINT_PEEK);
    }

    public boolean isMessageAnAgentResponse(Message message) {
        boolean z = false;
        if (message != null && message.getHeader() != null) {
            if (isMessageAnAgentFragment(message)) {
                return true;
            }
            Set<Name> set = ACCEPTED_DIRECTIVES.get(message.getHeader().getNamespace());
            if (set != null && set.contains(message.getHeader().getName())) {
                z = true;
            }
            if (z) {
                Objects.toString(message.getHeader().getNamespace());
                Objects.toString(message.getHeader().getName());
            }
        }
        return z;
    }
}
