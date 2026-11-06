package com.amazon.whispercloak.random;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Random;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class PRNGFixes {
    private static final byte[] BUILD_FINGERPRINT = getBuildFingerprintl();
    private static final byte[] RANDOM_SEED_BYTES = generateSeedBytes();
    private static final String TAG = "PRNGFixes";
    private static final int VERSION_CODE_JELLY_BEAN = 16;
    private static final int VERSION_CODE_JELLY_BEAN_MR2 = 18;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
        private static final File URANDOM_FILE = new File("/dev/urandom");
        private static final Object sLock = new Object();
        private static DataInputStream sUrandomIn;
        private static OutputStream sUrandomOut;
        private Random mBackupRandom = new Random();
        private boolean mSeeded;

        private DataInputStream getUrandomInputStream() {
            DataInputStream dataInputStream;
            synchronized (sLock) {
                if (sUrandomIn == null) {
                    try {
                        sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                    } catch (IOException e) {
                        throw new SecurityException("Failed to open " + URANDOM_FILE + " for reading", e);
                    }
                }
                dataInputStream = sUrandomIn;
            }
            return dataInputStream;
        }

        private OutputStream getUrandomOutputStream() throws IOException {
            OutputStream outputStream;
            synchronized (sLock) {
                try {
                    if (sUrandomOut == null) {
                        sUrandomOut = new FileOutputStream(URANDOM_FILE);
                    }
                    outputStream = sUrandomOut;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return outputStream;
        }

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            byte[] bArr = new byte[i];
            engineNextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            DataInputStream urandomInputStream;
            if (!this.mSeeded) {
                engineSetSeed(PRNGFixes.generateSeed());
            }
            InputStream inputStream = null;
            try {
                try {
                    try {
                        synchronized (sLock) {
                            urandomInputStream = getUrandomInputStream();
                        }
                        synchronized (urandomInputStream) {
                            urandomInputStream.readFully(bArr);
                        }
                        urandomInputStream.close();
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    Log.w(PRNGFixes.TAG, "IOException thrown reading /dev/urandom. Falling back to java.util.Random");
                    this.mBackupRandom.nextBytes(bArr);
                    if (0 != 0) {
                        inputStream.close();
                    }
                }
            } catch (IOException unused3) {
            }
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            OutputStream urandomOutputStream;
            OutputStream outputStream = null;
            try {
                try {
                    try {
                        synchronized (sLock) {
                            urandomOutputStream = getUrandomOutputStream();
                        }
                        urandomOutputStream.write(bArr);
                        urandomOutputStream.flush();
                        this.mSeeded = true;
                        urandomOutputStream.close();
                    } catch (Throwable th) {
                        this.mSeeded = true;
                        if (0 != 0) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    Log.w(PRNGFixes.TAG, "Failed to mix seed into " + URANDOM_FILE);
                    this.mSeeded = true;
                    if (0 != 0) {
                        outputStream.close();
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LinuxPRNGSecureRandomProvider extends Provider {
        public LinuxPRNGSecureRandomProvider() {
            super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }

    private PRNGFixes() {
    }

    public static void apply() {
        applyOpenSSLFix();
        installLinuxPRNGSecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] generateSeed() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(BUILD_FINGERPRINT);
            dataOutputStream.write(RANDOM_SEED_BYTES);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SecurityException("Failed to generate seed", e);
        }
    }

    private static byte[] generateSeedBytes() {
        byte[] bArr = new byte[10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private static byte[] getBuildFingerprintl() {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Single$$ExternalSyntheticBUOutline0.m("UTF-8 encoding not supported");
            return null;
        }
    }

    private static void applyOpenSSLFix() throws SecurityException {
    }

    private static void installLinuxPRNGSecureRandom() throws SecurityException {
    }
}
