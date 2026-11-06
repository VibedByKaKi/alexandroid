package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public final String f597a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public eb(String str, String str2, String str3, String str4, String str5) {
        this.f597a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        String str = this.f597a;
        String str2 = ebVar.f597a;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.b;
        String str4 = ebVar.b;
        if (str3 != null ? !str3.equals(str4) : str4 != null) {
            return false;
        }
        if (!this.c.equals(ebVar.c)) {
            return false;
        }
        String str5 = this.d;
        String str6 = ebVar.d;
        if (str5 != null ? !str5.equals(str6) : str6 != null) {
            return false;
        }
        String str7 = this.e;
        String str8 = ebVar.e;
        return str7 != null ? str7.equals(str8) : str8 == null;
    }

    public final int hashCode() {
        String str = this.f597a;
        int hashCode = str == null ? 43 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = this.c.hashCode() + ((((hashCode + 3717) * 59) + (str2 == null ? 43 : str2.hashCode())) * 59);
        String str3 = this.d;
        int i = hashCode2 * 59;
        int hashCode3 = str3 == null ? 43 : str3.hashCode();
        String str4 = this.e;
        return ((i + hashCode3) * 59) + (str4 != null ? str4.hashCode() : 43);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DigitalIdResponse(mIvvWorkflowId=");
        sb.append(this.f597a);
        sb.append(", mAttemptId=");
        sb.append(this.b);
        sb.append(", mStatus=");
        sb.append(this.c);
        sb.append(", mErrorCode=");
        sb.append(this.d);
        sb.append(", mErrorMessage=");
        return cg.a(sb, this.e, ", mJsBridgeVersion=4)");
    }
}
