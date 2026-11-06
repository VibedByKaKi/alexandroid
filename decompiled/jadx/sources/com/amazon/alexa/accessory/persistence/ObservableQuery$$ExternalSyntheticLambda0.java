package com.amazon.alexa.accessory.persistence;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ObservableQuery$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;

    public /* synthetic */ ObservableQuery$$ExternalSyntheticLambda0(Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Object lambda$mapToOne$0;
        List lambda$mapToList$1;
        int i = this.$r8$classId;
        Function function = this.f$0;
        DatabaseQuery databaseQuery = (DatabaseQuery) obj;
        switch (i) {
            case 0:
                lambda$mapToOne$0 = ObservableQuery.lambda$mapToOne$0(function, databaseQuery);
                return lambda$mapToOne$0;
            default:
                lambda$mapToList$1 = ObservableQuery.lambda$mapToList$1(function, databaseQuery);
                return lambda$mapToList$1;
        }
    }
}
