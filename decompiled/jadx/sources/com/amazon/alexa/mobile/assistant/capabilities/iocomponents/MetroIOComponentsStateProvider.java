package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import android.content.pm.PackageManager;
import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/MetroIOComponentsStateProvider;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/DeviceIOComponentsStateProvider;", "deviceType", "", "deviceSerialNumber", "packageManager", "Landroid/content/pm/PackageManager;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)V", "getFirmwareVersion", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MetroIOComponentsStateProvider extends DeviceIOComponentsStateProvider {

    @NotNull
    public static final String METRO_PACKAGE_NAME = "com.amazon.dee.app";

    @NotNull
    private static final String TAG = "MetroIOProvider";

    @NotNull
    private final PackageManager packageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroIOComponentsStateProvider(@NotNull String str, @NotNull String str2, @NotNull PackageManager packageManager) {
        super(str, str2);
        str.getClass();
        str2.getClass();
        packageManager.getClass();
        this.packageManager = packageManager;
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.DeviceIOComponentsStateProvider
    @Nullable
    public String getFirmwareVersion() {
        try {
            return this.packageManager.getPackageInfo("com.amazon.dee.app", 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Unable to find package: com.amazon.dee.app", e);
            return null;
        }
    }
}
