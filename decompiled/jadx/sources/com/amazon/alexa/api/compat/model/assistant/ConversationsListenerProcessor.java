package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class ConversationsListenerProcessor {
    private static final String TAG = "ConversationsListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.ConversationsListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType;

        static {
            int[] iArr = new int[ConversationsListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType = iArr;
            try {
                iArr[ConversationsListenerMessageType.ON_REQUEST_RESULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_CONVERSATIONS_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_CONVERSATION_UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_FRAGMENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_FRAGMENT_RENDERING_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_FRAGMENT_RENDERING_RESUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_ADD_FRAGMENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_UPDATE_CONVERSATION_METADATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_DELETE_CONVERSATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_UPDATE_FRAGMENT_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_PERSONALITY_DISPLAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[ConversationsListenerMessageType.ON_PERSONALIZED_CONTENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public ConversationsListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 15)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        ConversationsListenerMessageType fromOrdinal = ConversationsListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$ConversationsListenerMessageType[fromOrdinal.ordinal()]) {
            case 1:
                if (data != null) {
                    onRequestResult(data.getBundle(ConversationsListenerArgumentType.RESULT_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onRequestResult");
                    break;
                }
            case 2:
                if (data != null) {
                    onConversationsUpdated(data.getBundle(ConversationsListenerArgumentType.EXTRAS_BUNDLE.name()), data.getString(ConversationsListenerArgumentType.DATA.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onConversationsUpdated");
                    break;
                }
            case 3:
                if (data != null) {
                    onConversationUpdated(data.getString(ConversationsListenerArgumentType.CONVERSATION_ID.name()), data.getString(ConversationsListenerArgumentType.DATA.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onConversationUpdated");
                    break;
                }
            case 4:
                if (data != null) {
                    onFragments(data.getBundle(ConversationsListenerArgumentType.METADATA_BUNDLE.name()), data.getString(ConversationsListenerArgumentType.DATA.name()), data.getBundle(ConversationsListenerArgumentType.CHUNK_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onFragments");
                    break;
                }
            case 5:
                if (data != null) {
                    onFragmentRenderingPaused(data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onFragmentRenderingPaused");
                    break;
                }
            case 6:
                if (data != null) {
                    onFragmentRenderingResumed(data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onFragmentRenderingResumed");
                    break;
                }
            case 7:
                if (data != null) {
                    onAddFragments(data.getString(ConversationsListenerArgumentType.PAYLOAD_JSON.name()), data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onAddFragments");
                    break;
                }
            case 8:
                if (data != null) {
                    onUpdateConversationMetadata(data.getString(ConversationsListenerArgumentType.PAYLOAD_JSON.name()), data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onUpdateConversationMetadata");
                    break;
                }
            case 9:
                if (data != null) {
                    onDeleteConversations(data.getString(ConversationsListenerArgumentType.PAYLOAD_JSON.name()), data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onDeleteConversations");
                    break;
                }
            case 10:
                if (data != null) {
                    onUpdateFragmentData(data.getString(ConversationsListenerArgumentType.PAYLOAD_JSON.name()), data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onUpdateFragmentData");
                    break;
                }
            case 11:
                if (data != null) {
                    onPersonalityDisplay(data.getString(ConversationsListenerArgumentType.PAYLOAD_JSON.name()), data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onPersonalityDisplay");
                    break;
                }
            case 12:
                if (data != null) {
                    onPersonalizedContent(data.getString(ConversationsListenerArgumentType.PAYLOAD_JSON.name()), data.getString(ConversationsListenerArgumentType.DIALOG_REQUEST_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "ConversationsListener message has no data for onPersonalizedContent");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onAddFragments(String str, String str2);

    public abstract void onConversationUpdated(String str, String str2);

    public abstract void onConversationsUpdated(Bundle bundle, String str);

    public abstract void onDeleteConversations(String str, String str2);

    public abstract void onFragmentRenderingPaused(String str);

    public abstract void onFragmentRenderingResumed(String str);

    public abstract void onFragments(Bundle bundle, String str, Bundle bundle2);

    public abstract void onPersonalityDisplay(String str, String str2);

    public abstract void onPersonalizedContent(String str, String str2);

    public abstract void onRequestResult(Bundle bundle);

    public abstract void onUpdateConversationMetadata(String str, String str2);

    public abstract void onUpdateFragmentData(String str, String str2);
}
