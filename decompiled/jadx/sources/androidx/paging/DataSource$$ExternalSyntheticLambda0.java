package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.camera.lifecycle.LifecycleCameraProvider;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.paging.DataSource;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DataSource$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ DataSource$$ExternalSyntheticLambda0(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        Object map$lambda$1;
        LifecycleCameraProvider createInstanceAsync$lambda$0;
        ProcessCameraProvider instance$lambda$0;
        List mapByPage$lambda$0;
        List map$lambda$2;
        List mapByPage$lambda$3;
        List map$lambda$8;
        List mapByPage$lambda$5;
        List mapByPage$lambda$32;
        List map$lambda$6;
        List mapByPage$lambda$2;
        List map$lambda$5;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                map$lambda$1 = DataSource.map$lambda$1(function1, obj);
                return map$lambda$1;
            case 1:
                createInstanceAsync$lambda$0 = LifecycleCameraProvider.Companion.createInstanceAsync$lambda$0(function1, obj);
                return createInstanceAsync$lambda$0;
            case 2:
                instance$lambda$0 = ProcessCameraProvider.Companion.getInstance$lambda$0(function1, obj);
                return instance$lambda$0;
            case 3:
                mapByPage$lambda$0 = DataSource.mapByPage$lambda$0(function1, (List) obj);
                return mapByPage$lambda$0;
            case 4:
                map$lambda$2 = DataSource.Factory.map$lambda$2(function1, (List) obj);
                return map$lambda$2;
            case 5:
                mapByPage$lambda$3 = DataSource.Factory.mapByPage$lambda$3(function1, (List) obj);
                return mapByPage$lambda$3;
            case 6:
                map$lambda$8 = ItemKeyedDataSource.map$lambda$8(function1, (List) obj);
                return map$lambda$8;
            case 7:
                mapByPage$lambda$5 = ItemKeyedDataSource.mapByPage$lambda$5(function1, (List) obj);
                return mapByPage$lambda$5;
            case 8:
                mapByPage$lambda$32 = PageKeyedDataSource.mapByPage$lambda$3(function1, (List) obj);
                return mapByPage$lambda$32;
            case 9:
                map$lambda$6 = PageKeyedDataSource.map$lambda$6(function1, (List) obj);
                return map$lambda$6;
            case 10:
                mapByPage$lambda$2 = PositionalDataSource.mapByPage$lambda$2(function1, (List) obj);
                return mapByPage$lambda$2;
            default:
                map$lambda$5 = PositionalDataSource.map$lambda$5(function1, (List) obj);
                return map$lambda$5;
        }
    }
}
