package com.amazon.identity.auth.device;

import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.env.EnvironmentUtils;
import com.amazon.identity.kcpsdk.common.HttpVerb;
import com.amazon.identity.kcpsdk.common.WebProtocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class tm {

    /* renamed from: a, reason: collision with root package name */
    public String f980a;

    public final fr a() {
        if (this.f980a == null) {
            Log.e(yf.a("RenameDeviceRequest"), "getWebRequest: Cannot construct a WebRequest because the RenameDeviceRequest is invalid. (See previous warnings from RenameDeviceRequest::isValidDeviceName for details.)");
            return null;
        }
        fr frVar = new fr();
        WebProtocol webProtocol = WebProtocol.WebProtocolHttps;
        if (webProtocol != null) {
            frVar.c = webProtocol.getValue();
        } else {
            frVar.c = null;
        }
        frVar.d = EnvironmentUtils.getInstance().getFIRSHost();
        frVar.b("/FirsProxy/renameFiona");
        frVar.h = HttpVerb.HttpVerbGet;
        frVar.a("nickname", this.f980a);
        frVar.b("Content-Type", "text/xml");
        frVar.j = true;
        Log.i(yf.a("RenameDeviceRequest"), "getWebRequest: getWebRequest: constructed a web request.");
        "user".equalsIgnoreCase(Build.TYPE);
        return frVar;
    }
}
