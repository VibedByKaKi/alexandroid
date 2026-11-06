package com.amazon.clouddrive.cdasdk;

import androidx.annotation.NonNull;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RequestLoggingConfig {

    @NonNull
    private final DetailLevel detailLevel;

    @NonNull
    private final Verbosity verbosity;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DetailLevel {
        None,
        Basic,
        Full
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Verbosity {
        Debug,
        Verbose,
        Info
    }

    public RequestLoggingConfig() {
        this.detailLevel = DetailLevel.Basic;
        this.verbosity = Verbosity.Debug;
    }

    @NonNull
    @Generated
    public DetailLevel getDetailLevel() {
        return this.detailLevel;
    }

    @NonNull
    @Generated
    public Verbosity getVerbosity() {
        return this.verbosity;
    }

    public RequestLoggingConfig(@NonNull DetailLevel detailLevel, @NonNull Verbosity verbosity) {
        this.detailLevel = detailLevel;
        this.verbosity = verbosity;
    }
}
