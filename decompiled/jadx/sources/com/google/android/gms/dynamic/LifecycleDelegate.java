package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public interface LifecycleDelegate {
    @KeepForSdk
    void onCreate(@Nullable Bundle bundle);

    @NonNull
    @KeepForSdk
    View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onDestroyView();

    @KeepForSdk
    void onInflate(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2);

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onSaveInstanceState(@NonNull Bundle bundle);

    @KeepForSdk
    void onStart();

    @KeepForSdk
    void onStop();
}
