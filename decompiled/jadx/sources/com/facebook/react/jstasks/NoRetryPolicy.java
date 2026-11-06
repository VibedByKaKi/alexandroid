package com.facebook.react.jstasks;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/facebook/react/jstasks/NoRetryPolicy;", "Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;", "<init>", "()V", "canRetry", "", "delay", "", "getDelay", "()I", "update", "copy", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoRetryPolicy implements HeadlessJsTaskRetryPolicy {

    @JvmField
    @NotNull
    public static final NoRetryPolicy INSTANCE = new NoRetryPolicy();

    private NoRetryPolicy() {
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public boolean canRetry() {
        return false;
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public int getDelay() {
        throw new IllegalStateException(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Should not retrieve delay as canRetry is: ", canRetry()));
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    @NotNull
    public HeadlessJsTaskRetryPolicy update() {
        throw new IllegalStateException(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Should not update as canRetry is: ", canRetry()));
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    @NotNull
    public HeadlessJsTaskRetryPolicy copy() {
        return this;
    }
}
