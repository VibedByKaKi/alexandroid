package com.amazon.deecomms.smsmessaging.service.fetchsms;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import androidx.annotation.NonNull;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SMSFetchManager {
    private Context mContext;

    public SMSFetchManager(@NonNull Context context) {
        this.mContext = context;
    }

    public Cursor getConversationRecipient(int i) {
        return this.mContext.getContentResolver().query(Uri.parse("content://mms-sms/conversations?simple=true"), MessagingControllerConstant.CONVERSATION_RECIPIENT_PROJECTION, a$$ExternalSyntheticOutline0.m(i, "_id = "), null, null);
    }

    public Cursor getConversationUnreadMessages(int i, boolean z) {
        Uri uri;
        String[] strArr;
        if (z) {
            uri = Telephony.Sms.Inbox.CONTENT_URI;
            strArr = MessagingControllerConstant.UNREAD_SMS_CONVERSATION_PROJECTION;
        } else {
            uri = Telephony.Mms.CONTENT_URI;
            strArr = MessagingControllerConstant.UNREAD_MMS_CONVERSATION_PROJECTION;
        }
        return this.mContext.getContentResolver().query(uri, strArr, a$$ExternalSyntheticOutline0.m(i, "thread_id = ", " and read = 0"), null, "_id");
    }

    public Cursor getMMSAddresses(int i) {
        return this.mContext.getContentResolver().query(Uri.parse("content://mms/" + i + "/addr"), MessagingControllerConstant.MMS_ADDRESS_PROJECTION, null, null, "_id");
    }

    public Cursor getMMSPayload(int i) {
        return this.mContext.getContentResolver().query(Uri.parse("content://mms/part"), MessagingControllerConstant.MMS_PAYLOAD_PROJECTION, a$$ExternalSyntheticOutline0.m(i, "mid = "), null, "_id");
    }

    public Cursor getMMSSenderAddress(int i) {
        return this.mContext.getContentResolver().query(Uri.parse("content://mms/" + i + "/addr"), MessagingControllerConstant.MMS_SENDER_ADDRESS_PROJECTION, "type = 137", null, "_id");
    }

    public Cursor getReadMMSCount() {
        return this.mContext.getContentResolver().query(Telephony.Mms.CONTENT_URI, MessagingControllerConstant.COUNT_PROJECTION, "msg_box = 1 and read = 1", null, "_id");
    }

    public Cursor getReadSMSCount() {
        return this.mContext.getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, MessagingControllerConstant.COUNT_PROJECTION, "read = 1", null, "_id");
    }

    public Cursor getSentMMS() {
        return this.mContext.getContentResolver().query(Telephony.Mms.CONTENT_URI, MessagingControllerConstant.PROJECTION, "msg_box = 2", null, "_id");
    }

    public Cursor getSentSMS() {
        return this.mContext.getContentResolver().query(Telephony.Sms.Sent.CONTENT_URI, MessagingControllerConstant.PROJECTION, null, null, "_id");
    }

    public Cursor getTotalMessageCount(boolean z) {
        return this.mContext.getContentResolver().query(z ? Telephony.Sms.CONTENT_URI : Telephony.Mms.CONTENT_URI, MessagingControllerConstant.COUNT_PROJECTION, null, null, "_id");
    }

    public Cursor getUnreadMMS() {
        return this.mContext.getContentResolver().query(Telephony.Mms.CONTENT_URI, MessagingControllerConstant.SEARCH_MMS_CONVERSATION_PROJECTION, "msg_box = 1 and read = 0", null, "_id");
    }

    public Cursor getUnreadSMS() {
        return this.mContext.getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, MessagingControllerConstant.SEARCH_SMS_CONVERSATION_PROJECTION, "read = 0", null, "_id");
    }

    public boolean isUnreadMessagesAvailable() {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            Cursor unreadSMS = getUnreadSMS();
            try {
                cursor2 = getUnreadMMS();
                if (unreadSMS != null && unreadSMS.getCount() > 0) {
                    unreadSMS.close();
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return true;
                }
                if (cursor2 != null) {
                    if (cursor2.getCount() > 0) {
                        if (unreadSMS != null) {
                            unreadSMS.close();
                        }
                        cursor2.close();
                        return true;
                    }
                }
                if (unreadSMS != null) {
                    unreadSMS.close();
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
                cursor2 = unreadSMS;
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
