package com.amazon.alexa.crashreporting;

import androidx.annotation.NonNull;
import com.amazon.alexa.crashreporting.api.CrashMetadata;
import java.util.Objects;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CrashReportingMetadata implements CrashMetadata {
    private Provider<CrashReportingService> crashReportingService;

    public CrashReportingMetadata(Provider<CrashReportingService> provider) {
        this.crashReportingService = provider;
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashMetadata
    public void put(@NonNull String str, boolean z) {
        this.crashReportingService.get().putMetadata(str, String.valueOf(z));
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashMetadata
    public void put(@NonNull String str, @NonNull String str2) {
        CrashReportingService crashReportingService = this.crashReportingService.get();
        Objects.requireNonNull(str2);
        crashReportingService.putMetadata(str, str2);
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashMetadata
    public void put(@NonNull String str, int i) {
        this.crashReportingService.get().putMetadata(str, String.valueOf(i));
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashMetadata
    public void put(@NonNull String str, long j) {
        this.crashReportingService.get().putMetadata(str, String.valueOf(j));
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashMetadata
    public void put(@NonNull String str, float f) {
        this.crashReportingService.get().putMetadata(str, String.valueOf(f));
    }

    @Override // com.amazon.alexa.crashreporting.api.CrashMetadata
    public void put(@NonNull String str, double d) {
        this.crashReportingService.get().putMetadata(str, String.valueOf(d));
    }
}
