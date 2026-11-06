package org.apache.commons.lang3.reflect;

import com.dee.app.contacts.interfaces.models.data.server.ServerContact;
import com.dee.app.sync.utils.GenerateContactUpdateItems;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class MethodUtils$$ExternalSyntheticLambda14 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MethodUtils$$ExternalSyntheticLambda14(String str, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getMatchingAccessibleMethod$0;
        boolean lambda$getContactUpdateItems$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$getMatchingAccessibleMethod$0 = MethodUtils.lambda$getMatchingAccessibleMethod$0(this.f$0, (Class[]) this.f$1, (Method) obj);
                return lambda$getMatchingAccessibleMethod$0;
            default:
                lambda$getContactUpdateItems$3 = GenerateContactUpdateItems.lambda$getContactUpdateItems$3(this.f$0, (List) this.f$1, (ServerContact) obj);
                return lambda$getContactUpdateItems$3;
        }
    }
}
