package com.amazon.deecomms.messaging.sync;

import android.text.TextUtils;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.common.network.AppUrl;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.ServiceException;
import com.amazon.deecomms.common.util.TimePeriodHelper;
import com.amazon.deecomms.messaging.model.Conversation;
import com.amazon.deecomms.messaging.model.response.ConversationsResponse;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ConversationsDownloader {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ConversationsDownloader.class);
    private String mRegisteredCommsID;
    private TimePeriodHelper mTimePeriodHelper = new TimePeriodHelper();

    public ConversationsDownloader(String str) {
        this.mRegisteredCommsID = str;
    }

    private ConversationsResponse getConversations(long j, long j2, boolean z) {
        String format = MessageFormat.format(AppUrl.GET_CONVERSATIONS_FROM_COMMS_ID, this.mRegisteredCommsID);
        CommsLogger commsLogger = LOG;
        commsLogger.i(" API Suffix " + commsLogger.sensitive(format));
        IHttpClient.Request request = new ACMSClient(MetricKeys.OP_GET_RECENT_CONVO).request(format);
        if (j > 0) {
            request.addQueryParameter(AppUrl.MODIFIED_SINCE_TIME, this.mTimePeriodHelper.convertToISOFormat(j));
        }
        if (j2 > 0) {
            request.addQueryParameter(AppUrl.MODIFIED_BEFORE_TIME, this.mTimePeriodHelper.convertToISOFormat(j2));
        }
        request.addQueryParameter(AppUrl.LATEST, z ? "true" : "false");
        try {
            IHttpClient.Response execute = request.authenticatedAsCurrentCommsUser().addQueryParameter(AppUrl.INCLUDE_HOMEGROUP, Boolean.TRUE.toString()).get().execute();
            try {
                ConversationsResponse conversationsResponse = (ConversationsResponse) execute.convert(ConversationsResponse.class);
                if (conversationsResponse != null && conversationsResponse.getConversations() != null) {
                    commsLogger.i("Downloaded conversations, size: " + conversationsResponse.getConversations().length);
                }
                execute.close();
                return conversationsResponse;
            } catch (Throwable th) {
                if (execute != null) {
                    try {
                        execute.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (ServiceException | IOException e) {
            LOG.e("Exception in httpClient", e);
            return null;
        }
    }

    public List<Conversation> getConversationsAscending(long j) {
        ArrayList arrayList = new ArrayList();
        long j2 = j;
        while (true) {
            ConversationsDownloader conversationsDownloader = this;
            ConversationsResponse conversations = conversationsDownloader.getConversations(j2, 0L, false);
            if (conversations == null || conversations.getConversations() == null || conversations.getConversations().length == 0) {
                break;
            }
            arrayList.addAll(Arrays.asList(conversations.getConversations()));
            if (conversations.getLastPage()) {
                break;
            }
            long j3 = 0;
            for (Conversation conversation : conversations.getConversations()) {
                j3 = Math.max(j3, conversationsDownloader.mTimePeriodHelper.convertTimestampStringToMills(conversation.getLastModifiedTimestamp()));
            }
            j2 = j3 + 1;
            this = conversationsDownloader;
        }
        return arrayList;
    }

    public List<Conversation> getConversationsDescending(long j) {
        ArrayList arrayList = new ArrayList();
        long j2 = j;
        while (true) {
            ConversationsDownloader conversationsDownloader = this;
            ConversationsResponse conversations = conversationsDownloader.getConversations(0L, j2, true);
            if (conversations == null || conversations.getConversations() == null || conversations.getConversations().length == 0) {
                break;
            }
            arrayList.addAll(Arrays.asList(conversations.getConversations()));
            if (conversations.getLastPage()) {
                break;
            }
            long j3 = Long.MAX_VALUE;
            for (Conversation conversation : conversations.getConversations()) {
                if (!TextUtils.isEmpty(conversation.getLastModifiedTimestamp())) {
                    j3 = Math.min(j3, conversationsDownloader.mTimePeriodHelper.convertTimestampStringToMills(conversation.getLastModifiedTimestamp()));
                }
            }
            j2 = j3 - 1;
            this = conversationsDownloader;
        }
        return arrayList;
    }
}
