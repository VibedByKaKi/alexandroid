package com.amazon.alexa.dialog.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.dialog.api.Dialog;
import com.dee.app.contacts.common.constants.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0002KLB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010F\u001a\u00020\u0015H\u0016J\b\u0010G\u001a\u00020\u0005H\u0002J\u0017\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010IH\u0001¢\u0006\u0002\bJR&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R$\u0010\u0017\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0003\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R&\u0010'\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u0003\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R&\u0010+\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0003\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R&\u0010/\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0003\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R&\u00103\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b5\u0010\u0003\u001a\u0004\b6\u00107\"\u0004\b8\u00109R&\u0010:\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u0003\u001a\u0004\b<\u00107\"\u0004\b=\u00109R&\u0010>\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b?\u0010\u0003\u001a\u0004\b@\u00107\"\u0004\bA\u00109R&\u0010B\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u0003\u001a\u0004\bD\u00107\"\u0004\bE\u00109¨\u0006M"}, d2 = {"Lcom/amazon/alexa/dialog/impl/Dialog;", "Lcom/amazon/alexa/dialog/api/Dialog;", "<init>", "()V", "alertDialog", "Landroid/app/AlertDialog;", "getAlertDialog$AlexaMobileAndroidDialog_release$annotations", "getAlertDialog$AlexaMobileAndroidDialog_release", "()Landroid/app/AlertDialog;", "setAlertDialog$AlexaMobileAndroidDialog_release", "(Landroid/app/AlertDialog;)V", "contextField", "Landroid/content/Context;", "getContextField$AlexaMobileAndroidDialog_release$annotations", "getContextField$AlexaMobileAndroidDialog_release", "()Landroid/content/Context;", "setContextField$AlexaMobileAndroidDialog_release", "(Landroid/content/Context;)V", "context", "getContext", "isShowing", "", "()Z", "cancelable", "getCancelable$AlexaMobileAndroidDialog_release$annotations", "getCancelable$AlexaMobileAndroidDialog_release", "setCancelable$AlexaMobileAndroidDialog_release", "(Z)V", "message", "", "getMessage$AlexaMobileAndroidDialog_release$annotations", "getMessage$AlexaMobileAndroidDialog_release", "()Ljava/lang/CharSequence;", "setMessage$AlexaMobileAndroidDialog_release", "(Ljava/lang/CharSequence;)V", "negativeText", "getNegativeText$AlexaMobileAndroidDialog_release$annotations", "getNegativeText$AlexaMobileAndroidDialog_release", "setNegativeText$AlexaMobileAndroidDialog_release", "neutralText", "getNeutralText$AlexaMobileAndroidDialog_release$annotations", "getNeutralText$AlexaMobileAndroidDialog_release", "setNeutralText$AlexaMobileAndroidDialog_release", "positiveText", "getPositiveText$AlexaMobileAndroidDialog_release$annotations", "getPositiveText$AlexaMobileAndroidDialog_release", "setPositiveText$AlexaMobileAndroidDialog_release", "title", "getTitle$AlexaMobileAndroidDialog_release$annotations", "getTitle$AlexaMobileAndroidDialog_release", "setTitle$AlexaMobileAndroidDialog_release", "cancelRunnable", "Ljava/lang/Runnable;", "getCancelRunnable$AlexaMobileAndroidDialog_release$annotations", "getCancelRunnable$AlexaMobileAndroidDialog_release", "()Ljava/lang/Runnable;", "setCancelRunnable$AlexaMobileAndroidDialog_release", "(Ljava/lang/Runnable;)V", "negativeRunnable", "getNegativeRunnable$AlexaMobileAndroidDialog_release$annotations", "getNegativeRunnable$AlexaMobileAndroidDialog_release", "setNegativeRunnable$AlexaMobileAndroidDialog_release", "neutralRunnable", "getNeutralRunnable$AlexaMobileAndroidDialog_release$annotations", "getNeutralRunnable$AlexaMobileAndroidDialog_release", "setNeutralRunnable$AlexaMobileAndroidDialog_release", "positiveRunnable", "getPositiveRunnable$AlexaMobileAndroidDialog_release$annotations", "getPositiveRunnable$AlexaMobileAndroidDialog_release", "setPositiveRunnable$AlexaMobileAndroidDialog_release", "show", "buildAlertDialog", "builder", "Landroid/app/AlertDialog$Builder;", "buildAlertDialog$AlexaMobileAndroidDialog_release", "Builder", "Companion", "AlexaMobileAndroidDialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Dialog implements com.amazon.alexa.dialog.api.Dialog {

    @Nullable
    private static volatile WeakReference<Activity> mainActivity;

    @Nullable
    private AlertDialog alertDialog;

    @Nullable
    private Runnable cancelRunnable;
    private boolean cancelable = true;

    @Nullable
    private Context contextField;

    @Nullable
    private CharSequence message;

    @Nullable
    private Runnable negativeRunnable;

    @Nullable
    private CharSequence negativeText;

    @Nullable
    private Runnable neutralRunnable;

    @Nullable
    private CharSequence neutralText;

    @Nullable
    private Runnable positiveRunnable;

    @Nullable
    private CharSequence positiveText;

    @Nullable
    private CharSequence title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Dialog";

    @NotNull
    private static final Object mainActivityLock = new Object();

    private final AlertDialog buildAlertDialog() {
        return buildAlertDialog$AlexaMobileAndroidDialog_release(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAlertDialog$lambda$2(Dialog dialog, DialogInterface dialogInterface, int i) {
        Runnable runnable = dialog.negativeRunnable;
        runnable.getClass();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAlertDialog$lambda$3(Dialog dialog, DialogInterface dialogInterface, int i) {
        Runnable runnable = dialog.neutralRunnable;
        runnable.getClass();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAlertDialog$lambda$4(Dialog dialog, DialogInterface dialogInterface, int i) {
        Runnable runnable = dialog.positiveRunnable;
        runnable.getClass();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAlertDialog$lambda$5(Dialog dialog, DialogInterface dialogInterface) {
        Runnable runnable = dialog.cancelRunnable;
        runnable.getClass();
        runnable.run();
    }

    @JvmStatic
    public static final void setMainActivity(@NotNull Activity activity) {
        INSTANCE.setMainActivity(activity);
    }

    @VisibleForTesting
    @NotNull
    public final AlertDialog buildAlertDialog$AlexaMobileAndroidDialog_release(@Nullable AlertDialog.Builder builder) {
        AlertDialog.Builder builder2;
        if (builder == null) {
            if (this.contextField != null) {
                Context context = this.contextField;
                context.getClass();
                builder = new AlertDialog.Builder(context);
            } else {
                synchronized (mainActivityLock) {
                    WeakReference<Activity> weakReference = mainActivity;
                    weakReference.getClass();
                    Activity activity = weakReference.get();
                    activity.getClass();
                    builder2 = new AlertDialog.Builder(activity);
                }
                builder = builder2;
            }
        }
        builder.setCancelable(this.cancelable);
        CharSequence charSequence = this.message;
        if (charSequence != null) {
            builder.setMessage(charSequence);
        }
        CharSequence charSequence2 = this.title;
        if (charSequence2 != null) {
            builder.setTitle(charSequence2);
        }
        CharSequence charSequence3 = this.negativeText;
        if (charSequence3 != null && this.negativeRunnable != null) {
            final int i = 0;
            builder.setNegativeButton(charSequence3, new DialogInterface.OnClickListener(this) { // from class: com.amazon.alexa.dialog.impl.Dialog$$ExternalSyntheticLambda0
                public final /* synthetic */ Dialog f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = i;
                    Dialog dialog = this.f$0;
                    switch (i3) {
                        case 0:
                            Dialog.buildAlertDialog$lambda$2(dialog, dialogInterface, i2);
                            break;
                        case 1:
                            Dialog.buildAlertDialog$lambda$3(dialog, dialogInterface, i2);
                            break;
                        default:
                            Dialog.buildAlertDialog$lambda$4(dialog, dialogInterface, i2);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence4 = this.neutralText;
        if (charSequence4 != null && this.neutralRunnable != null) {
            final int i2 = 1;
            builder.setNeutralButton(charSequence4, new DialogInterface.OnClickListener(this) { // from class: com.amazon.alexa.dialog.impl.Dialog$$ExternalSyntheticLambda0
                public final /* synthetic */ Dialog f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    int i3 = i2;
                    Dialog dialog = this.f$0;
                    switch (i3) {
                        case 0:
                            Dialog.buildAlertDialog$lambda$2(dialog, dialogInterface, i22);
                            break;
                        case 1:
                            Dialog.buildAlertDialog$lambda$3(dialog, dialogInterface, i22);
                            break;
                        default:
                            Dialog.buildAlertDialog$lambda$4(dialog, dialogInterface, i22);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence5 = this.positiveText;
        if (charSequence5 != null && this.positiveRunnable != null) {
            final int i3 = 2;
            builder.setPositiveButton(charSequence5, new DialogInterface.OnClickListener(this) { // from class: com.amazon.alexa.dialog.impl.Dialog$$ExternalSyntheticLambda0
                public final /* synthetic */ Dialog f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    int i32 = i3;
                    Dialog dialog = this.f$0;
                    switch (i32) {
                        case 0:
                            Dialog.buildAlertDialog$lambda$2(dialog, dialogInterface, i22);
                            break;
                        case 1:
                            Dialog.buildAlertDialog$lambda$3(dialog, dialogInterface, i22);
                            break;
                        default:
                            Dialog.buildAlertDialog$lambda$4(dialog, dialogInterface, i22);
                            break;
                    }
                }
            });
        }
        if (this.cancelRunnable != null) {
            builder.setOnCancelListener(new Dialog$$ExternalSyntheticLambda3(this, 0));
        }
        AlertDialog create = builder.create();
        this.alertDialog = create;
        create.getClass();
        return create;
    }

    @Nullable
    /* renamed from: getAlertDialog$AlexaMobileAndroidDialog_release, reason: from getter */
    public final AlertDialog getAlertDialog() {
        return this.alertDialog;
    }

    @Nullable
    /* renamed from: getCancelRunnable$AlexaMobileAndroidDialog_release, reason: from getter */
    public final Runnable getCancelRunnable() {
        return this.cancelRunnable;
    }

    /* renamed from: getCancelable$AlexaMobileAndroidDialog_release, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @Override // com.amazon.alexa.dialog.api.Dialog
    @NotNull
    public Context getContext() {
        Context context = this.contextField;
        if (context != null) {
            return context;
        }
        WeakReference<Activity> weakReference = mainActivity;
        weakReference.getClass();
        Activity activity = weakReference.get();
        activity.getClass();
        return activity;
    }

    @Nullable
    /* renamed from: getContextField$AlexaMobileAndroidDialog_release, reason: from getter */
    public final Context getContextField() {
        return this.contextField;
    }

    @Nullable
    /* renamed from: getMessage$AlexaMobileAndroidDialog_release, reason: from getter */
    public final CharSequence getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: getNegativeRunnable$AlexaMobileAndroidDialog_release, reason: from getter */
    public final Runnable getNegativeRunnable() {
        return this.negativeRunnable;
    }

    @Nullable
    /* renamed from: getNegativeText$AlexaMobileAndroidDialog_release, reason: from getter */
    public final CharSequence getNegativeText() {
        return this.negativeText;
    }

    @Nullable
    /* renamed from: getNeutralRunnable$AlexaMobileAndroidDialog_release, reason: from getter */
    public final Runnable getNeutralRunnable() {
        return this.neutralRunnable;
    }

    @Nullable
    /* renamed from: getNeutralText$AlexaMobileAndroidDialog_release, reason: from getter */
    public final CharSequence getNeutralText() {
        return this.neutralText;
    }

    @Nullable
    /* renamed from: getPositiveRunnable$AlexaMobileAndroidDialog_release, reason: from getter */
    public final Runnable getPositiveRunnable() {
        return this.positiveRunnable;
    }

    @Nullable
    /* renamed from: getPositiveText$AlexaMobileAndroidDialog_release, reason: from getter */
    public final CharSequence getPositiveText() {
        return this.positiveText;
    }

    @Nullable
    /* renamed from: getTitle$AlexaMobileAndroidDialog_release, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @Override // com.amazon.alexa.dialog.api.Dialog
    public boolean isShowing() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public final void setAlertDialog$AlexaMobileAndroidDialog_release(@Nullable AlertDialog alertDialog) {
        this.alertDialog = alertDialog;
    }

    public final void setCancelRunnable$AlexaMobileAndroidDialog_release(@Nullable Runnable runnable) {
        this.cancelRunnable = runnable;
    }

    public final void setCancelable$AlexaMobileAndroidDialog_release(boolean z) {
        this.cancelable = z;
    }

    public final void setContextField$AlexaMobileAndroidDialog_release(@Nullable Context context) {
        this.contextField = context;
    }

    public final void setMessage$AlexaMobileAndroidDialog_release(@Nullable CharSequence charSequence) {
        this.message = charSequence;
    }

    public final void setNegativeRunnable$AlexaMobileAndroidDialog_release(@Nullable Runnable runnable) {
        this.negativeRunnable = runnable;
    }

    public final void setNegativeText$AlexaMobileAndroidDialog_release(@Nullable CharSequence charSequence) {
        this.negativeText = charSequence;
    }

    public final void setNeutralRunnable$AlexaMobileAndroidDialog_release(@Nullable Runnable runnable) {
        this.neutralRunnable = runnable;
    }

    public final void setNeutralText$AlexaMobileAndroidDialog_release(@Nullable CharSequence charSequence) {
        this.neutralText = charSequence;
    }

    public final void setPositiveRunnable$AlexaMobileAndroidDialog_release(@Nullable Runnable runnable) {
        this.positiveRunnable = runnable;
    }

    public final void setPositiveText$AlexaMobileAndroidDialog_release(@Nullable CharSequence charSequence) {
        this.positiveText = charSequence;
    }

    public final void setTitle$AlexaMobileAndroidDialog_release(@Nullable CharSequence charSequence) {
        this.title = charSequence;
    }

    @Override // com.amazon.alexa.dialog.api.Dialog
    public boolean show() {
        try {
            AlertDialog buildAlertDialog = buildAlertDialog();
            buildAlertDialog.show();
            this.alertDialog = buildAlertDialog;
            return true;
        } catch (WindowManager.BadTokenException e) {
            Log.e(TAG, "Exception caught while showing Dialog: " + e);
            return false;
        } catch (NullPointerException e2) {
            Log.e(TAG, "Exception caught while showing Dialog: " + e2);
            return false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/dialog/impl/Dialog$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "mainActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "mainActivityLock", "setMainActivity", "", "activity", "AlexaMobileAndroidDialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setMainActivity(@NotNull Activity activity) {
            activity.getClass();
            synchronized (Dialog.mainActivityLock) {
                Dialog.mainActivity = new WeakReference(activity);
                Unit unit = Unit.INSTANCE;
            }
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/dialog/impl/Dialog$Builder;", "Lcom/amazon/alexa/dialog/api/Dialog$Builder;", "<init>", "()V", "dialog", "Lcom/amazon/alexa/dialog/impl/Dialog;", "getDialog$annotations", "getDialog", "()Lcom/amazon/alexa/dialog/impl/Dialog;", "setDialog", "(Lcom/amazon/alexa/dialog/impl/Dialog;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setContext", "context", "Landroid/content/Context;", "setCancelable", "cancelable", "", "setMessage", "message", "", "setNegativeButton", "text", "action", "Ljava/lang/Runnable;", "setNeutralButton", "setOnCancelAction", "setPositiveButton", "setTitle", "title", "show", "AlexaMobileAndroidDialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder implements Dialog.Builder {

        @NotNull
        private Dialog dialog = new Dialog();

        @NotNull
        public final Dialog getDialog() {
            return this.dialog;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setCancelable(boolean cancelable) {
            this.dialog.setCancelable$AlexaMobileAndroidDialog_release(cancelable);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setContext(@Nullable Context context) {
            this.dialog.setContextField$AlexaMobileAndroidDialog_release(context);
            return this;
        }

        public final void setDialog(@NotNull Dialog dialog) {
            dialog.getClass();
            this.dialog = dialog;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setMessage(@NotNull CharSequence message) {
            message.getClass();
            this.dialog.setMessage$AlexaMobileAndroidDialog_release(message);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setNegativeButton(@NotNull CharSequence text, @NotNull Runnable action) {
            text.getClass();
            action.getClass();
            this.dialog.setNegativeText$AlexaMobileAndroidDialog_release(text);
            this.dialog.setNegativeRunnable$AlexaMobileAndroidDialog_release(action);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setNeutralButton(@NotNull CharSequence text, @NotNull Runnable action) {
            text.getClass();
            action.getClass();
            this.dialog.setNeutralText$AlexaMobileAndroidDialog_release(text);
            this.dialog.setNeutralRunnable$AlexaMobileAndroidDialog_release(action);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setOnCancelAction(@NotNull Runnable action) {
            action.getClass();
            this.dialog.setCancelRunnable$AlexaMobileAndroidDialog_release(action);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setPositiveButton(@NotNull CharSequence text, @NotNull Runnable action) {
            text.getClass();
            action.getClass();
            this.dialog.setPositiveText$AlexaMobileAndroidDialog_release(text);
            this.dialog.setPositiveRunnable$AlexaMobileAndroidDialog_release(action);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        public Builder setTitle(@NotNull CharSequence title) {
            title.getClass();
            this.dialog.setTitle$AlexaMobileAndroidDialog_release(title);
            return this;
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        public boolean show() {
            return getDialog().show();
        }

        @Override // com.amazon.alexa.dialog.api.Dialog.Builder
        @NotNull
        /* renamed from: build, reason: from getter */
        public Dialog getDialog() {
            return this.dialog;
        }

        @VisibleForTesting
        public static /* synthetic */ void getDialog$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getAlertDialog$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getCancelRunnable$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getCancelable$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getContextField$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMessage$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNegativeRunnable$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNegativeText$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNeutralRunnable$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNeutralText$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPositiveRunnable$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPositiveText$AlexaMobileAndroidDialog_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTitle$AlexaMobileAndroidDialog_release$annotations() {
    }
}
