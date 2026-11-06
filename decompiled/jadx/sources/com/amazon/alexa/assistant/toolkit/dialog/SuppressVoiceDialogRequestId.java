package com.amazon.alexa.assistant.toolkit.dialog;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/dialog/SuppressVoiceDialogRequestId;", "", "<init>", "()V", "MOBILE_TTA_PREFIX", "", "generate", "ensurePrefix", "dialogRequestId", "hasPrefix", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuppressVoiceDialogRequestId {

    @NotNull
    public static final SuppressVoiceDialogRequestId INSTANCE = new SuppressVoiceDialogRequestId();

    @NotNull
    public static final String MOBILE_TTA_PREFIX = "Mobile_TTA_";

    private SuppressVoiceDialogRequestId() {
    }

    @NotNull
    public final String ensurePrefix(@Nullable String dialogRequestId) {
        boolean startsWith$default;
        if (dialogRequestId == null) {
            return generate();
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(dialogRequestId, MOBILE_TTA_PREFIX, false, 2, null);
        return startsWith$default ? dialogRequestId : MOBILE_TTA_PREFIX.concat(dialogRequestId);
    }

    @NotNull
    public final String generate() {
        return TableInfo$$ExternalSyntheticOutline0.m(MOBILE_TTA_PREFIX, UUID.randomUUID());
    }

    public final boolean hasPrefix(@Nullable String dialogRequestId) {
        boolean startsWith$default;
        if (dialogRequestId == null) {
            return false;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(dialogRequestId, MOBILE_TTA_PREFIX, false, 2, null);
        return startsWith$default;
    }
}
