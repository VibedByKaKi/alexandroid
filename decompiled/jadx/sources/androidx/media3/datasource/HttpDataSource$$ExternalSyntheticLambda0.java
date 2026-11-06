package androidx.media3.datasource;

import androidx.media3.datasource.DefaultHttpDataSource;
import com.google.common.base.Predicate;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class HttpDataSource$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HttpDataSource$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean lambda$static$0;
        boolean lambda$entrySet$1;
        boolean lambda$keySet$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = HttpDataSource.lambda$static$0((String) obj);
                return lambda$static$0;
            case 1:
                lambda$entrySet$1 = DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
                return lambda$entrySet$1;
            default:
                lambda$keySet$0 = DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
                return lambda$keySet$0;
        }
    }
}
