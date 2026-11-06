package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccountApiSender {
    private static final String TAG = "AccountApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public AccountApiSender(Messenger messenger, int i) {
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

    public void logout() {
        sendMessage(AccountApiMessageType.LOGOUT.ordinal(), null);
    }

    public void sendSynchronizeStateEvent() {
        sendMessage(AccountApiMessageType.SEND_SYNCHRONIZE_STATE_EVENT.ordinal(), null);
    }

    public void setRegion(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AccountApiArgumentType.REGION.name(), str);
        sendMessage(AccountApiMessageType.SET_REGION.ordinal(), bundle);
    }

    public void setUserProfile(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(AccountApiArgumentType.PERSON_ID.name(), str);
        bundle.putString(AccountApiArgumentType.COMMS_ID.name(), str2);
        sendMessage(AccountApiMessageType.SET_USER_PROFILE.ordinal(), bundle);
    }

    public void setUserProfileV2(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(AccountApiArgumentType.PERSON_ID.name(), str);
        bundle.putString(AccountApiArgumentType.FIRST_NAME.name(), str2);
        bundle.putBoolean(AccountApiArgumentType.IS_CHILD_PROFILE.name(), z);
        sendMessage(AccountApiMessageType.SET_USER_PROFILE_V2.ordinal(), bundle);
    }

    public void updateBMCLEntitlementStatus(boolean z, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AccountApiArgumentType.IS_B_M_C_L_ENTITLED.name(), z);
        bundle.putString(AccountApiArgumentType.ENTITLED_BENEFIT.name(), str);
        sendMessage(AccountApiMessageType.UPDATE_B_M_C_L_ENTITLEMENT_STATUS.ordinal(), bundle);
    }
}
