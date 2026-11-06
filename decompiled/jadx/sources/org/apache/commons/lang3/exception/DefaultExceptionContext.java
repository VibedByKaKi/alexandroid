package org.apache.commons.lang3.exception;

import io.reactivex.rxjava3.core.Maybe$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda0;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DefaultExceptionContext implements ExceptionContext, Serializable {
    private static final long serialVersionUID = 20110706;
    private final List<Pair<String, Object>> contextValues = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getContextValues$0(String str, Pair pair) {
        return Strings.CS.equals(str, (String) pair.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getFirstContextValue$0(String str, Pair pair) {
        return Strings.CS.equals(str, (String) pair.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setContextValue$0(String str, Pair pair) {
        return Strings.CS.equals(str, (String) pair.getKey());
    }

    private Stream<Pair<String, Object>> stream() {
        return this.contextValues.stream();
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public DefaultExceptionContext addContextValue(String str, Object obj) {
        this.contextValues.add(new ImmutablePair(str, obj));
        return this;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public List<Pair<String, Object>> getContextEntries() {
        return this.contextValues;
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public Set<String> getContextLabels() {
        return (Set) stream().map(new Maybe$$ExternalSyntheticLambda0(9)).collect(Collectors.toSet());
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public List<Object> getContextValues(String str) {
        return (List) stream().filter(new LocaleUtils$$ExternalSyntheticLambda0(str, 14)).map(new Maybe$$ExternalSyntheticLambda0(8)).collect(Collectors.toList());
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public Object getFirstContextValue(String str) {
        return stream().filter(new LocaleUtils$$ExternalSyntheticLambda0(str, 16)).findFirst().map(new Maybe$$ExternalSyntheticLambda0(8)).orElse(null);
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public String getFormattedExceptionMessage(String str) {
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (!this.contextValues.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Exception Context:\n");
            int i = 0;
            for (Pair<String, Object> pair : this.contextValues) {
                sb.append("\t[");
                i++;
                sb.append(i);
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(pair.getKey());
                sb.append("=");
                try {
                    sb.append(Objects.toString(pair.getValue()));
                } catch (Exception e) {
                    sb.append("Exception thrown on toString(): ");
                    sb.append(ExceptionUtils.getStackTrace(e));
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public DefaultExceptionContext setContextValue(String str, Object obj) {
        this.contextValues.removeIf(new LocaleUtils$$ExternalSyntheticLambda0(str, 15));
        addContextValue(str, obj);
        return this;
    }
}
