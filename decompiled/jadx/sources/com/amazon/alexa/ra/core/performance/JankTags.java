package com.amazon.alexa.ra.core.performance;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/performance/JankTags;", "", "<init>", "()V", "INTERACTION_IN_PROGRESS", "", "VOICE_CHROME_ANIMATING", "FRAGMENT_SCROLL_IN_PROGRESS", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class JankTags {
    public static final int $stable = 0;

    @NotNull
    public static final String FRAGMENT_SCROLL_IN_PROGRESS = "fragment_scroll_in_progress";

    @NotNull
    public static final JankTags INSTANCE = new JankTags();

    @NotNull
    public static final String INTERACTION_IN_PROGRESS = "interaction_in_progress";

    @NotNull
    public static final String VOICE_CHROME_ANIMATING = "voice_chrome_animating";

    private JankTags() {
    }
}
