package com.facebook.soloader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class Elf32 {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Dyn {
        public static final int D_TAG = 0;
        public static final int D_UN = 4;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Ehdr {
        public static final int E_EHSIZE = 40;
        public static final int E_ENTRY = 24;
        public static final int E_FLAGS = 36;
        public static final int E_IDENT = 0;
        public static final int E_MACHINE = 18;
        public static final int E_PHENTSIZE = 42;
        public static final int E_PHNUM = 44;
        public static final int E_PHOFF = 28;
        public static final int E_SHENTSIZE = 46;
        public static final int E_SHNUM = 48;
        public static final int E_SHOFF = 32;
        public static final int E_SHSTRNDX = 50;
        public static final int E_TYPE = 16;
        public static final int E_VERSION = 20;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Phdr {
        public static final int P_ALIGN = 28;
        public static final int P_FILESZ = 16;
        public static final int P_FLAGS = 24;
        public static final int P_MEMSZ = 20;
        public static final int P_OFFSET = 4;
        public static final int P_PADDR = 12;
        public static final int P_TYPE = 0;
        public static final int P_VADDR = 8;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Shdr {
        public static final int SH_ADDR = 12;
        public static final int SH_ADDRALIGN = 32;
        public static final int SH_ENTSIZE = 36;
        public static final int SH_FLAGS = 8;
        public static final int SH_INFO = 28;
        public static final int SH_LINK = 24;
        public static final int SH_NAME = 0;
        public static final int SH_OFFSET = 16;
        public static final int SH_SIZE = 20;
        public static final int SH_TYPE = 4;
    }
}
