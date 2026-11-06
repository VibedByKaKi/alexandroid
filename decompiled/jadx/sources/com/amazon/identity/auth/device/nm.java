package com.amazon.identity.auth.device;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class nm {

    /* renamed from: a, reason: collision with root package name */
    public final String f840a;
    public final String[] b;

    public nm(String str, String[] strArr) {
        this.f840a = str;
        this.b = strArr;
    }

    public static nm a(String str, String str2, String str3, Date date) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        a(linkedHashMap, arrayList, "directedId", str);
        a(linkedHashMap, arrayList, "key", str2);
        a(linkedHashMap, arrayList, "namespace", str3);
        a(linkedHashMap, arrayList, "timestamp_key", date == null ? null : Long.toString(date.getTime()));
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(String.format("\"%s\":\"%s\"", entry.getKey(), entry.getValue()));
        }
        return new nm(a0.a("{", TextUtils.join(", ", arrayList2), StringSubstitutor.DEFAULT_VAR_END), (String[]) arrayList.toArray(new String[0]));
    }

    public static void a(LinkedHashMap linkedHashMap, ArrayList arrayList, String str, String str2) {
        if (str2 == null) {
            return;
        }
        linkedHashMap.put(str, "?");
        arrayList.add(str2);
    }
}
