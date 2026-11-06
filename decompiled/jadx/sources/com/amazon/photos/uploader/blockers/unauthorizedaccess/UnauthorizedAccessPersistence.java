package com.amazon.photos.uploader.blockers.unauthorizedaccess;

import android.content.SharedPreferences;
import com.amazon.photos.uploader.UploadFrameworkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0002\b\u000eJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0012R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/photos/uploader/blockers/unauthorizedaccess/UnauthorizedAccessPersistence;", "", "uploaderContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "clearAuthState", "", "clearAuthState$AndroidPhotosUploader_release", "getAuthStateWithDefaultFallback", "Lcom/amazon/photos/uploader/blockers/unauthorizedaccess/AuthState;", "defaultAuthState", "getAuthStateWithDefaultFallback$AndroidPhotosUploader_release", "", "persistAuthState", "authState", "persistAuthState$AndroidPhotosUploader_release", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnauthorizedAccessPersistence {

    @NotNull
    public static final String AUTH_EVALUATOR_PREFERENCES = "UNAUTHORIZED_ACCESS_EVALUATOR";

    @NotNull
    public static final String AUTH_STATE = "BLOCKER_AUTH_STATE";
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final UploadFrameworkContext uploaderContext;

    public UnauthorizedAccessPersistence(@NotNull UploadFrameworkContext uploadFrameworkContext) {
        uploadFrameworkContext.getClass();
        this.uploaderContext = uploadFrameworkContext;
        this.sharedPreferences = uploadFrameworkContext.getApplicationContext().getSharedPreferences("UNAUTHORIZED_ACCESS_EVALUATOR_" + uploadFrameworkContext.getHashedDirectedId() + ')', 0);
    }

    private final String getAuthStateWithDefaultFallback(String defaultAuthState) {
        return this.sharedPreferences.getString(AUTH_STATE, defaultAuthState);
    }

    public final void clearAuthState$AndroidPhotosUploader_release() {
        this.sharedPreferences.edit().clear().apply();
    }

    @NotNull
    public final AuthState getAuthStateWithDefaultFallback$AndroidPhotosUploader_release(@NotNull AuthState defaultAuthState) {
        defaultAuthState.getClass();
        String authStateWithDefaultFallback = getAuthStateWithDefaultFallback(defaultAuthState.name());
        if (authStateWithDefaultFallback == null) {
            authStateWithDefaultFallback = defaultAuthState.name();
        }
        return AuthState.valueOf(authStateWithDefaultFallback);
    }

    public final void persistAuthState$AndroidPhotosUploader_release(@NotNull AuthState authState) {
        authState.getClass();
        if (Intrinsics.areEqual(getAuthStateWithDefaultFallback(null), authState.name())) {
            return;
        }
        this.sharedPreferences.edit().putString(AUTH_STATE, authState.name()).apply();
    }
}
