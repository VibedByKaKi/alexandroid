package com.amazon.coral.model.xml;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.coral.model.ModelIndexFactoryException;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AmbiguousXmlNamespaceException extends ModelIndexFactoryException {
    public AmbiguousXmlNamespaceException(String str, String str2, String str3) {
        this(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Ambiguous definition of xmlns '", str, "': both '", str2, "' and '"), str3, "' match this namespace in model index "));
    }

    public AmbiguousXmlNamespaceException(String str) {
        super(str);
    }
}
