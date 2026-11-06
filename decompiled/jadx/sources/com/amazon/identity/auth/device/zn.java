package com.amazon.identity.auth.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class zn {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1113a;
    public final String b;

    public zn(boolean z, String str) {
        this.f1113a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        if (this.f1113a != znVar.f1113a) {
            return false;
        }
        String str = this.b;
        String str2 = znVar.b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int i = this.f1113a ? 79 : 97;
        String str = this.b;
        return ((i + 59) * 59) + (str == null ? 43 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmsRetrieverSupportInfo(mIsSupported=");
        sb.append(this.f1113a);
        sb.append(", mAppHash=");
        return cg.a(sb, this.b, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
