package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jl extends o8 {

    /* renamed from: a, reason: collision with root package name */
    public final tn f754a;

    public jl(tn tnVar) {
        this.f754a = tnVar;
    }

    @Override // com.amazon.identity.auth.device.o8
    public final ArrayList a(String str, String str2, String str3) {
        le b;
        boolean isEmpty = TextUtils.isEmpty(str);
        tn tnVar = this.f754a;
        if (isEmpty) {
            b = le.b(tnVar, "com.amazon.identity.auth.device.cookiekeys.namespace.nonAuth");
        } else {
            b = le.b(tnVar, "com.amazon.identity.auth.device.cookiekeys.namespace#" + str);
        }
        String a2 = b.a(str2);
        ArrayList arrayList = TextUtils.isEmpty(a2) ? new ArrayList() : a2.startsWith(MarkdownConstants.LEFT_BRACKET) ? r8.a(a2, str) : r8.b(a2, str);
        if (!TextUtils.isEmpty(a2) && !a2.startsWith(MarkdownConstants.LEFT_BRACKET)) {
            fp.b(new il(this, str, str2, str3, new ArrayList(arrayList)));
        }
        return arrayList;
    }

    @Override // com.amazon.identity.auth.device.o8
    public final List a(String str, String str2, String str3, String str4) {
        Log.e(yf.a("GenericCookieDataStore"), "Getting actor cookies is not supported in pre-merge devices, returning null");
        return null;
    }

    @Override // com.amazon.identity.auth.device.o8
    public final void a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        Log.e(yf.a("GenericCookieDataStore"), "Setting actor cookies is not supported in pre-merge devices, do nothing.");
    }

    @Override // com.amazon.identity.auth.device.o8
    public final void a(String str, String str2, String str3, ArrayList arrayList) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String a2 = r8.a(arrayList);
        tn tnVar = this.f754a;
        if (isEmpty) {
            le.b(tnVar, "com.amazon.identity.auth.device.cookiekeys.namespace.nonAuth").a(str2, a2);
            return;
        }
        le.b(tnVar, "com.amazon.identity.auth.device.cookiekeys.namespace#" + str).a(str2, a2);
    }

    @Override // com.amazon.identity.auth.device.o8
    public final boolean a(Context context, String str) {
        return le.b(context, "com.amazon.identity.auth.device.cookiekeys.namespace#" + str).a();
    }

    @Override // com.amazon.identity.auth.device.o8
    public final Map a(String str, String str2, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            yf.a("GenericCookieDataStore");
            "user".equalsIgnoreCase(Build.TYPE);
            return Collections.EMPTY_MAP;
        }
        a(str, str2, (String) null, arrayList);
        return Collections.EMPTY_MAP;
    }
}
