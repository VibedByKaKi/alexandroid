package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.events.KModuleEventEmitterWrapperKt;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.OnViewDidUpdatePropsException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eJ\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eJ\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019R\u001e\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "", "moduleHolder", "Lexpo/modules/kotlin/ModuleHolder;", "definition", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "delegateName", "", "<init>", "(Lexpo/modules/kotlin/ModuleHolder;Lexpo/modules/kotlin/views/ViewManagerDefinition;Ljava/lang/String;)V", "getModuleHolder$expo_modules_core_release", "()Lexpo/modules/kotlin/ModuleHolder;", "setModuleHolder$expo_modules_core_release", "(Lexpo/modules/kotlin/ModuleHolder;)V", "getDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getDelegateName$expo_modules_core_release", "()Ljava/lang/String;", "viewGroupDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "name", "getName", "props", "", "Lexpo/modules/kotlin/views/AnyViewProp;", "getProps", "()Ljava/util/Map;", "createView", "Landroid/view/View;", "context", "Landroid/content/Context;", "onViewDidUpdateProps", "", "view", "updateProperties", "", "propsMap", "Lcom/facebook/react/bridge/ReadableMap;", "onDestroy", "getExportedCustomDirectEventTypeConstants", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewManagerWrapperDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewManagerWrapperDelegate.kt\nexpo/modules/kotlin/views/ViewManagerWrapperDelegate\n+ 2 ExceptionDecorator.kt\nexpo/modules/kotlin/exception/ExceptionDecoratorKt\n+ 3 CodedException.kt\nexpo/modules/kotlin/exception/CodedExceptionKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,120:1\n5#2,4:121\n11#3,6:125\n11#3,6:131\n11#3,6:137\n11#3,6:143\n13472#4,2:149\n*S KotlinDebug\n*F\n+ 1 ViewManagerWrapperDelegate.kt\nexpo/modules/kotlin/views/ViewManagerWrapperDelegate\n*L\n31#1:121,4\n31#1:125,6\n43#1:131,6\n75#1:137,6\n99#1:143,6\n112#1:149,2\n*E\n"})
/* loaded from: classes9.dex */
public final class ViewManagerWrapperDelegate {

    @NotNull
    private final ViewManagerDefinition definition;

    @Nullable
    private final String delegateName;

    @NotNull
    private ModuleHolder<?> moduleHolder;

