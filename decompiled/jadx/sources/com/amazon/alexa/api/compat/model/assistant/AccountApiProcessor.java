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
public abstract class AccountApiProcessor {
    private static final String TAG = "AccountApiProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.AccountApiProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType;

        static {
            int[] iArr = new int[AccountApiMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType = iArr;
            try {
                iArr[AccountApiMessageType.SET_USER_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType[AccountApiMessageType.LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType[AccountApiMessageType.SET_REGION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType[AccountApiMessageType.UPDATE_B_M_C_L_ENTITLEMENT_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType[AccountApiMessageType.SEND_SYNCHRONIZE_STATE_EVENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType[AccountApiMessageType.SET_USER_PROFILE_V2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AccountApiProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 1)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        AccountApiMessageType fromOrdinal = AccountApiMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$AccountApiMessageType[fromOrdinal.ordinal()]) {
            case 1:
                if (data != null) {
                    onSetUserProfile(data.getString(AccountApiArgumentType.PERSON_ID.name()), data.getString(AccountApiArgumentType.COMMS_ID.name()));
                    break;
                } else {
                    Log.w(TAG, "AccountApi message has no data for setUserProfile");
                    break;
                }
            case 2:
                onLogout();
                break;
            case 3:
                if (data != null) {
                    onSetRegion(data.getString(AccountApiArgumentType.REGION.name()));
                    break;
                } else {
                    Log.w(TAG, "AccountApi message has no data for setRegion");
                    break;
                }
            case 4:
                if (data != null) {
                    onUpdateBMCLEntitlementStatus(data.getBoolean(AccountApiArgumentType.IS_B_M_C_L_ENTITLED.name()), data.getString(AccountApiArgumentType.ENTITLED_BENEFIT.name()));
                    break;
                } else {
                    Log.w(TAG, "AccountApi message has no data for updateBMCLEntitlementStatus");
                    break;
                }
            case 5:
                onSendSynchronizeStateEvent();
                break;
            case 6:
                if (data != null) {
                    onSetUserProfileV2(data.getString(AccountApiArgumentType.PERSON_ID.name()), data.getString(AccountApiArgumentType.FIRST_NAME.name()), data.getBoolean(AccountApiArgumentType.IS_CHILD_PROFILE.name()));
                    break;
                } else {
                    Log.w(TAG, "AccountApi message has no data for setUserProfileV2");
                    break;
                }
            default:
                Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                break;
        }
        return false;
    }

    public abstract void onLogout();

    public abstract void onSendSynchronizeStateEvent();

    public abstract void onSetRegion(String str);

    public abstract void onSetUserProfile(String str, String str2);

    public abstract void onSetUserProfileV2(String str, String str2, boolean z);

    public abstract void onUpdateBMCLEntitlementStatus(boolean z, String str);
}
