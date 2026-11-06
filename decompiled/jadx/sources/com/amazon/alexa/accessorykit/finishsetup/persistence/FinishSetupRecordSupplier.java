package com.amazon.alexa.accessorykit.finishsetup.persistence;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface FinishSetupRecordSupplier {
    @Nullable
    FinishSetupRecord get(String str);

    boolean has(String str);

    void remove(String str);

    void set(FinishSetupRecord finishSetupRecord);
}
