package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.connection.IConnectionManager;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConnectionManager$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ConnectionManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean _init_$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                _init_$lambda$0 = ConnectionManager._init_$lambda$0();
                break;
            case 1:
                _init_$lambda$0 = ConnectionManager._init_$lambda$1();
                break;
            case 2:
                _init_$lambda$0 = ConnectionManager._init_$lambda$2();
                break;
            case 3:
                _init_$lambda$0 = ConnectionManagerFactory._init_$lambda$0();
                break;
            case 4:
                _init_$lambda$0 = ConnectionManagerFactory._init_$lambda$1();
                break;
            case 5:
                _init_$lambda$0 = ConnectionManagerFactory._init_$lambda$2();
                break;
            case 6:
                _init_$lambda$0 = IConnectionManager.DefaultImpls.requestDownchannelRecovery$lambda$0();
                break;
            default:
                _init_$lambda$0 = IConnectionManager.DefaultImpls.requestDownchannelRecovery$lambda$1();
                break;
        }
        return Boolean.valueOf(_init_$lambda$0);
    }
}
