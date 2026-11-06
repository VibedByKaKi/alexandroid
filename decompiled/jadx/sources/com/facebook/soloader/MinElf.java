package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import kotlin.UShort;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class MinElf {
    public static final int DT_NEEDED = 1;
    public static final int DT_NULL = 0;
    public static final int DT_STRTAB = 5;
    public static final int ELF_MAGIC = 1179403647;
    public static final int PN_XNUM = 65535;
    public static final int PT_DYNAMIC = 2;
    public static final int PT_LOAD = 1;
    private static final String TAG = "MinElf";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotStripAny
    public static class ElfError extends UnsatisfiedLinkError {
        public ElfError(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ISA {
        public static final String AARCH64 = "arm64-v8a";
        public static final String ARM = "armeabi-v7a";
        public static final String X86 = "x86";
        public static final String X86_64 = "x86_64";
    }

    public static String[] extract_DT_NEEDED(File file) throws IOException {
        ElfFileChannel elfFileChannel = new ElfFileChannel(file);
        try {
            String[] extract_DT_NEEDED = extract_DT_NEEDED(elfFileChannel);
            elfFileChannel.close();
            return extract_DT_NEEDED;
        } catch (Throwable th) {
            try {
                elfFileChannel.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String[] extract_DT_NEEDED_no_retries(ElfByteChannel elfByteChannel) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long j12 = getu32(elfByteChannel, allocate, 0L);
        if (j12 != 1179403647) {
            throw new ElfError("file is not ELF: magic is 0x" + Long.toHexString(j12) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z = getu8(elfByteChannel, allocate, 4L) == 1;
        long j13 = 5;
        if (getu8(elfByteChannel, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        long j14 = z ? getu32(elfByteChannel, allocate, 28L) : get64(elfByteChannel, allocate, 32L);
        if (z) {
            j = 44;
            j2 = getu16(elfByteChannel, allocate, 44L);
        } else {
            j = 44;
            j2 = getu16(elfByteChannel, allocate, 56L);
        }
        int i = getu16(elfByteChannel, allocate, z ? 42L : 54L);
        boolean z2 = z;
        long j15 = 40;
        if (j2 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            long j16 = z2 ? getu32(elfByteChannel, allocate, 32L) : get64(elfByteChannel, allocate, 40L);
            j2 = z2 ? getu32(elfByteChannel, allocate, j16 + 28) : getu32(elfByteChannel, allocate, j16 + j);
        }
        long j17 = j14;
        long j18 = 0;
        while (true) {
            if (j18 >= j2) {
                j3 = 0;
                break;
            }
            if ((z2 ? getu32(elfByteChannel, allocate, j17) : getu32(elfByteChannel, allocate, j17)) == 2) {
                j3 = z2 ? getu32(elfByteChannel, allocate, j17 + 4) : get64(elfByteChannel, allocate, j17 + 8);
            } else {
                j17 += i;
                j18++;
                j15 = j15;
            }
        }
        long j19 = j15;
        if (j3 == 0) {
            throw new ElfError("ELF file does not contain dynamic linking information");
        }
        long j20 = j3;
        long j21 = 0;
        int i2 = 0;
        while (true) {
            long j22 = z2 ? getu32(elfByteChannel, allocate, j20) : get64(elfByteChannel, allocate, j20);
            long j23 = j13;
            if (j22 == 1) {
                if (i2 == Integer.MAX_VALUE) {
                    throw new ElfError("malformed DT_NEEDED section");
                }
                i2++;
            } else if (j22 == j23) {
                j21 = z2 ? getu32(elfByteChannel, allocate, j20 + 4) : get64(elfByteChannel, allocate, j20 + 8);
            }
            j20 += z2 ? 8L : 16L;
            if (j22 == 0) {
                if (j21 == 0) {
                    throw new ElfError("Dynamic section string-table not found");
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= j2) {
                        j4 = 0;
                        break;
                    }
                    if (z2) {
                        j6 = j14;
                        j7 = getu32(elfByteChannel, allocate, j6);
                    } else {
                        j6 = j14;
                        j7 = getu32(elfByteChannel, allocate, j6);
                    }
                    if (j7 == 1) {
                        if (z2) {
                            j8 = j2;
                            j9 = getu32(elfByteChannel, allocate, j6 + 8);
                        } else {
                            j8 = j2;
                            j9 = get64(elfByteChannel, allocate, j6 + 16);
                        }
                        if (z2) {
                            j10 = j9;
                            j11 = getu32(elfByteChannel, allocate, j6 + 20);
                        } else {
                            j10 = j9;
                            j11 = get64(elfByteChannel, allocate, j6 + j19);
                        }
                        if (j10 <= j21 && j21 < j10 + j11) {
                            j4 = (j21 - j10) + (z2 ? getu32(elfByteChannel, allocate, j6 + 4) : get64(elfByteChannel, allocate, j6 + 8));
                        }
                    } else {
                        j8 = j2;
                    }
                    j14 = j6 + i;
                    i3++;
                    j2 = j8;
                }
                if (j4 == 0) {
                    throw new ElfError("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i2];
                int i4 = 0;
                do {
                    j5 = z2 ? getu32(elfByteChannel, allocate, j3) : get64(elfByteChannel, allocate, j3);
                    if (j5 == 1) {
                        strArr[i4] = getSz(elfByteChannel, allocate, (z2 ? getu32(elfByteChannel, allocate, j3 + 4) : get64(elfByteChannel, allocate, j3 + 8)) + j4);
                        if (i4 == Integer.MAX_VALUE) {
                            throw new ElfError("malformed DT_NEEDED section");
                        }
                        i4++;
                    }
                    j3 += z2 ? 8L : 16L;
                } while (j5 != 0);
                if (i4 == i2) {
                    return strArr;
                }
                throw new ElfError("malformed DT_NEEDED section");
            }
            j13 = j23;
        }
    }

    private static String[] extract_DT_NEEDED_with_retries(ElfFileChannel elfFileChannel) throws IOException {
        int i = 0;
        while (true) {
            try {
                return extract_DT_NEEDED_no_retries(elfFileChannel);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                LogUtil.e(TAG, "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                elfFileChannel.openChannel();
            }
        }
    }

    private static long get64(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(elfByteChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static String getSz(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short u8Var = getu8(elfByteChannel, byteBuffer, j);
            if (u8Var == 0) {
                return sb.toString();
            }
            sb.append((char) u8Var);
            j = j2;
        }
    }

    private static int getu16(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(elfByteChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    private static long getu32(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(elfByteChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short getu8(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(elfByteChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    private static void read(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = elfByteChannel.read(byteBuffer, j)) != -1) {
            j += read;
        }
        if (byteBuffer.remaining() > 0) {
            throw new ElfError("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    public static String[] extract_DT_NEEDED(ElfByteChannel elfByteChannel) throws IOException {
        if (elfByteChannel instanceof ElfFileChannel) {
            return extract_DT_NEEDED_with_retries((ElfFileChannel) elfByteChannel);
        }
        return extract_DT_NEEDED_no_retries(elfByteChannel);
    }
}
