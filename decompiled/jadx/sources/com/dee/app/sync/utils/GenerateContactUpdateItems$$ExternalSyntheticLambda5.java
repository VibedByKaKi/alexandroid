package com.dee.app.sync.utils;

import com.dee.app.contacts.interfaces.models.data.ContactUploadInfo;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class GenerateContactUpdateItems$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GenerateContactUpdateItems f$0;
    public final /* synthetic */ Integer f$1;

    public /* synthetic */ GenerateContactUpdateItems$$ExternalSyntheticLambda5(GenerateContactUpdateItems generateContactUpdateItems, Integer num, int i) {
        this.$r8$classId = i;
        this.f$0 = generateContactUpdateItems;
        this.f$1 = num;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ContactUploadInfo.PhoneNumber lambda$sortAndTruncatePhoneNumbers$8;
        ContactUploadInfo.EmailAddress lambda$sortAndTruncateEmails$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$sortAndTruncatePhoneNumbers$8 = this.f$0.lambda$sortAndTruncatePhoneNumbers$8(this.f$1, (ContactUploadInfo.PhoneNumber) obj);
                return lambda$sortAndTruncatePhoneNumbers$8;
            default:
                lambda$sortAndTruncateEmails$11 = this.f$0.lambda$sortAndTruncateEmails$11(this.f$1, (ContactUploadInfo.EmailAddress) obj);
                return lambda$sortAndTruncateEmails$11;
        }
    }
}
