package com.amazon.comms.calling.presentation.ui.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.util.DropInUtils$$ExternalSyntheticLambda0;
import com.amazon.deecomms.common.util.Utils$$ExternalSyntheticLambda2;
import com.amazon.deecomms.perms.PermissionsHelper$$ExternalSyntheticLambda1;
import com.amazon.scxml.internal.DispatchQueue$$ExternalSyntheticLambda0;
import com.amazon.scxml.internal.EventQueue$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002JT\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010!\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170&H\u0002¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170&H\u0002¢\u0006\u0002\u0010'J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0015H\u0002J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170&2\u0006\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010-J!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170&2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170&H\u0002¢\u0006\u0002\u00100J4\u00101\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001aJa\u00107\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170&2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010:R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/amazon/comms/calling/presentation/ui/utils/PermissionsHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "kotlin.jvm.PlatformType", "Lcom/amazon/comms/log/CommsLogger;", "CONTACTS_CODE", "", "getCONTACTS_CODE", "()I", "SEND_SMS_AND_PHONE_CODE", "getSEND_SMS_AND_PHONE_CODE", "onPermissionGranted", "Lkotlin/Function0;", "", "onPermissionDenied", "checkPermission", "", "permission", "", "checkIfAllPermissionsGranted", "grantPermissionResults", "", "showPermissionNotAvailableDialog", "activity", "Landroid/app/Activity;", "rationaleMessage", "alertMetricName", "alertPageSource", "dialogContentView", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/DialogInterface$OnDismissListener;", "onDeny", "getPermissionListForVideoCalling", "", "()[Ljava/lang/String;", "getPermissionListForAudio", "getDeniedCallingPermissionsRationale", "isVideoCall", "getListOfUngrantedPermissions", "isVideo", "(Z)[Ljava/lang/String;", "filterGrantedPermissions", "permissionList", "([Ljava/lang/String;)[Ljava/lang/String;", "requestPermissionIfNeeded", "onGranted", "onDenied", "onRequestPermissionsResult", "requestCode", "grantResults", "requestPermission", "permissionsToRequest", "onShowingRationale", "(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsHelper.kt\ncom/amazon/comms/calling/presentation/ui/utils/PermissionsHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,263:1\n12597#2,2:264\n3829#2:266\n4344#2,2:267\n37#3:269\n36#3,3:270\n*S KotlinDebug\n*F\n+ 1 PermissionsHelper.kt\ncom/amazon/comms/calling/presentation/ui/utils/PermissionsHelper\n*L\n75#1:264,2\n188#1:266\n188#1:267,2\n190#1:269\n190#1:270,3\n*E\n"})
/* loaded from: classes20.dex */
public final class PermissionsHelper {
    public static final int REQUEST_CODE_NATIVE_CALLING = 335;
    public static final int REQUEST_CODE_RECORD_AUDIO = 1;
    public static final int REQUEST_CODE_RECORD_VIDEO = 2;
    private final int CONTACTS_CODE;
    private final CommsLogger LOG;
    private final int SEND_SMS_AND_PHONE_CODE;

    @NotNull
    private final Context context;

    @Nullable
    private Function0<Unit> onPermissionDenied;

    @Nullable
    private Function0<Unit> onPermissionGranted;

    @Inject
    public PermissionsHelper(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.LOG = CommsLogger.getLogger(Constants.LOG_TAG, PermissionsHelper.class);
        this.CONTACTS_CODE = 134;
        this.SEND_SMS_AND_PHONE_CODE = 334;
    }

