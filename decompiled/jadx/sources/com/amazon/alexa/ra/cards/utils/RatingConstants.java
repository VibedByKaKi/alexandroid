package com.amazon.alexa.ra.cards.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/cards/utils/RatingConstants;", "", "<init>", "()V", "MIN_RATING", "", "MAX_RATING", "TOTAL_STARS", "", "HALF_STAR_THRESHOLD", "EMPTY_STAR_ALPHA", "ICON_STAR_FILLED", "", "ICON_STAR_HALF", "ICON_STAR_EMPTY", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class RatingConstants {
    public static final int $stable = 0;
    public static final float EMPTY_STAR_ALPHA = 0.3f;
    public static final float HALF_STAR_THRESHOLD = 0.5f;

    @NotNull
    public static final String ICON_STAR_EMPTY = "star_off";

    @NotNull
    public static final String ICON_STAR_FILLED = "star_on";

    @NotNull
    public static final String ICON_STAR_HALF = "star_half";

    @NotNull
    public static final RatingConstants INSTANCE = new RatingConstants();
    public static final float MAX_RATING = 5.0f;
    public static final float MIN_RATING = 0.0f;
    public static final int TOTAL_STARS = 5;

    private RatingConstants() {
    }
}
