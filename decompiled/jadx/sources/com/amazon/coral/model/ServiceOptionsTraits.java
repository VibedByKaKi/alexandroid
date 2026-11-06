package com.amazon.coral.model;

import com.amazon.alexa.mobile.assistant.client.metrics.RaUiEventMetricsAdapter;
import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.ServiceOptionsTraitsValidator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "serviceoptions", targets = {ServiceModel.class})
@UseTraitValidator(ServiceOptionsTraitsValidator.class)
/* loaded from: classes19.dex */
public class ServiceOptionsTraits extends AbstractTraits {
    private static final DisableSpecificityRoutingMode DISABLE_SPECIFICITY_ROUTING_DEFAULT_MODE = DisableSpecificityRoutingMode.AUTO;
    private static final String DISABLE_SPECIFICITY_ROUTING_TAG = "disablespecificityrouting";
    private static final String ROUTING_MODE_TAG = "routingmode";
    private final String disableSpecificityRouting;
    private final boolean emptyLabelAllowed;
    private final String routingMode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DisableSpecificityRoutingMode {
        TRUE("true"),
        FALSE("false"),
        AUTO("auto");

        private final String value;

        DisableSpecificityRoutingMode(String str) {
            this.value = str;
        }

        public static DisableSpecificityRoutingMode from(String str) {
            if (str == null) {
                return AUTO;
            }
            if (str.equals("true")) {
                return TRUE;
            }
            if (str.equals("false")) {
                return FALSE;
            }
            if (str.equals("auto")) {
                return AUTO;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("The value `", str, "` for `DisableSpecificityRoutingMode` is unknown"));
            return null;
        }

        public static boolean isValid(String str) {
            if (str == null) {
                return true;
            }
            for (DisableSpecificityRoutingMode disableSpecificityRoutingMode : values()) {
                if (disableSpecificityRoutingMode.value.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RoutingMode {
        TRADITIONAL(RaUiEventMetricsAdapter.VISUAL_THEME_TRADITIONAL),
        AUTO("auto"),
        SPECIFICITY("specificity");

        private final String value;

        RoutingMode(String str) {
            this.value = str;
        }

        public static RoutingMode from(String str) {
            if (str == null) {
                return AUTO;
            }
            RoutingMode routingMode = SPECIFICITY;
            if (routingMode.toString().equals(str)) {
                return routingMode;
            }
            RoutingMode routingMode2 = TRADITIONAL;
            if (routingMode2.toString().equals(str)) {
                return routingMode2;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("The value `", str, "` for `RoutingMode` is unknown"));
            return null;
        }

        public static boolean isValid(String str) {
            if (str == null) {
                return true;
            }
            for (RoutingMode routingMode : values()) {
                if (routingMode.value.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public ServiceOptionsTraits(boolean z) {
        this(ServiceOptionsTraits.class, Model.Id.NONE, "", "N/A", z, "auto", "auto");
    }

    public static RoutingMode routingMode(ServiceOptionsTraits serviceOptionsTraits) {
        return serviceOptionsTraits == null ? RoutingMode.AUTO : RoutingMode.from(serviceOptionsTraits.routingMode());
    }

    public static DisableSpecificityRoutingMode specificityRoutingDisabledMode(ServiceOptionsTraits serviceOptionsTraits) {
        return serviceOptionsTraits == null ? DISABLE_SPECIFICITY_ROUTING_DEFAULT_MODE : DisableSpecificityRoutingMode.from(serviceOptionsTraits.specificityRoutingDisabled());
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServiceOptionsTraits)) {
            return false;
        }
        ServiceOptionsTraits serviceOptionsTraits = (ServiceOptionsTraits) obj;
        if (isEmptyLabelAllowed() == serviceOptionsTraits.isEmptyLabelAllowed() && Objects.equals(specificityRoutingDisabled(), serviceOptionsTraits.specificityRoutingDisabled()) && Objects.equals(routingMode(), serviceOptionsTraits.routingMode())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "emptylabelallowed")
    public boolean isEmptyLabelAllowed() {
        return this.emptyLabelAllowed;
    }

    @TraitProperty(emitIfNull = false, name = DISABLE_SPECIFICITY_ROUTING_TAG)
    public String specificityRoutingDisabled() {
        return this.disableSpecificityRouting;
    }

    @TraitProperty(emitIfNull = false, name = ROUTING_MODE_TAG)
    public String routingMode() {
        return this.routingMode;
    }

    @ValidTraitOr({@ValidTrait(requires = {}), @ValidTrait(requires = {"emptylabelallowed"}), @ValidTrait(requires = {DISABLE_SPECIFICITY_ROUTING_TAG}), @ValidTrait(requires = {"emptylabelallowed", DISABLE_SPECIFICITY_ROUTING_TAG}), @ValidTrait(requires = {ROUTING_MODE_TAG}), @ValidTrait(requires = {"emptylabelallowed", ROUTING_MODE_TAG})})
    public ServiceOptionsTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "emptylabelallowed") boolean z, @TraitProperty(name = "disablespecificityrouting") String str3, @TraitProperty(name = "routingmode") String str4) {
        super(cls, id, str, str2);
        this.emptyLabelAllowed = z;
        this.disableSpecificityRouting = str3;
        this.routingMode = str4;
    }
}
