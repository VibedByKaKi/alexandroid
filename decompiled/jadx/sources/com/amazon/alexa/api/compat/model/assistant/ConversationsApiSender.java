package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ConversationsApiSender {
    private static final String TAG = "ConversationsApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public ConversationsApiSender(Messenger messenger, int i) {
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

    private void sendMessageOrThrow(int i, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = this.specIndex;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        try {
            this.messenger.send(obtain);
        } catch (RemoteException e) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Failed to send message: ", i, TAG, e);
            throw e;
        }
    }

    public void deleteConversations(ArrayList<String> arrayList, Bundle bundle, String str) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList(ConversationsApiArgumentType.IDS.name(), arrayList);
        bundle2.putBundle(ConversationsApiArgumentType.TIMEOUT_BUNDLE.name(), bundle);
        bundle2.putString(ConversationsApiArgumentType.REQUEST_ID.name(), str);
        sendMessageOrThrow(ConversationsApiMessageType.DELETE_CONVERSATIONS.ordinal(), bundle2);
    }

    public void deleteFragments(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString(ConversationsApiArgumentType.CONVERSATION_ID.name(), str);
        bundle2.putBundle(ConversationsApiArgumentType.URIS_BUNDLE.name(), bundle);
        sendMessage(ConversationsApiMessageType.DELETE_FRAGMENTS.ordinal(), bundle2);
    }

    public void getFragments(Bundle bundle, String str) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(ConversationsApiArgumentType.METADATA_BUNDLE.name(), bundle);
        bundle2.putString(ConversationsApiArgumentType.REQUEST_ID.name(), str);
        sendMessageOrThrow(ConversationsApiMessageType.GET_FRAGMENTS.ordinal(), bundle2);
    }

    public void publishConversationStateJson(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ConversationsApiArgumentType.STATE_JSON.name(), str);
        sendMessage(ConversationsApiMessageType.PUBLISH_CONVERSATION_STATE_JSON.ordinal(), bundle);
    }

    public void sendEvent(String str, Bundle bundle, String str2) {
        Bundle bundle2 = new Bundle();
        bundle2.putString(ConversationsApiArgumentType.NAME.name(), str);
        bundle2.putBundle(ConversationsApiArgumentType.EXTRAS_BUNDLE.name(), bundle);
        bundle2.putString(ConversationsApiArgumentType.DATA.name(), str2);
        sendMessage(ConversationsApiMessageType.SEND_EVENT.ordinal(), bundle2);
    }

    public void updateConversations(Bundle bundle, String str) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(ConversationsApiArgumentType.EXTRAS_BUNDLE.name(), bundle);
        bundle2.putString(ConversationsApiArgumentType.REQUEST_ID.name(), str);
        sendMessageOrThrow(ConversationsApiMessageType.UPDATE_CONVERSATIONS.ordinal(), bundle2);
    }

    public void updateEntitlementStatus(boolean z, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ConversationsApiArgumentType.IS_ENTITLED.name(), z);
        bundle.putString(ConversationsApiArgumentType.ENTITLED_BENEFIT.name(), str);
        sendMessage(ConversationsApiMessageType.UPDATE_ENTITLEMENT_STATUS.ordinal(), bundle);
    }
}
