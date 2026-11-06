package com.amazon.alexa.accessory.notificationpublisher.batch;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.Notification;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.NotificationCluster;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.SenderIdentity;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PreambleComposer {
    private static final String TAG = "PreambleComposer";

    @NonNull
    private List<String> extractContactNames(@NonNull NotificationCluster notificationCluster) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<Notification> it2 = notificationCluster.getNotifications().iterator();
        while (it2.hasNext()) {
            String displayLabel = SenderIdentity.from(it2.next()).getDisplayLabel();
            if (linkedHashSet.add(displayLabel)) {
                arrayList.add(displayLabel);
            }
        }
        return arrayList;
    }

    @NonNull
    private String groupContextFragment(@NonNull List<NotificationCluster> list) {
        if (list.size() != 1 || list.get(0).getClusterType() != NotificationCluster.ClusterType.COMMS_GROUP_CHAT) {
            return "";
        }
        return " in " + list.get(0).getGroupChatName();
    }

    @NonNull
    private String messageDescriptor(@NonNull List<NotificationCluster> list) {
        int i = 0;
        int i2 = 0;
        for (NotificationCluster notificationCluster : list) {
            i += notificationCluster.getNotifications().size();
            i2 += notificationCluster.getLongMessageCount();
        }
        Log.i(TAG, "messageDescriptor - total: %d, long: %d", Integer.valueOf(i), Integer.valueOf(i2));
        return i2 == 0 ? "messages" : i2 == i ? i == 1 ? "a long message" : "long messages" : i2 == 1 ? "messages including a long message" : "messages including long messages";
    }

    @NonNull
    private List<String> senderLabels(@NonNull List<NotificationCluster> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationCluster notificationCluster : list) {
            if (notificationCluster.getClusterType() == NotificationCluster.ClusterType.COMMS_GROUP_CHAT) {
                arrayList.addAll(extractContactNames(notificationCluster));
            } else {
                arrayList.add(notificationCluster.getDisplayLabel());
            }
        }
        return arrayList;
    }

    @NonNull
    public String compose(@NonNull List<NotificationCluster> list) {
        String str = TAG;
        Log.i(str, "compose - clusters: %d", Integer.valueOf(list.size()));
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("You got ", messageDescriptor(list), groupContextFragment(list), " from ", ComposerHelper.formatNameList(senderLabels(list)));
        m.append(".");
        String sb = m.toString();
        Log.i(str, "compose - final preamble: %s", sb);
        return sb;
    }
}
