package com.amazon.dee.app.elements;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
interface ReactFeature extends Parcelable {
    @NonNull
    String getAppName();

    @NonNull
    String getInstanceId();

    @Nullable
    Bundle getLaunchOptions();
}
