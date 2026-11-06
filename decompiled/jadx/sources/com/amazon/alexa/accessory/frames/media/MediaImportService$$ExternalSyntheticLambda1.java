package com.amazon.alexa.accessory.frames.media;

import com.amazon.alexa.accessory.frames.media.transport.TransportSession;
import com.amazon.alexa.accessory.protocol.Common;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaImportService$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaImportService f$0;

    public /* synthetic */ MediaImportService$$ExternalSyntheticLambda1(MediaImportService mediaImportService, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaImportService;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        MediaImportService mediaImportService = this.f$0;
        switch (i) {
            case 0:
                mediaImportService.lambda$startImportViaNanWithSerial$8((Throwable) obj);
                break;
            case 1:
                mediaImportService.lambda$startImportViaNanWithSerial$6((Throwable) obj);
                break;
            case 2:
                mediaImportService.startImportViaNanWithSerial((String) obj);
                break;
            case 3:
                mediaImportService.lambda$startImportViaNan$4((Throwable) obj);
                break;
            case 4:
                mediaImportService.lambda$startImportViaSoftAp$17((TransportSession) obj);
                break;
            case 5:
                mediaImportService.lambda$startImportViaSoftAp$18((Throwable) obj);
                break;
            case 6:
                mediaImportService.lambda$startSessionAndObserve$19((Common.ErrorCode) obj);
                break;
            default:
                mediaImportService.lambda$startSessionAndObserve$20((Throwable) obj);
                break;
        }
    }
}
