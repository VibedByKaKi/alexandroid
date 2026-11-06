package com.amazon.dee.app.services.metrics.kinesis.system;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.dee.app.services.logging.Log;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/system/AndroidDeviceDetails;", "Lcom/amazon/dee/app/services/metrics/kinesis/system/DeviceDetails;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", AMPDInformationProvider.DEVICE_CARRIER_KEY, "", "platformVersion", "platform", "manufacturer", "model", "locale", "getLanguage", "getCountry", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidDeviceDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDeviceDetails.kt\ncom/amazon/dee/app/services/metrics/kinesis/system/AndroidDeviceDetails\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes5.dex */
public final class AndroidDeviceDetails implements DeviceDetails {

    @NotNull
    private static final String PLATFORM = "ANDROID";

    @NotNull
    private static final String UNKNOWN = "Unknown";

    @NotNull
    private final Context context;

    @NotNull
    private static final String TAG = Log.tag((Class<?>) AndroidDeviceDetails.class);

    public AndroidDeviceDetails(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @Nullable
    public String carrier() {
        String networkOperatorName;
        try {
            Object systemService = this.context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && (networkOperatorName = telephonyManager.getNetworkOperatorName()) != null) {
                if (networkOperatorName.length() > 0) {
                    return networkOperatorName;
                }
            }
            return null;
        } catch (Exception e) {
            Log.w(TAG, "Failed to retrieve carrier name with error: %s", e);
            return null;
        }
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String getCountry() {
        List split$default;
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return "Unknown";
        }
        String locale2 = locale.toString();
        locale2.getClass();
        split$default = StringsKt__StringsKt.split$default(locale2, new String[]{"_"}, false, 0, 6, (Object) null);
        return split$default.size() > 1 ? (String) split$default.get(1) : "";
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String getLanguage() {
        List split$default;
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return "Unknown";
        }
        String locale2 = locale.toString();
        locale2.getClass();
        split$default = StringsKt__StringsKt.split$default(locale2, new String[]{"_"}, false, 0, 6, (Object) null);
        return !split$default.isEmpty() ? (String) split$default.get(0) : "";
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String locale() {
        String locale;
        Locale locale2 = Locale.getDefault();
        return (locale2 == null || (locale = locale2.toString()) == null) ? "Unknown" : locale;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String manufacturer() {
        String str = Build.MANUFACTURER;
        str.getClass();
        return str;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String model() {
        String str = Build.MODEL;
        str.getClass();
        return str;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String platform() {
        return "ANDROID";
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.DeviceDetails
    @NotNull
    public String platformVersion() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        return str;
    }
}
