package com.amazon.alexa.assistant.voicechat.detector;

import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B7\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/detector/TelemetryDisabledProvider;", ExifInterface.GPS_DIRECTION_TRUE, "", "disableForProcess", "Lkotlin/Function0;", "", "getEnvironment", "disableEvents", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "telemetryDisabled", "", MetricsConstants.Method.CACHE_GET, "()Ljava/lang/Object;", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnnxRuntimeEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnnxRuntimeEnvironment.kt\ncom/amazon/alexa/assistant/voicechat/detector/TelemetryDisabledProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes17.dex */
public final class TelemetryDisabledProvider<T> {

    @NotNull
    private final Function1<T, Unit> disableEvents;

    @NotNull
    private final Function0<Unit> disableForProcess;

    @NotNull
    private final Function0<T> getEnvironment;
    private boolean telemetryDisabled;

    /* JADX WARN: Multi-variable type inference failed */
    public TelemetryDisabledProvider(@NotNull Function0<Unit> function0, @NotNull Function0<? extends T> function02, @NotNull Function1<? super T, Unit> function1) {
        function0.getClass();
        function02.getClass();
        function1.getClass();
        this.disableForProcess = function0;
        this.getEnvironment = function02;
        this.disableEvents = function1;
    }

    @NotNull
    public final synchronized T get() {
        T invoke;
        try {
            if (!this.telemetryDisabled) {
                Function0<Unit> function0 = this.disableForProcess;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m25294constructorimpl(function0.invoke());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m25294constructorimpl(ResultKt.createFailure(th));
                }
            }
            invoke = this.getEnvironment.invoke();
            if (!this.telemetryDisabled) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    this.disableEvents.invoke(invoke);
                    Result.m25294constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m25294constructorimpl(ResultKt.createFailure(th2));
                }
                this.telemetryDisabled = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return invoke;
    }
}
