package com.amazon.deecomms.nativemodules;

import com.amazon.dee.app.elements.bridges.ScreenSnapshotModule;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsMetricsLogStorage$$ExternalSyntheticLambda0 implements FilenameFilter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ CommsMetricsLogStorage$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$getLogFilenames$0;
        boolean deleteSnapshots$lambda$42;
        int i = this.$r8$classId;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                lambda$getLogFilenames$0 = CommsMetricsLogStorage.lambda$getLogFilenames$0(str2, file, str);
                return lambda$getLogFilenames$0;
            default:
                deleteSnapshots$lambda$42 = ScreenSnapshotModule.deleteSnapshots$lambda$42(str2, file, str);
                return deleteSnapshots$lambda$42;
        }
    }
}
