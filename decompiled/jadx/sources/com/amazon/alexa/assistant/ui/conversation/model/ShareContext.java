package com.amazon.alexa.assistant.ui.conversation.model;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.ui.conversation.fragments.SdkFragment;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ShareContext;", "", "fragments", "", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/SdkFragment;", "responseText", "", "activity", "Landroid/app/Activity;", "<init>", "(Ljava/util/List;Ljava/lang/String;Landroid/app/Activity;)V", "getFragments", "()Ljava/util/List;", "getResponseText", "()Ljava/lang/String;", "getActivity", "()Landroid/app/Activity;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ShareContext {
    public static final int $stable = 8;

    @NotNull
    private final Activity activity;

    @NotNull
    private final List<SdkFragment> fragments;

    @Nullable
    private final String responseText;

    public ShareContext(@NotNull List<SdkFragment> list, @Nullable String str, @NotNull Activity activity) {
        list.getClass();
        activity.getClass();
        this.fragments = list;
        this.responseText = str;
        this.activity = activity;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final List<SdkFragment> getFragments() {
        return this.fragments;
    }

    @Nullable
    public final String getResponseText() {
        return this.responseText;
    }
}
