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
public abstract class UserSpeechProviderListenerProcessor {
    private static final String TAG = "UserSpeechProviderListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.UserSpeechProviderListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType;

        static {
            int[] iArr = new int[UserSpeechProviderListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType = iArr;
            try {
                iArr[UserSpeechProviderListenerMessageType.ON_DIALOG_REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_REQUEST_DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.SET_WAKE_WORD_DETECTION_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.PAUSE_WAKE_WORD_DETECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.RESUME_WAKE_WORD_DETECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_STARTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_STARTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_FINISHED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_PLAYBACK_STARTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_PLAYBACK_STOPPED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_RESPONSE_PENDING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_RESERVE_RESPONSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_RESERVATION_AGREED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[UserSpeechProviderListenerMessageType.ON_RESERVATION_DISPUTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public UserSpeechProviderListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 29)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        UserSpeechProviderListenerMessageType fromOrdinal = UserSpeechProviderListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProviderListenerMessageType[fromOrdinal.ordinal()]) {
            case 1:
                if (data != null) {
                    onDialogRequested(data.getBundle(UserSpeechProviderListenerArgumentType.TURN_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogRequested");
                    break;
                }
            case 2:
                if (data != null) {
                    onDialogTurnRequested(data.getBundle(UserSpeechProviderListenerArgumentType.TURN_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogTurnRequested");
                    break;
                }
            case 3:
                if (data != null) {
                    onDialogRequestDenied(data.getBundle(UserSpeechProviderListenerArgumentType.REASON_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogRequestDenied");
                    break;
                }
            case 4:
                if (data != null) {
                    onSetWakeWordDetectionEnabled(data.getString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name()), data.getBoolean(UserSpeechProviderListenerArgumentType.ENABLED.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for setWakeWordDetectionEnabled");
                    break;
                }
            case 5:
                if (data != null) {
                    onPauseWakeWordDetection(data.getString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name()), data.getString(UserSpeechProviderListenerArgumentType.WAKE_WORD.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for pauseWakeWordDetection");
                    break;
                }
            case 6:
                if (data != null) {
                    onResumeWakeWordDetection(data.getString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name()), data.getString(UserSpeechProviderListenerArgumentType.WAKE_WORD.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for resumeWakeWordDetection");
                    break;
                }
            case 7:
                if (data != null) {
                    onDialogStarted(data.getBundle(UserSpeechProviderListenerArgumentType.DIALOG_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogStarted");
                    break;
                }
            case 8:
                if (data != null) {
                    onDialogFinished(data.getBundle(UserSpeechProviderListenerArgumentType.DIALOG_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogFinished");
                    break;
                }
            case 9:
                if (data != null) {
                    onDialogTurnStarted(data.getBundle(UserSpeechProviderListenerArgumentType.TURN_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogTurnStarted");
                    break;
                }
            case 10:
                if (data != null) {
                    onDialogTurnFinished(data.getBundle(UserSpeechProviderListenerArgumentType.TURN_FINISHED_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogTurnFinished");
                    break;
                }
            case 11:
                if (data != null) {
                    onPlaybackStarted(data.getString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onPlaybackStarted");
                    break;
                }
            case 12:
                if (data != null) {
                    onPlaybackStopped(data.getString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onPlaybackStopped");
                    break;
                }
            case 13:
                if (data != null) {
                    onDialogTurnResponsePending(data.getBundle(UserSpeechProviderListenerArgumentType.PENDING_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogTurnResponsePending");
                    break;
                }
            case 14:
                if (data != null) {
                    onDialogTurnReserveResponse(data.getBundle(UserSpeechProviderListenerArgumentType.RESERVE_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onDialogTurnReserveResponse");
                    break;
                }
            case 15:
                if (data != null) {
                    onReservationAgreed(data.getString(UserSpeechProviderListenerArgumentType.CALLBACKS_ID.name()), data.getLong(UserSpeechProviderListenerArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onReservationAgreed");
                    break;
                }
            case 16:
                if (data != null) {
                    onReservationDisputed(data.getString(UserSpeechProviderListenerArgumentType.CALLBACKS_ID.name()), data.getLong(UserSpeechProviderListenerArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProviderListener message has no data for onReservationDisputed");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onDialogFinished(Bundle bundle);

    public abstract void onDialogRequestDenied(Bundle bundle);

    public abstract void onDialogRequested(Bundle bundle);

    public abstract void onDialogStarted(Bundle bundle);

    public abstract void onDialogTurnFinished(Bundle bundle);

    public abstract void onDialogTurnRequested(Bundle bundle);

    public abstract void onDialogTurnReserveResponse(Bundle bundle);

    public abstract void onDialogTurnResponsePending(Bundle bundle);

    public abstract void onDialogTurnStarted(Bundle bundle);

    public abstract void onPauseWakeWordDetection(String str, String str2);

    public abstract void onPlaybackStarted(String str);

    public abstract void onPlaybackStopped(String str);

    public abstract void onReservationAgreed(String str, long j);

    public abstract void onReservationDisputed(String str, long j);

    public abstract void onResumeWakeWordDetection(String str, String str2);

    public abstract void onSetWakeWordDetectionEnabled(String str, boolean z);
}
