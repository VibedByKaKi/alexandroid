package com.amazon.photos.uploader.internal.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.photos.uploader.internal.utils.SystemUtil;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"H\u0000¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"H\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"H\u0002J\r\u0010+\u001a\u00020\u001cH\u0000¢\u0006\u0002\b,R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/amazon/photos/uploader/internal/device/BatteryState;", "", "context", "Landroid/content/Context;", "systemUtil", "Lcom/amazon/photos/uploader/internal/utils/SystemUtil;", "(Landroid/content/Context;Lcom/amazon/photos/uploader/internal/utils/SystemUtil;)V", "<set-?>", "", "batteryPercent", "getBatteryPercent$annotations", "()V", "getBatteryPercent", "()I", "chargingAction", "", "getChargingAction$annotations", "getChargingAction", "()Ljava/lang/String;", "chargingActions", "", "getChargingActions", "()Ljava/util/Set;", "chargingType", "getChargingType", "dischargingAction", "getDischargingAction$annotations", "getDischargingAction", "", "isCharging", "()Z", "isInPowerSaverMode", "updateAllStates", "batteryChangedIntent", "Landroid/content/Intent;", "updateAllStates$AndroidPhotosUploader_release", "updateBatteryPercent", "intent", "updateBatteryPercent$AndroidPhotosUploader_release", "updateChargingState", "updateChargingState$AndroidPhotosUploader_release", "updateChargingType", "updateIsCharging", "updatePowerState", "updatePowerState$AndroidPhotosUploader_release", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BatteryState {
    private static final int BATTERY_PLUGGED_ANY = 7;
    public static final int EXTRA_NOT_FOUND = -1;
    public static final int LOW_BATTERY_PERCENT = 15;
    private int batteryPercent;

    @SuppressLint({"InlinedApi"})
    @NotNull
    private final String chargingAction;

    @NotNull
    private final Set<String> chargingActions;
    private int chargingType;

    @NotNull
    private final Context context;

    @SuppressLint({"InlinedApi"})
    @NotNull
    private final String dischargingAction;
    private boolean isCharging;
    private boolean isInPowerSaverMode;

    @NotNull
    private final SystemUtil systemUtil;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> BATTERY_STATUS_CHANGE_ACTION = SetsKt.setOf("android.intent.action.BATTERY_CHANGED");

    @NotNull
    private static final Set<String> BATTERY_ACTIONS = SetsKt.setOf((Object[]) new String[]{"android.intent.action.BATTERY_LOW", "android.intent.action.BATTERY_OKAY"});

    public BatteryState(@NotNull Context context, @NotNull SystemUtil systemUtil) {
        context.getClass();
        systemUtil.getClass();
        this.context = context;
        this.systemUtil = systemUtil;
        String str = systemUtil.isOsVersionAtLeastM() ? "android.os.action.CHARGING" : "android.intent.action.ACTION_POWER_CONNECTED";
        this.chargingAction = str;
        String str2 = systemUtil.isOsVersionAtLeastM() ? "android.os.action.DISCHARGING" : "android.intent.action.ACTION_POWER_DISCONNECTED";
        this.dischargingAction = str2;
        this.chargingActions = SetsKt.setOf((Object[]) new String[]{str, str2});
        this.batteryPercent = 100;
        updateAllStates$AndroidPhotosUploader_release(null, context);
    }

    private final boolean updateChargingType(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra != -1) {
            int i = this.chargingType;
            this.chargingType = intExtra;
            if (intExtra != i) {
                return true;
            }
        }
        return false;
    }

    private final boolean updateIsCharging(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        boolean z = this.isCharging;
        if (intExtra != -1) {
            this.isCharging = (intExtra & 7) != 0;
        } else if (intent.getAction() != null) {
            Set<String> set = this.chargingActions;
            String action = intent.getAction();
            action.getClass();
            if (set.contains(action)) {
                this.isCharging = Intrinsics.areEqual(this.chargingAction, intent.getAction());
            }
        }
        return this.isCharging != z;
    }

    public final int getBatteryPercent() {
        return this.batteryPercent;
    }

    @NotNull
    public final String getChargingAction() {
        return this.chargingAction;
    }

    @NotNull
    public final Set<String> getChargingActions() {
        return this.chargingActions;
    }

    public final int getChargingType() {
        return this.chargingType;
    }

    @NotNull
    public final String getDischargingAction() {
        return this.dischargingAction;
    }

    /* renamed from: isCharging, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    /* renamed from: isInPowerSaverMode, reason: from getter */
    public final boolean getIsInPowerSaverMode() {
        return this.isInPowerSaverMode;
    }

    public final boolean updateAllStates$AndroidPhotosUploader_release(@Nullable Intent batteryChangedIntent, @NotNull Context context) {
        context.getClass();
        if ((batteryChangedIntent == null || !Intrinsics.areEqual("android.intent.action.BATTERY_CHANGED", batteryChangedIntent.getAction())) && (batteryChangedIntent = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return false;
        }
        return updatePowerState$AndroidPhotosUploader_release() | updateChargingState$AndroidPhotosUploader_release(batteryChangedIntent) | updateBatteryPercent$AndroidPhotosUploader_release(batteryChangedIntent);
    }

    public final boolean updateBatteryPercent$AndroidPhotosUploader_release(@NotNull Intent intent) {
        intent.getClass();
        int intExtra = intent.getIntExtra(ModelTransformer.KEY_BATTERY_LEVEL, -1);
        int intExtra2 = intent.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1);
        if (intExtra != -1 && intExtra2 > 0) {
            boolean z = this.batteryPercent > 15;
            int i = (intExtra * 100) / intExtra2;
            this.batteryPercent = i;
            if (z != (i > 15)) {
                return true;
            }
        }
        return false;
    }

    public final boolean updateChargingState$AndroidPhotosUploader_release(@NotNull Intent intent) {
        intent.getClass();
        return updateChargingType(intent) | updateIsCharging(intent);
    }

    public final boolean updatePowerState$AndroidPhotosUploader_release() {
        PowerManager powerManager = (PowerManager) this.context.getSystemService("power");
        boolean z = this.isInPowerSaverMode;
        boolean isPowerSaveMode = powerManager != null ? powerManager.isPowerSaveMode() : false;
        this.isInPowerSaverMode = isPowerSaveMode;
        return isPowerSaveMode != z;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/uploader/internal/device/BatteryState$Companion;", "", "()V", "BATTERY_ACTIONS", "", "", "getBATTERY_ACTIONS", "()Ljava/util/Set;", "BATTERY_PLUGGED_ANY", "", "BATTERY_STATUS_CHANGE_ACTION", "getBATTERY_STATUS_CHANGE_ACTION", "EXTRA_NOT_FOUND", "getEXTRA_NOT_FOUND$annotations", "LOW_BATTERY_PERCENT", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getBATTERY_ACTIONS() {
            return BatteryState.BATTERY_ACTIONS;
        }

        @NotNull
        public final Set<String> getBATTERY_STATUS_CHANGE_ACTION() {
            return BatteryState.BATTERY_STATUS_CHANGE_ACTION;
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getEXTRA_NOT_FOUND$annotations() {
        }
    }

    public static /* synthetic */ void getBatteryPercent$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getChargingAction$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDischargingAction$annotations() {
    }
}
