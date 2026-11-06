package org.apache.commons.lang.mutable;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MutableObject implements Mutable, Serializable {
    private static final long serialVersionUID = 86241875189L;
    private Object value;

    public MutableObject(Object obj) {
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableObject)) {
            return false;
        }
        Object obj2 = ((MutableObject) obj).value;
        Object obj3 = this.value;
        if (obj3 != obj2) {
            return obj3 != null && obj3.equals(obj2);
        }
        return true;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? "null" : obj.toString();
    }

    public MutableObject() {
    }
}
