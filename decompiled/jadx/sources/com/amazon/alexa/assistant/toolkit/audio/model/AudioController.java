package com.amazon.alexa.assistant.toolkit.audio.model;

import com.amazon.alexa.assistant.foundation.model.AudioControllerConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/audio/model/AudioController;", "", "recordPermission", "Lcom/amazon/alexa/assistant/toolkit/audio/model/RecordPermission;", "getRecordPermission", "()Lcom/amazon/alexa/assistant/toolkit/audio/model/RecordPermission;", "isExternalMediaPlaying", "", "()Z", "requestFocus", "Lkotlin/Result;", "", "configuration", "Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;", "requestFocus-IoAF18A", "(Lcom/amazon/alexa/assistant/foundation/model/AudioControllerConfiguration;)Ljava/lang/Object;", "releaseFocus", "releaseFocus-d1pmJ48", "()Ljava/lang/Object;", "cleanup", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AudioController {
    void cleanup();

    @NotNull
    RecordPermission getRecordPermission();

    boolean isExternalMediaPlaying();

    @NotNull
    /* renamed from: releaseFocus-d1pmJ48 */
    Object mo15085releaseFocusd1pmJ48();

    @NotNull
    /* renamed from: requestFocus-IoAF18A */
    Object mo15086requestFocusIoAF18A(@NotNull AudioControllerConfiguration configuration);
}
