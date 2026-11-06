package com.amazon.alexa.digitalcommerce.configservice;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/configservice/ConfigServiceModel;", "", "productAsin", "", "externalIdentifier", "Lcom/amazon/alexa/digitalcommerce/configservice/ExternalIdentifier;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/digitalcommerce/configservice/ExternalIdentifier;)V", "getProductAsin", "()Ljava/lang/String;", "getExternalIdentifier", "()Lcom/amazon/alexa/digitalcommerce/configservice/ExternalIdentifier;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ConfigServiceModel {

    @NotNull
    private final ExternalIdentifier externalIdentifier;

    @NotNull
    private final String productAsin;

    public ConfigServiceModel(@NotNull String str, @NotNull ExternalIdentifier externalIdentifier) {
        str.getClass();
        externalIdentifier.getClass();
        this.productAsin = str;
        this.externalIdentifier = externalIdentifier;
    }

    public static /* synthetic */ ConfigServiceModel copy$default(ConfigServiceModel configServiceModel, String str, ExternalIdentifier externalIdentifier, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configServiceModel.productAsin;
        }
        if ((i & 2) != 0) {
            externalIdentifier = configServiceModel.externalIdentifier;
        }
        return configServiceModel.copy(str, externalIdentifier);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductAsin() {
        return this.productAsin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ExternalIdentifier getExternalIdentifier() {
        return this.externalIdentifier;
    }

    @NotNull
    public final ConfigServiceModel copy(@NotNull String productAsin, @NotNull ExternalIdentifier externalIdentifier) {
        productAsin.getClass();
        externalIdentifier.getClass();
        return new ConfigServiceModel(productAsin, externalIdentifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigServiceModel)) {
            return false;
        }
        ConfigServiceModel configServiceModel = (ConfigServiceModel) other;
        return Intrinsics.areEqual(this.productAsin, configServiceModel.productAsin) && Intrinsics.areEqual(this.externalIdentifier, configServiceModel.externalIdentifier);
    }

    @NotNull
    public final ExternalIdentifier getExternalIdentifier() {
        return this.externalIdentifier;
    }

    @NotNull
    public final String getProductAsin() {
        return this.productAsin;
    }

    public int hashCode() {
        return this.externalIdentifier.hashCode() + (this.productAsin.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ConfigServiceModel(productAsin=" + this.productAsin + ", externalIdentifier=" + this.externalIdentifier + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
