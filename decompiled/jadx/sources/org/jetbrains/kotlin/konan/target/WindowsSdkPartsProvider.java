package org.jetbrains.kotlin.konan.target;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider;", "", "()V", "InternalServer", "Local", "Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider$InternalServer;", "Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider$Local;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
abstract class WindowsSdkPartsProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider$InternalServer;", "Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class InternalServer extends WindowsSdkPartsProvider {

        @NotNull
        public static final InternalServer INSTANCE = new InternalServer();

        private InternalServer() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider$Local;", "Lorg/jetbrains/kotlin/konan/target/WindowsSdkPartsProvider;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Local extends WindowsSdkPartsProvider {

        @NotNull
        public static final Local INSTANCE = new Local();

        private Local() {
            super(null);
        }
    }

    public /* synthetic */ WindowsSdkPartsProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WindowsSdkPartsProvider() {
    }
}
