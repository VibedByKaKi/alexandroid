package com.amazon.alexa.redesign.utils;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/utils/DismissIdBuilder;", "", "<init>", "()V", "buildDismissId", "", "contentId", "contentProvider", "contentType", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DismissIdBuilder {
    public static final int $stable = 0;

    @NotNull
    public static final DismissIdBuilder INSTANCE = new DismissIdBuilder();

    private DismissIdBuilder() {
    }

    @NotNull
    public final String buildDismissId(@NotNull String contentId, @NotNull String contentProvider, @NotNull String contentType) {
        contentId.getClass();
        contentProvider.getClass();
        contentType.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(contentId);
        sb.append("/");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, contentProvider, "/", contentType);
    }
}
