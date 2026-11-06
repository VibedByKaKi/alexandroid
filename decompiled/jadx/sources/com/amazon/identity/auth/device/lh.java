package com.amazon.identity.auth.device;

import android.content.Context;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class lh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f791a;
    public final String b;
    public final String c;

    public lh(Context context, String str, String str2) {
        Objects.requireNonNull(context, "context must not be null");
        this.f791a = context;
        Objects.requireNonNull(str, "directedId must not be null");
        this.b = str;
        this.c = str2;
    }

    public lh(tn tnVar, String str) {
        this(tnVar, str, tnVar.getPackageName());
    }
}
