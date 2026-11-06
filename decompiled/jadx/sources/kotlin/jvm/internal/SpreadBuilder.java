package kotlin.jvm.internal;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class SpreadBuilder {
    private final ArrayList<Object> list;

    public SpreadBuilder(int i) {
        this.list = new ArrayList<>(i);
    }

    public void add(Object obj) {
        this.list.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.list;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.list, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.list.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                this.list.add(it2.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m(obj, new StringBuilder("Don't know how to spread ")));
            return;
        }
        Iterator it3 = (Iterator) obj;
        while (it3.hasNext()) {
            this.list.add(it3.next());
        }
    }

    public int size() {
        return this.list.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.list.toArray(objArr);
    }
}
