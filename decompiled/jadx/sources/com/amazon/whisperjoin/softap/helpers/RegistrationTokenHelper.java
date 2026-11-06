package com.amazon.whisperjoin.softap.helpers;

import com.amazon.whisperjoin.provisioning.registration.RegistrationToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class RegistrationTokenHelper {
    public static RegistrationToken toWhisperjoinRegistrationToken(com.amazon.whisperjoin.softap.pojos.RegistrationToken registrationToken) {
        return new RegistrationToken(registrationToken.getToken(), 0L);
    }
}
