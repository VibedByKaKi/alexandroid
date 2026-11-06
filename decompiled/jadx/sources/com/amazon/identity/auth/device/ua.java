package com.amazon.identity.auth.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ua {

    /* renamed from: a, reason: collision with root package name */
    public final String f1003a;
    public final String b;
    public final String c;

    public ua(String str, String str2, String str3) {
        this.f1003a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        String str = this.f1003a;
        String str2 = uaVar.f1003a;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.b;
        String str4 = uaVar.b;
        if (str3 != null ? !str3.equals(str4) : str4 != null) {
            return false;
        }
        String str5 = this.c;
        String str6 = uaVar.c;
        return str5 != null ? str5.equals(str6) : str6 == null;
    }

    public final int hashCode() {
        String str = this.f1003a;
        int hashCode = str == null ? 43 : str.hashCode();
        String str2 = this.b;
        int i = (hashCode + 59) * 59;
        int hashCode2 = str2 == null ? 43 : str2.hashCode();
        String str3 = this.c;
        return ((i + hashCode2) * 59) + (str3 != null ? str3.hashCode() : 43);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DigitalIdCredentialRequest(mIvvWorkflowId=");
        sb.append(this.f1003a);
        sb.append(", mAttemptId=");
        sb.append(this.b);
        sb.append(", mReferenceHeader=");
        return cg.a(sb, this.c, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
