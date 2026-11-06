package com.amazon.alexa.redesign.compose.home;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/redesign/compose/home/MockGlobalHeader;", "Lcom/amazon/alexa/protocols/ui/appcomponent/GlobalHeader;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hasProfileIngress", "", "hasNotificationIngress", "hasQuickAdd", "hasTransparentBackground", "hasTitle", "hasPremiumBenefits", "getBuildType", "", "getRightButtonType", "getView", "Landroid/view/View;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class MockGlobalHeader implements GlobalHeader {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public MockGlobalHeader(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public int getBuildType() {
        return 2;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public int getRightButtonType() {
        return 0;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    @SuppressLint({"SetTextI18n"})
    @NotNull
    public View getView() {
        TextView textView = new TextView(this.context);
        textView.setText("Global Header");
        textView.setBackgroundResource(R.color.holo_blue_dark);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setHeight(45);
        textView.setPadding(16, 2, 2, 16);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(textView.getResources().getColor(R.color.white, textView.getContext().getTheme()));
        return textView;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasNotificationIngress() {
        return false;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasPremiumBenefits() {
        return false;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasProfileIngress() {
        return false;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasQuickAdd() {
        return false;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasTitle() {
        return false;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasTransparentBackground() {
        return false;
    }
}
