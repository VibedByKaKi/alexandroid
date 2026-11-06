package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.dependencies.AlexaMobileMetricsComponent;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentProtocol;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolComponent;
import com.amazon.alexa.handsfree.settings.contract.dependencies.FalcoSettingContractComponent;
import com.amazon.alexa.handsfree.settings.dependencies.FalcoAlexaAppSettingsMediatorComponent;
import com.amazon.alexa.handsfree.settings.dependencies.FalcoSettingsComponent;
import com.amazon.alexa.handsfree.storage.dependencies.FalcoStorageComponent;
import com.amazon.alexa.handsfree.vendor.bridge.dependencies.FalcoVendorBridgeComponent;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class BaseAhfComponentsProvider extends AhfComponentsProvider {
    private final Context mApplicationContext;
    private volatile AhfComponent mAhfComponent = null;
    private final Map<Class<?>, ComponentFactory<?>> componentFactoryMap = Collections.unmodifiableMap(factoryMap());
    private final Map<Class<?>, Object> instanceMap = new ConcurrentHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ComponentFactory<T> {
        @NonNull
        T create();
    }

    public BaseAhfComponentsProvider(Context context) {
        this.mApplicationContext = context;
    }

    private <T extends AhfComponentProtocol> void ensureComponentIsInMap(@NonNull Class<T> cls) {
        if (this.instanceMap.containsKey(cls)) {
            return;
        }
        synchronized (this.instanceMap) {
            try {
                if (!this.instanceMap.containsKey(cls)) {
                    ComponentFactory<?> componentFactory = this.componentFactoryMap.get(cls);
                    if (componentFactory == null) {
                        throw new IllegalArgumentException("Factory not found: " + cls);
                    }
                    T cast = cls.cast(componentFactory.create());
                    Preconditions.checkNotNull(cast);
                    this.instanceMap.put(cls, cast);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Map<Class<?>, ComponentFactory<?>> factoryMap() {
        HashMap hashMap = new HashMap();
        final int i = 0;
        hashMap.put(AhfComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i2 = i;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i2) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i2 = 1;
        hashMap.put(FalcoProtocolComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i2;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i3 = 2;
        hashMap.put(FalcoVendorBridgeComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i3;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i4 = 3;
        hashMap.put(FalcoSettingContractComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i4;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i5 = 4;
        hashMap.put(FalcoSettingsComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i5;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i6 = 5;
        hashMap.put(FalcoAlexaAppSettingsMediatorComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i6;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i7 = 6;
        hashMap.put(FalcoStorageComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i7;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        final int i8 = 7;
        hashMap.put(AlexaMobileMetricsComponent.class, new ComponentFactory(this) { // from class: com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider$$ExternalSyntheticLambda0
            public final /* synthetic */ BaseAhfComponentsProvider f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.voice.handsfree.dependencies.BaseAhfComponentsProvider.ComponentFactory
            public final Object create() {
                Object lambda$factoryMap$0;
                Object lambda$factoryMap$1;
                Object lambda$factoryMap$2;
                Object lambda$factoryMap$3;
                Object lambda$factoryMap$4;
                Object lambda$factoryMap$5;
                Object lambda$factoryMap$6;
                Object lambda$factoryMap$7;
                int i22 = i8;
                BaseAhfComponentsProvider baseAhfComponentsProvider = this.f$0;
                switch (i22) {
                    case 0:
                        lambda$factoryMap$0 = baseAhfComponentsProvider.lambda$factoryMap$0();
                        return lambda$factoryMap$0;
                    case 1:
                        lambda$factoryMap$1 = baseAhfComponentsProvider.lambda$factoryMap$1();
                        return lambda$factoryMap$1;
                    case 2:
                        lambda$factoryMap$2 = baseAhfComponentsProvider.lambda$factoryMap$2();
                        return lambda$factoryMap$2;
                    case 3:
                        lambda$factoryMap$3 = baseAhfComponentsProvider.lambda$factoryMap$3();
                        return lambda$factoryMap$3;
                    case 4:
                        lambda$factoryMap$4 = baseAhfComponentsProvider.lambda$factoryMap$4();
                        return lambda$factoryMap$4;
                    case 5:
                        lambda$factoryMap$5 = baseAhfComponentsProvider.lambda$factoryMap$5();
                        return lambda$factoryMap$5;
                    case 6:
                        lambda$factoryMap$6 = baseAhfComponentsProvider.lambda$factoryMap$6();
                        return lambda$factoryMap$6;
                    default:
                        lambda$factoryMap$7 = baseAhfComponentsProvider.lambda$factoryMap$7();
                        return lambda$factoryMap$7;
                }
            }
        });
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAhfComponent, reason: merged with bridge method [inline-methods] */
    public AhfComponent lambda$factoryMap$0() {
        AhfComponent ahfComponent;
        AhfComponent ahfComponent2 = this.mAhfComponent;
        if (ahfComponent2 != null) {
            return ahfComponent2;
        }
        synchronized (this) {
            try {
                ahfComponent = this.mAhfComponent;
                if (ahfComponent == null) {
                    ahfComponent = DaggerAhfComponent.builder().ahfModule(new AhfModule(this.mApplicationContext)).build();
                    this.mAhfComponent = ahfComponent;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ahfComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$1() {
        return lambda$factoryMap$0().falcoProtocolComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$2() {
        return lambda$factoryMap$0().falcoVendorBridgeComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$3() {
        return lambda$factoryMap$0().falcoSettingContractComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$4() {
        return lambda$factoryMap$0().falcoSettingsComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$5() {
        return lambda$factoryMap$0().falcoAlexaAppSettingsMediatorComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$6() {
        return lambda$factoryMap$0().falcoStorageComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$factoryMap$7() {
        return lambda$factoryMap$0().alexaMobileMetricsComponent();
    }

    @Override // com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider
    public <T extends AhfComponentProtocol> T getComponent(@NonNull Class<T> cls) {
        ensureComponentIsInMap(cls);
        return cls.cast(this.instanceMap.get(cls));
    }
}
