package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.identity.kcpsdk.common.FIRSErrorType;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class zb {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1107a;

    static {
        HashMap hashMap = new HashMap();
        f1107a = hashMap;
        hashMap.put("403", "BlockListedDevice");
    }

    public static yb a(Document document) {
        Element a2;
        String b;
        Element documentElement = document.getDocumentElement();
        String str = null;
        if (documentElement == null || !documentElement.getTagName().equals("error")) {
            return null;
        }
        FIRSErrorType fIRSErrorType = FIRSErrorType.FIRSErrorTypeCustomerNotFound;
        if (es.c(documentElement, fIRSErrorType.getErrorCode())) {
            Element documentElement2 = document.getDocumentElement();
            if (documentElement2 != null && documentElement2.getTagName().equals("error") && es.c(documentElement2, fIRSErrorType.getErrorCode()) && (a2 = es.a(documentElement2, "error_code")) != null && (b = es.b(a2)) != null) {
                str = (String) f1107a.get(b);
            }
        } else {
            fIRSErrorType = FIRSErrorType.FIRSErrorTypeDeviceAlreadyRegistered;
            if (!es.c(documentElement, fIRSErrorType.getErrorCode())) {
                fIRSErrorType = FIRSErrorType.FIRSErrorTypeDuplicateAccountName;
                if (!es.c(documentElement, fIRSErrorType.getErrorCode())) {
                    fIRSErrorType = FIRSErrorType.FIRSErrorTypeInternalError;
                    if (!es.c(documentElement, fIRSErrorType.getErrorCode())) {
                        fIRSErrorType = FIRSErrorType.FIRSErrorTypeInvalidAccountFound;
                        if (!es.c(documentElement, fIRSErrorType.getErrorCode())) {
                            fIRSErrorType = FIRSErrorType.FIRSErrorTypeUnrecognized;
                        }
                    }
                }
            }
        }
        Log.w(yf.a("FIRSErrorParser"), "FIRSError type=" + fIRSErrorType + " errorReason = " + str);
        return new yb(fIRSErrorType, str);
    }
}
