package com.amazon.alexa.hho.stickynotes;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class StickyNotesMediaProvider$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StickyNotesMediaProvider f$0;

    public /* synthetic */ StickyNotesMediaProvider$$ExternalSyntheticLambda5(StickyNotesMediaProvider stickyNotesMediaProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = stickyNotesMediaProvider;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$deleteMemoryExceedingFiles$25;
        CompletableSource lambda$deleteOldFiles$22;
        CompletableSource lambda$handleDeleteRequest$8;
        CompletableSource lambda$cleanupMediaCache$1;
        int i = this.$r8$classId;
        StickyNotesMediaProvider stickyNotesMediaProvider = this.f$0;
        switch (i) {
            case 0:
                lambda$deleteMemoryExceedingFiles$25 = stickyNotesMediaProvider.lambda$deleteMemoryExceedingFiles$25((List) obj);
                return lambda$deleteMemoryExceedingFiles$25;
            case 1:
                lambda$deleteOldFiles$22 = stickyNotesMediaProvider.lambda$deleteOldFiles$22((List) obj);
                return lambda$deleteOldFiles$22;
            case 2:
                lambda$handleDeleteRequest$8 = stickyNotesMediaProvider.lambda$handleDeleteRequest$8((String) obj);
                return lambda$handleDeleteRequest$8;
            default:
                lambda$cleanupMediaCache$1 = stickyNotesMediaProvider.lambda$cleanupMediaCache$1((Long) obj);
                return lambda$cleanupMediaCache$1;
        }
    }
}
