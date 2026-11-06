package com.amazon.identity.auth.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberAutoFillResultType;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberPickerMetric;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class zk {

    /* renamed from: a, reason: collision with root package name */
    public final PhoneNumberAutoFillResultType f1111a;
    public final String b;
    public final String c;
    public final PhoneNumberPickerMetric d;

    public zk(PhoneNumberAutoFillResultType phoneNumberAutoFillResultType, String str, String str2, PhoneNumberPickerMetric phoneNumberPickerMetric) {
        this.f1111a = phoneNumberAutoFillResultType;
        this.b = str;
        this.c = str2;
        this.d = phoneNumberPickerMetric;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        PhoneNumberAutoFillResultType phoneNumberAutoFillResultType = this.f1111a;
        PhoneNumberAutoFillResultType phoneNumberAutoFillResultType2 = zkVar.f1111a;
        if (phoneNumberAutoFillResultType != null ? !phoneNumberAutoFillResultType.equals(phoneNumberAutoFillResultType2) : phoneNumberAutoFillResultType2 != null) {
            return false;
        }
        String str = this.b;
        String str2 = zkVar.b;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.c;
        String str4 = zkVar.c;
        if (str3 != null ? !str3.equals(str4) : str4 != null) {
            return false;
        }
        PhoneNumberPickerMetric phoneNumberPickerMetric = this.d;
        PhoneNumberPickerMetric phoneNumberPickerMetric2 = zkVar.d;
        return phoneNumberPickerMetric != null ? phoneNumberPickerMetric.equals(phoneNumberPickerMetric2) : phoneNumberPickerMetric2 == null;
    }

    public final int hashCode() {
        PhoneNumberAutoFillResultType phoneNumberAutoFillResultType = this.f1111a;
        int hashCode = phoneNumberAutoFillResultType == null ? 43 : phoneNumberAutoFillResultType.hashCode();
        String str = this.b;
        int hashCode2 = ((hashCode + 59) * 59) + (str == null ? 43 : str.hashCode());
        String str2 = this.c;
        int i = hashCode2 * 59;
        int hashCode3 = str2 == null ? 43 : str2.hashCode();
        PhoneNumberPickerMetric phoneNumberPickerMetric = this.d;
        return ((i + hashCode3) * 59) + (phoneNumberPickerMetric != null ? phoneNumberPickerMetric.hashCode() : 43);
    }

    public final String toString() {
        return "PhoneNumberAutoFillResult(mPhoneNumberAutoFillResultType=" + this.f1111a + ", mResultTypeMessage=" + this.b + ", mPhoneNumber=" + this.c + ", mPhoneNumberPickerMetric=" + this.d + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
