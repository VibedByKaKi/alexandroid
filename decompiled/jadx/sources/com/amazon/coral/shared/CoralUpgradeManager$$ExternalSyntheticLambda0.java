package com.amazon.coral.shared;

import com.amazon.coral.shared.CoralUpgradeManager;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CoralUpgradeManager$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CoralUpgradeManager$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean currentServiceShouldUpgrade0;
        CoralUpgradeManager.CacheKey cacheKey = (CoralUpgradeManager.CacheKey) obj;
        switch (this.$r8$classId) {
            case 0:
                currentServiceShouldUpgrade0 = CoralUpgradeManager.currentServiceShouldUpgrade0(cacheKey);
                break;
            default:
                currentServiceShouldUpgrade0 = CoralUpgradeManager.currentHostShouldUpgrade0(cacheKey);
                break;
        }
        return Boolean.valueOf(currentServiceShouldUpgrade0);
    }
}
