package com.amazon.identity.auth.device;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberAutoFillResultType;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberPickerMetric;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class wk implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f1051a;
    public final /* synthetic */ yk b;

    public wk(yk ykVar, Activity activity) {
        this.b = ykVar;
        this.f1051a = activity;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(PendingIntent pendingIntent) {
        try {
            this.f1051a.startIntentSenderForResult(pendingIntent.getIntentSender(), 11, null, 0, 0, 0);
            this.b.d = true;
        } catch (IntentSender.SendIntentException e) {
            String str = "Error starting intent sender: " + e.getMessage();
            Log.e(yf.a("PhoneNumberAutoFillManager"), str, e);
            this.b.a(new zk(PhoneNumberAutoFillResultType.ERROR, str, null, PhoneNumberPickerMetric.PICKER_INTENT_SENDER_ERROR));
        }
    }
}
