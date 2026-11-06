package expo.modules.filesystem;

import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/filesystem/InvalidPermissionException;", "Lexpo/modules/kotlin/exception/CodedException;", "permission", "Lexpo/modules/interfaces/filesystem/Permission;", "<init>", "(Lexpo/modules/interfaces/filesystem/Permission;)V", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvalidPermissionException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidPermissionException(@NotNull Permission permission) {
        super(a$$ExternalSyntheticOutline0.m("Missing '", permission.name(), "' permission for accessing the file."), null, 2, null);
        permission.getClass();
    }
}
