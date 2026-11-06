package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class ConversationsApiProcessor {
    private static final String TAG = "ConversationsApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.ConversationsApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType;

        static {
            int[] iArr = new int[ConversationsApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType = iArr;
            try {
                iArr[ConversationsApiMessageType.UPDATE_CONVERSATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[ConversationsApiMessageType.GET_FRAGMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[ConversationsApiMessageType.DELETE_CONVERSATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[ConversationsApiMessageType.SEND_EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[ConversationsApiMessageType.PUBLISH_CONVERSATION_STATE_JSON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[ConversationsApiMessageType.DELETE_FRAGMENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[ConversationsApiMessageType.UPDATE_ENTITLEMENT_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ConversationsApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 14)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        ConversationsApiMessageType fromOrdinal = ConversationsApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsApiMessageType[fromOrdinal.ordinal()]) {
            case 1:
                if (data != null) {
                    onUpdateConversations(data.getBundle(ConversationsApiArgumentType.EXTRAS_BUNDLE.name()), data.getString(ConversationsApiArgumentType.REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for updateConversations");
                    break;
                }
            case 2:
                if (data != null) {
                    onGetFragments(data.getBundle(ConversationsApiArgumentType.METADATA_BUNDLE.name()), data.getString(ConversationsApiArgumentType.REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for getFragments");
                    break;
                }
            case 3:
                if (data != null) {
                    onDeleteConversations(data.getStringArrayList(ConversationsApiArgumentType.IDS.name()), data.getBundle(ConversationsApiArgumentType.TIMEOUT_BUNDLE.name()), data.getString(ConversationsApiArgumentType.REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for deleteConversations");
                    break;
                }
            case 4:
                if (data != null) {
                    onSendEvent(data.getString(ConversationsApiArgumentType.NAME.name()), data.getBundle(ConversationsApiArgumentType.EXTRAS_BUNDLE.name()), data.getString(ConversationsApiArgumentType.DATA.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for sendEvent");
                    break;
                }
            case 5:
                if (data != null) {
                    onPublishConversationStateJson(data.getString(ConversationsApiArgumentType.STATE_JSON.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for publishConversationStateJson");
                    break;
                }
            case 6:
                if (data != null) {
                    onDeleteFragments(data.getString(ConversationsApiArgumentType.CONVERSATION_ID.name()), data.getBundle(ConversationsApiArgumentType.URIS_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for deleteFragments");
                    break;
                }
            case 7:
                if (data != null) {
                    onUpdateEntitlementStatus(data.getBoolean(ConversationsApiArgumentType.IS_ENTITLED.name()), data.getString(ConversationsApiArgumentType.ENTITLED_BENEFIT.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsApi message has no data for updateEntitlementStatus");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onDeleteConversations(ArrayList<String> arrayList, Bundle bundle, String str);

    public abstract void onDeleteFragments(String str, Bundle bundle);

    public abstract void onGetFragments(Bundle bundle, String str);

    public abstract void onPublishConversationStateJson(String str);

    public abstract void onSendEvent(String str, Bundle bundle, String str2);

    public abstract void onUpdateConversations(Bundle bundle, String str);

    public abstract void onUpdateEntitlementStatus(boolean z, String str);
}
