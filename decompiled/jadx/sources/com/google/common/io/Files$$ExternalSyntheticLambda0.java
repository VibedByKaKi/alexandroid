package com.google.common.io;

import com.google.common.graph.SuccessorsFunction;
import java.io.File;
import java.nio.file.Path;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Files$$ExternalSyntheticLambda0 implements SuccessorsFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Files$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final Iterable successors(Object obj) {
        Iterable lambda$static$0;
        Iterable fileTreeChildren;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = Files.lambda$static$0((File) obj);
                return lambda$static$0;
            default:
                fileTreeChildren = MoreFiles.fileTreeChildren((Path) obj);
                return fileTreeChildren;
        }
    }
}
