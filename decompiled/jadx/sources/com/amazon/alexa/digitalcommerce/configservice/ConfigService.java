package com.amazon.alexa.digitalcommerce.configservice;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/configservice/ConfigService;", "", "productDescription", "Lcom/amazon/alexa/digitalcommerce/configservice/ConfigServiceModel;", "<init>", "(Lcom/amazon/alexa/digitalcommerce/configservice/ConfigServiceModel;)V", "getProductDescription", "()Lcom/amazon/alexa/digitalcommerce/configservice/ConfigServiceModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ConfigService {

    @NotNull
    private final ConfigServiceModel productDescription;

    public ConfigService(@NotNull ConfigServiceModel configServiceModel) {
        configServiceModel.getClass();
        this.productDescription = configServiceModel;
    }

    public static /* synthetic */ ConfigService copy$default(ConfigService configService, ConfigServiceModel configServiceModel, int i, Object obj) {
        if ((i & 1) != 0) {
            configServiceModel = configService.productDescription;
        }
        return configService.copy(configServiceModel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ConfigServiceModel getProductDescription() {
        return this.productDescription;
    }

    @NotNull
    public final ConfigService copy(@NotNull ConfigServiceModel productDescription) {
        productDescription.getClass();
        return new ConfigService(productDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConfigService) && Intrinsics.areEqual(this.productDescription, ((ConfigService) other).productDescription);
    }

    @NotNull
    public final ConfigServiceModel getProductDescription() {
        return this.productDescription;
    }

    public int hashCode() {
        return this.productDescription.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigService(productDescription=" + this.productDescription + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
