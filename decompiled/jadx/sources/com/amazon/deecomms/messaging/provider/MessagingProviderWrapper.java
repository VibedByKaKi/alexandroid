package com.amazon.deecomms.messaging.provider;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.CommsInternal;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.util.JacksonJSONConverter;
import com.amazon.deecomms.common.util.TimePeriodHelper;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.messaging.model.Conversation;
import com.amazon.deecomms.messaging.model.Message;
import com.amazon.deecomms.messaging.model.client.ClientConversation;
import com.amazon.deecomms.messaging.model.client.ClientMessage;
import com.amazon.deecomms.messaging.model.payload.MessagePayload;
import com.amazon.deecomms.messaging.provider.MessagingProviderContract;
import com.amazon.deecomms.notifications.TranscriptLatencyMetricHelper;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MessagingProviderWrapper {
    private static final long CLIENT_ID_DEFAULT_DB_VALUE = 0;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MessagingContentProvider.class);
    private Context mContext;
    private String mHomeGroupId;
    private String mRegisteredCommsId;

    @Inject
    TranscriptLatencyMetricHelper mTranscriptLatencyMetricHelper;
    private IHttpClient.JSONConverter mJsonConverter = new JacksonJSONConverter();
    private TimePeriodHelper mTimePeriodHelper = new TimePeriodHelper();

    public MessagingProviderWrapper(Context context, String str, String str2) {
        this.mContext = context;
        this.mRegisteredCommsId = str;
        this.mHomeGroupId = str2;
        CommsDaggerWrapper.getComponent().inject(this);
    }

    public static void addClientMessageId(@NonNull Message message, @NonNull ContentValues contentValues) {
        if (message.getClientMessageId() != null) {
            contentValues.put("client_message_id", message.getClientMessageId());
        }
    }

    private ContentValues convertClientConversation(ClientConversation clientConversation) {
        ContentValues convertConversationCommonProperties = convertConversationCommonProperties(clientConversation);
        String recipientId = clientConversation.getRecipientId();
        if (recipientId == null) {
            recipientId = "";
        }
        convertConversationCommonProperties.put("recipient_id", recipientId);
        convertConversationCommonProperties.put("_id", Long.valueOf(clientConversation.getUniqueId()));
        convertConversationCommonProperties.put("server_last_modified_timestamp", Long.valueOf(this.mTimePeriodHelper.convertTimestampStringToMills(clientConversation.getServerLastModifiedTime())));
        convertConversationCommonProperties.put("server_last_msg_id", Long.valueOf(clientConversation.getServerLastMsgId()));
        convertConversationCommonProperties.put("last_sync_msg_id", Long.valueOf(clientConversation.getLastSyncMsgId()));
        convertConversationCommonProperties.put("last_msg_sender_id", clientConversation.getLastMsgSender());
        convertConversationCommonProperties.put("last_msg_type", clientConversation.getLastMsgType());
        return convertConversationCommonProperties;
    }

    private ContentValues convertClientMessage(ClientMessage clientMessage) {
        ContentValues convertMessageCommonProperties = convertMessageCommonProperties(clientMessage);
        convertMessageCommonProperties.put("client_id", Long.valueOf(clientMessage.getClientID()));
        convertMessageCommonProperties.put("sync_status", Integer.valueOf(clientMessage.getSyncStatus()));
        String recipientID = clientMessage.getRecipientID();
        if (recipientID != null) {
            convertMessageCommonProperties.put("recipient_id", recipientID);
            return convertMessageCommonProperties;
        }
        convertMessageCommonProperties.put("recipient_id", "");
        return convertMessageCommonProperties;
    }

    private ContentValues convertConversation(Conversation conversation) {
        ContentValues convertConversationCommonProperties = convertConversationCommonProperties(conversation);
        String recipientIDFromParticipants = getRecipientIDFromParticipants(conversation.getParticipants(), this.mRegisteredCommsId, this.mHomeGroupId);
        if (recipientIDFromParticipants == null) {
            recipientIDFromParticipants = "";
        }
        convertConversationCommonProperties.put("recipient_id", recipientIDFromParticipants);
        return convertConversationCommonProperties;
    }

    private ContentValues convertConversationCommonProperties(Conversation conversation) {
        String str;
        ContentValues contentValues = new ContentValues();
        String conversationId = conversation.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        contentValues.put("conversation_id", conversationId);
        contentValues.put("last_msg_id", Long.valueOf(conversation.getLastMsgId()));
        contentValues.put("last_sequence_id", Long.valueOf(conversation.getLastSequenceId()));
        Message lastMsg = conversation.getLastMsg();
        if (lastMsg != null) {
            r2 = lastMsg.getPayload() != null ? lastMsg.getPayload().getSummaryText(this.mContext) : null;
            str = lastMsg.getSenderCommsId();
        } else {
            str = null;
        }
        contentValues.put("last_msg", r2);
        contentValues.put("last_msg_sender_id", str);
        contentValues.put("unread_notif_count", Integer.valueOf(conversation.getUnreadNotificationCount()));
        contentValues.put("unread_msg_count", Integer.valueOf(conversation.getUnreadMsgCount()));
        contentValues.put("last_modified_timestamp", Long.valueOf(this.mTimePeriodHelper.convertTimestampStringToMills(conversation.getLastModifiedTimestamp())));
        contentValues.put(MessagingProviderContract.Conversations.PARTICIPANTS_LIST, TextUtils.join(Constants.GROUP_CONCAT_SEPARATOR, conversation.getParticipants()));
        contentValues.put("send_as_comms_id", conversation.getSendAsCommsId());
        contentValues.put("view_as_comms_id", conversation.getViewAsCommsId());
        if (conversation.getLastReadStatusMap() != null && conversation.getLastReadStatusMap().containsKey(CommsInternal.getInstance().getCommsId())) {
            contentValues.put("last_read_msg_id", conversation.getLastReadStatusMap().get(CommsInternal.getInstance().getCommsId()));
        }
        contentValues.put(MessagingProviderContract.Conversations.LAST_READ_STATUS_LIST, getLastReadStatusString(conversation.getLastReadStatusMap()));
        return contentValues;
    }

    private ContentValues[] convertConversations(Conversation[] conversationArr) {
        if (conversationArr == null) {
            return null;
        }
        ContentValues[] contentValuesArr = new ContentValues[conversationArr.length];
        for (int i = 0; i < conversationArr.length; i++) {
            contentValuesArr[i] = convertConversation(conversationArr[i]);
        }
        return contentValuesArr;
    }

    private ContentValues convertMessage(Message message, String str, String str2) {
        ContentValues convertMessageCommonProperties = convertMessageCommonProperties(message);
        convertMessageCommonProperties.put("client_id", (Long) 0L);
        convertMessageCommonProperties.put("sync_status", (Integer) 0);
        if (str != null) {
            convertMessageCommonProperties.put("recipient_id", str);
        } else {
            convertMessageCommonProperties.put("recipient_id", "");
        }
        if (str2 != null) {
            convertMessageCommonProperties.put("view_as_comms_id", str2);
        }
        return convertMessageCommonProperties;
    }

    private ContentValues convertMessageCommonProperties(Message message) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_id", message.getConversationId());
        contentValues.put("message_id", Long.valueOf(message.getMessageId()));
        contentValues.put("_time", Long.valueOf(this.mTimePeriodHelper.convertTimestampStringToMills(message.getTime())));
        contentValues.put("_type", message.getType());
        contentValues.put("sender_comms_id", message.getSenderCommsId());
        contentValues.put("_payload", this.mJsonConverter.toJson(message.getPayload()));
        addClientMessageId(message, contentValues);
        return contentValues;
    }

    private String getLastReadStatusString(Map<String, Integer> map) {
        return this.mJsonConverter.toJson(map);
    }

    public static String getRecipientIDFromParticipants(String[] strArr, String str, String str2) {
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 1 && str.contentEquals(strArr[0])) {
            return str;
        }
        if (strArr.length == 1 && str2.contentEquals(strArr[0])) {
            return str2;
        }
        if (strArr.length != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        } else if (arrayList.contains(str2)) {
            arrayList.remove(str2);
        }
        return (String) arrayList.get(0);
    }

    public void deleteAllConversations() {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newDelete(MessagingProviderContract.Conversations.getContentUri(this.mContext)).build());
        arrayList.add(ContentProviderOperation.newDelete(MessagingProviderContract.Messages.getContentUri(this.mContext)).build());
        try {
            this.mContext.getContentResolver().applyBatch(MessagingProviderContract.getAuthorityId(this.mContext), arrayList);
        } catch (OperationApplicationException | RemoteException e) {
            LOG.e("Error clearing messages database.", e);
        }
    }

    public int deleteClientMessage(long j) {
        return this.mContext.getContentResolver().delete(MessagingProviderContract.Messages.getContentUri(this.mContext), "_id = ?", new String[]{String.valueOf(j)});
    }

    public int deleteConversation(long j) {
        return this.mContext.getContentResolver().delete(MessagingProviderContract.Conversations.getContentUri(this.mContext), "_id = ?", new String[]{String.valueOf(j)});
    }

    public ClientConversation getClientConversation(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("conversation_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("recipient_id"));
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string3 = cursor.getString(cursor.getColumnIndex("last_msg"));
        String string4 = cursor.getString(cursor.getColumnIndex("last_msg_type"));
        long j2 = cursor.getLong(cursor.getColumnIndex("last_modified_timestamp"));
        int i = cursor.getInt(cursor.getColumnIndex("unread_msg_count"));
        long j3 = cursor.getLong(cursor.getColumnIndex("last_msg_id"));
        long j4 = cursor.getLong(cursor.getColumnIndex("last_sequence_id"));
        int i2 = cursor.getInt(cursor.getColumnIndex("unread_notif_count"));
        String string5 = cursor.getString(cursor.getColumnIndex("send_as_comms_id"));
        String string6 = cursor.getString(cursor.getColumnIndex("view_as_comms_id"));
        long j5 = cursor.getLong(cursor.getColumnIndex("server_last_modified_timestamp"));
        int i3 = cursor.getInt(cursor.getColumnIndex("server_last_msg_id"));
        long j6 = cursor.getLong(cursor.getColumnIndex("last_sync_msg_id"));
        String string7 = cursor.getString(cursor.getColumnIndex("last_msg_sender_id"));
        long j7 = cursor.getLong(cursor.getColumnIndex("last_read_msg_id"));
        long j8 = cursor.getLong(cursor.getColumnIndex("read_message_locally_only"));
        ClientConversation clientConversation = new ClientConversation();
        clientConversation.setUniqueId(j);
        clientConversation.setRecipientId(string2);
        clientConversation.setConversationId(string);
        clientConversation.setLastMsgId(j3);
        clientConversation.setLastSequenceId(j4);
        clientConversation.setLastMsgStr(string3);
        clientConversation.setLastMsgType(string4);
        clientConversation.setLastModifiedTimestamp(this.mTimePeriodHelper.convertToISOFormat(j2));
        clientConversation.setUnreadMsgCount(i);
        clientConversation.setSendAsCommsId(string5);
        clientConversation.setViewAsCommsId(string6);
        clientConversation.setUnreadNotificationCount(i2);
        clientConversation.setServerLastModifiedTime(this.mTimePeriodHelper.convertToISOFormat(j5));
        clientConversation.setServerLastMsgId(i3);
        clientConversation.setLastSyncMsgId(j6);
        clientConversation.setLastMsgSender(string7);
        clientConversation.setLastReadMsgId(j7);
        clientConversation.setReadMsgLocallyOnly(j8);
        return clientConversation;
    }

    public ClientConversation getConversation(String str, String str2, String str3) {
        String str4;
        ArrayList arrayList = new ArrayList();
        ClientConversation clientConversation = null;
        if (str == null) {
            if (str2 != null) {
                arrayList.add(str2);
                if (str3 != null) {
                    arrayList.add(str3);
                    str4 = "conversations.recipient_id = ? AND conversations.send_as_comms_id = ?";
                } else {
                    str4 = "conversations.recipient_id = ?";
                }
            }
            return clientConversation;
        }
        arrayList.add(str);
        str4 = "conversations.conversation_id = ?";
        Cursor query = this.mContext.getContentResolver().query(MessagingProviderContract.Conversations.getConversationContentUri(this.mContext), null, str4, (String[]) arrayList.toArray(new String[arrayList.size()]), null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    clientConversation = getClientConversation(query);
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        return clientConversation;
    }

    public long getLastUpdatedServerTimeForConversations() {
        Cursor query = this.mContext.getContentResolver().query(MessagingProviderContract.Conversations.getLastUpdatedServerTimeUri(this.mContext), null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    long j = query.getLong(query.getColumnIndex(MessagingProviderContract.Conversations.LAST_UPDATED_SERVER_TIME_ALIAS));
                    query.close();
                    return j;
                }
            } finally {
            }
        }
        if (query == null) {
            return -1L;
        }
        query.close();
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getLatestReadMessage(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String[] r4 = new java.lang.String[]{r7}
            android.content.Context r7 = r6.mContext
            android.content.ContentResolver r0 = r7.getContentResolver()
            android.content.Context r6 = r6.mContext
            android.net.Uri r1 = com.amazon.deecomms.messaging.provider.MessagingProviderContract.Messages.getMostRecentMessageContentUri(r6)
            java.lang.String r3 = "conversation_id = ?"
            r5 = 0
            r2 = 0
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L38
            boolean r7 = r6.moveToNext()     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L38
            java.lang.String r7 = "max_message_id"
            int r7 = r6.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L2c
            long r0 = r6.getLong(r7)     // Catch: java.lang.Throwable -> L2c
            goto L3a
        L2c:
            r0 = move-exception
            r7 = r0
            r6.close()     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r0 = move-exception
            r6 = r0
            r7.addSuppressed(r6)
        L37:
            throw r7
        L38:
            r0 = -1
        L3a:
            if (r6 == 0) goto L3f
            r6.close()
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.messaging.provider.MessagingProviderWrapper.getLatestReadMessage(java.lang.String):long");
    }

    public <T extends MessagePayload> T getMessagePayload(@NonNull String str, long j, @NonNull Class<T> cls) {
        T t = null;
        try {
            Cursor query = this.mContext.getContentResolver().query(MessagingProviderContract.Messages.getContentUri(this.mContext), new String[]{"_payload"}, "conversation_id = ? AND message_id = ? AND _type = ?", new String[]{str, String.valueOf(j), cls.newInstance().getType()}, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("_payload");
                    if (columnIndex != -1 && query.moveToFirst()) {
                        t = (T) this.mJsonConverter.fromJson(query.getString(columnIndex), cls);
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
            return t;
        } catch (IllegalAccessException unused) {
            LOG.e("Cannot instantiate an object of class " + cls);
            return null;
        } catch (InstantiationException unused2) {
            LOG.e("Cannot instantiate an object of class " + cls);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getMessageType(@androidx.annotation.NonNull java.lang.String r8, long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "_type"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String[] r5 = new java.lang.String[]{r8, r9}
            android.content.Context r8 = r7.mContext
            android.content.ContentResolver r1 = r8.getContentResolver()
            android.content.Context r7 = r7.mContext
            android.net.Uri r2 = com.amazon.deecomms.messaging.provider.MessagingProviderContract.Messages.getContentUri(r7)
            java.lang.String r4 = "conversation_id = ? AND message_id = ?"
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)
            if (r7 == 0) goto L41
            int r8 = r7.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L35
            r9 = -1
            if (r8 == r9) goto L41
            boolean r9 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L41
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L35
            goto L42
        L35:
            r0 = move-exception
            r8 = r0
            r7.close()     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)
        L40:
            throw r8
        L41:
            r8 = 0
        L42:
            if (r7 == 0) goto L47
            r7.close()
        L47:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.messaging.provider.MessagingProviderWrapper.getMessageType(java.lang.String, long):java.lang.String");
    }

    @NonNull
    public List<String> getParticipantsInConversation(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.mContext.getContentResolver().query(MessagingProviderContract.Participants.getParticipantsCommsidInConversationUri(this.mContext), null, null, new String[]{str}, null);
        try {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList.add(query.getString(0));
                query.moveToNext();
            }
            query.close();
            return arrayList;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public List<ClientConversation> getUnsyncedConversations() {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.mContext.getContentResolver().query(MessagingProviderContract.Conversations.getConversationContentUri(this.mContext), null, "last_sync_msg_id is NULL OR last_sync_msg_id < server_last_msg_id", null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(getClientConversation(query));
            } catch (Throwable th) {
                if (query == null) {
                    throw th;
                }
                try {
                    query.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        query.close();
        return arrayList;
    }

    public long insertClientConversationAndParticipants(ClientConversation clientConversation) {
        if (clientConversation == null) {
            return 0L;
        }
        return ContentUris.parseId(this.mContext.getContentResolver().insert(MessagingProviderContract.Conversations.getContentUri(this.mContext), convertClientConversation(clientConversation)));
    }

    public long insertClientMessage(ClientMessage clientMessage, String str) {
        if (clientMessage == null) {
            return 0L;
        }
        ContentValues convertClientMessage = convertClientMessage(clientMessage);
        convertClientMessage.put("view_as_comms_id", str);
        return ContentUris.parseId(this.mContext.getContentResolver().insert(MessagingProviderContract.Messages.getContentUri(this.mContext), convertClientMessage));
    }

    public void insertMessages(List<Message> list, String str, String str2) {
        if (list == null) {
            return;
        }
        ContentValues[] contentValuesArr = new ContentValues[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Message message = list.get(i);
            contentValuesArr[i] = convertMessage(message, str, str2);
            this.mTranscriptLatencyMetricHelper.startTimer(message);
        }
        this.mContext.getContentResolver().bulkInsert(MessagingProviderContract.Messages.getContentUri(this.mContext), contentValuesArr);
    }

    public void syncConversations(List<Conversation> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Conversation conversation : list) {
            if (conversation.getFirstVisibleMessageId() <= conversation.getLastMsgId()) {
                arrayList.add(conversation);
            }
        }
        ContentValues[] convertConversations = convertConversations((Conversation[]) arrayList.toArray(new Conversation[arrayList.size()]));
        for (ContentValues contentValues : convertConversations) {
            Long asLong = contentValues.getAsLong("last_modified_timestamp");
            asLong.getClass();
            contentValues.put("server_last_modified_timestamp", asLong);
            contentValues.putNull("last_modified_timestamp");
            Long asLong2 = contentValues.getAsLong("last_msg_id");
            asLong2.getClass();
            contentValues.put("server_last_msg_id", asLong2);
            contentValues.putNull("last_msg_id");
        }
        this.mContext.getContentResolver().bulkInsert(MessagingProviderContract.Conversations.getConversationSyncUri(this.mContext), convertConversations);
    }

    public void updateClientConversationAndParticipants(long j, ContentValues contentValues) {
        this.mContext.getContentResolver().update(MessagingProviderContract.Conversations.getContentUri(this.mContext), contentValues, "_id = ?", new String[]{String.valueOf(j)});
    }

    public void updateClientMessage(long j, ContentValues contentValues) {
        this.mContext.getContentResolver().update(MessagingProviderContract.Messages.getContentUri(this.mContext), contentValues, "_id = ?", new String[]{String.valueOf(j)});
    }

    public void updateMessagePayload(@NonNull ClientConversation clientConversation, long j, @NonNull MessagePayload messagePayload) {
        String messageType = getMessageType(clientConversation.getConversationId(), j);
        if (messageType == null || !messageType.equals(messagePayload.getType())) {
            LOG.e(a$$ExternalSyntheticOutline0.m("Payload type (", messagePayload.getType(), ") doesn't match message type (", messageType, "), cannot update payload."));
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_payload", this.mJsonConverter.toJson(messagePayload));
        updateClientMessage(clientConversation.getConversationId(), j, contentValues);
        if (clientConversation.getLastMsgId() == j) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("last_msg", messagePayload.getSummaryText(this.mContext));
            updateClientConversationAndParticipants(clientConversation.getConversationId(), contentValues2);
        }
    }

    public int updateClientConversationAndParticipants(String str, ContentValues contentValues) {
        return this.mContext.getContentResolver().update(MessagingProviderContract.Conversations.getContentUri(this.mContext), contentValues, "conversation_id = ?", new String[]{str});
    }

    public void updateClientMessage(@NonNull String str, long j, @NonNull ContentValues contentValues) {
        this.mContext.getContentResolver().update(MessagingProviderContract.Messages.getContentUri(this.mContext), contentValues, "conversation_id = ? AND message_id = ?", new String[]{str, String.valueOf(j)});
    }
}
