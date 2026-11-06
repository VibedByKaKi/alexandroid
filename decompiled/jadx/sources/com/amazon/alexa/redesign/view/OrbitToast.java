package com.amazon.alexa.redesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.ttcf.TTCFService$$ExternalSyntheticLambda0;
import com.amazon.apl.android.APLLayout$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R*\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/view/OrbitToast;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "toast", "getToast$annotations", "()V", "getToast", "()Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", "toastText", "getToastText$annotations", "getToastText", "()Landroid/widget/TextView;", "initView", "", "showHomeModeToast", "toastPayload", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class OrbitToast extends RelativeLayout {
    public static final int $stable = 8;

    @Nullable
    private RelativeLayout toast;

    @Nullable
    private TextView toastText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitToast(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        initView(context);
    }

    private final void initView(Context context) {
        RelativeLayout relativeLayout = (RelativeLayout) View.inflate(context, R.layout.amahc_orbit_toast, this);
        this.toast = relativeLayout != null ? (RelativeLayout) relativeLayout.findViewById(R.id.home_channel_toast_view) : null;
        this.toastText = relativeLayout != null ? (TextView) relativeLayout.findViewById(R.id.home_channel_toast_text) : null;
        RelativeLayout relativeLayout2 = this.toast;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHomeModeToast$lambda$1(OrbitToast orbitToast, String str) {
        TextView textView = orbitToast.toastText;
        if (textView != null) {
            textView.setText(str);
        }
        RelativeLayout relativeLayout = orbitToast.toast;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = orbitToast.toast;
        if (relativeLayout2 != null) {
            relativeLayout2.announceForAccessibility(str);
        }
        RelativeLayout relativeLayout3 = orbitToast.toast;
        if (relativeLayout3 != null) {
            relativeLayout3.postDelayed(new TTCFService$$ExternalSyntheticLambda0(orbitToast, 22), 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHomeModeToast$lambda$1$lambda$0(OrbitToast orbitToast) {
        RelativeLayout relativeLayout = orbitToast.toast;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    @Nullable
    public final RelativeLayout getToast() {
        return this.toast;
    }

    @Nullable
    public final TextView getToastText() {
        return this.toastText;
    }

    public final void showHomeModeToast(@NotNull String toastPayload) {
        toastPayload.getClass();
        RelativeLayout relativeLayout = this.toast;
        if (relativeLayout != null) {
            relativeLayout.post(new APLLayout$$ExternalSyntheticLambda0(this, toastPayload, 4));
        }
    }

    public /* synthetic */ OrbitToast(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @VisibleForTesting
    public static /* synthetic */ void getToast$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getToastText$annotations() {
    }
}
