package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class DittoConfigTraits extends AbstractTraits {
    public static final String DITTO_TRAITS_STAGING_MODE = DittoMode.STAGING.name();
    private final String dittoMode;
    private final Double dittoStagingTrafficPercentage;
    private final Long durationBetweenSampling;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DittoMode {
        DISABLED,
        ENABLED,
        STAGING,
        SHADOW;

        public static boolean isValid(String str) {
            if (str == null) {
                return false;
            }
            for (DittoMode dittoMode : values()) {
                if (dittoMode.name().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public DittoConfigTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, String str3, Long l, Double d) {
        super(cls, id, str, str2);
        this.dittoMode = str3;
        this.durationBetweenSampling = l;
        this.dittoStagingTrafficPercentage = d;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        DittoConfigTraits dittoConfigTraits = (DittoConfigTraits) obj;
        return Objects.equals(this.durationBetweenSampling, dittoConfigTraits.durationBetweenSampling) && Objects.equals(this.dittoMode, dittoConfigTraits.dittoMode) && Objects.equals(this.dittoStagingTrafficPercentage, dittoConfigTraits.dittoStagingTrafficPercentage);
    }

    @TraitProperty(name = "dittomode")
    public String getDittoMode() {
        return this.dittoMode;
    }

    @TraitProperty(emitIfNull = false, name = "dittostagingtrafficpercentage")
    public Double getDittoStagingTrafficPercentage() {
        return this.dittoStagingTrafficPercentage;
    }

    @TraitProperty(emitIfNull = false, name = "durationbetweensampling")
    public Long getDurationBetweenSampling() {
        return this.durationBetweenSampling;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.dittoMode, this.durationBetweenSampling, this.dittoStagingTrafficPercentage);
    }
}
