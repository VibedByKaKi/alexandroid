package kotlin;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InlineOnly;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0013H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0087\b\u001a!\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b¨\u0006\u0019"}, d2 = {"plus", "Ljava/math/BigInteger;", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "minus", "times", "div", "rem", "unaryMinus", "inc", "dec", "inv", "and", "or", "xor", "shl", "n", "", "shr", "toBigInteger", "", "toBigDecimal", "Ljava/math/BigDecimal;", ModelTransformer.KEY_BATTERY_SCALE, "mathContext", "Ljava/math/MathContext;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes10.dex */
class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger and(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger and = bigInteger.and(bigInteger2);
        and.getClass();
        return and;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger dec(BigInteger bigInteger) {
        bigInteger.getClass();
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        subtract.getClass();
        return subtract;
    }

    @InlineOnly
    private static final BigInteger div(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger divide = bigInteger.divide(bigInteger2);
        divide.getClass();
        return divide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inc(BigInteger bigInteger) {
        bigInteger.getClass();
        BigInteger add = bigInteger.add(BigInteger.ONE);
        add.getClass();
        return add;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inv(BigInteger bigInteger) {
        bigInteger.getClass();
        BigInteger not = bigInteger.not();
        not.getClass();
        return not;
    }

    @InlineOnly
    private static final BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        subtract.getClass();
        return subtract;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger or(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger or = bigInteger.or(bigInteger2);
        or.getClass();
        return or;
    }

    @InlineOnly
    private static final BigInteger plus(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger add = bigInteger.add(bigInteger2);
        add.getClass();
        return add;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final BigInteger rem(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        remainder.getClass();
        return remainder;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shl(BigInteger bigInteger, int i) {
        bigInteger.getClass();
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        shiftLeft.getClass();
        return shiftLeft;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shr(BigInteger bigInteger, int i) {
        bigInteger.getClass();
        BigInteger shiftRight = bigInteger.shiftRight(i);
        shiftRight.getClass();
        return shiftRight;
    }

    @InlineOnly
    private static final BigInteger times(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        multiply.getClass();
        return multiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(BigInteger bigInteger, int i, MathContext mathContext) {
        bigInteger.getClass();
        mathContext.getClass();
        return new BigDecimal(bigInteger, i, mathContext);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            mathContext.getClass();
        }
        bigInteger.getClass();
        mathContext.getClass();
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(int i) {
        BigInteger valueOf = BigInteger.valueOf(i);
        valueOf.getClass();
        return valueOf;
    }

    @InlineOnly
    private static final BigInteger unaryMinus(BigInteger bigInteger) {
        bigInteger.getClass();
        BigInteger negate = bigInteger.negate();
        negate.getClass();
        return negate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger xor(BigInteger bigInteger, BigInteger bigInteger2) {
        bigInteger.getClass();
        bigInteger2.getClass();
        BigInteger xor = bigInteger.xor(bigInteger2);
        xor.getClass();
        return xor;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        valueOf.getClass();
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(BigInteger bigInteger) {
        bigInteger.getClass();
        return new BigDecimal(bigInteger);
    }
}
