package expo.modules.kotlin.views;

import expo.modules.kotlin.Filter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class FilteredReadableMap$$ExternalSyntheticLambda0 implements Filter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FilteredReadableMap f$0;

    public /* synthetic */ FilteredReadableMap$$ExternalSyntheticLambda0(FilteredReadableMap filteredReadableMap, int i) {
        this.$r8$classId = i;
        this.f$0 = filteredReadableMap;
    }

    @Override // expo.modules.kotlin.Filter
    public final boolean apply(Object obj) {
        boolean keySetIterator$lambda$1;
        boolean entryIterator$lambda$0;
        int i = this.$r8$classId;
        FilteredReadableMap filteredReadableMap = this.f$0;
        switch (i) {
            case 0:
                keySetIterator$lambda$1 = FilteredReadableMap.keySetIterator$lambda$1(filteredReadableMap, (String) obj);
                return keySetIterator$lambda$1;
            default:
                entryIterator$lambda$0 = FilteredReadableMap.entryIterator$lambda$0(filteredReadableMap, (Map.Entry) obj);
                return entryIterator$lambda$0;
        }
    }
}
