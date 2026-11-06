package com.amazon.identity.auth.device;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class so {

    /* renamed from: a, reason: collision with root package name */
    public final String f946a;
    public final String b;
    public final List c;

    public so(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || ((str2 != null && str2.length() == 0) || TextUtils.isEmpty(str3))) {
            Single$$ExternalSyntheticBUOutline0.m$3("One or more parameters are null or empty");
            throw null;
        }
        this.f946a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(Arrays.asList(str == null ? null : str.concat(".tokens.adp_token"), str == null ? null : str.concat(".tokens.private_key"), str == null ? null : str.concat(".tokens.device_type"), str == null ? null : str.concat(".tokens.dsn"), str == null ? null : str.concat(".tokens.email"), str == null ? null : str.concat(".tokens.storeAuthCookie"), str == null ? null : str.concat(".tokens.xmain"), str != null ? str.concat(".tokens.account_pool") : null));
    }

    public so(String str, String str2, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && arrayList != null && !arrayList.isEmpty()) {
            this.f946a = str;
            this.b = str2;
            this.c = Collections.unmodifiableList(new ArrayList(arrayList));
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("One or more parameters are null or empty");
        throw null;
    }
}
