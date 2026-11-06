package com.amazon.dee.app.ui.main.appcomponent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.databinding.DataBindingUtil;
import com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.core.databinding.AlexaGlobalHeaderBinding;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DefaultGlobalHeader implements GlobalHeader {
    private static final String TAG = "DefaultGlobalHeader";
    private final int buildType;
    private final Context context;
    private final GlobalHeaderEventPublisher eventPublisher;
    private final boolean hasNotificationIngress;
    private final boolean hasPersistentAlexaPlusUpsell;
    private final boolean hasPremiumBenefits;
    private final boolean hasProfileIngress;
    private final boolean hasQuickAdd;
    private final boolean hasTitle;
    private final boolean hasTransparentBackground;
    private final GlobalHeaderState headerState;
    private View headerView;
    private final int iconBackground;
    private final int rightButtonType;

    private DefaultGlobalHeader(Builder builder, Context context) {
        this.hasProfileIngress = builder.hasProfileIngress;
        this.hasNotificationIngress = builder.hasNotificationIngress;
        this.hasPersistentAlexaPlusUpsell = builder.hasPersistentAlexaPlusUpsell;
        this.hasQuickAdd = builder.hasQuickAdd;
        this.hasTransparentBackground = builder.hasTransparentBackground;
        this.hasTitle = builder.hasTitle;
        this.rightButtonType = builder.rightButtonType;
        this.hasPremiumBenefits = builder.hasPremiumBenefits;
        this.buildType = builder.buildType;
        this.iconBackground = builder.iconBackground;
        this.context = context;
        this.headerState = builder.globalHeaderState;
        this.eventPublisher = builder.globalHeaderEventPublisher;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultGlobalHeader)) {
            return false;
        }
        DefaultGlobalHeader defaultGlobalHeader = (DefaultGlobalHeader) obj;
        if (this.hasProfileIngress == defaultGlobalHeader.hasProfileIngress && this.hasNotificationIngress == defaultGlobalHeader.hasNotificationIngress && this.hasPersistentAlexaPlusUpsell == defaultGlobalHeader.hasPersistentAlexaPlusUpsell && this.hasQuickAdd == defaultGlobalHeader.hasQuickAdd && this.hasTransparentBackground == defaultGlobalHeader.hasTransparentBackground && this.hasTitle == defaultGlobalHeader.hasTitle && this.rightButtonType == defaultGlobalHeader.rightButtonType && this.hasPremiumBenefits == defaultGlobalHeader.hasPremiumBenefits && this.buildType == defaultGlobalHeader.buildType && this.iconBackground == defaultGlobalHeader.iconBackground && this.headerState.equals(defaultGlobalHeader.headerState)) {
            return this.eventPublisher.equals(defaultGlobalHeader.eventPublisher);
        }
        return false;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public int getBuildType() {
        return this.buildType;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    @NonNull
    public GlobalHeaderEventPublisher getEventPublisher() {
        return this.eventPublisher;
    }

    @NonNull
    public GlobalHeaderState getHeaderState() {
        return this.headerState;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public int getIconBackground() {
        return this.iconBackground;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    @Nullable
    @SuppressLint({"SetTextI18n"})
    public View getMockView(@NonNull Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.alexa_global_header, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText("Mock Header");
        return inflate;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public int getRightButtonType() {
        return this.rightButtonType;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    @NonNull
    public View getView() {
        if (this.headerView == null) {
            AlexaGlobalHeaderBinding alexaGlobalHeaderBinding = (AlexaGlobalHeaderBinding) DataBindingUtil.inflate(LayoutInflater.from(this.context), R.layout.alexa_global_header, null, false);
            alexaGlobalHeaderBinding.setGlobalHeader(this);
            alexaGlobalHeaderBinding.setGlobalHeaderState(this.headerState);
            alexaGlobalHeaderBinding.setEventPublisher(this.eventPublisher);
            this.headerView = alexaGlobalHeaderBinding.getRoot();
        }
        return this.headerView;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasNotificationIngress() {
        return this.hasNotificationIngress;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasPersistentAlexaPlusUpsell() {
        return this.hasPersistentAlexaPlusUpsell;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasPremiumBenefits() {
        return this.hasPremiumBenefits;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasProfileIngress() {
        return this.hasProfileIngress;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasQuickAdd() {
        return this.hasQuickAdd;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasTitle() {
        return this.hasTitle;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader
    public boolean hasTransparentBackground() {
        return this.hasTransparentBackground;
    }

    public int hashCode() {
        return this.eventPublisher.hashCode() + ((this.headerState.hashCode() + ((((((((((((((((((((this.hasProfileIngress ? 1 : 0) * 31) + (this.hasNotificationIngress ? 1 : 0)) * 31) + (this.hasPersistentAlexaPlusUpsell ? 1 : 0)) * 31) + (this.hasQuickAdd ? 1 : 0)) * 31) + (this.hasTransparentBackground ? 1 : 0)) * 31) + (this.hasTitle ? 1 : 0)) * 31) + this.rightButtonType) * 31) + (this.hasPremiumBenefits ? 1 : 0)) * 31) + this.buildType) * 31) + this.iconBackground) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultGlobalHeader{hasProfileIngress=");
        sb.append(this.hasProfileIngress);
        sb.append(", hasNotificationIngress=");
        sb.append(this.hasNotificationIngress);
        sb.append(", hasPersistentAlexaPlusUpsell=");
        sb.append(this.hasPersistentAlexaPlusUpsell);
        sb.append(", hasQuickAdd=");
        sb.append(this.hasQuickAdd);
        sb.append(", hasTransparentBackground=");
        sb.append(this.hasTransparentBackground);
        sb.append(", hasTitle=");
        sb.append(this.hasTitle);
        sb.append(", rightButtonType=");
        sb.append(this.rightButtonType);
        sb.append(", hasPremiumBenefits=");
        sb.append(this.hasPremiumBenefits);
        sb.append(", buildType=");
        sb.append(this.buildType);
        sb.append(", iconBackground=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.iconBackground, AbstractJsonLexerKt.END_OBJ);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder implements GlobalHeader.Builder {
        private int buildType;
        private Context context;
        private GlobalHeaderEventPublisher globalHeaderEventPublisher;
        private GlobalHeaderState globalHeaderState;
        private boolean hasNotificationIngress;
        private boolean hasPersistentAlexaPlusUpsell;
        private boolean hasPremiumBenefits;
        private boolean hasProfileIngress;
        private boolean hasQuickAdd;
        private boolean hasTitle;
        private boolean hasTransparentBackground;
        private int rightButtonType = 0;
        private int iconBackground = 1;

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public GlobalHeader build() {
            Context context = this.context;
            if (context == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Context must be set using withContext() before building");
                return null;
            }
            if (this.globalHeaderState == null) {
                Single$$ExternalSyntheticBUOutline0.m$2("HeaderState must be set using withHeaderState() before building");
                return null;
            }
            if (this.globalHeaderEventPublisher != null) {
                return new DefaultGlobalHeader(this, context, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("EventPublisher must be set using withEventPublisher() before building");
            return null;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public GlobalHeader.Builder hasPremiumBenefits(boolean z) {
            this.hasPremiumBenefits = z;
            return this;
        }

        @NonNull
        public GlobalHeader.Builder withBuildType(int i) {
            this.buildType = i;
            return this;
        }

        @NonNull
        public Builder withContext(@NonNull Context context) {
            this.context = context;
            return this;
        }

        @NonNull
        public Builder withEventPublisher(@NonNull GlobalHeaderEventPublisher globalHeaderEventPublisher) {
            this.globalHeaderEventPublisher = globalHeaderEventPublisher;
            return this;
        }

        @NonNull
        public Builder withGlobalHeaderState(@NonNull GlobalHeaderState globalHeaderState) {
            this.globalHeaderState = globalHeaderState;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public GlobalHeader.Builder withHeaderButtonBackground(int i) {
            this.iconBackground = i;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public GlobalHeader.Builder withPersistentAlexaPlusUpsell() {
            this.hasPersistentAlexaPlusUpsell = true;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public Builder withRightButtonAs(int i) {
            if (i == 0 || i == 1 || i == 2) {
                this.rightButtonType = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid right button type: "));
            return null;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public Builder withNotificationIngress() {
            this.hasNotificationIngress = true;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public Builder withProfileIngress() {
            this.hasProfileIngress = true;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public Builder withQuickAdd() {
            this.hasQuickAdd = true;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public Builder withTitle() {
            this.hasTitle = true;
            return this;
        }

        @Override // com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader.Builder
        @NonNull
        public Builder withTransparentBackground() {
            this.hasTransparentBackground = true;
            return this;
        }
    }

    public /* synthetic */ DefaultGlobalHeader(Builder builder, Context context, int i) {
        this(builder, context);
    }
}
