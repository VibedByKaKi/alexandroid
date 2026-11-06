package com.here.sdk.core.engine;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum LogLevel {
    LOG_LEVEL_INFO(0),
    LOG_LEVEL_WARNING(1),
    LOG_LEVEL_ERROR(2),
    LOG_LEVEL_FATAL(3),
    LOG_LEVEL_OFF(4);

    public final int value;

    LogLevel(int i) {
        this.value = i;
    }
}
