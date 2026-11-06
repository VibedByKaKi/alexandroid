package autovalue.shaded.com.google.escapevelocity;

import androidx.media3.ui.PlayerView$$ExternalSyntheticLambda1;
import androidx.work.impl.Processor$$ExternalSyntheticLambda2;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface EvaluationContext {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PlainEvaluationContext implements EvaluationContext {
        private final Map<String, Macro> macros;
        private final MethodFinder methodFinder;
        private final Map<String, Object> vars;

        public PlainEvaluationContext(Map<String, ?> map, Map<String, Macro> map2, MethodFinder methodFinder) {
            this.vars = new TreeMap(map);
            this.macros = map2;
            this.methodFinder = methodFinder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setVar$0(String str, Object obj) {
            this.vars.put(str, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setVar$1(String str) {
            this.vars.remove(str);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.EvaluationContext
        public Map<String, Macro> getMacros() {
            return this.macros;
        }

        @Override // autovalue.shaded.com.google.escapevelocity.EvaluationContext
        public Object getVar(String str) {
            return this.vars.get(str);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.EvaluationContext
        public ImmutableSet<Method> publicMethodsWithName(Class<?> cls, String str) {
            return this.methodFinder.publicMethodsWithName(cls, str);
        }

        @Override // autovalue.shaded.com.google.escapevelocity.EvaluationContext
        public Runnable setVar(String str, Object obj) {
            Runnable playerView$$ExternalSyntheticLambda1;
            if (this.vars.containsKey(str)) {
                playerView$$ExternalSyntheticLambda1 = new Processor$$ExternalSyntheticLambda2(this, 16, str, this.vars.get(str));
            } else {
                playerView$$ExternalSyntheticLambda1 = new PlayerView$$ExternalSyntheticLambda1(this, str, 28);
            }
            this.vars.put(str, obj);
            return playerView$$ExternalSyntheticLambda1;
        }

        @Override // autovalue.shaded.com.google.escapevelocity.EvaluationContext
        public boolean varIsDefined(String str) {
            return this.vars.containsKey(str);
        }
    }

    Map<String, Macro> getMacros();

    Object getVar(String str);

    ImmutableSet<Method> publicMethodsWithName(Class<?> cls, String str);

    Runnable setVar(String str, Object obj);

    boolean varIsDefined(String str);
}
