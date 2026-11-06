package com.amazon.alexa.ra.core.features.dictation;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/AudioCaptureSource;", "", "start", "Lkotlinx/coroutines/flow/Flow;", "", "stop", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AudioCaptureSource {
    @NotNull
    Flow<byte[]> start();

    void stop();
}
