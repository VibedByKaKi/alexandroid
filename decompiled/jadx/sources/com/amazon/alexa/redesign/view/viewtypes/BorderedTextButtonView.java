package com.amazon.alexa.redesign.view.viewtypes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0002¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/view/viewtypes/BorderedTextButtonView;", "Lcom/amazon/alexa/redesign/view/viewtypes/TextButtonView;", "context", "Landroid/content/Context;", "root", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/LayoutInflater;Landroid/util/AttributeSet;I)V", "bind", "", "model", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "metricsObject", "", "", "", ViewProps.ACCESSIBILITY_LABEL, "styleTextButton", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class BorderedTextButtonView extends TextButtonView {
    public static final int $stable = 0;

    public /* synthetic */ BorderedTextButtonView(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewGroup, layoutInflater, (i2 & 8) != 0 ? null : attributeSet, (i2 & 16) != 0 ? 0 : i);
    }

    private final void styleTextButton() {
        int i = ThemeUtil.isLightMode(getContext()) ? R.attr.mosaicBackground : R.attr.mosaicNeutral10;
        Button textButton = getTextButton();
        if (textButton != null) {
            textButton.setTextColor(ThemeUtil.getColorFromAttribute(textButton.getContext(), i));
            textButton.setBackgroundColor(ThemeUtil.getColorFromAttribute(textButton.getContext(), R.attr.mosaicAction20));
        }
    }

    @Override // com.amazon.alexa.redesign.view.viewtypes.TextButtonView, com.amazon.alexa.redesign.view.viewtypes.ViewType
    public void bind(@NotNull ViewTypeModel model, @NotNull Map<String, ? extends Object> metricsObject, @NotNull String accessibilityLabel) {
        model.getClass();
        metricsObject.getClass();
        accessibilityLabel.getClass();
        super.bind(model, metricsObject, accessibilityLabel);
        styleTextButton();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorderedTextButtonView(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet) {
        this(context, viewGroup, layoutInflater, attributeSet, 0, 16, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorderedTextButtonView(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable LayoutInflater layoutInflater) {
        this(context, viewGroup, layoutInflater, null, 0, 24, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorderedTextButtonView(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet, int i) {
        super(context, viewGroup, layoutInflater, attributeSet, i);
        context.getClass();
    }
}
