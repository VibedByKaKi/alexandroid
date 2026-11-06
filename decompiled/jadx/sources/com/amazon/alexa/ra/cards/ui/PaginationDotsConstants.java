package com.amazon.alexa.ra.cards.ui;

import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/cards/ui/PaginationDotsConstants;", "", "<init>", "()V", "ANIMATION_DURATION_MS", "", "SMALL_DOT_SCALE", "", "INACTIVE_DOT_ALPHA", "ANIMATION_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getANIMATION_EASING", "()Landroidx/compose/animation/core/CubicBezierEasing;", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class PaginationDotsConstants {
    public static final int ANIMATION_DURATION_MS = 1200;
    public static final float INACTIVE_DOT_ALPHA = 0.4f;
    public static final float SMALL_DOT_SCALE = 0.5f;

    @NotNull
    public static final PaginationDotsConstants INSTANCE = new PaginationDotsConstants();

    @NotNull
    private static final CubicBezierEasing ANIMATION_EASING = new CubicBezierEasing(0.2f, 0.2f, 0.2f, 1.0f);

    private PaginationDotsConstants() {
    }

    @NotNull
    public final CubicBezierEasing getANIMATION_EASING() {
        return ANIMATION_EASING;
    }
}
