package com.amazon.alexa.ra.core.ui;

import android.app.KeyguardManager;
import android.content.Intent;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/LockScreenManager;", "", "<init>", "()V", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class LockScreenManager {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_IS_SCREEN_LOCKED = "is_screen_locked";

    @NotNull
    private static final String EXTRA_IS_SCREEN_LOCKED_SECURE = "is_screen_locked_secure";

    @NotNull
    private static final String TAG = "LockScreenManager";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/LockScreenManager$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "EXTRA_IS_SCREEN_LOCKED", "EXTRA_IS_SCREEN_LOCKED_SECURE", "requestPhoneUnlockIfRequired", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "intent", "Landroid/content/Intent;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void requestPhoneUnlockIfRequired(@NotNull AppCompatActivity activity, @Nullable Intent intent) {
            activity.getClass();
            boolean booleanExtra = intent != null ? intent.getBooleanExtra(LockScreenManager.EXTRA_IS_SCREEN_LOCKED, false) : false;
            boolean booleanExtra2 = intent != null ? intent.getBooleanExtra(LockScreenManager.EXTRA_IS_SCREEN_LOCKED_SECURE, false) : false;
            Log.i(LockScreenManager.TAG, "Checking unlock requirements - isOverLockScreen: " + booleanExtra + ", isLockScreenSecure: " + booleanExtra2);
            if (!booleanExtra || booleanExtra2) {
                return;
            }
            Object systemService = activity.getSystemService("keyguard");
            systemService.getClass();
            ((KeyguardManager) systemService).requestDismissKeyguard(activity, new KeyguardManager.KeyguardDismissCallback() { // from class: com.amazon.alexa.ra.core.ui.LockScreenManager$Companion$requestPhoneUnlockIfRequired$1
                @Override // android.app.KeyguardManager.KeyguardDismissCallback
                public void onDismissCancelled() {
                    Log.w("LockScreenManager", "Keyguard dismissal was cancelled");
                }

                @Override // android.app.KeyguardManager.KeyguardDismissCallback
                public void onDismissError() {
                    Log.e("LockScreenManager", "Failed to dismiss keyguard");
                }

                @Override // android.app.KeyguardManager.KeyguardDismissCallback
                public void onDismissSucceeded() {
                    Log.i("LockScreenManager", "Keyguard dismissal succeeded");
                }
            });
        }

        private Companion() {
        }
    }
}
