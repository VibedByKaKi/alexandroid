package com.amazon.alexa.accessory.avsclient;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.PermissionChecker;
import com.amazon.alexa.accessory.sco.ScoPrioritizer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class PhoneStateScoPrioritizer implements ScoPrioritizer {
    private final Context context;
    private final TelephonyManager telephonyManager;

    public PhoneStateScoPrioritizer(Context context) {
        this.context = context;
        this.telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    public boolean isReadPhoneStatePermissionGranted() {
        return PermissionChecker.checkSelfPermission(this.context, "android.permission.READ_PHONE_STATE") == 0;
    }

    @Override // com.amazon.alexa.accessory.sco.ScoPrioritizer
    public boolean shouldUseSco() {
        return isReadPhoneStatePermissionGranted() && this.telephonyManager.getCallState() != 0;
    }
}
