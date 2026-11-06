package com.amazon.tarazed.ui.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.amazon.tarazed.R;
import com.amazon.tarazed.utility.DeviceInfoUtility;
import it.innove.Peripheral$$ExternalSyntheticLambda3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/tarazed/ui/toast/ToastManager;", "", "context", "Landroid/content/Context;", "mainLooperHandler", "Landroid/os/Handler;", "deviceInfoUtility", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "(Landroid/content/Context;Landroid/os/Handler;Lcom/amazon/tarazed/utility/DeviceInfoUtility;)V", "toast", "Landroid/widget/Toast;", "view", "Landroid/view/View;", "displayToast", "", "text", "", "duration", "", "makeToast", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ToastManager {

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceInfoUtility deviceInfoUtility;

    @NotNull
    private final Handler mainLooperHandler;

    @Nullable
    private Toast toast;

    @NotNull
    private final View view;

    public ToastManager(@NotNull Context context, @NotNull Handler handler, @NotNull DeviceInfoUtility deviceInfoUtility) {
        context.getClass();
        handler.getClass();
        deviceInfoUtility.getClass();
        this.context = context;
        this.mainLooperHandler = handler;
        this.deviceInfoUtility = deviceInfoUtility;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.firetv_toast, new FrameLayout(context));
        inflate.getClass();
        this.view = inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayToast$lambda$0(ToastManager toastManager, CharSequence charSequence, int i) {
        toastManager.getClass();
        charSequence.getClass();
        toastManager.makeToast(charSequence, i);
        Toast toast = toastManager.toast;
        if (toast != null) {
            toast.show();
        }
    }

    @SuppressLint({"ShowToast"})
    private final void makeToast(CharSequence text, int duration) {
        Toast makeText;
        Toast toast = this.toast;
        if (toast != null) {
            toast.cancel();
        }
        if (this.deviceInfoUtility.is1PDevice()) {
            ((TextView) this.view.findViewById(R.id.system_toast_message)).setText(text);
            makeText = new SystemToast(this.context, this.view, duration, this.mainLooperHandler, this.deviceInfoUtility);
        } else {
            makeText = Toast.makeText(this.context, text, duration);
        }
        this.toast = makeText;
    }

    public final void displayToast(@NotNull CharSequence text, int duration) {
        text.getClass();
        this.mainLooperHandler.post(new Peripheral$$ExternalSyntheticLambda3(this, text, duration, 14));
    }
}
