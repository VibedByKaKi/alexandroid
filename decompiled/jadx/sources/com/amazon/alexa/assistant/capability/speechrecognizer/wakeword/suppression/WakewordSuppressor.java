package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.suppression;

import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/suppression/WakewordSuppressor;", "", "wakewordSuppressedFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "getWakewordSuppressedFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakewordSuppressor {
    @NotNull
    StateFlow<Boolean> getWakewordSuppressedFlow();
}
