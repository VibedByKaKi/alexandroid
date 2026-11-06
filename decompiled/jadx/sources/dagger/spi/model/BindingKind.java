package dagger.spi.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum BindingKind {
    INJECTION,
    PROVISION,
    ASSISTED_INJECTION,
    ASSISTED_FACTORY,
    COMPONENT,
    COMPONENT_PROVISION,
    COMPONENT_DEPENDENCY,
    MEMBERS_INJECTOR,
    SUBCOMPONENT_CREATOR,
    BOUND_INSTANCE,
    PRODUCTION,
    COMPONENT_PRODUCTION,
    MULTIBOUND_SET,
    MULTIBOUND_MAP,
    OPTIONAL,
    DELEGATE,
    MEMBERS_INJECTION;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.spi.model.BindingKind$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$dagger$spi$model$BindingKind;

        static {
            int[] iArr = new int[BindingKind.values().length];
            $SwitchMap$dagger$spi$model$BindingKind = iArr;
            try {
                iArr[BindingKind.MULTIBOUND_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$dagger$spi$model$BindingKind[BindingKind.MULTIBOUND_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public boolean isMultibinding() {
        int i = AnonymousClass1.$SwitchMap$dagger$spi$model$BindingKind[ordinal()];
        return i == 1 || i == 2;
    }
}
