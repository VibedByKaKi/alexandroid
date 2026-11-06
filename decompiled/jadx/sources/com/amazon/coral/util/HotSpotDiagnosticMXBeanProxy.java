package com.amazon.coral.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.sun.management.VMOption;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.openmbean.CompositeDataSupport;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HotSpotDiagnosticMXBeanProxy {
    private static final String DUMP_HEAP_OPERATION = "dumpHeap";
    public static final String ERROR_FILE = "ErrorFile";
    private static final String GET_VM_OPTION_OPERATION = "getVMOption";
    public static final String HEAP_DUMP_ON_OOM = "HeapDumpOnOutOfMemoryError";
    public static final String HEAP_DUMP_PATH = "HeapDumpPath";
    private static final String HOTSPOT_MBEAN_NAME = "com.sun.management:type=HotSpotDiagnostic";
    private static final String SET_VM_OPTION_OPERATION = "setVMOption";
    private final ObjectName hotspotMBeanName;
    private final MBeanServerConnection mbeanServerConnection;
    private static final String[] DUMP_HEAP_SIGNATURE = {"java.lang.String", TypedValues.Custom.S_BOOLEAN};
    private static final String[] SET_VM_OPTION_SIGNATURE = {"java.lang.String", "java.lang.String"};
    private static final String[] GET_VM_OPTION_SIGNATURE = {"java.lang.String"};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MBeanInvocationException extends Exception {
        public MBeanInvocationException(Throwable th) {
            super(th);
        }
    }

    public HotSpotDiagnosticMXBeanProxy(MBeanServerConnection mBeanServerConnection) {
        if (mBeanServerConnection == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.mbeanServerConnection = mBeanServerConnection;
        try {
            this.hotspotMBeanName = new ObjectName(HOTSPOT_MBEAN_NAME);
        } catch (MalformedObjectNameException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    private Object invoke(String str, Object[] objArr, String[] strArr) throws MBeanInvocationException, IOException {
        try {
            return this.mbeanServerConnection.invoke(this.hotspotMBeanName, str, objArr, strArr);
        } catch (MBeanException e) {
            throw new MBeanInvocationException(e);
        } catch (InstanceNotFoundException e2) {
            throw new MBeanInvocationException(e2);
        } catch (ReflectionException e3) {
            throw new MBeanInvocationException(e3);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void dumpHeap(String str, boolean z) throws MBeanInvocationException, IOException {
        invoke(DUMP_HEAP_OPERATION, new Object[]{str, Boolean.valueOf(z)}, DUMP_HEAP_SIGNATURE);
    }

    public VMOption getVMOption(String str) throws MBeanInvocationException {
        try {
            CompositeDataSupport compositeDataSupport = (CompositeDataSupport) invoke(GET_VM_OPTION_OPERATION, new Object[]{str}, GET_VM_OPTION_SIGNATURE);
            return new VMOption((String) compositeDataSupport.get("name"), (String) compositeDataSupport.get("value"), ((Boolean) compositeDataSupport.get("writeable")).booleanValue(), VMOption.Origin.valueOf((String) compositeDataSupport.get("origin")));
        } catch (IOException e) {
            throw new MBeanInvocationException(e);
        }
    }

    public void setVMOption(String str, String str2) throws MBeanInvocationException {
        try {
            invoke(SET_VM_OPTION_OPERATION, new Object[]{str, str2}, SET_VM_OPTION_SIGNATURE);
        } catch (IOException e) {
            throw new MBeanInvocationException(e);
        }
    }

    public HotSpotDiagnosticMXBeanProxy() {
        this(ManagementFactory.getPlatformMBeanServer());
    }
}
