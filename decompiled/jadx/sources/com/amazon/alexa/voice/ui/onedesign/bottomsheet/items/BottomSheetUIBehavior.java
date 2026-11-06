package com.amazon.alexa.voice.ui.onedesign.bottomsheet.items;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetUIBehavior {
    private boolean isFitToContents;
    private boolean isFullScreen;
    private boolean isHideable;

    public BottomSheetUIBehavior(boolean z, boolean z2, boolean z3) {
        this.isFitToContents = z;
        this.isHideable = z2;
        this.isFullScreen = z3;
    }

    public boolean isFitToContents() {
        return this.isFitToContents;
    }

    public boolean isFullScreen() {
        return this.isFullScreen;
    }

    public boolean isHideable() {
        return this.isHideable;
    }
}