    public ViewManagerWrapperDelegate(@NotNull ModuleHolder<?> moduleHolder, @NotNull ViewManagerDefinition viewManagerDefinition, @Nullable String str) {
        moduleHolder.getClass();
        viewManagerDefinition.getClass();
        this.moduleHolder = moduleHolder;
        this.definition = viewManagerDefinition;
        this.delegateName = str;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [expo.modules.kotlin.modules.Module] */
    @NotNull
    public final View createView(@NotNull Context context) {
        context.getClass();
        return this.definition.createView(context, this.moduleHolder.getModule().getAppContext());
    }

    @NotNull
    /* renamed from: getDefinition$expo_modules_core_release, reason: from getter */
    public final ViewManagerDefinition getDefinition() {
        return this.definition;
    }

    @Nullable
    /* renamed from: getDelegateName$expo_modules_core_release, reason: from getter */
    public final String getDelegateName() {
        return this.delegateName;
    }

    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] names;
        Map createMapBuilder = MapsKt.createMapBuilder();
        CallbacksDefinition callbacksDefinition = this.definition.getCallbacksDefinition();
        if (callbacksDefinition != null && (names = callbacksDefinition.getNames()) != null) {
            for (String str : names) {
                createMapBuilder.put(KModuleEventEmitterWrapperKt.normalizeEventName(str), MapsKt.mapOf(TuplesKt.to("registrationName", str)));
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    @NotNull
    public final ModuleHolder<?> getModuleHolder$expo_modules_core_release() {
        return this.moduleHolder;
    }

    @NotNull
    public final String getName() {
        String str = this.delegateName;
        return str == null ? a$$ExternalSyntheticOutline0.m$1(this.moduleHolder.getName(), "_", this.definition.getName()) : str;
    }

    @NotNull
    public final Map<String, AnyViewProp> getProps() {
        return this.definition.getProps$expo_modules_core_release();
    }

    @Nullable
    public final ViewGroupDefinition getViewGroupDefinition$expo_modules_core_release() {
        return this.definition.getViewGroupDefinition();
    }

    public final void onDestroy(@NotNull View view) {
        CodedException unexpectedException;
        CodedException codedException;
        view.getClass();
        try {
            Function1<View, Unit> onViewDestroys = this.definition.getOnViewDestroys();
            if (onViewDestroys != null) {
                onViewDestroys.invoke(view);
            }
        } catch (Throwable th) {
            if (ErrorViewKt.isErrorView(view)) {
                return;
            }
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                    String code = codedException2.getCode();
                    code.getClass();
                    unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            CoreLoggerKt.getLogger().error("❌ '" + view + "' wasn't able to destroy itself", codedException);
            this.definition.handleException(view, codedException);
        }
    }

    public final void onViewDidUpdateProps(@NotNull View view) {
        CodedException unexpectedException;
        CodedException codedException;
        CodedException codedException2;
        view.getClass();
        Function1<View, Unit> onViewDidUpdateProps = this.definition.getOnViewDidUpdateProps();
        if (onViewDidUpdateProps != null) {
            try {
                onViewDidUpdateProps.invoke(view);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (th instanceof CodedException) {
                        codedException2 = (CodedException) th;
                    } else if (th instanceof expo.modules.core.errors.CodedException) {
                        String code = ((expo.modules.core.errors.CodedException) th).getCode();
                        code.getClass();
                        codedException2 = new CodedException(code, ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause());
                    } else {
                        codedException2 = new UnexpectedException(th);
                    }
                    throw new OnViewDidUpdatePropsException(JvmClassMappingKt.getKotlinClass(view.getClass()), codedException2);
                } catch (Throwable th2) {
                    if (ErrorViewKt.isErrorView(view)) {
                        return;
                    }
                    if (th2 instanceof CodedException) {
                        codedException = (CodedException) th2;
                    } else {
                        if (th2 instanceof expo.modules.core.errors.CodedException) {
                            expo.modules.core.errors.CodedException codedException3 = (expo.modules.core.errors.CodedException) th2;
                            String code2 = codedException3.getCode();
                            code2.getClass();
                            unexpectedException = new CodedException(code2, codedException3.getMessage(), codedException3.getCause());
                        } else {
                            unexpectedException = new UnexpectedException(th2);
                        }
                        codedException = unexpectedException;
                    }
                    CoreLoggerKt.getLogger().error("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'", codedException);
                    this.definition.handleException(view, codedException);
                }
            }
        }
    }

    public final void setModuleHolder$expo_modules_core_release(@NotNull ModuleHolder<?> moduleHolder) {
        moduleHolder.getClass();
        this.moduleHolder = moduleHolder;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [expo.modules.kotlin.modules.Module] */
    @NotNull
    public final List<String> updateProperties(@NotNull View view, @NotNull ReadableMap propsMap) {
        view.getClass();
        propsMap.getClass();
        Map<String, AnyViewProp> props = getProps();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator keySetIterator = propsMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            AnyViewProp anyViewProp = props.get(nextKey);
            if (anyViewProp != null) {
                try {
                    Dynamic dynamic = propsMap.getDynamic(nextKey);
                    RuntimeContext runtimeContext = this.moduleHolder.getModule().get_runtimeContext();
                    anyViewProp.set(dynamic, view, runtimeContext != null ? runtimeContext.getAppContext() : null);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ ViewManagerWrapperDelegate(ModuleHolder moduleHolder, ViewManagerDefinition viewManagerDefinition, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(moduleHolder, viewManagerDefinition, (i & 4) != 0 ? null : str);
    }
}
