package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.Window;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/FrameChangeDetector;", "", "requestCopy", "", "window", "Landroid/view/Window;", "onResult", "Lkotlin/Function1;", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange;", "Lkotlin/ParameterName;", "name", "change", "", "reset", "forget", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FrameChangeDetector {
    void forget(@NotNull Window window);

    boolean requestCopy(@NotNull Window window, @NotNull Function1<? super PixelChange, Unit> onResult);

    void reset();
}
