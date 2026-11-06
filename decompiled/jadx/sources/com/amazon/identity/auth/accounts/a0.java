package com.amazon.identity.auth.accounts;

import android.util.Log;
import com.amazon.identity.auth.device.utils.AccountConstants;
import com.amazon.identity.auth.device.yf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f387a;
    public final ArrayList b = new ArrayList();

    public a0(a aVar) {
        this.f387a = aVar;
    }

    public final HashSet a(HashSet hashSet, HashSet hashSet2) {
        if (hashSet.size() > 0 || hashSet2.size() > 0) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.f387a.f386a.c((String) it2.next(), AccountConstants.KEY_SESSION_USER_AMAZON_ACCOUNT, "true");
            }
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                this.f387a.f386a.c((String) it3.next(), AccountConstants.KEY_SESSION_USER_AMAZON_ACCOUNT, null);
            }
            Iterator it4 = this.b.iterator();
            while (it4.hasNext()) {
                ((SessionUserChanger$OnSessionUsersChangedListener) it4.next()).onChanged(hashSet, hashSet2);
            }
        } else {
            Log.i(yf.a("SessionUserChanger"), "No New Session Users to add");
        }
        return this.f387a.d();
    }
}
