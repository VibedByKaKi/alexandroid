package com.amazon.identity.auth.device;

import android.content.res.XmlResourceParser;
import com.amazon.identity.auth.accounts.InvalidSubAuthenticatorDefinitionException;
import com.amazon.identity.auth.device.utils.AccountConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class to {

    /* renamed from: a, reason: collision with root package name */
    public XmlResourceParser f982a;
    public final ArrayList b = new ArrayList();
    public boolean c;
    public String d;

    public final void a() {
        a(0);
        a(2);
        if (!this.f982a.getName().equals(AccountConstants.SUB_AUTHENTICATOR_ATTRIBUTES_NAME)) {
            throw new InvalidSubAuthenticatorDefinitionException();
        }
        if (!this.f982a.getAttributeValue(null, AccountConstants.SUB_AUTHENTICATOR_ACCOUNT_TYPE_ATTRIBUTE).equals(AccountConstants.AMAZON_ACCOUNT_TYPE)) {
            throw new InvalidSubAuthenticatorDefinitionException();
        }
        String attributeValue = this.f982a.getAttributeValue(null, "type");
        if (attributeValue == null || !attributeValue.equals("DMS")) {
            a(2);
            if (!this.f982a.getName().equals(AccountConstants.SUB_AUTHENTICATOR_TOKEN_TYPES_NAME)) {
                throw new InvalidSubAuthenticatorDefinitionException();
            }
            while (true) {
                int nextTag = this.f982a.nextTag();
                XmlResourceParser xmlResourceParser = this.f982a;
                if (nextTag != 3) {
                    if (!xmlResourceParser.getName().equals(AccountConstants.SUB_AUTHENTICATOR_TOKEN_TYPE_NAME)) {
                        throw new InvalidSubAuthenticatorDefinitionException();
                    }
                    String attributeValue2 = this.f982a.getAttributeValue(null, "name");
                    a(3);
                    this.b.add(attributeValue2);
                } else if (!xmlResourceParser.getName().equals(AccountConstants.SUB_AUTHENTICATOR_TOKEN_TYPES_NAME)) {
                    throw new InvalidSubAuthenticatorDefinitionException();
                }
            }
        } else {
            this.c = true;
            while (this.f982a.next() != 3) {
                String name = this.f982a.getName();
                a(4);
                if (name.equals(AccountConstants.SUB_AUTHENTICATOR_DEVICE_TYPE_NAME)) {
                    this.d = this.f982a.getText();
                } else {
                    if (!name.equals(AccountConstants.SUB_AUTHENTICATOR_MULTIPLE_ACCOUNT_AWARE)) {
                        throw new InvalidSubAuthenticatorDefinitionException();
                    }
                    String text = this.f982a.getText();
                    if (!"true".equalsIgnoreCase(text) && !"yes".equalsIgnoreCase(text)) {
                        "1".equalsIgnoreCase(text);
                    }
                }
                a(3);
            }
        }
        if (!this.f982a.getName().equals(AccountConstants.SUB_AUTHENTICATOR_ATTRIBUTES_NAME)) {
            a(3);
        }
        a(1);
    }

    public final void a(int i) {
        int nextTag;
        if (i != 2 && i != 3) {
            nextTag = this.f982a.next();
        } else {
            nextTag = this.f982a.nextTag();
        }
        if (nextTag != i) {
            throw new InvalidSubAuthenticatorDefinitionException();
        }
    }
}
