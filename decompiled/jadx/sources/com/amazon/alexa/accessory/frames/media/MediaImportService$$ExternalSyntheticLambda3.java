package com.amazon.alexa.accessory.frames.media;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import kotlin.Pair;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaImportService$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaImportService f$0;
    public final /* synthetic */ Subject f$1;

    public /* synthetic */ MediaImportService$$ExternalSyntheticLambda3(MediaImportService mediaImportService, Subject subject, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaImportService;
        this.f$1 = subject;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startNANDiscovery$13((ReplaySubject) this.f$1, (Pair) obj);
                break;
            case 1:
                this.f$0.lambda$subscribeNanTransferState$11((ReplaySubject) this.f$1, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$startNANDiscovery$14((ReplaySubject) this.f$1, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$observeTransferState$21((UnicastSubject) this.f$1, (Throwable) obj);
                break;
        }
    }
}
