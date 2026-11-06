package com.amazon.deecomms.calling.incallexperiences.storytime.contracts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface StoryTimeButtonViewContract {
    void bindPresenterCallback(StoryTimeButtonPresenterContract storyTimeButtonPresenterContract);

    void hideFloatingStoryTimeButton();

    void showFloatingStoryTimeButton();

    void showStoryTimeMessage(int i);

    void startStoryTime(boolean z);
}
