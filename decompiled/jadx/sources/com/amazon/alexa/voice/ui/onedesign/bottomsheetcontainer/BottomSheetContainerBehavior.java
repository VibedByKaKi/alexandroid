package com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BottomSheetContainerBehavior implements BottomSheetContainerBehaviorModel {
    private final boolean canHide;
    private final boolean isFullScreen;
    private final boolean shouldFitToContents;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        boolean canHide;
        boolean isFullScreen;
        boolean shouldFitToContents;

        public BottomSheetContainerBehavior build() {
            return new BottomSheetContainerBehavior(this);
        }

        public Builder canHide(boolean z) {
            this.canHide = z;
            return this;
        }

        public Builder isFullScreen(boolean z) {
            this.isFullScreen = z;
            return this;
        }

        public Builder shouldFitToContents(boolean z) {
            this.shouldFitToContents = z;
            return this;
        }
    }

    public BottomSheetContainerBehavior(Builder builder) {
        this.shouldFitToContents = builder.shouldFitToContents;
        this.canHide = builder.canHide;
        this.isFullScreen = builder.isFullScreen;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BottomSheetContainerBehavior.class != obj.getClass()) {
            return false;
        }
        BottomSheetContainerBehavior bottomSheetContainerBehavior = (BottomSheetContainerBehavior) obj;
        return this.shouldFitToContents == bottomSheetContainerBehavior.shouldFitToContents && this.canHide == bottomSheetContainerBehavior.canHide && this.isFullScreen == bottomSheetContainerBehavior.isFullScreen;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerBehaviorModel
    public boolean getCanHide() {
        return this.canHide;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerBehaviorModel
    public boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerBehaviorModel
    public boolean getShouldFitToContents() {
        return this.shouldFitToContents;
    }

    public int hashCode() {
        return ((((JfifUtil.MARKER_EOI + (this.shouldFitToContents ? 1 : 0)) * 31) + (this.canHide ? 1 : 0)) * 31) + (this.isFullScreen ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetContainerBehavior{shouldFitToContents=");
        sb.append(this.shouldFitToContents);
        sb.append(", canHide=");
        sb.append(this.canHide);
        sb.append(", isFullScreen=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isFullScreen, AbstractJsonLexerKt.END_OBJ);
    }
}
