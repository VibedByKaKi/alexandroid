package org.openjdk.tools.javac.file;

import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import org.openjdk.tools.javac.file.Locations;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Locations$SystemModulesLocationHandler$$ExternalSyntheticLambda0 implements DirectoryStream.Filter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Locations$SystemModulesLocationHandler$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public final boolean accept(Object obj) {
        Path path = (Path) obj;
        switch (this.$r8$classId) {
            case 0:
                return Locations.SystemModulesLocationHandler.lambda$initSystemModules$0(path);
            default:
                return Locations.ModuleSourcePathLocationHandler.lambda$add$2(path);
        }
    }
}
