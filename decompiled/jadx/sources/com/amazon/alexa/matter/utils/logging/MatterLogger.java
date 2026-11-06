package com.amazon.alexa.matter.utils.logging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public interface MatterLogger {
    void debug(@NonNull String str);

    void error(@NonNull String str);

    void error(@NonNull String str, @Nullable Throwable th);

    void info(@NonNull String str);

    void warn(@NonNull String str);

    void warn(@NonNull String str, @Nullable Throwable th);
}
