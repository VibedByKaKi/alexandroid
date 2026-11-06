package com.amazon.identity.auth.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class fb {

    /* renamed from: a, reason: collision with root package name */
    public final String f616a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public fb(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f616a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        String str = this.f616a;
        String str2 = fbVar.f616a;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.b;
        String str4 = fbVar.b;
        if (str3 != null ? !str3.equals(str4) : str4 != null) {
            return false;
        }
        String str5 = this.c;
        String str6 = fbVar.c;
        if (str5 != null ? !str5.equals(str6) : str6 != null) {
            return false;
        }
        String str7 = this.d;
        String str8 = fbVar.d;
        if (str7 != null ? !str7.equals(str8) : str8 != null) {
            return false;
        }
        String str9 = this.e;
        String str10 = fbVar.e;
        if (str9 != null ? !str9.equals(str10) : str10 != null) {
            return false;
        }
        String str11 = this.f;
        String str12 = fbVar.f;
        return str11 != null ? str11.equals(str12) : str12 == null;
    }

    public final int hashCode() {
        String str = this.f616a;
        int hashCode = str == null ? 43 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = ((hashCode + 59) * 59) + (str2 == null ? 43 : str2.hashCode());
        String str3 = this.c;
        int hashCode3 = (hashCode2 * 59) + (str3 == null ? 43 : str3.hashCode());
        String str4 = this.d;
        int hashCode4 = (hashCode3 * 59) + (str4 == null ? 43 : str4.hashCode());
        String str5 = this.e;
        int i = hashCode4 * 59;
        int hashCode5 = str5 == null ? 43 : str5.hashCode();
        String str6 = this.f;
        return ((i + hashCode5) * 59) + (str6 != null ? str6.hashCode() : 43);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DigitalIdSubmissionRequest(mIvvWorkflowId=");
        sb.append(this.f616a);
        sb.append(", mAttemptId=");
        sb.append(this.b);
        sb.append(", mResponseType=");
        sb.append(this.c);
        sb.append(", mCredentialType=");
        sb.append(this.d);
        sb.append(", mEncryptedData=");
        sb.append(this.e);
        sb.append(", mReferenceHeader=");
        return cg.a(sb, this.f, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
