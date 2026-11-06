package com.amazon.deecomms.identity;

import com.amazon.deecomms.api.CommsIdentity;
import com.amazon.deecomms.util.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsIdentityStore$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsIdentity f$0;

    public /* synthetic */ CommsIdentityStore$$ExternalSyntheticLambda1(CommsIdentity commsIdentity, int i) {
        this.$r8$classId = i;
        this.f$0 = commsIdentity;
    }

    @Override // com.amazon.deecomms.util.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        CommsIdentity commsIdentity = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                commsIdentity.setEmail(str);
                break;
            case 1:
                commsIdentity.setPhoneNumber(str);
                break;
            case 2:
                commsIdentity.setHomeGroupId(str);
                break;
            case 3:
                commsIdentity.setHashedCommsId(str);
                break;
            case 4:
                commsIdentity.setAor(str);
                break;
            case 5:
                commsIdentity.setFirstName(str);
                break;
            case 6:
                commsIdentity.setLastName(str);
                break;
            case 7:
                commsIdentity.setPhoneticFirstName(str);
                break;
            case 8:
                commsIdentity.setPhoneticLastName(str);
                break;
            default:
                commsIdentity.setCountryOfResidence(str);
                break;
        }
    }
}
