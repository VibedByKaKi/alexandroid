package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.davs;

import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.davs.model.DAVSModelDownloadResult;
import com.amazon.alexa.assistant.toolkit.session.davs.filters.DavsFilter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/DAVSModelDownloader;", "", "downloadModel", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/davs/model/DAVSModelDownloadResult;", "localChecksum", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFilter", "", "filter", "Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DavsFilter;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DAVSModelDownloader {
    @Nullable
    Object downloadModel(@Nullable String str, @NotNull Continuation<? super DAVSModelDownloadResult> continuation);

    void updateFilter(@NotNull DavsFilter filter);
}
