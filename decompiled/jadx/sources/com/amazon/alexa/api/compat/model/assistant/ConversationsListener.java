package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class ConversationsListener {
    public abstract void onAddFragments(String str, String str2);

    public abstract void onConversationUpdated(String str, String str2);

    public abstract void onConversationsUpdated(Bundle bundle, String str);

    public abstract void onDeleteConversations(String str, String str2);

    public abstract void onFragmentRenderingPaused(String str);

    public abstract void onFragmentRenderingResumed(String str);

    public abstract void onFragments(Bundle bundle, String str, Bundle bundle2);

    public abstract void onPersonalityDisplay(String str, String str2);

    public abstract void onPersonalizedContent(String str, String str2);

    public abstract void onRequestResult(Bundle bundle);

    public abstract void onUpdateConversationMetadata(String str, String str2);

    public abstract void onUpdateFragmentData(String str, String str2);
}
