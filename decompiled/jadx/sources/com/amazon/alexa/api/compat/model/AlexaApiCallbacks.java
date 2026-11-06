package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ApiCallbacksBundleKeys;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaApiCallbacks;", "", ApiCallbacksBundleKeys.TIMEOUT_VALUE, "", ApiCallbacksBundleKeys.TIMEOUT_UNIT, "Ljava/util/concurrent/TimeUnit;", "<init>", "(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)V", "getTimeoutValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeoutUnit", "()Ljava/util/concurrent/TimeUnit;", "id", "", "getId", "()Ljava/lang/String;", "callbackMethodCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "doOnSuccess", "", "doOnFailure", "apiCallFailure", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "onSuccess", "onFailure", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AlexaApiCallbacks {
    public static final int $stable = 8;

    @NotNull
    private final AtomicBoolean callbackMethodCalled;

    @NotNull
    private final String id;

    @Nullable
    private final TimeUnit timeoutUnit;

    @Nullable
    private final Long timeoutValue;

    public AlexaApiCallbacks(@Nullable Long l, @Nullable TimeUnit timeUnit) {
        this.timeoutValue = l;
        this.timeoutUnit = timeUnit;
        this.id = TableInfo$$ExternalSyntheticOutline0.m();
        this.callbackMethodCalled = new AtomicBoolean(false);
    }

    public final void doOnFailure(@Nullable ApiCallFailure apiCallFailure) {
        if (this.callbackMethodCalled.compareAndSet(false, true)) {
            onFailure(apiCallFailure);
        }
    }

    public final void doOnSuccess() {
        if (this.callbackMethodCalled.compareAndSet(false, true)) {
            onSuccess();
        }
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final TimeUnit getTimeoutUnit() {
        return this.timeoutUnit;
    }

    @Nullable
    public final Long getTimeoutValue() {
        return this.timeoutValue;
    }

    public void onSuccess() {
    }

    public void onFailure(@Nullable ApiCallFailure apiCallFailure) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaApiCallbacks() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AlexaApiCallbacks(Long l, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : timeUnit);
    }
}
