package com.amazon.alexa.accessorykit.interprocess;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SMSFetchManager {
    private static final int UNREAD_MESSAGE = 0;
    private Context mContext;
    private static final String[] SEARCH_SMS_CONVERSATION_PROJECTION = {"_id", "thread_id", "date"};
    private static final String[] SEARCH_MMS_CONVERSATION_PROJECTION = {"_id", "thread_id", "date"};
    private static final String[] MMS_ADDRESS_PROJECTION = {"address", "type"};
    private static final String[] CONVERSATION_RECIPIENT_PROJECTION = {"recipient_ids"};

    public SMSFetchManager(Context context) {
        Preconditions.notNull(context, "context");
        this.mContext = context;
    }

    public Cursor getConversationRecipient(int i) {
        return this.mContext.getContentResolver().query(Uri.parse("content://mms-sms/conversations?simple=true"), CONVERSATION_RECIPIENT_PROJECTION, a$$ExternalSyntheticOutline0.m(i, "_id = "), null, null);
    }

    public Cursor getMMSAddresses(int i) {
        return this.mContext.getContentResolver().query(Uri.parse("content://mms/" + i + "/addr"), MMS_ADDRESS_PROJECTION, null, null, "_id");
    }

    public Cursor getUnreadMMS() {
        return this.mContext.getContentResolver().query(Telephony.Mms.CONTENT_URI, SEARCH_MMS_CONVERSATION_PROJECTION, "msg_box = 1 and read = 0", null, "_id");
    }

    public Cursor getUnreadSMS() {
        return this.mContext.getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, SEARCH_SMS_CONVERSATION_PROJECTION, "read = 0", null, "_id");
    }
}
