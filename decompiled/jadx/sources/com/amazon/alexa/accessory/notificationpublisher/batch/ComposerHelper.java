package com.amazon.alexa.accessory.notificationpublisher.batch;

import ai.onnxruntime.TensorInfo$$ExternalSyntheticLambda4;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.Notification;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.NotificationCluster;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ComposerHelper {
    private static final String TAG = "ComposerHelper";

    private ComposerHelper() {
    }

    @NonNull
    private static String buildGroupKey(@NonNull Notification notification) {
        if (!NotificationConstants.TYPE_COMMS.equals(notification.getType())) {
            return "NON_COMMS:" + notification.getAppName();
        }
        if (!NotificationConstants.SUB_TYPE_GROUP_MESSAGE.equalsIgnoreCase(notification.getSubType())) {
            return "COMMS_DIRECT:" + notification.getContact();
        }
        return "GROUP_CHAT:" + notification.getPackageIdentifier() + ":" + notification.getGroupName();
    }

    @NonNull
    public static String ensureTrailingPunctuation(@NonNull String str) {
        char m;
        return (str.isEmpty() || (m = AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str)) == '.' || m == '!' || m == '?') ? str : str.concat(".");
    }

    @NonNull
    public static String extractMessageContent(@NonNull Notification notification) {
        String contentWithoutPrefix = notification.getContentWithoutPrefix();
        if (!contentWithoutPrefix.isEmpty()) {
            return contentWithoutPrefix.trim();
        }
        String detailedContent = notification.getDetailedContent();
        if (detailedContent.isEmpty()) {
            return "";
        }
        if (!NotificationConstants.TYPE_COMMS.equals(notification.getType())) {
            String str = notification.getAppName() + " says ";
            return detailedContent.startsWith(str) ? stripTrailingPeriod(detailedContent.substring(str.length())).trim() : detailedContent.trim();
        }
        String str2 = notification.getContact() + " says to the group, ";
        if (detailedContent.startsWith(str2)) {
            return stripTrailingPeriod(detailedContent.substring(str2.length())).trim();
        }
        String contentPrefix = notification.getContentPrefix();
        return (contentPrefix.isEmpty() || !detailedContent.startsWith(contentPrefix)) ? detailedContent.trim() : stripTrailingPeriod(detailedContent.substring(contentPrefix.length())).trim();
    }

    @NonNull
    public static String formatNameList(@NonNull List<String> list) {
        if (list.size() <= 1) {
            return list.isEmpty() ? "" : list.get(0);
        }
        if (list.size() != 2) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(String.join(", ", list.subList(0, list.size() - 1)), ", and ");
            m1m.append((String) ErrorUtils$$ExternalSyntheticOutline0.m(list, 1));
            return m1m.toString();
        }
        return list.get(0) + " and " + list.get(1);
    }

    @NonNull
    public static List<NotificationCluster> groupNotifications(@NonNull List<Notification> list) {
        Log.i(TAG, "groupNotifications - input count: %d", Integer.valueOf(list.size()));
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Notification notification : list) {
            ((List) linkedHashMap.computeIfAbsent(buildGroupKey(notification), new TensorInfo$$ExternalSyntheticLambda4(7))).add(notification);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(new NotificationCluster((List) it2.next()));
        }
        Log.i(TAG, "groupNotifications - groups created: %d", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static boolean isSelfAttributedContent(@NonNull String str, @NonNull Notification notification) {
        if (NotificationConstants.TYPE_COMMS.equals(notification.getType()) && notification.getContentWithoutPrefix().isEmpty()) {
            return str.equals(notification.getDetailedContent().trim());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$groupNotifications$0(String str) {
        return new ArrayList();
    }

    @NonNull
    private static String stripTrailingPeriod(@NonNull String str) {
        return str.endsWith(".") ? AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, str) : str;
    }
}
