package com.amazon.alexa.assistant.transport.connection;

import kotlin.Metadata;
import kotlin.time.Duration;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/RetryStrategy;", "", "nextInterval", "Lkotlin/time/Duration;", "attempt", "", "nextInterval-LV8wdWc", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RetryStrategy {
    @Nullable
    /* renamed from: nextInterval-LV8wdWc */
    Duration mo15117nextIntervalLV8wdWc(int attempt);
}
