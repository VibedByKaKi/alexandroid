package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
interface SheetCallback {
    void onSlide(@NonNull View view, float f);

    void onStateChanged(@NonNull View view, int i);
}
