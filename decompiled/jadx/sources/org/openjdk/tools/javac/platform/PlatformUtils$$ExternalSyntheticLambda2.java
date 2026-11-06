package org.openjdk.tools.javac.platform;

import com.amazon.alexa.configservice.rnbridge.ConfigServiceBridgeDelegate;
import com.facebook.react.bridge.ReadableMap;
import java.util.Optional;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class PlatformUtils$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ PlatformUtils$$ExternalSyntheticLambda2(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional lambda$lookupPlatformDescription$1;
        ConfigServiceBridgeDelegate.ConfigValidationMessage lambda$getMapConfig$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$lookupPlatformDescription$1 = PlatformUtils.lambda$lookupPlatformDescription$1(this.f$0, this.f$1, (PlatformProvider) obj);
                return lambda$lookupPlatformDescription$1;
            default:
                lambda$getMapConfig$2 = ConfigServiceBridgeDelegate.lambda$getMapConfig$2(this.f$0, this.f$1, (ReadableMap) obj);
                return lambda$getMapConfig$2;
        }
    }
}
