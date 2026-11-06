package com.amazon.identity.auth.device;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class qk {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f901a = new HashMap();

    public final synchronized pk a(q7 q7Var, String str) {
        List b = b(str);
        b.add(q7Var);
        if (b.size() > 1) {
            return null;
        }
        return new pk(this, str);
    }

    public final synchronized List b(String str) {
        List list;
        list = (List) this.f901a.get(str);
        if (list == null) {
            list = a(str);
        }
        return list;
    }

    public final synchronized LinkedList a(String str) {
        LinkedList linkedList;
        linkedList = new LinkedList();
        this.f901a.put(str, linkedList);
        return linkedList;
    }
}
