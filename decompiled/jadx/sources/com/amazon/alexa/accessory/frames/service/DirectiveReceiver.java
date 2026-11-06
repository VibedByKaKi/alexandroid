package com.amazon.alexa.accessory.frames.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective;
import com.amazon.alexa.accessory.notificationpublisher.directiveconsumer.DirectiveConstants;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DirectiveReceiver extends BroadcastReceiver {
    private static final String TAG = "DirectiveReceiver";
    DirectiveConsumer consumer = new DirectiveConsumer();

    private boolean isValidIntent(@NonNull Intent intent) {
        return intent != null && DirectiveConstants.INTENT_ACTION_ROUTE_DIRECTIVE.equals(intent.getAction());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        if (!isValidIntent(intent)) {
            Log.w(TAG, "receive invalid intent");
            return;
        }
        try {
            if (this.consumer.consumeDirective(new AnnounceWithContentDirective() { // from class: com.amazon.alexa.accessory.frames.service.DirectiveReceiver.1
                @Override // com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective
                public String getAnnouncementUri() {
                    return intent.getStringExtra(DirectiveConstants.INTENT_KEY_ANNOUNCEMENT_URI);
                }

                @Override // com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective
                public String getContentUri() {
                    return intent.getStringExtra(DirectiveConstants.INTENT_KEY_CONTENT_URI);
                }

                @Override // com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective
                public String getName() {
                    return intent.getStringExtra(DirectiveConstants.INTENT_KEY_DIRECTIVE_NAME);
                }

                @Override // com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective
                public String getNamespace() {
                    return intent.getStringExtra(DirectiveConstants.INTENT_KEY_DIRECTIVE_NAMESPACE);
                }

                @Override // com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.AnnounceWithContentDirective
                public String getNotificationUuid() {
                    return intent.getStringExtra(DirectiveConstants.INTENT_KEY_NOTIFICATION_UUID);
                }
            })) {
                getResultExtras(true).putString(DirectiveConstants.INTENT_KEY_LAST_RECEIVER, DirectiveConstants.INTENT_TOP_CONTACT_RECEIVER);
                abortBroadcast();
            }
        } catch (Exception e) {
            Log.d(TAG, "process - Exception when processing directive. ", e);
        }
    }
}
