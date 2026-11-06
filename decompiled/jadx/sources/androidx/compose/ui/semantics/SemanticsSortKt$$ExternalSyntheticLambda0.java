package androidx.compose.ui.semantics;

import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import com.amazon.tarazed.sessionmanager.TarazedController;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SemanticsSortKt$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;

    public /* synthetic */ SemanticsSortKt$$ExternalSyntheticLambda0(Function2 function2, int i) {
        this.$r8$classId = i;
        this.f$0 = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int sortByGeometryGroupings$lambda$3;
        int sort$lambda$2;
        int launchRequestQueue$lambda$0;
        int encounteredLaunchRequestSet$lambda$1;
        int i = this.$r8$classId;
        Function2 function2 = this.f$0;
        switch (i) {
            case 0:
                sortByGeometryGroupings$lambda$3 = SemanticsSortKt.sortByGeometryGroupings$lambda$3(function2, obj, obj2);
                return sortByGeometryGroupings$lambda$3;
            case 1:
                sort$lambda$2 = SelectionRegistrarImpl.sort$lambda$2(function2, obj, obj2);
                return sort$lambda$2;
            case 2:
                launchRequestQueue$lambda$0 = TarazedController.launchRequestQueue$lambda$0(function2, obj, obj2);
                return launchRequestQueue$lambda$0;
            default:
                encounteredLaunchRequestSet$lambda$1 = TarazedController.encounteredLaunchRequestSet$lambda$1(function2, obj, obj2);
                return encounteredLaunchRequestSet$lambda$1;
        }
    }
}
