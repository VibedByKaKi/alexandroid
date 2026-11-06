package com.amazon.alexa.ra.core.ui.backgroundmode;

import android.app.Notification;
import android.app.PendingIntent;
import com.dee.app.data.reactnative.observers.WritableMapEncodingDataServiceObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H&¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/backgroundmode/NotificationHandler;", "", "createForegroundNotification", "Landroid/app/Notification;", "contentIntent", "Landroid/app/PendingIntent;", "showPermissionNotification", "", "packageName", "", "updateTitle", "title", "updateStatus", WritableMapEncodingDataServiceObserver.ElementsResponseKey.STATUS_TEXT, "updateMuteButton", "isMuted", "", "createNotificationChannel", "repostAsHeadsUp", "onConfigurationChanged", "onDestroy", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface NotificationHandler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onConfigurationChanged(@NotNull NotificationHandler notificationHandler) {
            NotificationHandler.super.onConfigurationChanged();
        }

        @Deprecated
        public static void updateTitle(@NotNull NotificationHandler notificationHandler, @NotNull String str) {
            str.getClass();
            NotificationHandler.super.updateTitle(str);
        }
    }

    @NotNull
    Notification createForegroundNotification(@NotNull PendingIntent contentIntent);

    void createNotificationChannel();

    void onDestroy();

    void repostAsHeadsUp();

    void showPermissionNotification(@NotNull String packageName);

    void updateMuteButton(boolean isMuted);

    void updateStatus(@NotNull PendingIntent contentIntent, @NotNull String statusText);

    default void updateTitle(@NotNull String title) {
        title.getClass();
    }

    default void onConfigurationChanged() {
    }
}
