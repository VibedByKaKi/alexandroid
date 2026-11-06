package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J+\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "reactInstanceDevHelper", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "<init>", "(Lcom/facebook/react/devsupport/ReactInstanceDevHelper;)V", "devLoadingView", "Landroid/widget/TextView;", "devLoadingPopup", "Landroid/widget/PopupWindow;", "showMessage", "", "message", "", "updateProgress", "status", "done", "", "total", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", Constants.HINT_TEXT_OPERATION_HIDE, "showInternal", "hideInternal", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultDevLoadingViewImplementation implements DevLoadingViewManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isEnabled = true;

    @Nullable
    private PopupWindow devLoadingPopup;

    @Nullable
    private TextView devLoadingView;

    @NotNull
    private final ReactInstanceDevHelper reactInstanceDevHelper;

    public DefaultDevLoadingViewImplementation(@NotNull ReactInstanceDevHelper reactInstanceDevHelper) {
        reactInstanceDevHelper.getClass();
        this.reactInstanceDevHelper = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideInternal() {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.devLoadingPopup = null;
            this.devLoadingView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInternal(String message) {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                FLog.e(ReactConstants.TAG, "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i = rect.top;
                Object systemService = currentActivity.getSystemService("layout_inflater");
                systemService.getClass();
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.dev_loading_view, (ViewGroup) null);
                inflate.getClass();
                TextView textView = (TextView) inflate;
                textView.setText(message);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i);
                this.devLoadingView = textView;
                this.devLoadingPopup = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                FLog.e(ReactConstants.TAG, "Unable to display loading message because react activity isn't active, message: " + message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProgress$lambda$1(Integer num, Integer num2, DefaultDevLoadingViewImplementation defaultDevLoadingViewImplementation, String str) {
        String str2;
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
        }
        TextView textView = defaultDevLoadingViewImplementation.devLoadingView;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + str2 + "…");
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void hide() {
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new BridgeDevSupportManager$$ExternalSyntheticLambda0(this, 1));
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void showMessage(@NotNull String message) {
        message.getClass();
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new DevSupportManagerBase$$ExternalSyntheticLambda1(this, message, 3));
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void updateProgress(@Nullable String status, @Nullable Integer done, @Nullable Integer total) {
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new Schedulers$$ExternalSyntheticLambda1(26, done, total, this, status));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation$Companion;", "", "<init>", "()V", "isEnabled", "", "setDevLoadingEnabled", "", "enabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setDevLoadingEnabled(boolean enabled) {
            DefaultDevLoadingViewImplementation.isEnabled = enabled;
        }

        private Companion() {
        }
    }
}
