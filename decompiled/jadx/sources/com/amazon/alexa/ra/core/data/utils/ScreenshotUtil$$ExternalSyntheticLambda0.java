package com.amazon.alexa.ra.core.data.utils;

import com.amazon.alexa.accessory.kota.FileSystemFirmwareSupplier;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ScreenshotUtil$$ExternalSyntheticLambda0 implements FilenameFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ScreenshotUtil$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean deleteScreenshot$lambda$2;
        boolean lambda$getExistingPackageForCriteria$6;
        boolean lambda$deleteStalePartFiles$0;
        boolean latestScreenshotFile$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                deleteScreenshot$lambda$2 = ScreenshotUtil.deleteScreenshot$lambda$2(file, str);
                return deleteScreenshot$lambda$2;
            case 1:
                lambda$getExistingPackageForCriteria$6 = FileSystemFirmwareSupplier.lambda$getExistingPackageForCriteria$6(file, str);
                return lambda$getExistingPackageForCriteria$6;
            case 2:
                lambda$deleteStalePartFiles$0 = FileSystemFirmwareSupplier.lambda$deleteStalePartFiles$0(file, str);
                return lambda$deleteStalePartFiles$0;
            default:
                latestScreenshotFile$lambda$0 = ScreenshotUtil.getLatestScreenshotFile$lambda$0(file, str);
                return latestScreenshotFile$lambda$0;
        }
    }
}
