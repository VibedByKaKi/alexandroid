package com.amazon.alexa.assistant.ui.conversation.source;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"FIRE_OS_MANUFACTURER", "", "isHeaderSwipeDownSupported", "", "manufacturer", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HeaderSwipeDownSupportKt {

    @NotNull
    private static final String FIRE_OS_MANUFACTURER = "Amazon";

    public static final boolean isHeaderSwipeDownSupported(@Nullable String str) {
        return !Intrinsics.areEqual(str, "Amazon");
    }
}
