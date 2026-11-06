package org.objectweb.asm;

/* loaded from: classes11.dex */
public final class Handle {

    /* renamed from: a, reason: collision with root package name */
    final int f1181a;
    final String b;
    final String c;
    final String d;

    public Handle(int i, String str, String str2, String str3) {
        this.f1181a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.f1181a == handle.f1181a && this.b.equals(handle.b) && this.c.equals(handle.c) && this.d.equals(handle.d);
    }

    public String getDesc() {
        return this.d;
    }

    public String getName() {
        return this.c;
    }

    public String getOwner() {
        return this.b;
    }

    public int getTag() {
        return this.f1181a;
    }

    public int hashCode() {
        return (this.d.hashCode() * this.c.hashCode() * this.b.hashCode()) + this.f1181a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append('.');
        stringBuffer.append(this.c);
        stringBuffer.append(this.d);
        stringBuffer.append(" (");
        stringBuffer.append(this.f1181a);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
