package org.apache.commons.lang3;

import com.amazon.alexa.configservice.manager.RemoteConfigRetrievalManager;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.util.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Validate$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Validate$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String message;
        Optional retrieveConfigInBackground$lambda$3;
        Object lambda$map$0;
        switch (this.$r8$classId) {
            case 0:
                message = Validate.getMessage((String) this.f$0, (Object[]) this.f$1);
                return message;
            case 1:
                retrieveConfigInBackground$lambda$3 = RemoteConfigRetrievalManager.retrieveConfigInBackground$lambda$3((List) this.f$0, (RemoteConfigRetrievalManager) this.f$1);
                return retrieveConfigInBackground$lambda$3;
            default:
                lambda$map$0 = ((Lazy) this.f$0).lambda$map$0((Function) this.f$1);
                return lambda$map$0;
        }
    }
}
