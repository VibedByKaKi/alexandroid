package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ConversationsListenerSender {
    private static final String TAG = "ConversationsListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public ConversationsListenerSender(Messenger messenger, int i) {
        this.messenger = messenger;
        this.specIndex = i;
    }

    private boolean sendMessage(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = this.specIndex;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        try {
            this.messenger.send(obtain);
            return true;
        } catch (RemoteException e) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Failed to send message: ", i, TAG, e);
            return false;
        }
    }

    public boolean onAddFragments(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.PAYLOAD_JSON.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_ADD_FRAGMENTS.ordinal(), bundle);
    }

    public boolean onConversationUpdated(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.CONVERSATION_ID.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DATA.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_CONVERSATION_UPDATED.ordinal(), bundle);
    }

    public boolean onConversationsUpdated(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(ConversationsListenerArgumentType.EXTRAS_BUNDLE.name(), bundle);
        bundle2.putString(ConversationsListenerArgumentType.DATA.name(), str);
        return sendMessage(ConversationsListenerMessageType.ON_CONVERSATIONS_UPDATED.ordinal(), bundle2);
    }

    public boolean onDeleteConversations(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.PAYLOAD_JSON.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_DELETE_CONVERSATIONS.ordinal(), bundle);
    }

    public boolean onFragmentRenderingPaused(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str);
        return sendMessage(ConversationsListenerMessageType.ON_FRAGMENT_RENDERING_PAUSED.ordinal(), bundle);
    }

    public boolean onFragmentRenderingResumed(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str);
        return sendMessage(ConversationsListenerMessageType.ON_FRAGMENT_RENDERING_RESUMED.ordinal(), bundle);
    }

    public boolean onFragments(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putBundle(ConversationsListenerArgumentType.METADATA_BUNDLE.name(), bundle);
        bundle3.putString(ConversationsListenerArgumentType.DATA.name(), str);
        bundle3.putBundle(ConversationsListenerArgumentType.CHUNK_BUNDLE.name(), bundle2);
        return sendMessage(ConversationsListenerMessageType.ON_FRAGMENTS.ordinal(), bundle3);
    }

    public boolean onPersonalityDisplay(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.PAYLOAD_JSON.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_PERSONALITY_DISPLAY.ordinal(), bundle);
    }

    public boolean onPersonalizedContent(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.PAYLOAD_JSON.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_PERSONALIZED_CONTENT.ordinal(), bundle);
    }

    public boolean onRequestResult(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(ConversationsListenerArgumentType.RESULT_BUNDLE.name(), bundle);
        return sendMessage(ConversationsListenerMessageType.ON_REQUEST_RESULT.ordinal(), bundle2);
    }

    public boolean onUpdateConversationMetadata(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.PAYLOAD_JSON.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_UPDATE_CONVERSATION_METADATA.ordinal(), bundle);
    }

    public boolean onUpdateFragmentData(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsListenerArgumentType.PAYLOAD_JSON.name(), str);
        bundle.putString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name(), str2);
        return sendMessage(ConversationsListenerMessageType.ON_UPDATE_FRAGMENT_DATA.ordinal(), bundle);
    }
}
