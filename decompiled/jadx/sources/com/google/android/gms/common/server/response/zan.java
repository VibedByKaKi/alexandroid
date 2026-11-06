package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
/* loaded from: classes7.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap zab;

    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String zac;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.zaa = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.zab;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zalVar.zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) zalVar.zac.get(i3);
                hashMap2.put(zamVar.zab, zamVar.zac);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        this.zac = (String) Preconditions.checkNotNull(str);
        zad();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.zab.get(str);
            for (String str2 : map.keySet()) {
                AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "  ", str2, ": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zal(str, (Map) this.zab.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.zac, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zaa() {
        return this.zac;
    }

    @Nullable
    public final Map zab(String str) {
        return (Map) this.zab.get(str);
    }

    public final void zac() {
        for (String str : this.zab.keySet()) {
            Map map = (Map) this.zab.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((FastJsonResponse.Field) map.get(str2)).zab());
            }
            this.zab.put(str, hashMap);
        }
    }

    public final void zad() {
        Iterator it2 = this.zab.keySet().iterator();
        while (it2.hasNext()) {
            Map map = (Map) this.zab.get((String) it2.next());
            Iterator it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it3.next())).zai(this);
            }
        }
    }

    public final void zae(Class cls, Map map) {
        this.zab.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(Class cls) {
        return this.zab.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(Class cls) {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
