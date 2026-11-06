package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
interface BundleAdapter<T> {
    @Nullable
    T createFromBundle(Bundle bundle);

    Bundle toBundle(T t);
}
