package com.amazon.alexa.matter.utils.logging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class PrefixLogger implements MatterLogger {

    @NonNull
    private final MatterLogger mDelegate;

    @NonNull
    final String mPrefix;

    public PrefixLogger(@NonNull MatterLogger matterLogger, @NonNull String str) {
        this.mDelegate = matterLogger;
        this.mPrefix = str;
    }

    @NonNull
    public static PrefixLogger scopedTo(@NonNull Class<?> cls, @NonNull MatterLogger matterLogger) {
        return new PrefixLogger(matterLogger, cls.getSimpleName().concat(": "));
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void debug(@NonNull String str) {
        this.mDelegate.debug(this.mPrefix + str);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void error(@NonNull String str) {
        this.mDelegate.error(this.mPrefix + str);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void info(@NonNull String str) {
        this.mDelegate.info(this.mPrefix + str);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void warn(@NonNull String str) {
        this.mDelegate.warn(this.mPrefix + str);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void error(@NonNull String str, @Nullable Throwable th) {
        this.mDelegate.error(this.mPrefix + str, th);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void warn(@NonNull String str, @Nullable Throwable th) {
        this.mDelegate.warn(this.mPrefix + str, th);
    }
}
