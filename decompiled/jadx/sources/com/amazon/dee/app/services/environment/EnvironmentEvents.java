package com.amazon.dee.app.services.environment;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/dee/app/services/environment/EnvironmentEvents;", "", "<init>", "()V", "ENDPOINTS_CHANGED", "", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnvironmentEvents {

    @NotNull
    public static final EnvironmentEvents INSTANCE = new EnvironmentEvents();

    @JvmField
    @NotNull
    public static final String ENDPOINTS_CHANGED = "ENDPOINTS_CHANGED";

    private EnvironmentEvents() {
    }
}
