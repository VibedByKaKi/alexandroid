package org.apache.commons.text.lookup;

import java.nio.file.Path;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class StringLookupFactory$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StringLookupFactory$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$static$0;
        String lambda$new$0;
        String lambda$static$1;
        String lambda$static$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = StringLookupFactory.lambda$static$0((String) obj);
                return lambda$static$0;
            case 1:
                lambda$new$0 = InterpolatorStringLookup.lambda$new$0((Map.Entry) obj);
                return lambda$new$0;
            case 2:
                return ((Path) obj).toAbsolutePath();
            case 3:
                return (StringLookup) ((Map.Entry) obj).getValue();
            case 4:
                lambda$static$1 = StringLookupFactory.lambda$static$1((String) obj);
                return lambda$static$1;
            case 5:
                return System.getenv((String) obj);
            case 6:
                lambda$static$2 = StringLookupFactory.lambda$static$2((String) obj);
                return lambda$static$2;
            default:
                return System.getProperty((String) obj);
        }
    }
}
