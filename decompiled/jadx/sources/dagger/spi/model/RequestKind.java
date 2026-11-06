package dagger.spi.model;

import com.google.common.base.CaseFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum RequestKind {
    INSTANCE,
    PROVIDER,
    LAZY,
    PROVIDER_OF_LAZY,
    MEMBERS_INJECTION,
    PRODUCER,
    PRODUCED,
    FUTURE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.spi.model.RequestKind$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$dagger$spi$model$RequestKind;

        static {
            int[] iArr = new int[RequestKind.values().length];
            $SwitchMap$dagger$spi$model$RequestKind = iArr;
            try {
                iArr[RequestKind.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$dagger$spi$model$RequestKind[RequestKind.PROVIDER_OF_LAZY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$dagger$spi$model$RequestKind[RequestKind.MEMBERS_INJECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$dagger$spi$model$RequestKind[RequestKind.FUTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public String format(Key key) {
        int i = AnonymousClass1.$SwitchMap$dagger$spi$model$RequestKind[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.format("%s<%s>", CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name()), key) : String.format("ListenableFuture<%s>", key) : String.format("injectMembers(%s)", key) : String.format("Provider<Lazy<%s>>", key) : key.toString();
    }
}
