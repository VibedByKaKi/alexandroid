package com.typesafe.config.impl;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigMergeable;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import dagger.internal.codegen.base.Formatter;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class AbstractConfigValue implements ConfigValue, MergeableValue {
    private final SimpleConfigOrigin origin;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Modifier {
        AbstractConfigValue modifyChildMayThrow(String str, AbstractConfigValue abstractConfigValue) throws Exception;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class NoExceptionsModifier implements Modifier {
        public NoExceptionsModifier() {
        }

        public abstract AbstractConfigValue modifyChild(String str, AbstractConfigValue abstractConfigValue);

        @Override // com.typesafe.config.impl.AbstractConfigValue.Modifier
        public final AbstractConfigValue modifyChildMayThrow(String str, AbstractConfigValue abstractConfigValue) throws Exception {
            try {
                return modifyChild(str, abstractConfigValue);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new ConfigException.BugOrBroken("Unexpected exception", e2);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NotPossibleToResolve extends Exception {
        private static final long serialVersionUID = 1;
        private final String traceString;

        public NotPossibleToResolve(ResolveContext resolveContext) {
            super("was not possible to resolve");
            this.traceString = resolveContext.traceString();
        }

        public String traceString() {
            return this.traceString;
        }
    }

    public AbstractConfigValue(ConfigOrigin configOrigin) {
        this.origin = (SimpleConfigOrigin) configOrigin;
    }

    private final AbstractConfigValue delayMerge(Collection<AbstractConfigValue> collection, AbstractConfigValue abstractConfigValue) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.add(abstractConfigValue);
        return constructDelayedMerge(AbstractConfigObject.mergeOrigins(arrayList), arrayList);
    }

    public static boolean hasDescendantInList(List<AbstractConfigValue> list, AbstractConfigValue abstractConfigValue) {
        Iterator<AbstractConfigValue> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next() == abstractConfigValue) {
                return true;
            }
        }
        for (ConfigMergeable configMergeable : list) {
            if ((configMergeable instanceof Container) && ((Container) configMergeable).hasDescendant(abstractConfigValue)) {
                return true;
            }
        }
        return false;
    }

    public static void indent(StringBuilder sb, int i, ConfigRenderOptions configRenderOptions) {
        if (configRenderOptions.getFormatted()) {
            while (i > 0) {
                sb.append(Formatter.INDENT);
                i--;
            }
        }
    }

    public static List<AbstractConfigValue> replaceChildInList(List<AbstractConfigValue> list, AbstractConfigValue abstractConfigValue, AbstractConfigValue abstractConfigValue2) {
        int i = 0;
        while (i < list.size() && list.get(i) != abstractConfigValue) {
            i++;
        }
        if (i == list.size()) {
            CodecsKt$$ExternalSyntheticBUOutline0.m("tried to replace ", abstractConfigValue, " which is not in ", list);
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (abstractConfigValue2 != null) {
            arrayList.set(i, abstractConfigValue2);
        } else {
            arrayList.remove(i);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.typesafe.config.ConfigValue
    public SimpleConfig atKey(String str) {
        return atKey(SimpleConfigOrigin.newSimple(a$$ExternalSyntheticOutline0.m("atKey(", str, MarkdownConstants.RIGHT_PARENTHESIS)), str);
    }

    public SimpleConfig atPath(ConfigOrigin configOrigin, Path path) {
        SimpleConfig atKey = atKey(configOrigin, path.last());
        for (Path parent = path.parent(); parent != null; parent = parent.parent()) {
            atKey = atKey.atKey(configOrigin, parent.last());
        }
        return atKey;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ConfigValue;
    }

    public AbstractConfigValue constructDelayedMerge(ConfigOrigin configOrigin, List<AbstractConfigValue> list) {
        return new ConfigDelayedMerge(configOrigin, list);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ConfigValue) && canEqual(obj)) {
            ConfigValue configValue = (ConfigValue) obj;
            if (valueType() == configValue.valueType() && ConfigImplUtil.equalsHandlingNull(unwrapped(), configValue.unwrapped())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object unwrapped = unwrapped();
        if (unwrapped == null) {
            return 0;
        }
        return unwrapped.hashCode();
    }

    public boolean ignoresFallbacks() {
        return resolveStatus() == ResolveStatus.RESOLVED;
    }

    public final AbstractConfigValue mergedWithNonObject(Collection<AbstractConfigValue> collection, AbstractConfigValue abstractConfigValue) {
        requireNotIgnoringFallbacks();
        return resolveStatus() == ResolveStatus.RESOLVED ? withFallbacksIgnored() : delayMerge(collection, abstractConfigValue);
    }

    public final AbstractConfigValue mergedWithObject(Collection<AbstractConfigValue> collection, AbstractConfigObject abstractConfigObject) {
        requireNotIgnoringFallbacks();
        if (!(this instanceof AbstractConfigObject)) {
            return mergedWithNonObject(collection, abstractConfigObject);
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m("Objects must reimplement mergedWithObject");
        return null;
    }

    public final AbstractConfigValue mergedWithTheUnmergeable(Collection<AbstractConfigValue> collection, Unmergeable unmergeable) {
        requireNotIgnoringFallbacks();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(unmergeable.unmergedValues());
        return constructDelayedMerge(AbstractConfigObject.mergeOrigins(arrayList), arrayList);
    }

    public abstract AbstractConfigValue newCopy(ConfigOrigin configOrigin);

    public void render(StringBuilder sb, int i, boolean z, String str, ConfigRenderOptions configRenderOptions) {
        if (str != null) {
            sb.append(configRenderOptions.getJson() ? ConfigImplUtil.renderJsonString(str) : ConfigImplUtil.renderStringUnquotedIfPossible(str));
            if (configRenderOptions.getJson()) {
                if (configRenderOptions.getFormatted()) {
                    sb.append(" : ");
                } else {
                    sb.append(":");
                }
            } else if (!(this instanceof ConfigObject)) {
                sb.append("=");
            } else if (configRenderOptions.getFormatted()) {
                sb.append(' ');
            }
        }
        render(sb, i, z, configRenderOptions);
    }

    public final void requireNotIgnoringFallbacks() {
        if (ignoresFallbacks()) {
            CodecsKt$$ExternalSyntheticBUOutline0.m("method should not have been called with ignoresFallbacks=true ".concat(getClass().getSimpleName()));
        }
    }

    public ResolveStatus resolveStatus() {
        return ResolveStatus.RESOLVED;
    }

    public ResolveResult<? extends AbstractConfigValue> resolveSubstitutions(ResolveContext resolveContext, ResolveSource resolveSource) throws NotPossibleToResolve {
        return ResolveResult.make(resolveContext, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, ConfigRenderOptions.concise());
        return getClass().getSimpleName() + MarkdownConstants.LEFT_PARENTHESIS + sb.toString() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public String transformToString() {
        return null;
    }

    @Override // com.typesafe.config.ConfigValue, com.typesafe.config.ConfigMergeable
    public AbstractConfigValue withFallback(ConfigMergeable configMergeable) {
        if (ignoresFallbacks()) {
            return this;
        }
        ConfigValue fallbackValue = ((MergeableValue) configMergeable).toFallbackValue();
        return fallbackValue instanceof Unmergeable ? mergedWithTheUnmergeable((Unmergeable) fallbackValue) : fallbackValue instanceof AbstractConfigObject ? mergedWithObject((AbstractConfigObject) fallbackValue) : mergedWithNonObject((AbstractConfigValue) fallbackValue);
    }

    public AbstractConfigValue withFallbacksIgnored() {
        if (ignoresFallbacks()) {
            return this;
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m((Object) this, "value class doesn't implement forced fallback-ignoring ");
        return null;
    }

    @Override // com.typesafe.config.ConfigValue
    public AbstractConfigValue withOrigin(ConfigOrigin configOrigin) {
        return this.origin == configOrigin ? this : newCopy(configOrigin);
    }

    @Override // com.typesafe.config.ConfigValue
    public SimpleConfigOrigin origin() {
        return this.origin;
    }

    @Override // com.typesafe.config.impl.MergeableValue
    public AbstractConfigValue toFallbackValue() {
        return this;
    }

    public SimpleConfig atKey(ConfigOrigin configOrigin, String str) {
        return new SimpleConfigObject(configOrigin, Collections.singletonMap(str, this)).toConfig();
    }

    public AbstractConfigValue mergedWithObject(AbstractConfigObject abstractConfigObject) {
        requireNotIgnoringFallbacks();
        return mergedWithObject(Collections.singletonList(this), abstractConfigObject);
    }

    public AbstractConfigValue mergedWithNonObject(AbstractConfigValue abstractConfigValue) {
        requireNotIgnoringFallbacks();
        return mergedWithNonObject(Collections.singletonList(this), abstractConfigValue);
    }

    public AbstractConfigValue relativized(Path path) {
        return this;
    }

    public AbstractConfigValue mergedWithTheUnmergeable(Unmergeable unmergeable) {
        requireNotIgnoringFallbacks();
        return mergedWithTheUnmergeable(Collections.singletonList(this), unmergeable);
    }

    @Override // com.typesafe.config.ConfigValue
    public SimpleConfig atPath(String str) {
        return atPath(SimpleConfigOrigin.newSimple(a$$ExternalSyntheticOutline0.m("atPath(", str, MarkdownConstants.RIGHT_PARENTHESIS)), Path.newPath(str));
    }

    public void render(StringBuilder sb, int i, boolean z, ConfigRenderOptions configRenderOptions) {
        sb.append(unwrapped().toString());
    }

    @Override // com.typesafe.config.ConfigValue
    public final String render() {
        return render(ConfigRenderOptions.defaults());
    }

    @Override // com.typesafe.config.ConfigValue
    public final String render(ConfigRenderOptions configRenderOptions) {
        StringBuilder sb = new StringBuilder();
        render(sb, 0, true, null, configRenderOptions);
        return sb.toString();
    }
}
