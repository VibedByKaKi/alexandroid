package kotlin;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0087\b¨\u0006\u0011"}, d2 = {"plus", "Ljava/math/BigDecimal;", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "minus", "times", "div", "rem", "unaryMinus", "inc", "dec", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes10.dex */
class NumbersKt__BigDecimalsKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal dec(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        subtract.getClass();
        return subtract;
    }

    @InlineOnly
    private static final BigDecimal div(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        divide.getClass();
        return divide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal inc(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        add.getClass();
        return add;
    }

    @InlineOnly
    private static final BigDecimal minus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        subtract.getClass();
        return subtract;
    }

    @InlineOnly
    private static final BigDecimal plus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        BigDecimal add = bigDecimal.add(bigDecimal2);
        add.getClass();
        return add;
    }

    @InlineOnly
    private static final BigDecimal rem(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        remainder.getClass();
        return remainder;
    }

    @InlineOnly
    private static final BigDecimal times(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        multiply.getClass();
        return multiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(float f, MathContext mathContext) {
        mathContext.getClass();
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @InlineOnly
    private static final BigDecimal unaryMinus(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        BigDecimal negate = bigDecimal.negate();
        negate.getClass();
        return negate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(int i, MathContext mathContext) {
        mathContext.getClass();
        return new BigDecimal(i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        valueOf.getClass();
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(long j, MathContext mathContext) {
        mathContext.getClass();
        return new BigDecimal(j, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(int i) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        valueOf.getClass();
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(double d, MathContext mathContext) {
        mathContext.getClass();
        return new BigDecimal(String.valueOf(d), mathContext);
    }
}
