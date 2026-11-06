package com.amazon.deecomms.messaging.sync;

import android.content.Context;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.messaging.model.Conversation;
import com.amazon.deecomms.messaging.provider.MessagingProviderWrapper;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ConversationSyncHandler {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ConversationSyncHandler.class);
    private ConversationsDownloader mConversationsDownloader;
    private MessagingProviderWrapper mMessagingProvider;

    public ConversationSyncHandler(Context context, String str, String str2) {
        this.mConversationsDownloader = new ConversationsDownloader(str);
        this.mMessagingProvider = new MessagingProviderWrapper(context, str, str2);
    }

    public void syncConversations() {
        long lastUpdatedServerTimeForConversations = this.mMessagingProvider.getLastUpdatedServerTimeForConversations();
        ConversationsDownloader conversationsDownloader = this.mConversationsDownloader;
        List<Conversation> conversationsAscending = lastUpdatedServerTimeForConversations > 0 ? conversationsDownloader.getConversationsAscending(lastUpdatedServerTimeForConversations) : conversationsDownloader.getConversationsDescending(0L);
        if (conversationsAscending == null || conversationsAscending.size() <= 0) {
            LOG.e("Conversation list to be updated is null, returning");
        } else {
            this.mMessagingProvider.syncConversations(conversationsAscending);
        }
    }
}
