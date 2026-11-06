package expo.modules.kotlin.classcomponent;

import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public /* synthetic */ class ClassComponentBuilder$buildClass$2 extends FunctionReferenceImpl implements Function2<SharedObject, String, Unit> {
    public static final ClassComponentBuilder$buildClass$2 INSTANCE = new ClassComponentBuilder$buildClass$2();

    public ClassComponentBuilder$buildClass$2() {
        super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SharedObject sharedObject, String str) {
        invoke2(sharedObject, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SharedObject sharedObject, String str) {
        sharedObject.getClass();
        str.getClass();
        sharedObject.onStopListeningToEvent(str);
    }
}
