package org.apache.http.params;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes11.dex */
public class BasicHttpParams extends AbstractHttpParams implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final Map<String, Object> parameters = new ConcurrentHashMap();

    public void clear() {
        this.parameters.clear();
    }

    public Object clone() throws CloneNotSupportedException {
        BasicHttpParams basicHttpParams = (BasicHttpParams) super.clone();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        try {
            return (HttpParams) clone();
        } catch (CloneNotSupportedException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Cloning not supported");
            return null;
        }
    }

    public void copyParams(HttpParams httpParams) {
        for (Map.Entry<String, Object> entry : this.parameters.entrySet()) {
            httpParams.setParameter(entry.getKey(), entry.getValue());
        }
    }

    @Override // org.apache.http.params.AbstractHttpParams, org.apache.http.params.HttpParamsNames
    public Set<String> getNames() {
        return new HashSet(this.parameters.keySet());
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        return this.parameters.get(str);
    }

    public boolean isParameterSet(String str) {
        return getParameter(str) != null;
    }

    public boolean isParameterSetLocally(String str) {
        return this.parameters.get(str) != null;
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        if (!this.parameters.containsKey(str)) {
            return false;
        }
        this.parameters.remove(str);
        return true;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        if (str == null) {
            return this;
        }
        Map<String, Object> map = this.parameters;
        if (obj != null) {
            map.put(str, obj);
            return this;
        }
        map.remove(str);
        return this;
    }

    public void setParameters(String[] strArr, Object obj) {
        for (String str : strArr) {
            setParameter(str, obj);
        }
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("[parameters="), this.parameters, MarkdownConstants.RIGHT_BRACKET);
    }
}
