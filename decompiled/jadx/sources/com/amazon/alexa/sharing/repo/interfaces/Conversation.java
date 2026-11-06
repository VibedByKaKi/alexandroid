package com.amazon.alexa.sharing.repo.interfaces;

import com.amazon.alexa.sharing.repo.models.Result;
import com.amazon.alexa.sharing.repo.models.SortOrder;
import com.amazon.alexa.sharing.repo.models.acms.ACMSMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface Conversation {
    Conversation[] getAllConversations();

    String getConversationId(String[] strArr);

    ACMSMessage[] getMessagesForConversation(String str, String str2, int i, Boolean bool, SortOrder sortOrder);

    void openCommsHome(boolean z);

    void openConversation(String str);

    Result sendMessage(String str, String str2);
}
