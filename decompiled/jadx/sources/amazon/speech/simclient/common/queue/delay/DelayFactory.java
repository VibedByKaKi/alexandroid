package amazon.speech.simclient.common.queue.delay;

import java.util.Random;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class DelayFactory {
    public static Delay exponential(final long j, final long j2, final Random random) {
        if (j < 0 || j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Delay can not be negative");
            return null;
        }
        if (j <= j2) {
            return new Delay() { // from class: amazon.speech.simclient.common.queue.delay.DelayFactory.6
                @Override // amazon.speech.simclient.common.queue.delay.Delay
                public long delay(int i) {
                    return (long) Math.min(Math.pow(2.0d, i) * DelayFactory.randomInRange(j, j2, random), 9.223372036854776E18d);
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Min delay can not be greater than max delay");
        return null;
    }

    public static Delay exponentialWithMaxDelay(final long j, final long j2) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Delay can not be negative");
            return null;
        }
        if (j2 > 0) {
            return new Delay() { // from class: amazon.speech.simclient.common.queue.delay.DelayFactory.5
                @Override // amazon.speech.simclient.common.queue.delay.Delay
                public long delay(int i) {
                    return (long) Math.min(Math.pow(2.0d, i) * j, j2);
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Maximum ms must be positive");
        return null;
    }

    public static Delay fixed(final long j) {
        if (j >= 0) {
            return new Delay() { // from class: amazon.speech.simclient.common.queue.delay.DelayFactory.2
                @Override // amazon.speech.simclient.common.queue.delay.Delay
                public long delay(int i) {
                    return j;
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Delay can not be negative");
        return null;
    }

    public static Delay linear(final long j, final long j2, final Random random) {
        if (j < 0 || j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Delay can not be negative");
            return null;
        }
        if (j <= j2) {
            return new Delay() { // from class: amazon.speech.simclient.common.queue.delay.DelayFactory.4
                @Override // amazon.speech.simclient.common.queue.delay.Delay
                public long delay(int i) {
                    return DelayFactory.randomInRange(j, j2, random) * (i + 1);
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Min delay can not be greater than max delay");
        return null;
    }

    public static Delay none() {
        return new Delay() { // from class: amazon.speech.simclient.common.queue.delay.DelayFactory.1
            @Override // amazon.speech.simclient.common.queue.delay.Delay
            public long delay(int i) {
                return 0L;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long randomInRange(long j, long j2, Random random) {
        return ((long) (random.nextFloat() * (j2 - j))) + j;
    }

    public static Delay exponential(long j, long j2) {
        return exponential(j, j2, new Random());
    }

    public static Delay linear(long j, long j2) {
        return linear(j, j2, new Random());
    }

    public static Delay exponential(long j) {
        return exponentialWithMaxDelay(j, Long.MAX_VALUE);
    }

    public static Delay linear(final long j) {
        if (j >= 0) {
            return new Delay() { // from class: amazon.speech.simclient.common.queue.delay.DelayFactory.3
                @Override // amazon.speech.simclient.common.queue.delay.Delay
                public long delay(int i) {
                    return j * (i + 1);
                }
            };
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Delay can not be negative");
        return null;
    }
}
