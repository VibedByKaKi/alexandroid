package com.amazon.alexa.voice.tta.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.voice.tta.R;
import com.amazon.alexa.voice.tta.typing.PersistentStorage;
import com.amazon.alexa.voice.tta.typing.TextTtaResponseMessage;
import com.amazon.alexa.voice.ui.tta.TtaResponseMessage;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard;
import org.jetbrains.kotlin.library.KotlinLibraryKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PermissionsUtil {
    public static final int LOCATION_PERMISSION_REQUEST_CODE = 321;
    public static final String LOCATION_PERMISSION_URI = "twa-prompt://location";

    private boolean isPermissionGranted(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public TtaResponseMessage getLocationPermissionMessage(Activity activity, PersistentStorage persistentStorage) {
        if (activity == null || activity.isDestroyed()) {
            return new TextTtaResponseMessage("");
        }
        return new TextTtaResponseMessage(getPermissionStatus(activity, "android.permission.ACCESS_FINE_LOCATION", persistentStorage) == PermissionStatus.DONT_ASK_AGAIN ? activity.getString(R.string.tta_location_permission_message_when_disabled) : activity.getString(R.string.tta_location_permission_message));
    }

    public PermissionStatus getPermissionStatus(Activity activity, String str, PersistentStorage persistentStorage) {
        return isPermissionGranted(activity, str) ? PermissionStatus.GRANTED : ActivityCompat.shouldShowRequestPermissionRationale(activity, str) ? PermissionStatus.DENIED : !persistentStorage.isPermissionRequested(str) ? PermissionStatus.NOT_REQUESTED : PermissionStatus.DONT_ASK_AGAIN;
    }

    public Permission getRequiredPermission(TtaInChatResultCard ttaInChatResultCard) {
        ItemRoute itemRoute = ttaInChatResultCard.getItemRoute();
        return (itemRoute == null || !LOCATION_PERMISSION_URI.equals(itemRoute.getRouteLink())) ? Permission.builder().message("").type(PermissionType.NONE).build() : Permission.builder().message(ttaInChatResultCard.getMessage()).type(PermissionType.LOCATION).build();
    }

    public void openAppInfo(Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts(KotlinLibraryKt.KLIB_PROPERTY_PACKAGE, activity.getPackageName(), null));
        activity.startActivity(intent);
    }

    public void requestLocationPermissions(Activity activity, PersistentStorage persistentStorage) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        if (getPermissionStatus(activity, "android.permission.ACCESS_FINE_LOCATION", persistentStorage) == PermissionStatus.DONT_ASK_AGAIN) {
            openAppInfo(activity);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, LOCATION_PERMISSION_REQUEST_CODE);
            persistentStorage.setPermissionRequested("android.permission.ACCESS_FINE_LOCATION", true);
        }
    }
}
