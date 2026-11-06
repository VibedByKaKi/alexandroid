package com.amazon.coral.shared;

import com.amazon.coral.shared.CoralInternalLoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CoralInternalLoggerFactory$$ExternalSyntheticLambda0 implements CoralInternalLoggerFactory.LoggerImplFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CoralInternalLoggerFactory$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.coral.shared.CoralInternalLoggerFactory.LoggerImplFactory
    public final CoralInternalLogger create(String str) {
        switch (this.$r8$classId) {
            case 0:
                return new JclLogger(str);
            case 1:
                return new JulLogger(str);
            default:
                return new Log4j2Logger(str);
        }
    }
}
