package com.amazon.alexa.redesign.view.viewtypes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.entity.viewtypes.TextButtonModel;
import com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel;
import com.amazon.alexa.redesign.utils.Constants;
import com.amazon.alexa.redesign.utils.TestIdUtil;
import com.amazon.alexa.redesign.view.templates.TemplateHelperUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001bH\u0002R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/amazon/alexa/redesign/view/viewtypes/TextButtonView;", "Landroid/widget/LinearLayout;", "Lcom/amazon/alexa/redesign/view/viewtypes/ViewType;", "context", "Landroid/content/Context;", "root", "Landroid/view/ViewGroup;", "inflater", "Landroid/view/LayoutInflater;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/LayoutInflater;Landroid/util/AttributeSet;I)V", "textButton", "Landroid/widget/Button;", "getTextButton", "()Landroid/widget/Button;", "setTextButton", "(Landroid/widget/Button;)V", "textButtonLinearLayout", "getTextButtonLinearLayout", "()Landroid/widget/LinearLayout;", "setTextButtonLinearLayout", "(Landroid/widget/LinearLayout;)V", "bind", "", "model", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "metricsObject", "", "", "", ViewProps.ACCESSIBILITY_LABEL, "styleTextButton", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public class TextButtonView extends LinearLayout implements ViewType {
    public static final int $stable = 8;

    @Nullable
    private Button textButton;

    @Nullable
    private LinearLayout textButtonLinearLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextButtonView(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.amahc_viewtype_text_button, viewGroup, true) : null;
        if (inflate != null) {
            this.textButton = (Button) inflate.findViewById(R.id.text_button);
            this.textButtonLinearLayout = (LinearLayout) inflate.findViewById(R.id.text_button_linear_layout);
        }
    }

    private final void styleTextButton() {
        Button button = this.textButton;
        if (button != null) {
            button.setTextColor(ThemeUtil.getColorFromAttribute(button.getContext(), R.attr.mosaicAction10));
            button.setBackgroundColor(0);
            button.setTypeface(FontResolver.getFont(button.getContext(), Font.APP_TEXT_BOLD));
            button.setGravity(17);
            button.setLetterSpacing(0.05f);
            TemplateHelperUtil.Companion companion = TemplateHelperUtil.INSTANCE;
            Context context = button.getContext();
            context.getClass();
            companion.scaleTextViewWithFontFireOS(button, context, R.integer.amahc_fireos_font_scaling_button);
        }
    }

    public void bind(@NotNull ViewTypeModel model, @NotNull Map<String, ? extends Object> metricsObject, @NotNull String accessibilityLabel) {
        Button button;
        model.getClass();
        metricsObject.getClass();
        accessibilityLabel.getClass();
        if (model instanceof TextButtonModel) {
            Button button2 = this.textButton;
            if (button2 != null) {
                button2.setText(((TextButtonModel) model).get_buttonText());
            }
            styleTextButton();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = this.textButtonLinearLayout;
            if (linearLayout != null) {
                linearLayout.setLayoutParams(layoutParams);
            }
            if (!Constants.AutomationConstants.INSTANCE.isQABuild() || (button = this.textButton) == null) {
                return;
            }
            Object obj = metricsObject.get("contentProvider");
            String obj2 = obj != null ? obj.toString() : null;
            Object obj3 = metricsObject.get("contentType");
            String obj4 = obj3 != null ? obj3.toString() : null;
            if (obj2 == null || obj4 == null) {
                return;
            }
            TestIdUtil.INSTANCE.setTestId(button, obj2, obj4, "_" + ((Object) button.getText()) + "_button");
        }
    }

    @Nullable
    public final Button getTextButton() {
        return this.textButton;
    }

    @Nullable
    public final LinearLayout getTextButtonLinearLayout() {
        return this.textButtonLinearLayout;
    }

    public final void setTextButton(@Nullable Button button) {
        this.textButton = button;
    }

    public final void setTextButtonLinearLayout(@Nullable LinearLayout linearLayout) {
        this.textButtonLinearLayout = linearLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextButtonView(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable LayoutInflater layoutInflater, @Nullable AttributeSet attributeSet) {
        this(context, viewGroup, layoutInflater, attributeSet, 0, 16, null);
        context.getClass();
    }

    public /* synthetic */ TextButtonView(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewGroup, layoutInflater, (i2 & 8) != 0 ? null : attributeSet, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextButtonView(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable LayoutInflater layoutInflater) {
        this(context, viewGroup, layoutInflater, null, 0, 24, null);
        context.getClass();
    }
}
