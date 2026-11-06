package com.amazon.identity.auth.device;

import android.content.Context;
import android.util.Log;
import com.amazon.identity.auth.device.framework.RemoteMAPException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class w3 extends u3 {
    public final qn c;
    public String d;

    public w3(Context context) {
        super(context);
        this.c = new qn(context);
    }

    @Override // com.amazon.identity.auth.device.u3
    public final synchronized String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        try {
            this.d = x3.a(this.c, "dsn");
        } catch (RemoteMAPException e) {
            Log.e(yf.a("AmazonDeviceInformationProviderHelper"), "Unable to retrieve Device Serial Number from Amazon Device Information Component. Falling back to 3P value.", e);
            this.d = super.c();
        }
        return this.d;
    }
}
