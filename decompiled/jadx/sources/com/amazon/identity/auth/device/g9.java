package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.CustomerAttributeKeys;
import com.amazon.identity.auth.device.utils.AccountConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class g9 {
    public static boolean a(pd pdVar) {
        String str = pdVar.c;
        return CustomerAttributeKeys.KEY_COR.equals(str) || CustomerAttributeKeys.KEY_PFM.equals(str);
    }

    public static boolean b(pd pdVar) {
        return "com.amazon.dcp.sso.property.deviceemail".equals(pdVar.c) || "com.amazon.dcp.sso.property.devicename".equals(pdVar.c) || "com.amazon.dcp.sso.property.username".equals(pdVar.c) || "com.amazon.dcp.sso.property.firstname".equals(pdVar.c) || "com.amazon.dcp.sso.token.devicedevicetype".equals(pdVar.c) || "com.amazon.dcp.sso.token.device.deviceserialname".equals(pdVar.c) || "com.amazon.dcp.sso.token.device.accountpool".equals(pdVar.c) || "com.amazon.dcp.sso.property.account.delegateeaccount".equals(pdVar.c) || CustomerAttributeKeys.KEY_IS_ANONYMOUS.equals(pdVar.c) || AccountConstants.KEY_ACCOUNT_UUID.equals(pdVar.c) || AccountConstants.KEY_SECONDARY_AMAZON_ACCOUNT.equals(pdVar.c) || AccountConstants.KEY_DEVICE_ACCOUNT_ROLE.equals(pdVar.c) || pdVar.c.startsWith("com.amazon.dcp.sso.property.account.extratokens");
    }
}
