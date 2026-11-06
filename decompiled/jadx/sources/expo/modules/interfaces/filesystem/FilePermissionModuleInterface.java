package expo.modules.interfaces.filesystem;

import android.content.Context;
import java.util.EnumSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface FilePermissionModuleInterface {
    EnumSet<Permission> getPathPermissions(Context context, String str);
}
