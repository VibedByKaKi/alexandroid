package com.amazon.alexa.redesign.view.errorPage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.Navigation$$ExternalSyntheticLambda0;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.presenter.StartHandler$$ExternalSyntheticLambda2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/redesign/view/errorPage/ErrorPage;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Landroid/view/View;", "errorPageRootView", "getErrorPageRootView$annotations", "()V", "getErrorPageRootView", "()Landroid/view/View;", "retry", "Landroid/widget/TextView;", "onErrorPageRetryClickListener", "Lkotlin/Function0;", "", "getOnErrorPageRetryClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnErrorPageRetryClickListener", "(Lkotlin/jvm/functions/Function0;)V", "retryClicked", "Landroid/view/View$OnClickListener;", "getRetryClicked$annotations", "getRetryClicked", "()Landroid/view/View$OnClickListener;", "initView", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ErrorPage extends LinearLayout {
    public static final int $stable = 8;

    @Nullable
    private View errorPageRootView;

    @NotNull
    private Function0<Unit> onErrorPageRetryClickListener;

    @Nullable
    private TextView retry;

    @NotNull
    private final View.OnClickListener retryClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ErrorPage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.onErrorPageRetryClickListener = new StartHandler$$ExternalSyntheticLambda2(24);
        this.retryClicked = new Navigation$$ExternalSyntheticLambda0(this, 17);
        initView(context);
    }

    private final void initView(Context context) {
        View inflate = View.inflate(context, R.layout.amahc_error_page, this);
        TextView textView = null;
        inflate.setOnClickListener(null);
        this.errorPageRootView = inflate;
        TextView textView2 = (TextView) inflate.findViewById(R.id.error_page_subtitle);
        if (textView2 != null) {
            textView2.setOnClickListener(this.retryClicked);
            textView = textView2;
        }
        this.retry = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retryClicked$lambda$1(ErrorPage errorPage, View view) {
        errorPage.onErrorPageRetryClickListener.invoke();
    }

    @Nullable
    public final View getErrorPageRootView() {
        return this.errorPageRootView;
    }

    @NotNull
    public final Function0<Unit> getOnErrorPageRetryClickListener() {
        return this.onErrorPageRetryClickListener;
    }

    @NotNull
    public final View.OnClickListener getRetryClicked() {
        return this.retryClicked;
    }

    public final void setOnErrorPageRetryClickListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.onErrorPageRetryClickListener = function0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorPageRootView$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRetryClicked$annotations() {
    }

    public /* synthetic */ ErrorPage(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorPage(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
