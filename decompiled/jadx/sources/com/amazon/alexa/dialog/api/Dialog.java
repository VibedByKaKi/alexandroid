package com.amazon.alexa.dialog.api;

import android.content.Context;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\t\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/dialog/api/Dialog;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "isShowing", "", "()Z", "show", "Builder", "AlexaMobileAndroidDialogApi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Dialog {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\fH&J\b\u0010\u0016\u001a\u00020\u0006H&¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/dialog/api/Dialog$Builder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/dialog/api/Dialog;", "setCancelable", "cancelable", "", "setContext", "context", "Landroid/content/Context;", "setMessage", "message", "", "setNegativeButton", "text", "action", "Ljava/lang/Runnable;", "setNeutralButton", "setOnCancelAction", "setPositiveButton", "setTitle", "title", "show", "AlexaMobileAndroidDialogApi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        @NotNull
        Dialog build();

        @NotNull
        Builder setCancelable(boolean cancelable);

        @NotNull
        Builder setContext(@Nullable Context context);

        @NotNull
        Builder setMessage(@NotNull CharSequence message);

        @NotNull
        Builder setNegativeButton(@NotNull CharSequence text, @NotNull Runnable action);

        @NotNull
        Builder setNeutralButton(@NotNull CharSequence text, @NotNull Runnable action);

        @NotNull
        Builder setOnCancelAction(@NotNull Runnable action);

        @NotNull
        Builder setPositiveButton(@NotNull CharSequence text, @NotNull Runnable action);

        @NotNull
        Builder setTitle(@NotNull CharSequence title);

        boolean show();
    }

    @NotNull
    Context getContext();

    boolean isShowing();

    boolean show();
}
