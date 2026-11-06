package io.branch.referral.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import io.branch.receivers.SharingBroadcastReceiver;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lio/branch/referral/util/SharingUtil;", "", "()V", "sharedURL", "", "getSharedURL", "()Ljava/lang/String;", "setSharedURL", "(Ljava/lang/String;)V", "share", "", "text", "title", "subject", "activity", "Landroid/app/Activity;", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SharingUtil {

    @NotNull
    public static final SharingUtil INSTANCE = new SharingUtil();

    @Nullable
    private static String sharedURL = "";

    private SharingUtil() {
    }

    @JvmStatic
    @RequiresApi(22)
    public static final void share(@NotNull String text, @Nullable String title, @Nullable String subject, @NotNull Activity activity) {
        text.getClass();
        activity.getClass();
        sharedURL = text;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra("android.intent.extra.TITLE", title);
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        activity.startActivityForResult(Intent.createChooser(intent, title, PendingIntent.getBroadcast(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), (Class<?>) SharingBroadcastReceiver.class), 167772160).getIntentSender()), 1002);
    }

    @Nullable
    public final String getSharedURL() {
        return sharedURL;
    }

    public final void setSharedURL(@Nullable String str) {
        sharedURL = str;
    }
}
