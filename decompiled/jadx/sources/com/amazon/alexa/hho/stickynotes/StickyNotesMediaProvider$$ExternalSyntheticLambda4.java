package com.amazon.alexa.hho.stickynotes;

import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class StickyNotesMediaProvider$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StickyNotesMediaProvider f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ StickyNotesMediaProvider$$ExternalSyntheticLambda4(StickyNotesMediaProvider stickyNotesMediaProvider, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = stickyNotesMediaProvider;
        this.f$1 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        MaybeSource lambda$downloadMediaIfNotInProgress$10;
        MaybeSource lambda$downloadMediaIfNotInProgress$13;
        SingleSource lambda$downloadAndCacheMedia$16;
        String lambda$handleDeleteRequest$6;
        switch (this.$r8$classId) {
            case 0:
                lambda$downloadMediaIfNotInProgress$10 = this.f$0.lambda$downloadMediaIfNotInProgress$10((MediaDownloadRequest) this.f$1, (Boolean) obj);
                return lambda$downloadMediaIfNotInProgress$10;
            case 1:
                lambda$downloadMediaIfNotInProgress$13 = this.f$0.lambda$downloadMediaIfNotInProgress$13((MediaDownloadRequest) this.f$1, (Boolean) obj);
                return lambda$downloadMediaIfNotInProgress$13;
            case 2:
                lambda$downloadAndCacheMedia$16 = this.f$0.lambda$downloadAndCacheMedia$16((MediaDownloadRequest) this.f$1, (String) obj);
                return lambda$downloadAndCacheMedia$16;
            default:
                lambda$handleDeleteRequest$6 = this.f$0.lambda$handleDeleteRequest$6((String) this.f$1, (StickyNoteMediaType) obj);
                return lambda$handleDeleteRequest$6;
        }
    }
}
