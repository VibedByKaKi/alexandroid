package com.amazon.deecomms.contacts.presence;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda2;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.contacts.presence.ContactPresenceService;
import com.amazon.deecomms.contacts.presence.model.PresenceDocument;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class PresenceReplyHandler extends Handler {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, PresenceReplyHandler.class);
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processMessage, reason: merged with bridge method [inline-methods] */
    public void lambda$handleMessage$0(Message message) {
        switch (message.what) {
            case 101:
                handleReplyActiveCount(message.arg1);
                break;
            case 102:
                Object obj = message.obj;
                if (obj instanceof ContactPresenceService.ContactActivityBannerReply) {
                    ContactPresenceService.ContactActivityBannerReply contactActivityBannerReply = (ContactPresenceService.ContactActivityBannerReply) obj;
                    handleReplyActivityForBanner(contactActivityBannerReply.totalWithPresence, contactActivityBannerReply.totalActive, contactActivityBannerReply.nameForBanner, contactActivityBannerReply.contactCommsId);
                    break;
                }
                break;
            case 103:
                Object obj2 = message.obj;
                if (obj2 instanceof List) {
                    handleReplyActiveContacts((List) obj2);
                    break;
                }
                break;
            case 104:
                Object obj3 = message.obj;
                if (obj3 instanceof List) {
                    handleReplyAllContacts((List) obj3);
                    break;
                }
                break;
            case 105:
                Object obj4 = message.obj;
                if (obj4 instanceof ContactPresenceService.ContactActiveReply) {
                    ContactPresenceService.ContactActiveReply contactActiveReply = (ContactPresenceService.ContactActiveReply) obj4;
                    handleReplyIsContactActive(contactActiveReply.hgCommsId, contactActiveReply.active);
                    break;
                }
                break;
            case 106:
                Object obj5 = message.obj;
                if (obj5 instanceof PresenceDocument) {
                    handleReplyGetContactPresence((PresenceDocument) obj5);
                    break;
                }
                break;
            default:
                LOG.e("PresenceReplyHandler - Unsupported Message Sent - " + message.what);
                break;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Message message2 = new Message();
        message2.copyFrom(message);
        this.mainThreadHandler.post(new RootContext$$ExternalSyntheticLambda2(this, message2, 29));
    }

    public abstract void handleReplyActiveContacts(List<PresenceDocument> list);

    public abstract void handleReplyActiveCount(int i);

    public abstract void handleReplyActivityForBanner(int i, int i2, String str, String str2);

    public abstract void handleReplyAllContacts(List<PresenceDocument> list);

    public abstract void handleReplyGetContactPresence(PresenceDocument presenceDocument);

    public abstract void handleReplyIsContactActive(String str, boolean z);
}
