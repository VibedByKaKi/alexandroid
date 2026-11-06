package com.amazon.identity.auth.accounts;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.jg;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.utils.AccountConstants;
import com.amazon.identity.auth.device.v9;
import com.amazon.identity.auth.device.yf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final v9 f386a;

    public a(Context context) {
        this.f386a = tn.a(context).a();
    }

    public final boolean a(String str) {
        Iterator it2 = a().iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        Iterator it2 = a().iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                if (AmazonAccountManager$AccountRegistrationStatus.fromValue(this.f386a.e(str, AccountConstants.KEY_ACCOUNT_STATUS)) != AmazonAccountManager$AccountRegistrationStatus.Deregistering) {
                    return true;
                }
                jg.a("AccountRemovedBecauseDeregisteringState");
                Log.i(yf.a("AmazonAccountManager"), "Removing account from database since database is stuck in bad state. Account status is Deregistering and registerAccount API is called");
                this.f386a.f(str);
            }
        }
        return false;
    }

    public final boolean c(String str) {
        AmazonAccountManager$AccountRegistrationStatus fromValue = AmazonAccountManager$AccountRegistrationStatus.fromValue(this.f386a.e(str, AccountConstants.KEY_ACCOUNT_STATUS));
        if (fromValue == null) {
            fromValue = a(str) ? AmazonAccountManager$AccountRegistrationStatus.Registered : AmazonAccountManager$AccountRegistrationStatus.NotFound;
        }
        return fromValue == AmazonAccountManager$AccountRegistrationStatus.NotFound || fromValue == AmazonAccountManager$AccountRegistrationStatus.Deregistering;
    }

    public final HashSet d() {
        HashSet hashSet = new HashSet();
        for (String str : a()) {
            if (f(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final boolean e(String str) {
        return this.f386a.e(str, AccountConstants.KEY_SECONDARY_AMAZON_ACCOUNT) != null;
    }

    public final boolean f(String str) {
        return this.f386a.e(str, AccountConstants.KEY_SESSION_USER_AMAZON_ACCOUNT) != null;
    }

    public a(v9 v9Var) {
        this.f386a = v9Var;
    }

    public final boolean e() {
        return b() != null;
    }

    public final Set a() {
        this.f386a.b().size();
        yf.a("AmazonAccountManager");
        "user".equalsIgnoreCase(Build.TYPE);
        return this.f386a.b();
    }

    public final boolean d(String str) {
        return a(str) && !e(str);
    }

    public final HashSet c() {
        Set<String> a2 = a();
        HashSet hashSet = new HashSet();
        for (String str : a2) {
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final String b() {
        HashSet c = c();
        if (c.size() <= 0) {
            return null;
        }
        Iterator it2 = c.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!e(str)) {
                return str;
            }
        }
        return null;
    }
}
