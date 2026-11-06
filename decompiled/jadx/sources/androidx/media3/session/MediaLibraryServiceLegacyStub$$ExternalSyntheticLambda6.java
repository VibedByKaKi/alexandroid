package androidx.media3.session;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda6 implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaLibraryServiceLegacyStub f$0;

    public /* synthetic */ MediaLibraryServiceLegacyStub$$ExternalSyntheticLambda6(MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaLibraryServiceLegacyStub;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        ListenableFuture lambda$createMediaItemsToBrowserItemsAsyncFunction$12;
        ListenableFuture lambda$createMediaItemToBrowserItemAsyncFunction$15;
        int i = this.$r8$classId;
        MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub = this.f$0;
        LibraryResult libraryResult = (LibraryResult) obj;
        switch (i) {
            case 0:
                lambda$createMediaItemsToBrowserItemsAsyncFunction$12 = mediaLibraryServiceLegacyStub.lambda$createMediaItemsToBrowserItemsAsyncFunction$12(libraryResult);
                return lambda$createMediaItemsToBrowserItemsAsyncFunction$12;
            default:
                lambda$createMediaItemToBrowserItemAsyncFunction$15 = mediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$15(libraryResult);
                return lambda$createMediaItemToBrowserItemAsyncFunction$15;
        }
    }
}
