package com.amazon.alexa.assistant.ui.conversation.ftux;

import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxCache;", "", "warm", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requiredFtuxExperience", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxExperience;", MetricsConstants.Method.CACHE_CLEAR, "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FtuxCache {
    void clear();

    @Nullable
    Object requiredFtuxExperience(@NotNull Continuation<? super FtuxExperience> continuation);

    @Nullable
    Object warm(@NotNull Continuation<? super Unit> continuation);
}
