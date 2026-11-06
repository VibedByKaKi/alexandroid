package com.amazon.alexa.permissions;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.permissions.api.PermissionsListener;
import com.amazon.alexa.permissions.api.PermissionsService;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/permissions/DefaultPermissionsService;", "Lcom/amazon/alexa/permissions/api/PermissionsService;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "requestMap", "", "", "Lcom/amazon/alexa/permissions/api/PermissionsListener;", "getRequestMap$AlexaMobileAndroidPermissions_release", "()Ljava/util/Map;", "isRequested", "", "requestCode", "onResult", "", MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_PERMISSIONS_KEY, "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", MissingTokenPull.TRIGGER_REQUEST, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "([Ljava/lang/String;Lcom/amazon/alexa/permissions/api/PermissionsListener;)V", "Companion", "AlexaMobileAndroidPermissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultPermissionsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPermissionsService.kt\ncom/amazon/alexa/permissions/DefaultPermissionsService\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n37#2,2:140\n819#3:142\n847#3,2:143\n*S KotlinDebug\n*F\n+ 1 DefaultPermissionsService.kt\ncom/amazon/alexa/permissions/DefaultPermissionsService\n*L\n72#1:140,2\n108#1:142\n108#1:143,2\n*E\n"})
/* loaded from: classes18.dex */
public class DefaultPermissionsService implements PermissionsService {

    @NotNull
    private static final String ACCESS_BACKGROUND_LOCATION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final int ANDROID_Q = 29;
    private static final int REQUEST_CODE_MAX = 999;
    private static final int REQUEST_CODE_MIN = 100;

    @NotNull
    private static final String TAG = "PermissionsService";

    @NotNull
    private final Activity activity;

    @NotNull
    private final Map<Integer, PermissionsListener> requestMap;

    public DefaultPermissionsService(@NotNull Activity activity) {
        activity.getClass();
        this.activity = activity;
        this.requestMap = new ConcurrentHashMap();
    }

    @VisibleForTesting
    @NotNull
    public final Map<Integer, PermissionsListener> getRequestMap$AlexaMobileAndroidPermissions_release() {
        return this.requestMap;
    }

    public boolean isRequested(int requestCode) {
        return this.requestMap.containsKey(Integer.valueOf(requestCode));
    }

    public void onResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (!this.requestMap.containsKey(Integer.valueOf(requestCode))) {
            Log.w(TAG, "onResult called but did not recognize request code; ignoring");
            return;
        }
        PermissionsListener remove = this.requestMap.remove(Integer.valueOf(requestCode));
        if (remove == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = grantResults.length;
        for (int i = 0; i < length; i++) {
            if (grantResults[i] != 0) {
                arrayList.add(permissions[i]);
            }
        }
        if (arrayList.isEmpty()) {
            remove.onGranted();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!this.activity.shouldShowRequestPermissionRationale((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            remove.onDenied(arrayList);
        } else {
            remove.onBlocked(arrayList, arrayList2);
        }
    }

    @Override // com.amazon.alexa.permissions.api.PermissionsService
    public void request(@NotNull String[] permissions, @NotNull PermissionsListener listener) {
        int nextInt;
        permissions.getClass();
        listener.getClass();
        do {
            nextInt = new Random().nextInt(900) + 100;
        } while (this.requestMap.containsKey(Integer.valueOf(nextInt)));
        this.requestMap.put(Integer.valueOf(nextInt), listener);
        ArrayList arrayList = new ArrayList();
        for (String str : permissions) {
            if (ContextCompat.checkSelfPermission(this.activity, str) != 0) {
                arrayList.add(str);
            }
            arrayList.contains(ACCESS_BACKGROUND_LOCATION);
        }
        if (!arrayList.isEmpty()) {
            ActivityCompat.requestPermissions(this.activity, (String[]) arrayList.toArray(new String[0]), nextInt);
            return;
        }
        PermissionsListener remove = this.requestMap.remove(Integer.valueOf(nextInt));
        if (remove != null) {
            remove.onGranted();
        }
    }
}
