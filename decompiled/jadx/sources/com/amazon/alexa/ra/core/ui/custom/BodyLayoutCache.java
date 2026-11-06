package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/BodyLayoutCache;", "", "<init>", "()V", "maxWidth", "", "getMaxWidth", "()I", "setMaxWidth", "(I)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "result", "Landroidx/compose/ui/text/TextLayoutResult;", "getResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "matches", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class BodyLayoutCache {

    @Nullable
    private LayoutDirection layoutDirection;

    @Nullable
    private TextLayoutResult result;
    private int maxWidth = -1;
    private float density = -1.0f;
    private float fontScale = -1.0f;

    public final float getDensity() {
        return this.density;
    }

    public final float getFontScale() {
        return this.fontScale;
    }

    @Nullable
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    @Nullable
    public final TextLayoutResult getResult() {
        return this.result;
    }

    public final boolean matches(int maxWidth, float density, float fontScale, @NotNull LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        return this.result != null && this.maxWidth == maxWidth && this.density == density && this.fontScale == fontScale && this.layoutDirection == layoutDirection;
    }

    public final void setDensity(float f) {
        this.density = f;
    }

    public final void setFontScale(float f) {
        this.fontScale = f;
    }

    public final void setLayoutDirection(@Nullable LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final void setResult(@Nullable TextLayoutResult textLayoutResult) {
        this.result = textLayoutResult;
    }
}
