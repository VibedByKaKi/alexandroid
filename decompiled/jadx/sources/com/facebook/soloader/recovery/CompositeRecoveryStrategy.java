package com.facebook.soloader.recovery;

import com.facebook.soloader.SoSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class CompositeRecoveryStrategy implements RecoveryStrategy {
    private int mCurrentStrategy = 0;
    private final RecoveryStrategy[] mStrategies;

    public CompositeRecoveryStrategy(RecoveryStrategy... recoveryStrategyArr) {
        this.mStrategies = recoveryStrategyArr;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        int i;
        RecoveryStrategy[] recoveryStrategyArr;
        do {
            i = this.mCurrentStrategy;
            recoveryStrategyArr = this.mStrategies;
            if (i >= recoveryStrategyArr.length) {
                return false;
            }
            this.mCurrentStrategy = i + 1;
        } while (!recoveryStrategyArr[i].recover(unsatisfiedLinkError, soSourceArr));
        return true;
    }
}
