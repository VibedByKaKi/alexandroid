package com.amazon.tarazed.ui.toast;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.VisibleForTesting;
import com.amazon.tarazed.R;
import com.amazon.tarazed.ui.WindowParamsHelper;
import com.amazon.tarazed.utility.AccessibilityHelper;
import com.amazon.tarazed.utility.DeviceInfoUtility;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/tarazed/ui/toast/SystemToast;", "Landroid/widget/Toast;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "duration", "", "mainLooperHandler", "Landroid/os/Handler;", "deviceInfoUtility", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "(Landroid/content/Context;Landroid/view/View;ILandroid/os/Handler;Lcom/amazon/tarazed/utility/DeviceInfoUtility;)V", "isDisplayed", "", "isDisplayed$TarazedAndroidLibrary_release$annotations", "()V", "isDisplayed$TarazedAndroidLibrary_release", "()Z", "setDisplayed$TarazedAndroidLibrary_release", "(Z)V", "cancel", "", "createLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "applicationContext", "presentToast", "windowManager", "Landroid/view/WindowManager;", "layoutParams", "show", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SystemToast extends Toast {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int LONG_DELAY_MILLIS = 3500;

    @Deprecated
    public static final int SHORT_DELAY_MILLIS = 2000;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceInfoUtility deviceInfoUtility;
    private boolean isDisplayed;

    @NotNull
    private final Handler mainLooperHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemToast(@NotNull Context context, @NotNull View view, int i, @NotNull Handler handler, @NotNull DeviceInfoUtility deviceInfoUtility) {
        super(context);
        context.getClass();
        view.getClass();
        handler.getClass();
        deviceInfoUtility.getClass();
        this.context = context;
        this.mainLooperHandler = handler;
        this.deviceInfoUtility = deviceInfoUtility;
        setView(view);
        setDuration(i);
    }

    private final WindowManager.LayoutParams createLayoutParams(Context applicationContext) {
        int dimensionPixelSize = applicationContext.getResources().getDimensionPixelSize(R.dimen.firetv_toast_margin);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, dimensionPixelSize, dimensionPixelSize, WindowParamsHelper.INSTANCE.getWindowType(this.deviceInfoUtility), 152, -3);
        layoutParams.gravity = 8388693;
        return layoutParams;
    }

    private final void presentToast(WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        windowManager.addView(getView(), layoutParams);
        View view = getView();
        TextView textView = view != null ? (TextView) view.findViewById(R.id.system_toast_message) : null;
        if (textView != null) {
            AccessibilityHelper accessibilityHelper = AccessibilityHelper.INSTANCE;
            Context context = this.context;
            CharSequence text = textView.getText();
            text.getClass();
            accessibilityHelper.announceForAccessibility1P(context, text);
        }
        this.isDisplayed = true;
        this.mainLooperHandler.postDelayed(new LifecycleUtils$$ExternalSyntheticLambda4(this, windowManager, 8), getDuration() == 1 ? LONG_DELAY_MILLIS : 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentToast$lambda$0(SystemToast systemToast, WindowManager windowManager) {
        systemToast.getClass();
        windowManager.getClass();
        if (systemToast.isDisplayed) {
            windowManager.removeView(systemToast.getView());
        }
        systemToast.isDisplayed = false;
    }

    @Override // android.widget.Toast
    public void cancel() {
        Object systemService = this.context.getApplicationContext().getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        if (this.isDisplayed) {
            windowManager.removeView(getView());
            this.isDisplayed = false;
        }
    }

    /* renamed from: isDisplayed$TarazedAndroidLibrary_release, reason: from getter */
    public final boolean getIsDisplayed() {
        return this.isDisplayed;
    }

    public final void setDisplayed$TarazedAndroidLibrary_release(boolean z) {
        this.isDisplayed = z;
    }

    @Override // android.widget.Toast
    public void show() {
        Context applicationContext = this.context.getApplicationContext();
        Object systemService = applicationContext.getSystemService("window");
        systemService.getClass();
        presentToast((WindowManager) systemService, createLayoutParams(applicationContext));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/ui/toast/SystemToast$Companion;", "", "()V", "LONG_DELAY_MILLIS", "", "SHORT_DELAY_MILLIS", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void isDisplayed$TarazedAndroidLibrary_release$annotations() {
    }
}