    private final boolean checkIfAllPermissionsGranted(int[] grantPermissionResults) {
        boolean z = false;
        if (grantPermissionResults.length == 0) {
            Log.i("", "No permissions were requested or granted properly");
            return false;
        }
        int length = grantPermissionResults.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (grantPermissionResults[i] == -1) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    private final String[] filterGrantedPermissions(String[] permissionList) {
        ArrayList arrayList = new ArrayList();
        for (String str : permissionList) {
            if (!checkPermission(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String getDeniedCallingPermissionsRationale(Context context, boolean isVideoCall) {
        Resources resources = context.getResources();
        return isVideoCall ? resources.getString(R.string.video_call_permission) : resources.getString(R.string.audio_call_permission);
    }

    private final String[] getListOfUngrantedPermissions(boolean isVideo) {
        if (isVideo) {
            return filterGrantedPermissions(getPermissionListForVideoCalling());
        }
        if (!isVideo) {
            return filterGrantedPermissions(getPermissionListForAudio());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private final String[] getPermissionListForAudio() {
        return new String[]{"android.permission.RECORD_AUDIO"};
    }

    private final String[] getPermissionListForVideoCalling() {
        return new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
    }

    public static /* synthetic */ void requestPermission$default(PermissionsHelper permissionsHelper, Activity activity, String[] strArr, String str, int i, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        permissionsHelper.requestPermission(activity, strArr, str, i, function0, function02, (i2 & 64) != 0 ? null : function03);
    }

    public static /* synthetic */ void requestPermissionIfNeeded$default(PermissionsHelper permissionsHelper, Activity activity, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        permissionsHelper.requestPermissionIfNeeded(activity, z, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionIfNeeded$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionIfNeeded$lambda$6(Function0 function0, PermissionsHelper permissionsHelper) {
        function0.invoke();
        permissionsHelper.LOG.i("User is taken to the app settings page for enabling permissions. Rejecting the incoming call");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showPermissionNotAvailableDialog$default(PermissionsHelper permissionsHelper, Activity activity, String str, String str2, String str3, int i, DialogInterface.OnDismissListener onDismissListener, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            onDismissListener = null;
        }
        permissionsHelper.showPermissionNotAvailableDialog(activity, str, str2, str3, i, onDismissListener, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionNotAvailableDialog$lambda$1(PermissionsHelper permissionsHelper, Function0 function0, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + permissionsHelper.context.getPackageName()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        permissionsHelper.context.startActivity(intent);
        if (function0 != null) {
            function0.invoke();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionNotAvailableDialog$lambda$2(DialogInterface dialogInterface, int i) {
        dialogInterface.getClass();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionNotAvailableDialog$lambda$3(AlertDialog alertDialog, PermissionsHelper permissionsHelper, DialogInterface dialogInterface) {
        alertDialog.getButton(-2).setTextColor(permissionsHelper.context.getColor(R.color.action10));
        alertDialog.getButton(-1).setTextColor(permissionsHelper.context.getColor(R.color.action10));
    }

    public final boolean checkPermission(@NotNull String permission) {
        permission.getClass();
        int checkSelfPermission = ContextCompat.checkSelfPermission(this.context, permission);
        if (checkSelfPermission == -1) {
            return false;
        }
        if (checkSelfPermission == 0) {
            return true;
        }
        Log.w("", "Hit else case in checkPermission (not expected) for permission " + permission + " result was " + checkSelfPermission);
        return false;
    }

    public final int getCONTACTS_CODE() {
        return this.CONTACTS_CODE;
    }

    public final int getSEND_SMS_AND_PHONE_CODE() {
        return this.SEND_SMS_AND_PHONE_CODE;
    }

    public final void onRequestPermissionsResult(int requestCode, @NotNull int[] grantResults) {
        grantResults.getClass();
        if (!checkIfAllPermissionsGranted(grantResults)) {
            Function0<Unit> function0 = this.onPermissionDenied;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (requestCode == 1 || requestCode == 2 || requestCode == 335) {
            Function0<Unit> function02 = this.onPermissionGranted;
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        this.LOG.e("Unknown Manifest.permission code granted " + requestCode);
    }

    public final void requestPermission(@NotNull Activity activity, @NotNull String[] permissionsToRequest, @NotNull String rationaleMessage, int requestCode, @NotNull Function0<Unit> onGranted, @Nullable Function0<Unit> onDenied, @Nullable Function0<Unit> onShowingRationale) {
        activity.getClass();
        permissionsToRequest.getClass();
        rationaleMessage.getClass();
        onGranted.getClass();
        this.onPermissionGranted = onGranted;
        this.onPermissionDenied = onDenied;
        String[] filterGrantedPermissions = filterGrantedPermissions(permissionsToRequest);
        if (filterGrantedPermissions.length == 0) {
            onGranted.invoke();
            return;
        }
        int length = filterGrantedPermissions.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, filterGrantedPermissions[i])) {
                z = true;
                break;
            }
            i++;
        }
        CommsLogger commsLogger = this.LOG;
        String arrays = Arrays.toString(filterGrantedPermissions);
        arrays.getClass();
        commsLogger.i("Requesting Permissions " + arrays);
        CommsLogger commsLogger2 = this.LOG;
        if (!z) {
            commsLogger2.i("Requesting permission from the user");
            ActivityCompat.requestPermissions(activity, filterGrantedPermissions, requestCode);
        } else {
            commsLogger2.i("User has denied permissions. Requesting permissions from the user by navigating to App settings page");
            if (onShowingRationale != null) {
                onShowingRationale.invoke();
            }
            showPermissionNotAvailableDialog$default(this, activity, rationaleMessage, null, null, 0, null, onDenied, 60, null);
        }
    }

    public final void requestPermissionIfNeeded(@NotNull Activity activity, boolean isVideo, @NotNull Function0<Unit> onGranted, @NotNull Function0<Unit> onDenied) {
        activity.getClass();
        onGranted.getClass();
        onDenied.getClass();
        requestPermission$default(this, activity, getListOfUngrantedPermissions(isVideo), getDeniedCallingPermissionsRationale(activity, isVideo), isVideo ? 2 : 1, new DispatchQueue$$ExternalSyntheticLambda0(onGranted, 3), new EventQueue$$ExternalSyntheticLambda0(onDenied, this, 13), null, 64, null);
    }

    public final void showPermissionNotAvailableDialog(@NotNull Activity activity, @NotNull String rationaleMessage, @Nullable String alertMetricName, @Nullable String alertPageSource, int dialogContentView, @Nullable DialogInterface.OnDismissListener listener, @Nullable Function0<Unit> onDeny) {
        activity.getClass();
        rationaleMessage.getClass();
        AlertDialog create = new AlertDialog.Builder(activity).setMessage(rationaleMessage).setPositiveButton(this.context.getString(R.string.settings_description), new DropInUtils$$ExternalSyntheticLambda0(this, onDeny, 2)).setNegativeButton(this.context.getString(R.string.cancel_description), new Utils$$ExternalSyntheticLambda2(2)).setView(dialogContentView != 0 ? activity.getLayoutInflater().inflate(dialogContentView, (ViewGroup) null) : null).setOnDismissListener(listener).create();
        create.setOnShowListener(new PermissionsHelper$$ExternalSyntheticLambda1(create, this, 1));
        create.show();
    }
}
