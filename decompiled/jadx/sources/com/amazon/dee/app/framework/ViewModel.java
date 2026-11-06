package com.amazon.dee.app.framework;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface ViewModel {
    void create(@Nullable Bundle bundle);

    void destroy();

    @Nullable
    Bundle saveState();

    void updateContentMode(int i);
}
