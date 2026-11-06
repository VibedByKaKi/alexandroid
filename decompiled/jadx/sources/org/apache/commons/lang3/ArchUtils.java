package org.apache.commons.lang3;

import com.facebook.soloader.MinElf;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils$$ExternalSyntheticLambda2;
import org.apache.commons.lang3.arch.Processor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ArchUtils {
    private static final Map<String, Processor> ARCH_TO_PROCESSOR = new HashMap();

    static {
        init();
    }

    @Deprecated
    public ArchUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addProcessor(String str, Processor processor) {
        Map<String, Processor> map = ARCH_TO_PROCESSOR;
        if (map.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Key ", str, " already exists in processor map"));
        } else {
            map.put(str, processor);
        }
    }

    private static void addProcessors(Processor processor, String... strArr) {
        org.apache.commons.lang3.stream.Streams.of(strArr).forEach(new FileUtils$$ExternalSyntheticLambda2(processor, 18));
    }

    public static Processor getProcessor() {
        return getProcessor(SystemProperties.getOsArch());
    }

    private static void init() {
        init_X86_32Bit();
        init_X86_64Bit();
        init_IA64_32Bit();
        init_IA64_64Bit();
        init_PPC_32Bit();
        init_PPC_64Bit();
        init_Aarch_64Bit();
        init_RISCV_32Bit();
        init_RISCV_64Bit();
    }

    private static void init_Aarch_64Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_64, Processor.Type.AARCH_64), "aarch64");
    }

    private static void init_IA64_32Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_32, Processor.Type.IA_64), "ia64_32", "ia64n");
    }

    private static void init_IA64_64Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_64, Processor.Type.IA_64), "ia64", "ia64w");
    }

    private static void init_PPC_32Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_32, Processor.Type.PPC), "ppc", "power", "powerpc", "power_pc", "power_rs");
    }

    private static void init_PPC_64Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_64, Processor.Type.PPC), "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }

    private static void init_RISCV_32Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_32, Processor.Type.RISC_V), "riscv32");
    }

    private static void init_RISCV_64Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_64, Processor.Type.RISC_V), "riscv64");
    }

    private static void init_X86_32Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_32, Processor.Type.X86), MinElf.ISA.X86, "i386", "i486", "i586", "i686", "pentium");
    }

    private static void init_X86_64Bit() {
        addProcessors(new Processor(Processor.Arch.BIT_64, Processor.Type.X86), MinElf.ISA.X86_64, "amd64", "em64t", "universal");
    }

    public static Processor getProcessor(String str) {
        return ARCH_TO_PROCESSOR.get(str);
    }
}
