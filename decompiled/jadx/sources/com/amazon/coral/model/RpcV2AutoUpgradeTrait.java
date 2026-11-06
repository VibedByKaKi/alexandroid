package com.amazon.coral.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "rpcv2autoupgrade", targets = {ServiceModel.class})
/* loaded from: classes19.dex */
public final class RpcV2AutoUpgradeTrait extends AbstractTraits {
    private final boolean enabledInProduction;
    private final boolean permanentlyUpgraded;

    public RpcV2AutoUpgradeTrait(boolean z, boolean z2) {
        this(RpcV2AutoUpgradeTrait.class, Model.Id.NONE, "", "N/A", z, z2);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RpcV2AutoUpgradeTrait.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        RpcV2AutoUpgradeTrait rpcV2AutoUpgradeTrait = (RpcV2AutoUpgradeTrait) obj;
        return this.permanentlyUpgraded == rpcV2AutoUpgradeTrait.permanentlyUpgraded && this.enabledInProduction == rpcV2AutoUpgradeTrait.enabledInProduction;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        return Boolean.hashCode(this.enabledInProduction) + DoubleList$$ExternalSyntheticOutline0.m(this.permanentlyUpgraded, super.hashCode() * 31, 31);
    }

    @TraitProperty(name = "enabledinproduction")
    public boolean isEnabledInProduction() {
        return this.enabledInProduction;
    }

    @TraitProperty(name = "permanentlyupgraded")
    public boolean isPermanentlyUpgraded() {
        return this.permanentlyUpgraded;
    }

    @ValidTrait(requires = {"permanentlyupgraded", "enabledinproduction"})
    public RpcV2AutoUpgradeTrait(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "permanentlyupgraded") boolean z, @TraitProperty(name = "enabledinproduction") boolean z2) {
        super(cls, id, str, str2);
        this.permanentlyUpgraded = z;
        this.enabledInProduction = z2;
    }
}
