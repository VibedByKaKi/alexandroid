package io.reactivex.rxjava3.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.concurrent.UncheckedFuture;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.spi.LoggerRegistry;
import org.openjdk.tools.javac.api.BasicJavacTask;
import org.openjdk.tools.javac.code.Symbol;
import org.openjdk.tools.javac.code.Type;
import org.openjdk.tools.javac.jvm.ClassWriter;
import org.openjdk.tools.javac.model.JavacElements;
import org.openjdk.tools.javac.parser.JavacParser;
import org.openjdk.tools.javac.tree.JCTree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class Maybe$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Maybe$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$new$0;
        List lambda$getMatchingMethod$4;
        char[] lambda$toCharArray$1;
        char[] lambda$toCharArray$0;
        Stream lambda$getLoggers$0;
        String lambda$initPlugins$0;
        Set lambda$writeModuleAttribute$0;
        Symbol.ModuleSymbol lambda$unboundNameToSymbol$0;
        String moduleSymbol;
        String lambda$merge$0;
        switch (this.$r8$classId) {
            case 0:
                return Maybe.just(obj);
            case 1:
                return Flowable.just(obj);
            case 2:
                return Observable.just(obj);
            case 3:
                return ((Path) obj).toFile();
            case 4:
                lambda$new$0 = RegexFileFilter.lambda$new$0((Path) obj);
                return lambda$new$0;
            case 5:
                return ((Field) obj).getName();
            case 6:
                return Objects.toString(obj);
            case 7:
                return UncheckedFuture.on((Future) obj);
            case 8:
                return ((Pair) obj).getValue();
            case 9:
                return (String) ((Pair) obj).getKey();
            case 10:
                return String.valueOf((Class) obj);
            case 11:
                return ((Method) obj).toString();
            case 12:
                return ClassUtils.getName((Class<?>) obj);
            case 13:
                lambda$getMatchingMethod$4 = MethodUtils.lambda$getMatchingMethod$4((Integer) obj);
                return lambda$getMatchingMethod$4;
            case 14:
                return ((Class) obj).getDeclaredMethods();
            case 15:
                return Stream.of((Object[]) obj);
            case 16:
                return ((StringBuilder) obj).toString();
            case 17:
                return ((StringJoiner) obj).toString();
            case 18:
                lambda$toCharArray$1 = StrBuilder.lambda$toCharArray$1((Integer) obj);
                return lambda$toCharArray$1;
            case 19:
                lambda$toCharArray$0 = StrBuilder.lambda$toCharArray$0((Integer) obj);
                return lambda$toCharArray$0;
            case 20:
                return (CharSequence) ((Map.Entry) obj).getValue();
            case 21:
                return (CharSequence) ((Map.Entry) obj).getKey();
            case 22:
                return new MarkerManager.Log4jMarker((String) obj);
            case 23:
                lambda$getLoggers$0 = LoggerRegistry.lambda$getLoggers$0((Map) obj);
                return lambda$getLoggers$0;
            case 24:
                lambda$initPlugins$0 = BasicJavacTask.lambda$initPlugins$0((Map.Entry) obj);
                return lambda$initPlugins$0;
            case 25:
                lambda$writeModuleAttribute$0 = ClassWriter.lambda$writeModuleAttribute$0((Symbol.ClassSymbol) obj);
                return lambda$writeModuleAttribute$0;
            case 26:
                lambda$unboundNameToSymbol$0 = JavacElements.lambda$unboundNameToSymbol$0((Symbol) obj);
                return lambda$unboundNameToSymbol$0;
            case 27:
                moduleSymbol = ((Symbol.ModuleSymbol) obj).toString();
                return moduleSymbol;
            case 28:
                return ((Type) obj).stripMetadataIfNeeded();
            default:
                lambda$merge$0 = JavacParser.lambda$merge$0((JCTree.JCLiteral) obj);
                return lambda$merge$0;
        }
    }
}
