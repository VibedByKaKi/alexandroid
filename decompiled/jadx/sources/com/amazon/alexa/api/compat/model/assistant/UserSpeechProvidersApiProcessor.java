package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class UserSpeechProvidersApiProcessor {
    private static final String TAG = "UserSpeechProvidersApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.UserSpeechProvidersApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType;

        static {
            int[] iArr = new int[UserSpeechProvidersApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType = iArr;
            try {
                iArr[UserSpeechProvidersApiMessageType.REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.DEREGISTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.REQUEST_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.TURN_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.TURN_ABANDONED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.RESERVE_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.RESERVED_RESPONSE_STARTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.RESERVATION_AGREED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[UserSpeechProvidersApiMessageType.RESERVATION_DISPUTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public UserSpeechProvidersApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new MapboxRenderThread$$ExternalSyntheticLambda2(this, 1)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        UserSpeechProvidersApiMessageType fromOrdinal = UserSpeechProvidersApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$UserSpeechProvidersApiMessageType[fromOrdinal.ordinal()]) {
            case 1:
                if (data != null) {
                    onRegister(data.getBundle(UserSpeechProvidersApiArgumentType.PROVIDER_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for register");
                    break;
                }
            case 2:
                if (data != null) {
                    onDeregister(data.getString(UserSpeechProvidersApiArgumentType.PROVIDER_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for deregister");
                    break;
                }
            case 3:
                if (data != null) {
                    onRequestDialog(data.getBundle(UserSpeechProvidersApiArgumentType.REQUEST_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for requestDialog");
                    break;
                }
            case 4:
                if (data != null) {
                    onTurnStarted(data.getBundle(UserSpeechProvidersApiArgumentType.STARTED_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for turnStarted");
                    break;
                }
            case 5:
                if (data != null) {
                    onTurnAbandoned(data.getString(UserSpeechProvidersApiArgumentType.TURN_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for turnAbandoned");
                    break;
                }
            case 6:
                if (data != null) {
                    onReserveResponse(data.getBundle(UserSpeechProvidersApiArgumentType.RESERVE_REQUEST_BUNDLE.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for reserveResponse");
                    break;
                }
            case 7:
                if (data != null) {
                    onReservedResponseStarted(data.getString(UserSpeechProvidersApiArgumentType.COORDINATOR_ID.name()), data.getLong(UserSpeechProvidersApiArgumentType.START_TIMESTAMP_EPOCH_MS.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for reservedResponseStarted");
                    break;
                }
            case 8:
                if (data != null) {
                    onReservationAgreed(data.getString(UserSpeechProvidersApiArgumentType.RESERVATION_ID.name()), data.getLong(UserSpeechProvidersApiArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for reservationAgreed");
                    break;
                }
            case 9:
                if (data != null) {
                    onReservationDisputed(data.getString(UserSpeechProvidersApiArgumentType.RESERVATION_ID.name()), data.getLong(UserSpeechProvidersApiArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name()));
                    break;
                } else {
                    Log.w(TAG, "UserSpeechProvidersApi message has no data for reservationDisputed");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onDeregister(String str);

    public abstract void onRegister(Bundle bundle);

    public abstract void onRequestDialog(Bundle bundle);

    public abstract void onReservationAgreed(String str, long j);

    public abstract void onReservationDisputed(String str, long j);

    public abstract void onReserveResponse(Bundle bundle);

    public abstract void onReservedResponseStarted(String str, long j);

    public abstract void onTurnAbandoned(String str);

    public abstract void onTurnStarted(Bundle bundle);
}
