package com.amazon.alexa.photos;

import com.amazon.clouddrive.extended.model.UploadFileExtendedResponse;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UploadOperation$$ExternalSyntheticLambda6 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ UploadOperation$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((UploadOperation) obj2).lambda$setupUploadObservable$1((UploadFileExtendedResponse) obj);
                break;
            default:
                ((MessagePublisher) obj2).lambda$initializeMessageFilter$3((PhotosUploaderEventMessage) obj);
                break;
        }
    }
}
