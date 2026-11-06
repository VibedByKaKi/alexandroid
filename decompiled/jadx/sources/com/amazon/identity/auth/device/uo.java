package com.amazon.identity.auth.device;

import android.content.res.XmlResourceParser;
import com.amazon.identity.auth.accounts.InvalidSubAuthenticatorDefinitionException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class uo {
    public static so a(String str, String str2, XmlResourceParser xmlResourceParser) {
        if (str == null || xmlResourceParser == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The package name and xml parser parameter cannot be null");
            return null;
        }
        to toVar = new to();
        toVar.f982a = xmlResourceParser;
        try {
            toVar.a();
            return toVar.c ? new so(str, str2, toVar.d) : new so(str, str2, toVar.b);
        } catch (IOException e) {
            throw new InvalidSubAuthenticatorDefinitionException(e);
        } catch (XmlPullParserException e2) {
            throw new InvalidSubAuthenticatorDefinitionException(e2);
        }
    }
}
