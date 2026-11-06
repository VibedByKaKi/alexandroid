package com.amazon.dee.app.services.usermessage;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Looper;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import com.amazon.alexa.protocols.usermessage.UserMessageService;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.usermessage.DefaultUserMessageService;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultUserMessageService implements UserMessageService {
    private static final String LOG_TAG = "DefaultUserMessageService";
    private final WeakReference<Activity> weakActivity;

    public DefaultUserMessageService(@Nullable Activity activity) {
        this.weakActivity = new WeakReference<>(activity);
    }

    @Override // com.amazon.alexa.protocols.usermessage.UserMessageService
    @NonNull
    public UserMessageService.MessageBuilder message(@StringRes int i) {
        return new AlertDialogMessageBuilder(i);
    }

    @Override // com.amazon.alexa.protocols.usermessage.UserMessageService
    @NonNull
    public UserMessageService.MessageBuilder message(CharSequence charSequence) {
        return new AlertDialogMessageBuilder(charSequence);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AlertDialogMessageBuilder implements UserMessageService.MessageBuilder {
        Runnable actionRunnable;
        int actionTextId;

        @VisibleForTesting
        AlertDialog.Builder builder;
        Runnable cancelRunnable;
        int cancelTextId;
        Runnable dismissRunnable;
        CharSequence text;
        int textId;

        public AlertDialogMessageBuilder(@StringRes int i) {
            this.textId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$configureAlertDialog$0(DialogInterface dialogInterface) {
            this.dismissRunnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$configureAlertDialog$2(DialogInterface dialogInterface, int i) {
            this.actionRunnable.run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$configureAlertDialog$3(DialogInterface dialogInterface, int i) {
            this.cancelRunnable.run();
        }

        @VisibleForTesting
        public void configureAlertDialog(AlertDialog.Builder builder) {
            if (this.dismissRunnable != null) {
                builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.amazon.dee.app.services.usermessage.DefaultUserMessageService$AlertDialogMessageBuilder$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        DefaultUserMessageService.AlertDialogMessageBuilder.this.lambda$configureAlertDialog$0(dialogInterface);
                    }
                });
            }
            if (this.actionRunnable == null) {
                builder.setPositiveButton(R.string.ok, new DefaultUserMessageService$AlertDialogMessageBuilder$$ExternalSyntheticLambda1());
            } else {
                final int i = 0;
                builder.setPositiveButton(this.actionTextId, new DialogInterface.OnClickListener(this) { // from class: com.amazon.dee.app.services.usermessage.DefaultUserMessageService$AlertDialogMessageBuilder$$ExternalSyntheticLambda2
                    public final /* synthetic */ DefaultUserMessageService.AlertDialogMessageBuilder f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        int i3 = i;
                        DefaultUserMessageService.AlertDialogMessageBuilder alertDialogMessageBuilder = this.f$0;
                        switch (i3) {
                            case 0:
                                alertDialogMessageBuilder.lambda$configureAlertDialog$2(dialogInterface, i2);
                                break;
                            default:
                                alertDialogMessageBuilder.lambda$configureAlertDialog$3(dialogInterface, i2);
                                break;
                        }
                    }
                });
            }
            if (this.cancelRunnable != null) {
                final int i2 = 1;
                builder.setNegativeButton(this.cancelTextId, new DialogInterface.OnClickListener(this) { // from class: com.amazon.dee.app.services.usermessage.DefaultUserMessageService$AlertDialogMessageBuilder$$ExternalSyntheticLambda2
                    public final /* synthetic */ DefaultUserMessageService.AlertDialogMessageBuilder f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i22) {
                        int i3 = i2;
                        DefaultUserMessageService.AlertDialogMessageBuilder alertDialogMessageBuilder = this.f$0;
                        switch (i3) {
                            case 0:
                                alertDialogMessageBuilder.lambda$configureAlertDialog$2(dialogInterface, i22);
                                break;
                            default:
                                alertDialogMessageBuilder.lambda$configureAlertDialog$3(dialogInterface, i22);
                                break;
                        }
                    }
                });
            }
        }

        @VisibleForTesting
        public void configureAlertDialogMessage(AlertDialog.Builder builder) {
            CharSequence charSequence = this.text;
            if (charSequence != null) {
                builder.setMessage(charSequence);
            } else {
                builder.setMessage(this.textId);
            }
        }

        @Override // com.amazon.alexa.protocols.usermessage.UserMessageService.MessageBuilder
        public void show() {
            final Activity activity = (Activity) DefaultUserMessageService.this.weakActivity.get();
            if (activity == null || activity.isFinishing()) {
                Log.w(DefaultUserMessageService.LOG_TAG, "Failed to display dialog, activity is null");
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                lambda$show$4(activity);
            } else {
                activity.runOnUiThread(new Runnable() { // from class: com.amazon.dee.app.services.usermessage.DefaultUserMessageService$AlertDialogMessageBuilder$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultUserMessageService.AlertDialogMessageBuilder.this.lambda$show$4(activity);
                    }
                });
            }
        }

        @VisibleForTesting
        /* renamed from: showOnMainThread, reason: merged with bridge method [inline-methods] */
        public void lambda$show$4(Activity activity) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            this.builder = builder;
            configureAlertDialog(builder);
            try {
                configureAlertDialogMessage(this.builder);
                this.builder.show();
            } catch (WindowManager.BadTokenException e) {
                Log.e(DefaultUserMessageService.LOG_TAG, "Caught bad token exception trying to show dialog: " + e);
            }
        }

        @Override // com.amazon.alexa.protocols.usermessage.UserMessageService.MessageBuilder
        @NonNull
        public UserMessageService.MessageBuilder withAction(@StringRes int i, @NonNull Runnable runnable) {
            this.actionTextId = i;
            this.actionRunnable = runnable;
            return this;
        }

        @Override // com.amazon.alexa.protocols.usermessage.UserMessageService.MessageBuilder
        @NonNull
        public UserMessageService.MessageBuilder withCancel(@StringRes int i, @NonNull Runnable runnable) {
            this.cancelTextId = i;
            this.cancelRunnable = runnable;
            return this;
        }

        @Override // com.amazon.alexa.protocols.usermessage.UserMessageService.MessageBuilder
        @NonNull
        public UserMessageService.MessageBuilder withDismiss(@NonNull Runnable runnable) {
            this.dismissRunnable = runnable;
            return this;
        }

        public AlertDialogMessageBuilder(CharSequence charSequence) {
            this.text = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$configureAlertDialog$1(DialogInterface dialogInterface, int i) {
        }
    }
}
