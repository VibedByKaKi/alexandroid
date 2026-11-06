package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LanguageCombinationListItem {
    private final LanguageGroup languageGroup;
    private boolean selected;

    public LanguageCombinationListItem(@NonNull LanguageGroup languageGroup, boolean z) {
        this.languageGroup = languageGroup;
        this.selected = z;
    }

    public LanguageGroup getLanguageGroup() {
        return this.languageGroup;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
