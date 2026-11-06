package com.amazon.tarazed.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.amazon.deecomms.perms.PermissionsHelper$$ExternalSyntheticLambda1;
import com.amazon.tarazed.R;
import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import com.amazon.tarazed.logging.TarazedSessionLogger;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0001EB)\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fJ\b\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000fJ\u0015\u0010$\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020!H\u0002J\u0015\u0010'\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000fJ\u001a\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u00020\u00002\u0006\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00104\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0018J\u001a\u0010?\u001a\u00020\u00002\u0006\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u000fJ\u0015\u0010B\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010,J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006F"}, d2 = {"Lcom/amazon/tarazed/dialog/AlertDialogBuilder;", "Landroid/app/AlertDialog$Builder;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "(Landroid/content/Context;Lcom/amazon/tarazed/logging/TarazedSessionLogger;Lkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;)V", "themeResId", "", "(Landroid/content/Context;Lcom/amazon/tarazed/logging/TarazedSessionLogger;ILkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;)V", "canceledOnTouchOutside", "", "dialogAutoDismissMs", "", "Ljava/lang/Long;", "forceSystem", "messageList", "", "", "onShowListener", "Landroid/content/DialogInterface$OnShowListener;", "selectPositiveButton", "widthResourceId", "Ljava/lang/Integer;", "windowType", "addMessage", "messageIds", "", "create", "Landroid/app/AlertDialog;", "setCanceledOnTouchOutside", "cancel", "setDialogAutoDismissMs", "autoDismissMs", "(Ljava/lang/Long;)Lcom/amazon/tarazed/dialog/AlertDialogBuilder;", "setDialogWidth", "", "resourceId", "alertDialog", "newWidthResourceId", "(Ljava/lang/Integer;)Lcom/amazon/tarazed/dialog/AlertDialogBuilder;", "setForceSystem", "forceSystemValue", "setNegativeButton", "textId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/DialogInterface$OnClickListener;", "setNeutralButton", "setOnCancelListener", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "setOnDismissListener", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "setOnKeyListener", "onKeyListener", "Landroid/content/DialogInterface$OnKeyListener;", "setOnShowListener", "newOnShowListener", "setPositiveButton", "setSelectPositiveButton", "selectPositiveButtonValue", "setTitle", "titleId", "setWindowType", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertDialogBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialogBuilder.kt\ncom/amazon/tarazed/dialog/AlertDialogBuilder\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,306:1\n107#2:307\n79#2,22:308\n*S KotlinDebug\n*F\n+ 1 AlertDialogBuilder.kt\ncom/amazon/tarazed/dialog/AlertDialogBuilder\n*L\n244#1:307\n244#1:308,22\n*E\n"})
/* loaded from: classes17.dex */
public final class AlertDialogBuilder extends AlertDialog.Builder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "AlertDialogBuilder";
    private boolean canceledOnTouchOutside;

    @NotNull
    private CoroutineScope coroutineScope;

    @Nullable
    private Long dialogAutoDismissMs;

    @NotNull
    private DispatcherProvider dispatchers;
    private boolean forceSystem;

    @NotNull
    private TarazedSessionLogger logger;

    @NotNull
    private List<String> messageList;

    @Nullable
    private DialogInterface.OnShowListener onShowListener;
    private boolean selectPositiveButton;

    @Nullable
    private Integer widthResourceId;

    @Nullable
    private Integer windowType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogBuilder(@NotNull Context context, @NotNull TarazedSessionLogger tarazedSessionLogger, int i, @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider) {
        super(context, i);
        context.getClass();
        tarazedSessionLogger.getClass();
        coroutineScope.getClass();
        dispatcherProvider.getClass();
        this.canceledOnTouchOutside = true;
        this.logger = tarazedSessionLogger;
        this.messageList = new ArrayList();
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatcherProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$2(AlertDialogBuilder alertDialogBuilder, AlertDialog alertDialog, DialogInterface dialogInterface) {
        alertDialogBuilder.getClass();
        Integer num = alertDialogBuilder.widthResourceId;
        if (num != null) {
            int intValue = num.intValue();
            alertDialog.getClass();
            alertDialogBuilder.setDialogWidth(intValue, alertDialog);
        }
        if (alertDialogBuilder.selectPositiveButton) {
            Button button = alertDialog.getButton(-1);
            button.setFocusableInTouchMode(true);
            if (button.isInTouchMode()) {
                Drawable background = button.getBackground();
                button.setBackgroundResource(R.drawable.hidden_focus_button);
                button.setOnFocusChangeListener(new AlertDialogBuilder$$ExternalSyntheticLambda0(button, background, 0));
            }
            button.requestFocus();
        }
        DialogInterface.OnShowListener onShowListener = alertDialogBuilder.onShowListener;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
        if (alertDialogBuilder.dialogAutoDismissMs != null) {
            BuildersKt__Builders_commonKt.launch$default(alertDialogBuilder.coroutineScope, alertDialogBuilder.dispatchers.main(), null, new AlertDialogBuilder$create$2$2(alertDialogBuilder, alertDialog, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$2$lambda$1(Button button, Drawable drawable, View view, boolean z) {
        if (button.isInTouchMode()) {
            return;
        }
        button.setBackground(drawable);
    }

    private final void setDialogWidth(int resourceId, AlertDialog alertDialog) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(resourceId);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = alertDialog.getWindow();
        if (window == null) {
            this.logger.w(TAG, "setDialogWidth - Dialog's window is null");
            return;
        }
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = dimensionPixelSize;
        Window window2 = alertDialog.getWindow();
        if (window2 == null) {
            return;
        }
        window2.setAttributes(layoutParams);
    }

    @NotNull
    public final AlertDialogBuilder addMessage(@NotNull List<Integer> messageIds) {
        messageIds.getClass();
        Iterator<Integer> it2 = messageIds.iterator();
        while (it2.hasNext()) {
            int intValue = it2.next().intValue();
            List<String> list = this.messageList;
            String string = getContext().getString(intValue);
            string.getClass();
            list.add(string);
        }
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialog create() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = this.messageList.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(" ");
        }
        String sb2 = sb.toString();
        int length = sb2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) sb2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        setMessage(sb2.subSequence(i, length + 1).toString());
        AlertDialog create = super.create();
        create.setCanceledOnTouchOutside(this.canceledOnTouchOutside);
        if (this.forceSystem) {
            Window window = create.getWindow();
            if (window == null || (num = this.windowType) == null) {
                this.logger.w(TAG, "setWindowType - Dialog's window is null");
            } else {
                window.setType(num.intValue());
            }
        }
        create.setOnShowListener(new PermissionsHelper$$ExternalSyntheticLambda1(this, create));
        return create;
    }

    @NotNull
    public final AlertDialogBuilder setCanceledOnTouchOutside(boolean cancel) {
        this.canceledOnTouchOutside = cancel;
        return this;
    }

    @NotNull
    public final AlertDialogBuilder setDialogAutoDismissMs(@Nullable Long autoDismissMs) {
        this.dialogAutoDismissMs = autoDismissMs;
        return this;
    }

    @NotNull
    public final AlertDialogBuilder setForceSystem(boolean forceSystemValue) {
        this.forceSystem = forceSystemValue;
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialogBuilder setNegativeButton(int textId, @Nullable DialogInterface.OnClickListener listener) {
        if (textId != 0 && listener != null) {
            super.setNegativeButton(textId, listener);
        }
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialogBuilder setNeutralButton(int textId, @Nullable DialogInterface.OnClickListener listener) {
        if (textId != 0 && listener != null) {
            super.setNeutralButton(textId, listener);
        }
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialogBuilder setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (onCancelListener != null) {
            super.setOnCancelListener(onCancelListener);
        }
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialogBuilder setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            super.setOnDismissListener(onDismissListener);
        }
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialogBuilder setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        if (onKeyListener != null) {
            super.setOnKeyListener(onKeyListener);
        }
        return this;
    }

    @NotNull
    public final AlertDialogBuilder setOnShowListener(@NotNull DialogInterface.OnShowListener newOnShowListener) {
        newOnShowListener.getClass();
        this.onShowListener = newOnShowListener;
        return this;
    }

    @Override // android.app.AlertDialog.Builder
    @NotNull
    public AlertDialogBuilder setPositiveButton(int textId, @Nullable DialogInterface.OnClickListener listener) {
        if (textId != 0 && listener != null) {
            super.setPositiveButton(textId, listener);
        }
        return this;
    }

    @NotNull
    public final AlertDialogBuilder setSelectPositiveButton(boolean selectPositiveButtonValue) {
        this.selectPositiveButton = selectPositiveButtonValue;
        return this;
    }

    @NotNull
    public final AlertDialogBuilder setTitle(@Nullable Integer titleId) {
        if (titleId != null) {
            setTitle(titleId.intValue());
        }
        return this;
    }

    @NotNull
    public final AlertDialogBuilder setWindowType(int windowType) {
        this.windowType = Integer.valueOf(windowType);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/tarazed/dialog/AlertDialogBuilder$Companion;", "", "()V", Constants.LOG_TAG, "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogBuilder(@Nullable Context context, @NotNull TarazedSessionLogger tarazedSessionLogger, @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider) {
        super(context);
        tarazedSessionLogger.getClass();
        coroutineScope.getClass();
        dispatcherProvider.getClass();
        this.canceledOnTouchOutside = true;
        this.logger = tarazedSessionLogger;
        this.messageList = new ArrayList();
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatcherProvider;
    }

    @NotNull
    public final AlertDialogBuilder setDialogWidth(@Nullable Integer newWidthResourceId) {
        this.widthResourceId = newWidthResourceId;
        return this;
    }
}
