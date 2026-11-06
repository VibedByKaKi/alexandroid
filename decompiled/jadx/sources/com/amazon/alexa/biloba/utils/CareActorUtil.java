package com.amazon.alexa.biloba.utils;

import android.text.TextUtils;
import com.amazon.alexa.assistant.ui.conversation.view.ftux.FtuxTouBodyKt;
import com.amazon.alexa.biloba.model.CareActor;
import com.amazon.deecomms.remoteConfig.ArcusConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CareActorUtil {
    private static final String SPACE = " ";
    private static final String TAG = "CareActorUtil";

    private CareActorUtil() {
    }

    public static String getDisplayName(CareActor careActor) {
        return careActor == null ? "" : !TextUtils.isEmpty(careActor.getNickName()) ? String.format(FtuxTouBodyKt.APP_NAME_PLACEHOLDER, careActor.getNickName()) : !TextUtils.isEmpty(careActor.getFirstName()) ? String.format(FtuxTouBodyKt.APP_NAME_PLACEHOLDER, careActor.getFirstName()) : !TextUtils.isEmpty(careActor.getLastName()) ? String.format(FtuxTouBodyKt.APP_NAME_PLACEHOLDER, careActor.getLastName()) : "";
    }

    public static String getEnclosedNickName(CareActor careActor) {
        return (careActor == null || TextUtils.isEmpty(careActor.getNickName())) ? "" : String.format("(%1$s)", careActor.getNickName());
    }

    public static String getFullName(CareActor careActor) {
        StringBuilder sb = new StringBuilder();
        if (careActor == null) {
            return sb.toString();
        }
        if (!AndroidUtils.isEmpty(careActor.getFirstName())) {
            sb.append(careActor.getFirstName());
            sb.append(" ");
        }
        if (!AndroidUtils.isEmpty(careActor.getLastName())) {
            sb.append(careActor.getLastName());
        }
        return sb.toString().trim();
    }

    public static String getSlicedContactId(CareActor careActor) {
        if (careActor == null || careActor.getContactId() == null) {
            LogUtils.i(TAG, "ContactId is null returning empty string");
            return "";
        }
        return careActor.getContactId().split(ArcusConfig.PATH_SEPARATOR)[r1.length - 1];
    }

    public static boolean isCommsEnabled(CareActor careActor) {
        if (careActor == null) {
            return false;
        }
        if (careActor.getIsCommsProvisioned() == Boolean.TRUE) {
            return true;
        }
        return "ENABLED".equals(careActor.getCommsStatus());
    }
}
