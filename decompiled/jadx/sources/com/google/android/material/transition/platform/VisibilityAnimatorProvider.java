package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(21)
/* loaded from: classes7.dex */
public interface VisibilityAnimatorProvider {
    @Nullable
    Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view);

    @Nullable
    Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view);
}
