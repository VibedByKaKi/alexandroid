package com.amazon.identity.auth.device;

import android.content.ContentValues;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class z8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ai f1104a;
    public final ContentValues b;
    public final /* synthetic */ b9 c;

    public z8(b9 b9Var, ai aiVar, ContentValues contentValues) {
        this.c = b9Var;
        this.f1104a = aiVar;
        this.b = new ContentValues(contentValues);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b9 b9Var = this.c;
        ai aiVar = this.f1104a;
        ContentValues contentValues = this.b;
        HashSet a2 = b9Var.a();
        if (a2.isEmpty()) {
            return;
        }
        b9Var.d.remove(s0.a("p2a_transition:", contentValues.getAsString("source_account_id")));
        b9Var.a(aiVar, contentValues, a2);
    }
}
