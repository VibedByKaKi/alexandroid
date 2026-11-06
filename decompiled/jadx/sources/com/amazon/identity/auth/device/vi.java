package com.amazon.identity.auth.device;

import android.text.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vi {

    /* renamed from: a, reason: collision with root package name */
    public final String f1031a;
    public final String b;
    public final String c;

    public vi(String str, String str2, String str3) {
        this.f1031a = TextUtils.isEmpty(str) ? "Unrecognized" : str;
        this.b = TextUtils.isEmpty(str2) ? "Unrecognized" : str2;
        this.c = TextUtils.isEmpty(str3) ? "No error index" : str3;
    }
}
