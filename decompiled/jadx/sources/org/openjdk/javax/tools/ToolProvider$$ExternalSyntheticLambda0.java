package org.openjdk.javax.tools;

import java.io.Serializable;
import java.security.PrivilegedAction;
import org.apache.logging.log4j.util.LoaderUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ToolProvider$$ExternalSyntheticLambda0 implements PrivilegedAction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ ToolProvider$$ExternalSyntheticLambda0(Object obj, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Boolean lambda$matches$0;
        ClassLoader lambda$getClassLoader$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$matches$0 = ToolProvider.lambda$matches$0(this.f$0, (String) this.f$1);
                return lambda$matches$0;
            default:
                lambda$getClassLoader$2 = LoaderUtil.lambda$getClassLoader$2((Class) this.f$0, (Class) this.f$1);
                return lambda$getClassLoader$2;
        }
    }
}
