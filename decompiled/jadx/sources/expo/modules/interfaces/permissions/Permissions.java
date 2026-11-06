package expo.modules.interfaces.permissions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import expo.modules.core.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface Permissions {
    static void askForPermissionsWithPermissionsManager(Permissions permissions, Promise promise, String... strArr) {
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.askForPermissionsWithPromise(promise, strArr);
        }
    }

    static void getPermissionsWithPermissionsManager(Permissions permissions, Promise promise, String... strArr) {
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.getPermissionsWithPromise(promise, strArr);
        }
    }

    void askForPermissions(PermissionsResponseListener permissionsResponseListener, String... strArr);

    void askForPermissionsWithPromise(Promise promise, String... strArr);

    void getPermissions(PermissionsResponseListener permissionsResponseListener, String... strArr);

    void getPermissionsWithPromise(Promise promise, String... strArr);

    boolean hasGrantedPermissions(String... strArr);

    boolean isPermissionPresentInManifest(String str);

    static void askForPermissionsWithPermissionsManager(@Nullable Permissions permissions, @NonNull final expo.modules.kotlin.Promise promise, @NonNull String... strArr) {
        askForPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.interfaces.permissions.Permissions.2
            @Override // expo.modules.core.Promise
            public void reject(String str, String str2, Throwable th) {
                expo.modules.kotlin.Promise.this.reject(str, str2, th);
            }

            @Override // expo.modules.core.Promise
            public void resolve(Object obj) {
                expo.modules.kotlin.Promise.this.resolve(obj);
            }
        }, strArr);
    }

    static void getPermissionsWithPermissionsManager(@Nullable Permissions permissions, @NonNull final expo.modules.kotlin.Promise promise, @NonNull String... strArr) {
        getPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.interfaces.permissions.Permissions.1
            @Override // expo.modules.core.Promise
            public void reject(String str, String str2, Throwable th) {
                expo.modules.kotlin.Promise.this.reject(str, str2, th);
            }

            @Override // expo.modules.core.Promise
            public void resolve(Object obj) {
                expo.modules.kotlin.Promise.this.resolve(obj);
            }
        }, strArr);
    }
}
