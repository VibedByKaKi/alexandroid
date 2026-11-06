package com.amazon.alexa.photos;

import android.net.Uri;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UploadOperation$$ExternalSyntheticLambda10 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ UploadOperation$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ObservableSource lambda$start$0;
        List buildUploadRequests;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$start$0 = ((UploadOperation) obj2).lambda$start$0((Uri) obj);
                return lambda$start$0;
            default:
                buildUploadRequests = ((UploadOperationV2) obj2).buildUploadRequests((Map) obj);
                return buildUploadRequests;
        }
    }
}
