package com.facebook.soloader.observer;

import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface Observer {
    void onGetDependenciesEnd(@Nullable Throwable th);

    void onGetDependenciesStart();

    void onLoadDependencyEnd(@Nullable Throwable th, boolean z);

    void onLoadDependencyStart(String str, int i);

    void onLoadLibraryEnd(@Nullable Throwable th, boolean z);

    void onLoadLibraryStart(String str, @Nullable String str2, int i);

    void onRecoveryEnd(@Nullable Throwable th);

    void onRecoveryStart(RecoveryStrategy recoveryStrategy);

    void onSoFileLoaderLoadEnd(@Nullable Throwable th);

    void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i);

    void onSoSourceLoadLibraryEnd(@Nullable Throwable th);

    void onSoSourceLoadLibraryStart(SoSource soSource);
}
