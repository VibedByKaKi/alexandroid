package org.apache.logging.log4j.message;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import com.google.errorprone.annotations.InlineMe;
import com.imagepicker.Options$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.logging.log4j.message.ParameterFormatter;
import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.apache.logging.log4j.util.StringBuilders;
import org.apache.logging.log4j.util.internal.SerializationUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ParameterizedMessage implements Message, StringBuilderFormattable {
    public static final String ERROR_MSG_SEPARATOR = ":";
    public static final String ERROR_PREFIX = "[!!!";
    public static final String ERROR_SEPARATOR = "=>";
    public static final String ERROR_SUFFIX = "!!!]";
    private static final ThreadLocal<FormatBufferHolder> FORMAT_BUFFER_HOLDER_REF;
    public static final String RECURSION_PREFIX = "[...";
    public static final String RECURSION_SUFFIX = "...]";
    private static final long serialVersionUID = -665975803997290697L;
    private transient Object[] args;
    private String formattedMessage;
    private final String pattern;
    private final ParameterFormatter.MessagePatternAnalysis patternAnalysis;
    private final transient Throwable throwable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FormatBufferHolder {
        private final StringBuilder buffer;
        private boolean used;

        private FormatBufferHolder() {
            this.buffer = new StringBuilder(Constants.MAX_REUSABLE_MESSAGE_SIZE);
            this.used = false;
        }
    }

    static {
        FORMAT_BUFFER_HOLDER_REF = Constants.ENABLE_THREADLOCALS ? ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(27)) : null;
    }

    public ParameterizedMessage(String str, Object[] objArr, Throwable th) {
        this.args = objArr;
        this.pattern = str;
        ParameterFormatter.MessagePatternAnalysis analyzePattern = ParameterFormatter.analyzePattern(str, objArr != null ? objArr.length : 0);
        this.patternAnalysis = analyzePattern;
        this.throwable = determineThrowable(th, this.args, analyzePattern);
    }

    public static int countArgumentPlaceholders(String str) {
        if (str == null) {
            return 0;
        }
        return ParameterFormatter.analyzePattern(str, -1).placeholderCount;
    }

    public static String deepToString(Object obj) {
        return ParameterFormatter.deepToString(obj);
    }

    private static Throwable determineThrowable(Throwable th, Object[] objArr, ParameterFormatter.MessagePatternAnalysis messagePatternAnalysis) {
        if (th != null) {
            return th;
        }
        if (objArr == null || objArr.length <= messagePatternAnalysis.placeholderCount) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static String format(String str, Object[] objArr) {
        return ParameterFormatter.format(str, objArr, objArr != null ? objArr.length : 0);
    }

    public static String identityToString(Object obj) {
        return ParameterFormatter.identityToString(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object[] lambda$new$1(int i) {
        return new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FormatBufferHolder lambda$static$0() {
        return new FormatBufferHolder();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        SerializationUtil.assertFiltered(objectInputStream);
        objectInputStream.defaultReadObject();
        this.args = new Object[objectInputStream.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.args;
            if (i >= objArr.length) {
                return;
            }
            objArr[i] = SerializationUtil.readWrappedObject(objectInputStream);
            i++;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.args.length);
        for (Object obj : this.args) {
            SerializationUtil.writeWrappedObject(obj instanceof Serializable ? (Serializable) obj : String.valueOf(obj), objectOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterizedMessage)) {
            return false;
        }
        ParameterizedMessage parameterizedMessage = (ParameterizedMessage) obj;
        return Objects.equals(this.pattern, parameterizedMessage.pattern) && Arrays.equals(this.args, parameterizedMessage.args);
    }

    @Override // org.apache.logging.log4j.util.StringBuilderFormattable
    public void formatTo(StringBuilder sb) {
        String str = this.formattedMessage;
        if (str != null) {
            sb.append(str);
        } else {
            Object[] objArr = this.args;
            ParameterFormatter.formatMessage(sb, this.pattern, objArr, objArr != null ? objArr.length : 0, this.patternAnalysis);
        }
    }

    @Override // org.apache.logging.log4j.message.Message
    public String getFormat() {
        return this.pattern;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.logging.log4j.message.Message
    public String getFormattedMessage() {
        if (this.formattedMessage == null) {
            ThreadLocal<FormatBufferHolder> threadLocal = FORMAT_BUFFER_HOLDER_REF;
            if (threadLocal != null) {
                FormatBufferHolder formatBufferHolder = threadLocal.get();
                if (!formatBufferHolder.used) {
                    formatBufferHolder.used = true;
                    StringBuilder sb = formatBufferHolder.buffer;
                    try {
                        formatTo(sb);
                        this.formattedMessage = sb.toString();
                    } finally {
                        StringBuilders.trimToMaxSize(sb, Constants.MAX_REUSABLE_MESSAGE_SIZE);
                        sb.setLength(0);
                        formatBufferHolder.used = false;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder(Constants.MAX_REUSABLE_MESSAGE_SIZE);
            formatTo(sb2);
            this.formattedMessage = sb2.toString();
        }
        return this.formattedMessage;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Object[] getParameters() {
        return this.args;
    }

    @Override // org.apache.logging.log4j.message.Message
    public Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        String str = this.pattern;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object[] objArr = this.args;
        return hashCode + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParameterizedMessage[messagePattern=");
        sb.append(this.pattern);
        sb.append(", argCount=");
        sb.append(this.args.length);
        sb.append(", throwableProvided=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.throwable != null, AbstractJsonLexerKt.END_LIST);
    }

    @InlineMe(imports = {"java.util.Arrays"}, replacement = "this(pattern, Arrays.stream(args).toArray(Object[]::new), throwable)")
    @Deprecated
    public ParameterizedMessage(String str, String[] strArr, Throwable th) {
        this(str, Arrays.stream(strArr).toArray(new Options$$ExternalSyntheticLambda1(3)), th);
    }

    public ParameterizedMessage(String str, Object... objArr) {
        this(str, objArr, (Throwable) null);
    }

    public ParameterizedMessage(String str, Object obj) {
        this(str, obj);
    }

    public ParameterizedMessage(String str, Object obj, Object obj2) {
        this(str, obj, obj2);
    }
}
