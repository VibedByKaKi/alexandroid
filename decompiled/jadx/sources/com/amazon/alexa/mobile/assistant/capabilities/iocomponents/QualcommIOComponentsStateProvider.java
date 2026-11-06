package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import android.content.pm.PackageManager;
import android.util.Log;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/QualcommIOComponentsStateProvider;", "Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/DeviceIOComponentsStateProvider;", "deviceType", "", "deviceSerialNumber", "packageManager", "Landroid/content/pm/PackageManager;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageManager;)V", "activePackageName", "getFirmwareVersion", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class QualcommIOComponentsStateProvider extends DeviceIOComponentsStateProvider {

    @NotNull
    public static final String ALEXA_APP_PACKAGE_NAME = "com.amazon.dee.app";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_VERSION_QUALCOMM_APP = 400001;

    @NotNull
    public static final String QUALCOMM_PACKAGE_NAME = "com.quicinc.voice.activation";

    @NotNull
    private static final String TAG = "QualcommIOProvider";

    @NotNull
    private final String activePackageName;

    @NotNull
    private final PackageManager packageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualcommIOComponentsStateProvider(@NotNull String str, @NotNull String str2, @NotNull PackageManager packageManager) {
        super(str, str2);
        str.getClass();
        str2.getClass();
        packageManager.getClass();
        this.packageManager = packageManager;
        this.activePackageName = INSTANCE.getPackageName$capabilities_release(packageManager);
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.iocomponents.DeviceIOComponentsStateProvider
    @Nullable
    public String getFirmwareVersion() {
        try {
            return this.packageManager.getPackageInfo(this.activePackageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Unable to find package: " + this.activePackageName, e);
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/QualcommIOComponentsStateProvider$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "QUALCOMM_PACKAGE_NAME", "ALEXA_APP_PACKAGE_NAME", "MIN_VERSION_QUALCOMM_APP", "", "getPackageName", "packageManager", "Landroid/content/pm/PackageManager;", "getPackageName$capabilities_release", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getPackageName$capabilities_release(@NotNull PackageManager packageManager) {
            packageManager.getClass();
            try {
                return packageManager.getPackageInfo(QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME, 0).versionCode >= 400001 ? "com.amazon.dee.app" : QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(QualcommIOComponentsStateProvider.TAG, "Unable to find package: com.quicinc.voice.activation", e);
                return QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME;
            }
        }

        private Companion() {
        }
    }
}
