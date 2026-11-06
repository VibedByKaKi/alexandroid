package com.amazon.rtcsc.wrappers;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCCustomMetricInterface {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public RTCCustomMetricInterface(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(RTCCustomMetricInterface rTCCustomMetricInterface) {
        if (rTCCustomMetricInterface == null) {
            return 0L;
        }
        return rTCCustomMetricInterface.swigCPtr;
    }

    public synchronized void delete() {
        try {
            if (this.swigCPtr != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    throw new UnsupportedOperationException("C++ destructor does not have public access");
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public CounterVector getCounters() {
        return new CounterVector(RTCControllerAndroidJNI.RTCCustomMetricInterface_getCounters(this.swigCPtr, this), true);
    }

    public MetadataVector getMetadata() {
        return new MetadataVector(RTCControllerAndroidJNI.RTCCustomMetricInterface_getMetadata(this.swigCPtr, this), true);
    }

    public Priority getPriority() {
        return Priority.swigToEnum(RTCControllerAndroidJNI.RTCCustomMetricInterface_getPriority(this.swigCPtr, this));
    }

    public String getProgramName() {
        return RTCControllerAndroidJNI.RTCCustomMetricInterface_getProgramName(this.swigCPtr, this);
    }

    public String getSourceName() {
        return RTCControllerAndroidJNI.RTCCustomMetricInterface_getSourceName(this.swigCPtr, this);
    }

    public TimerVector getTimers() {
        return new TimerVector(RTCControllerAndroidJNI.RTCCustomMetricInterface_getTimers(this.swigCPtr, this), true);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Counter {
        protected transient boolean swigCMemOwn;
        private transient long swigCPtr;

        public Counter() {
            this(RTCControllerAndroidJNI.new_RTCCustomMetricInterface_Counter(), true);
        }

        public static long getCPtr(Counter counter) {
            if (counter == null) {
                return 0L;
            }
            return counter.swigCPtr;
        }

        public synchronized void delete() {
            try {
                long j = this.swigCPtr;
                if (j != 0) {
                    if (this.swigCMemOwn) {
                        this.swigCMemOwn = false;
                        RTCControllerAndroidJNI.delete_RTCCustomMetricInterface_Counter(j);
                    }
                    this.swigCPtr = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void finalize() {
            delete();
        }

        public String getName() {
            return RTCControllerAndroidJNI.RTCCustomMetricInterface_Counter_name_get(this.swigCPtr, this);
        }

        public int getValue() {
            return RTCControllerAndroidJNI.RTCCustomMetricInterface_Counter_value_get(this.swigCPtr, this);
        }

        public void setName(String str) {
            RTCControllerAndroidJNI.RTCCustomMetricInterface_Counter_name_set(this.swigCPtr, this, str);
        }

        public void setValue(int i) {
            RTCControllerAndroidJNI.RTCCustomMetricInterface_Counter_value_set(this.swigCPtr, this, i);
        }

        public Counter(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Metadata {
        protected transient boolean swigCMemOwn;
        private transient long swigCPtr;

        public Metadata() {
            this(RTCControllerAndroidJNI.new_RTCCustomMetricInterface_Metadata(), true);
        }

        public static long getCPtr(Metadata metadata) {
            if (metadata == null) {
                return 0L;
            }
            return metadata.swigCPtr;
        }

        public synchronized void delete() {
            try {
                long j = this.swigCPtr;
                if (j != 0) {
                    if (this.swigCMemOwn) {
                        this.swigCMemOwn = false;
                        RTCControllerAndroidJNI.delete_RTCCustomMetricInterface_Metadata(j);
                    }
                    this.swigCPtr = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void finalize() {
            delete();
        }

        public String getName() {
            return RTCControllerAndroidJNI.RTCCustomMetricInterface_Metadata_name_get(this.swigCPtr, this);
        }

        public String getValue() {
            return RTCControllerAndroidJNI.RTCCustomMetricInterface_Metadata_value_get(this.swigCPtr, this);
        }

        public void setName(String str) {
            RTCControllerAndroidJNI.RTCCustomMetricInterface_Metadata_name_set(this.swigCPtr, this, str);
        }

        public void setValue(String str) {
            RTCControllerAndroidJNI.RTCCustomMetricInterface_Metadata_value_set(this.swigCPtr, this, str);
        }

        public Metadata(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Timer {
        protected transient boolean swigCMemOwn;
        private transient long swigCPtr;

        public Timer() {
            this(RTCControllerAndroidJNI.new_RTCCustomMetricInterface_Timer(), true);
        }

        public static long getCPtr(Timer timer) {
            if (timer == null) {
                return 0L;
            }
            return timer.swigCPtr;
        }

        public synchronized void delete() {
            try {
                long j = this.swigCPtr;
                if (j != 0) {
                    if (this.swigCMemOwn) {
                        this.swigCMemOwn = false;
                        RTCControllerAndroidJNI.delete_RTCCustomMetricInterface_Timer(j);
                    }
                    this.swigCPtr = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void finalize() {
            delete();
        }

        public String getName() {
            return RTCControllerAndroidJNI.RTCCustomMetricInterface_Timer_name_get(this.swigCPtr, this);
        }

        public double getValue() {
            return RTCControllerAndroidJNI.RTCCustomMetricInterface_Timer_value_get(this.swigCPtr, this);
        }

        public void setName(String str) {
            RTCControllerAndroidJNI.RTCCustomMetricInterface_Timer_name_set(this.swigCPtr, this, str);
        }

        public void setValue(double d) {
            RTCControllerAndroidJNI.RTCCustomMetricInterface_Timer_value_set(this.swigCPtr, this, d);
        }

        public Timer(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Priority {
        public static final Priority CRITICAL;
        public static final Priority HIGH;
        public static final Priority NORMAL;
        private static int swigNext;
        private static Priority[] swigValues;
        private final String swigName;
        private final int swigValue;

        static {
            Priority priority = new Priority("NORMAL");
            NORMAL = priority;
            Priority priority2 = new Priority(BleConnectionPriority.HIGH);
            HIGH = priority2;
            Priority priority3 = new Priority("CRITICAL");
            CRITICAL = priority3;
            swigValues = new Priority[]{priority, priority2, priority3};
            swigNext = 0;
        }

        private Priority(String str) {
            this.swigName = str;
            int i = swigNext;
            swigNext = i + 1;
            this.swigValue = i;
        }

        public static Priority swigToEnum(int i) {
            Priority[] priorityArr = swigValues;
            if (i < priorityArr.length && i >= 0) {
                Priority priority = priorityArr[i];
                if (priority.swigValue == i) {
                    return priority;
                }
            }
            int i2 = 0;
            while (true) {
                Priority[] priorityArr2 = swigValues;
                if (i2 >= priorityArr2.length) {
                    Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(Priority.class, "No enum ", " with value ", i));
                    return null;
                }
                Priority priority2 = priorityArr2[i2];
                if (priority2.swigValue == i) {
                    return priority2;
                }
                i2++;
            }
        }

        public final int swigValue() {
            return this.swigValue;
        }

        public String toString() {
            return this.swigName;
        }

        private Priority(String str, int i) {
            this.swigName = str;
            this.swigValue = i;
            swigNext = i + 1;
        }

        private Priority(String str, Priority priority) {
            this.swigName = str;
            int i = priority.swigValue;
            this.swigValue = i;
            swigNext = i + 1;
        }
    }
}
