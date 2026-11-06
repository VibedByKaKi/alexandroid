package org.jetbrains.kotlin.gradle.plugin;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007J\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000fJ*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fH\u0007R(\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048EX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/CompilerPluginConfig;", "", "()V", "optionsByPluginId", "", "", "", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginOption;", "getOptionsByPluginId", "()Ljava/util/Map;", "addPluginArgument", "", "pluginId", "option", "allOptions", "", "", "computeForSubpluginId", "subpluginId", "subpluginOptions", "getAsTaskInputArgs", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nKotlinGradleSubplugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinGradleSubplugin.kt\norg/jetbrains/kotlin/gradle/plugin/CompilerPluginConfig\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n372#2,7:168\n372#2,7:181\n215#3,2:175\n1477#4:177\n1502#4,3:178\n1505#4,3:188\n1864#4,2:191\n1866#4:194\n1#5:193\n*S KotlinDebug\n*F\n+ 1 KotlinGradleSubplugin.kt\norg/jetbrains/kotlin/gradle/plugin/CompilerPluginConfig\n*L\n75#1:168,7\n91#1:181,7\n81#1:175,2\n91#1:177\n91#1:178,3\n91#1:188,3\n93#1:191,2\n93#1:194\n*E\n"})
/* loaded from: classes11.dex */
public class CompilerPluginConfig {

    @NotNull
    private final Map<String, List<SubpluginOption>> optionsByPluginId = new LinkedHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilesOptionKind.values().length];
            try {
                iArr[FilesOptionKind.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map<String, String> computeForSubpluginId(String subpluginId, List<? extends SubpluginOption> subpluginOptions) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : subpluginOptions) {
            String key = ((SubpluginOption) obj).getKey();
            Object obj2 = linkedHashMap2.get(key);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(key, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int i = 0;
            for (Object obj3 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SubpluginOption subpluginOption = (SubpluginOption) obj3;
                String m = list.size() > 1 ? a$$ExternalSyntheticOutline0.m(i, ".") : "";
                if (!(subpluginOption instanceof InternalSubpluginOption)) {
                    if (subpluginOption instanceof CompositeSubpluginOption) {
                        linkedHashMap.putAll(computeForSubpluginId(subpluginId + '.' + str + m, ((CompositeSubpluginOption) subpluginOption).getOriginalOptions()));
                    } else if (subpluginOption instanceof FilesSubpluginOption) {
                        if (WhenMappings.$EnumSwitchMapping$0[((FilesSubpluginOption) subpluginOption).getKind().ordinal()] != 1) {
                            PathKt$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        StringBuilder m2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(subpluginId, '.');
                        m2.append(subpluginOption.getKey());
                        m2.append(m);
                        linkedHashMap.put(m2.toString(), subpluginOption.getValue());
                    }
                }
                i = i2;
            }
        }
        return linkedHashMap;
    }

    public final void addPluginArgument(@NotNull String pluginId, @NotNull SubpluginOption option) {
        pluginId.getClass();
        option.getClass();
        Map<String, List<SubpluginOption>> map = this.optionsByPluginId;
        List<SubpluginOption> list = map.get(pluginId);
        if (list == null) {
            list = new ArrayList<>();
            map.put(pluginId, list);
        }
        list.add(option);
    }

    @NotNull
    public final Map<String, List<SubpluginOption>> allOptions() {
        return this.optionsByPluginId;
    }

    @Input
    @NotNull
    public final Map<String, String> getAsTaskInputArgs() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<SubpluginOption>> entry : this.optionsByPluginId.entrySet()) {
            linkedHashMap.putAll(computeForSubpluginId(entry.getKey(), entry.getValue()));
        }
        return linkedHashMap;
    }

    @Internal
    @NotNull
    public final Map<String, List<SubpluginOption>> getOptionsByPluginId() {
        return this.optionsByPluginId;
    }
}
