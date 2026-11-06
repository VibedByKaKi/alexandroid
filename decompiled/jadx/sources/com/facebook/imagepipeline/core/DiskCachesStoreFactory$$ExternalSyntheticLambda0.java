package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.FileCache;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DiskCachesStoreFactory$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DiskCachesStoreFactory f$0;

    public /* synthetic */ DiskCachesStoreFactory$$ExternalSyntheticLambda0(DiskCachesStoreFactory diskCachesStoreFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = diskCachesStoreFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DiskCachesStoreFactory$diskCachesStore$2$1 diskCachesStore_delegate$lambda$0;
        FileCache mainFileCache_delegate$lambda$0;
        FileCache smallImageFileCache_delegate$lambda$2;
        int i = this.$r8$classId;
        DiskCachesStoreFactory diskCachesStoreFactory = this.f$0;
        switch (i) {
            case 0:
                diskCachesStore_delegate$lambda$0 = DiskCachesStoreFactory.diskCachesStore_delegate$lambda$0(diskCachesStoreFactory);
                return diskCachesStore_delegate$lambda$0;
            case 1:
                mainFileCache_delegate$lambda$0 = DiskCachesStoreFactory$diskCachesStore$2$1.mainFileCache_delegate$lambda$0(diskCachesStoreFactory);
                return mainFileCache_delegate$lambda$0;
            default:
                smallImageFileCache_delegate$lambda$2 = DiskCachesStoreFactory$diskCachesStore$2$1.smallImageFileCache_delegate$lambda$2(diskCachesStoreFactory);
                return smallImageFileCache_delegate$lambda$2;
        }
    }
}
