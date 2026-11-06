package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender;
import com.facebook.react.animated.InterpolationAnimatedNode;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi;
import org.jetbrains.kotlin.gradle.InternalKotlinGradlePluginApi;
import org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyBuilder;
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\b\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0007\u001a%\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"defaultKotlinHierarchyTemplate", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;", "getDefaultKotlinHierarchyTemplate$annotations", "()V", "impl", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplateImpl;", "getImpl", "(Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplate;)Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyTemplateImpl;", "KotlinHierarchyTemplate", "describe", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinHierarchyBuilder$Root;", "", "Lkotlin/ExtensionFunctionType;", "applyHierarchyTemplate", GetFocusFilterTemplatesFromS3RequestSender.TEMPLATE_KEY, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_EXTEND, "kotlin-gradle-plugin-api_common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KotlinHierarchyTemplateKt {

    @NotNull
    private static final KotlinHierarchyTemplate defaultKotlinHierarchyTemplate = KotlinHierarchyTemplate(new Function1<KotlinHierarchyBuilder.Root, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt$defaultKotlinHierarchyTemplate$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull KotlinHierarchyBuilder.Root root) {
            root.getClass();
            KotlinSourceSetTree.Companion companion = KotlinSourceSetTree.INSTANCE;
            root.withSourceSetTree(companion.getMain(), companion.getTest());
            root.common(new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt$defaultKotlinHierarchyTemplate$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder) {
                    kotlinHierarchyBuilder.getClass();
                    kotlinHierarchyBuilder.withCompilations(new Function1<KotlinCompilation<?>, Boolean>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull KotlinCompilation<?> kotlinCompilation) {
                            kotlinCompilation.getClass();
                            return Boolean.TRUE;
                        }
                    });
                    kotlinHierarchyBuilder.group("native", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder2) {
                            kotlinHierarchyBuilder2.getClass();
                            kotlinHierarchyBuilder2.withNative();
                            kotlinHierarchyBuilder2.group("apple", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    kotlinHierarchyBuilder3.getClass();
                                    kotlinHierarchyBuilder3.withApple();
                                    kotlinHierarchyBuilder3.group("ios", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            invoke2(kotlinHierarchyBuilder4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            kotlinHierarchyBuilder4.getClass();
                                            kotlinHierarchyBuilder4.withIos();
                                        }
                                    });
                                    kotlinHierarchyBuilder3.group("tvos", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.1.2
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            invoke2(kotlinHierarchyBuilder4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            kotlinHierarchyBuilder4.getClass();
                                            kotlinHierarchyBuilder4.withTvos();
                                        }
                                    });
                                    kotlinHierarchyBuilder3.group("watchos", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.1.3
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            invoke2(kotlinHierarchyBuilder4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            kotlinHierarchyBuilder4.getClass();
                                            kotlinHierarchyBuilder4.withWatchos();
                                        }
                                    });
                                    kotlinHierarchyBuilder3.group("macos", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.1.4
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            invoke2(kotlinHierarchyBuilder4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder4) {
                                            kotlinHierarchyBuilder4.getClass();
                                            kotlinHierarchyBuilder4.withMacos();
                                        }
                                    });
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    invoke2(kotlinHierarchyBuilder3);
                                    return Unit.INSTANCE;
                                }
                            });
                            kotlinHierarchyBuilder2.group("linux", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    invoke2(kotlinHierarchyBuilder3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    kotlinHierarchyBuilder3.getClass();
                                    kotlinHierarchyBuilder3.withLinux();
                                }
                            });
                            kotlinHierarchyBuilder2.group("mingw", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    invoke2(kotlinHierarchyBuilder3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    kotlinHierarchyBuilder3.getClass();
                                    kotlinHierarchyBuilder3.withMingw();
                                }
                            });
                            kotlinHierarchyBuilder2.group("androidNative", new Function1<KotlinHierarchyBuilder, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt.defaultKotlinHierarchyTemplate.1.1.2.4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    invoke2(kotlinHierarchyBuilder3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull KotlinHierarchyBuilder kotlinHierarchyBuilder3) {
                                    kotlinHierarchyBuilder3.getClass();
                                    kotlinHierarchyBuilder3.withAndroidNative();
                                }
                            });
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder2) {
                            invoke2(kotlinHierarchyBuilder2);
                            return Unit.INSTANCE;
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder kotlinHierarchyBuilder) {
                    invoke2(kotlinHierarchyBuilder);
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder.Root root) {
            invoke2(root);
            return Unit.INSTANCE;
        }
    });

    @NotNull
    @ExperimentalKotlinGradlePluginApi
    public static final KotlinHierarchyTemplate KotlinHierarchyTemplate(@NotNull Function1<? super KotlinHierarchyBuilder.Root, Unit> function1) {
        function1.getClass();
        return new KotlinHierarchyTemplateImpl(function1);
    }

    @InternalKotlinGradlePluginApi
    public static final void applyHierarchyTemplate(@NotNull KotlinHierarchyBuilder.Root root, @NotNull KotlinHierarchyTemplate kotlinHierarchyTemplate) {
        root.getClass();
        kotlinHierarchyTemplate.getClass();
        getImpl(kotlinHierarchyTemplate).layout(root);
    }

    @NotNull
    @ExperimentalKotlinGradlePluginApi
    public static final KotlinHierarchyTemplate extend(@NotNull final KotlinHierarchyTemplate kotlinHierarchyTemplate, @NotNull final Function1<? super KotlinHierarchyBuilder.Root, Unit> function1) {
        kotlinHierarchyTemplate.getClass();
        function1.getClass();
        return KotlinHierarchyTemplate(new Function1<KotlinHierarchyBuilder.Root, Unit>() { // from class: org.jetbrains.kotlin.gradle.plugin.KotlinHierarchyTemplateKt$extend$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KotlinHierarchyBuilder.Root root) {
                root.getClass();
                KotlinHierarchyTemplateKt.getImpl(KotlinHierarchyTemplate.this).layout(root);
                function1.invoke(root);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KotlinHierarchyBuilder.Root root) {
                invoke2(root);
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public static final KotlinHierarchyTemplateImpl getImpl(@NotNull KotlinHierarchyTemplate kotlinHierarchyTemplate) {
        kotlinHierarchyTemplate.getClass();
        if (kotlinHierarchyTemplate instanceof KotlinHierarchyTemplateImpl) {
            return (KotlinHierarchyTemplateImpl) kotlinHierarchyTemplate;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private static /* synthetic */ void getDefaultKotlinHierarchyTemplate$annotations() {
    }
}
