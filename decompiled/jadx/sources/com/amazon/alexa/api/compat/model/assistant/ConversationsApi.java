package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class ConversationsApi {
    public abstract void deleteConversations(ArrayList<String> arrayList, Bundle bundle, String str);

    public abstract void deleteFragments(String str, Bundle bundle);

    public abstract void getFragments(Bundle bundle, String str);

    public abstract void publishConversationStateJson(String str);

    public abstract void sendEvent(String str, Bundle bundle, String str2);

    public abstract void updateConversations(Bundle bundle, String str);

    public abstract void updateEntitlementStatus(boolean z, String str);
}
